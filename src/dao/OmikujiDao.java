package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Chukichi;
import bean.Daikichi;
import bean.Kichi;
import bean.Kyou;
import bean.OmikujiForm;
import bean.Suekichi;
import bean.Syokichi;
import db.DBManager;

/**
 * おみくじを選ぶdaoクラス
 * @author a_aoki
 */
public class OmikujiDao {

	/**
	 * @param omikujiId おみくじId取得
	 * @return　おみくじid
	 */
	public OmikujiForm selectById(int omikujiId) {

		Connection con = null;
		PreparedStatement statement = null;
		OmikujiForm omikujiForm = null;
		//運勢を選ぶ
		try {
			String sql = "SELECT unsei.unsei_name,omikuji.negaigoto,omikuji.akinai,omikuji.gakumon FROM unsei INNER JOIN omikuji ON unsei.unsei_id = omikuji.unsei_id WHERE omikuji_id=?";
			con = DBManager.getConnection();
			statement = con.prepareStatement(sql);
			statement.setInt(1, omikujiId);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				String unseiName = rs.getString("unsei_name");
				switch (unseiName) {
				case "大吉":
					omikujiForm = new Daikichi();
					break;
				case "中吉":
					omikujiForm = new Chukichi();
					break;
				case "小吉":
					omikujiForm = new Syokichi();
					break;
				case "末吉":
					omikujiForm = new Suekichi();
					break;
				case "吉":
					omikujiForm = new Kichi();
					break;
				case "凶":
					omikujiForm = new Kyou();
					break;
				}
				omikujiForm.setOmikujiId(omikujiId);
				omikujiForm.setUnsei();
				omikujiForm.setNegaigoto(rs.getString("negaigoto"));
				omikujiForm.setAkinai(rs.getString("akinai"));
				omikujiForm.setGakumon(rs.getString("gakumon"));

				return omikujiForm;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(statement, con);
		}
		return omikujiForm;
	}

	/**
	 * @return おみくじ全件数
	 */
	public int selectCount() {
		Connection con = null;
		PreparedStatement statement = null;
		//おみくじを全件取り出す
		try {
			String sql = "SELECT COUNT (*) FROM omikuji";
			con = DBManager.getConnection();
			statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			rs.next();

			return rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

}