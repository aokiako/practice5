package bean;

/**
 * 統計1の割合のフォーム
 * @author a_aoki
 */
public class Statistics1Form {
	/** 運勢名文字列 */
	private String unsei_name;
	/** 統計1の割合の数字 */
	private int percentage;

	/**
	 * 運勢名を取得
	 * @return　運勢名の文字列
	 */
	public String getUnsei_name() {
		return unsei_name;
	}

	/**
	 * 運勢名を設定
	 * @param unsei_name　運勢名の文字列
	 */
	public void setUnsei_name(String unsei_name) {
		this.unsei_name = unsei_name;
	}

	/**
	 * 統計1の割合の取得
	 * @return　統計1の割合の数字
	 */
	public int getPercentage() {
		return percentage;
	}

	/**
	 * 統計1の割合を設定
	 * @param percentage　統計1の割合の数字
	 */
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
