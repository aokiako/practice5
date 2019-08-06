package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import bean.Statistics2Form;
import db.DBManager;

/**
 * 統計2のフォーム
 * @author a_aoki
 */
public class Statistics2Dao {
	/**
	 * @param birthday　入力された誕生日
	 * @param date3　今日から半年前の日付
	 * @return 日付、運勢名、願い事、商い、学問が格納されているリスト
	 */
	public List<Statistics2Form> pastresult(String birthday, Date date3) {
		try {
			//運勢ごとの件数(入力された誕生日のみ)
			String sql = "Select u.unsei_name,o.negaigoto,o.akinai,o.gakumon,r.fortune_day From (unsei u inner join omikuji o on u.unsei_id = o.unsei_id)"
					+ "Inner join result r on o.omikuji_id = r.omikuji_id where r.fortune_day>=? AND r.birthday=? order by fortune_day desc";

			Connection con = DBManager.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			java.util.Date dateBirthday = sdf.parse(birthday);
			Date sqlDateBd = new Date(dateBirthday.getTime());
			//取得した値を?にset
			statement.setDate(1, date3);
			statement.setDate(2, sqlDateBd);
			ResultSet rs = statement.executeQuery();
			//リスト用意
			List<Statistics2Form> statis3 = new ArrayList<>();
			while (rs.next()) {
				Date fday = rs.getDate("fortune_day");
				String name = rs.getString("unsei_name");
				String negaigoto = rs.getString("negaigoto");
				String akinai = rs.getString("akinai");
				String gakumon = rs.getString("gakumon");

				Statistics2Form statistics3 = new Statistics2Form();
				statistics3.setFortuneDay(fday);
				statistics3.setUnseiName(name);
				statistics3.setNegaigoto(negaigoto);
				statistics3.setAkinai(akinai);
				statistics3.setGakumon(gakumon);

				statis3.add(statistics3);
			}

			return statis3;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
