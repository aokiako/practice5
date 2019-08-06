package bean;

import java.sql.Date;

/**
 * 運勢名とIDを保持するフォーム
 * @author a_aoki
 *
 */
public class UnseiForm {

	/** 運勢ID数字*/
	private int unseiId;
	/** 運勢名文字列　*/
	private String unseiName;
	/** 更新者文字列 */
	private String changer;
	/** 更新日日付 */
	private Date update;
	/** 作成者文字列 */
	private String creater;
	/** 作成日日付 */
	private Date createDay;

	/**
	 * 運勢ID取得
	* @return　運勢IDの数字
	*/
	public int getUnseiId() {
		return unseiId;
	}

	/**
	 * 運勢ID設定
	 * @param unseiId　運勢IDの数字
	 */
	public void setUnseiId(int unseiId) {
		this.unseiId = unseiId;
	}

	/**
	 * 運勢名を取得
	 * @return 運勢名の文字列
	 */
	public String getUnseiName() {
		return unseiName;
	}

	public void setUnseiName(String unseiName) {
		this.unseiName = unseiName;
	}

	/**
	 * 更新者の取得
	 * @return　更新者の文字列
	 */
	public String getChanger() {
		return changer;
	}

	/**
	 * 更新者の設定
	 * @param changer　更新者の文字列
	 */
	public void setChanger(String changer) {
		this.changer = changer;
	}

	/**
	 * 更新日の取得
	 * @return　更新日の日付
	 */
	public Date getUpdate() {
		return update;
	}


	/**
	 * 更新日の設定
	 * @param update 更新日の日付
	 */
	public void setUpdate(Date update) {
		this.update = update;
	}

	/**
	 * 作成者の取得
	 * @return　作成者の文字列
	 */
	public String getCreater() {
		return creater;
	}

	/**
	 * 作成者の設定
	 * @param creater　作成者の文字列
	 */
	public void setCreater(String creater) {
		this.creater = creater;
	}

	/**
	 * 作成日の取得
	 * @return　作成日の日付
	 */
	public Date getCreateDay() {
		return createDay;
	}

	/**
	 * 作成日の設定
	 * @param createDay　作成日の日付
	 */
	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}

}
