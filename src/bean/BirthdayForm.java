package bean;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * birthdayを保持するフォーム
 * @author a_aoki
 */
public class BirthdayForm extends ValidatorForm {
	private String birthday;

public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
	ActionErrors errors = new ActionErrors();
	return errors;
}
	/**
	 * 誕生日を設定
	 * @return　入力された誕生日
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 誕生日を取得
	 * @param birthday　入力された誕生日
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
