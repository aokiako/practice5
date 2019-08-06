package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import bean.OmikujiForm;
import db.DBManager;

/**
 * おみくじ結果を取得するdaoクラス
 * @author a_aoki
 */
public class ResultDao {

	/**
	 *
	 * @param birthday　誕生日の取得
	 * @return おみくじID
	 */
	public int selectByBirthday(String birthday) {
		//一度入力された誕生日か確かめる
		try {
			String sql = "SELECT omikuji_id FROM result WHERE fortune_day = current_date AND birthday=?";
			Connection con = DBManager.getConnection();
			PreparedStatement statement = con.prepareStatement(sql);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			java.util.Date dateBirthday = sdf.parse(birthday);
			//sql.Dateに変換
			Date sqlDateBd = new java.sql.Date(dateBirthday.getTime());
			statement.setDate(1, sqlDateBd);
			ResultSet rs = statement.executeQuery();
			//一度入力された誕生日があったら
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("DB関連処理でエラーが発生しました");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("日付の解析処理に失敗しました");
			e.printStackTrace();
		}
		return -1;
	}

	//結果をDBに書き込む
	/**
	 * @param omikujiForm　おみくじの結果
	 * @param birthday　入力された誕生日
	 */
	public void insert(OmikujiForm omikujiForm, String birthday) {

		Connection con = null;
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO result VALUES(current_date,?,?,current_date,?,current_date,?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			java.util.Date dateBirthday = sdf.parse(birthday);
			Date sqlDateBd = new java.sql.Date(dateBirthday.getTime());
			ps.setDate(1, sqlDateBd);
			ps.setString(2, "aoki");
			ps.setString(3, "aoki");
			ps.setInt(4, omikujiForm.getOmikujiId());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			DBManager.close(ps, con);
		}
	}
}
