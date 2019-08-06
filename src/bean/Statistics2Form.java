package bean;

import java.sql.Date;

/**
 * 統計2のフォーム
 * @author a_aoki
 */
/**
 * @author a_aoki
 *
 */
public class Statistics2Form {
	/** 占い日日付 */
	private Date fortuneDay;
	/** 運勢名文字列　*/
	private String unseiName;
	/** 願い事文字列　*/
	private String negaigoto;
	/** 商い文字列*/
	private String akinai;
	/** 学問文字列 */
	private String gakumon;

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
	 * 運勢名を取得
	 * @return 運勢名の文字列
	 */
	public String getUnseiName() {
		return unseiName;
	}

	/**
	 * 運勢名の設定
	 * @param unseiName　運勢名の文字列
	 */
	public void setUnseiName(String unseiName) {
		this.unseiName = unseiName;
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

}
