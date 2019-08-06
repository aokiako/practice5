package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 結果から入力画面に戻るアクション
 * @author a_aoki
 */
public class ResultReturnAction extends Action {
	/**
	 * おみくじの結果画面から誕生日入力画面に戻る
	 * */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res) {

		return mapping.findForward("top");

	}
}
