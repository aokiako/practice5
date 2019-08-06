package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Statistics1Form;
import db.DBManager;

/**
 * @author a_aoki
 *
 */
public class Statistics1Dao {
	/**
	 * @param date1　今日の日付
	 * @return　期間内の全件数
	 */
	public int selectAll(Date date1) {

		//期間内の全件取得
		int count = 0;
		try {
			String sql = "SELECT count(*) FROM result where fortune_day>=?";
			Connection con = DBManager.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setDate(1, date1);
			ResultSet rs = statement.executeQuery();
			rs.next();
			count = rs.getInt("count");

		} catch (Exception e) {
			e.printStackTrace();

		}
		return count;
	}

	//運勢ごとの件数取得
	/**
	 * @param date2　今日から半年前の日付
	 * @return　運勢名と件数が格納されているリスト
	 */
	public List<Statistics1Form> selectPercentage(Date date2) {
		try {
			String sql = "select u.unsei_name,cnt_res.cnt\n" +
					"from unsei u left outer join \n" +
					"(select o.unsei_id,count(*) as cnt\n" +
					"From omikuji o inner join result r\n" +
					"On  o.omikuji_id= r.omikuji_id\n" +
					"where r.fortune_day>=?\n" +
					"group by unsei_id) cnt_res\n" +
					"on u.unsei_id = cnt_res.unsei_id\n" +
					"order by u.unsei_id";

			Connection con = DBManager.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setDate(1, date2);
			ResultSet rs = statement.executeQuery();
			//運勢名と件数を格納するリスト作成
			List<Statistics1Form> statis1 = new ArrayList<>();

			while (rs.next()) {
				int count2 = rs.getInt("cnt");
				String unsei = rs.getString("unsei_name");

				//リストに運勢名と件数を格納
				Statistics1Form statistics1Form = new Statistics1Form();
				statistics1Form.setUnsei_name(unsei);
				statistics1Form.setPercentage(count2);

				statis1.add(statistics1Form);
			}
			return statis1;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}
}
