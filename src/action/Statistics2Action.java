package action;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.BirthdayForm;
import bean.Statistics2Form;
import dao.Statistics2Dao;

/**
 * 統計2を表示するアクションクラス
 *@author a_aoki
 */
public class Statistics2Action extends Action {
	/**
	 * 入力された誕生日の過去の結果をリストで表示させる
	 * */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res) {

		BirthdayForm birthdayForm = (BirthdayForm) form;
		String birthday = birthdayForm.getBirthday();

		req.setAttribute("birthday", birthday);

		Calendar cal = Calendar.getInstance();
		//過去半年の計算
		java.util.Date date2 = new java.util.Date();
		cal.setTime(date2);
		cal.add(Calendar.MONTH, -6);
		Date date3 = new Date(cal.getTime().getTime());

		Statistics2Dao st = new Statistics2Dao();

		List<Statistics2Form> stlist2 = st.pastresult(birthday, date3);

		req.setAttribute("pastresult", stlist2);

		return mapping.findForward("success2");

	}
}
