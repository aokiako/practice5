package bean;

import java.sql.Date;

/**
 * おみくじ結果を保持するフォーム
 * @author a_aoki
 *
 */
public abstract class OmikujiForm  {

	/** おみくじIDの数字 */
	private int omikujiId;
	/** 運勢名文字列　*/
	protected String unseiNm;
	/** 願い事文字列　*/
	private String negaigoto;
	/** 商い文字列*/
	private String akinai;
	/** 学問文字列 */
	private String gakumon;
	/** 更新日日付 */
	private Date upDate;
	/** 更新者文字列 */
	private String changer;
	/** 作成日日付 */
	private Date createDay;
	/** 作成者文字列 */
	private String creater;



	public abstract void setUnsei();

	/**
	 * 運勢名を取得
	 * @return 運勢名の文字列
	 */
	public String getUnseiNm() {
		return unseiNm;
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

	/**
	 * 願い事を取得
	 * @return　願い事の文字列
	 */
	public String getNegaigoto() {
		return negaigoto;
	}

	/**
	 * 願い事を設定
	 * @param negaigoto　願い事の文字列
	 */
	public void setNegaigoto(String negaigoto) {
		this.negaigoto = negaigoto;
	}

	/**
	 * 商いを取得
	 * @return　願い事の文字列
	 */
	public String getAkinai() {
		return akinai;
	}

	/**
	 * 商いを設定
	 * @param akinai　商いの文字列
	 */
	public void setAkinai(String akinai) {
		this.akinai = akinai;
	}

	/**
	 * 学問を取得
	 * @return　学問の文字列
	 */
	public String getGakumon() {
		return gakumon;
	}

	/**
	 * 学問を設定
	 * @param gakumon　学問の文字列
	 */
	public void setGakumon(String gakumon) {
		this.gakumon = gakumon;
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

}





