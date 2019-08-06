package bean;

import java.sql.Date;

/**
 * 結果を保持するフォーム
 * @author a_aoki
 *
 */
public class ResultForm {

	/** 占い日日付 */
	private Date fortuneDay;
	/** 誕生日日付 */
	private Date birthday;
	/** 更新者文字列 */
	private String changer;
	/** 更新日日付 */
	private Date upDate;
	/** 作成者文字列 */
	private String creater;
	/** 作成日日付 */
	private Date createDay;
	/** おみくじIDの数字 */
	private int omikujiId;

	/**
	 * 占い日の取得
	 * @return　占い日の日付
	 */
	public Date getFortuneDay() {
		return fortuneDay;
	}

	/**
	 * 占い日の設定
	 * @param fortuneDay　占い日の日付
	 */
	public void setFortuneDay(Date fortuneDay) {
		this.fortuneDay = fortuneDay;
	}

	/**
	 * 誕生日を取得
	 * @return　誕生日の日付
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 誕生日を設定
	 * @param birthday　誕生日の日付
	 */
	public void setBirthDay(Date birthday) {
		this.birthday = birthday;
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
	public Date getUpDate() {
		return upDate;
	}

	/**
	 * 更新日の設定
	 * @param upDate　更新日の日付
	 */
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
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

	/**
	 * おみくじIDを取得
	 * @return おみくじIDの数字
	 */
	public int getOmikujiId() {
		return omikujiId;
	}

	/**
	 * おみくじIdを設定
	 * @param omikujiId　おみくじIDの数字
	 */
	public void setOmikujiId(int omikujiId) {
		this.omikujiId = omikujiId;
	}

}
