package action;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.BirthdayForm;
import bean.Statistics1Form;
import dao.Statistics1Dao;

/**
 * 統計1を表示するアクションクラス
 * @author a_aoki
 */
public class Statistics1Action extends Action {
	/**
	 * 今日と過去半年のおみくじ結果の割合を表す統計を出力させる
	 * */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res) {
		//占い結果の保持
		BirthdayForm birthdayForm = (BirthdayForm) form;
		String birthday = birthdayForm.getBirthday();

		req.setAttribute("birthday", birthday);

		Calendar cal1 = Calendar.getInstance();
		//今日
		java.sql.Date date1 = new java.sql.Date(cal1.getTime().getTime());
		//過去半年の計算
		Date date = new Date();
		cal1.setTime(date);
		cal1.add(Calendar.MONTH, -6);
		java.sql.Date date2 = new java.sql.Date(cal1.getTime().getTime());

		Statistics1Dao st1 = new Statistics1Dao();

		int count = st1.selectAll(date1);
		int count2 = st1.selectAll(date2);

		List<Statistics1Form> stlist1 = st1.selectPercentage(date1);
		List<Statistics1Form> stlist2 = st1.selectPercentage(date2);

		//mapを使って運勢と確率を格納
		//今日
		Map<String, Integer> map = new LinkedHashMap<>();
		for (Statistics1Form sta1 : stlist1) {
			int stat1 = sta1.getPercentage();

			double per = (double) stat1 / count;
			per = per * 100;
			int pertoday = (int) per;

			map.put(sta1.getUnsei_name(), pertoday);
		}
		req.setAttribute("percent", map);

		//過去半年
		Map<String, Integer> map2 = new LinkedHashMap<>();

		for (Statistics1Form sta2 : stlist2) {
			int stat2 = sta2.getPercentage();

			double per2 = (double) stat2 / count2;
			per2 = per2 * 100;
			int perpast = (int) per2;

			map2.put(sta2.getUnsei_name(), perpast);
		}
		req.setAttribute("percent2", map2);

		return mapping.findForward("success1");
	}

}
