package action;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bean.BirthdayForm;
import bean.OmikujiForm;
import dao.OmikujiDao;
import dao.ResultDao;

/**
 * Servlet implementation class OmikujiResult
 */
/**
 * おみくじ結果を扱うアクションクラス
 * @author a_aoki
 */
public class OmikujiResultAction extends Action {
	/**
	 * 入力チェックの後におみくじの結果を選んで表示させる
	 * */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res) {

		//入力項目を取得
		BirthdayForm birthdayForm = (BirthdayForm) form;
		String birthday = birthdayForm.getBirthday();

		//入力チェック
		Pattern p = Pattern.compile("^(\\d{4})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$");
		Matcher match = null;

		match = p.matcher(birthday);
		ActionMessages errors = new ActionMessages();
		//合わな買ったらエラーメッセージを出す
		if (!match.find()) {
			errors.add("errBirthday", new ActionMessage("errors.invalid"));
			saveErrors(req, errors);
			return mapping.findForward("error");
		}

		try {
			//omikujiidの生成
			ResultDao resultDao = new ResultDao();
			int omikujiId = resultDao.selectByBirthday(birthday);
			OmikujiForm omikujiForm = null;

			OmikujiDao omikujiDao = new OmikujiDao();
			int max = omikujiDao.selectCount();
			//一度引いたおみくじがなかったら、ランダムで引いてDBに書き込む
			if (omikujiId == -1) {
				// ランダムの処理
				Random rand2 = new Random();
				omikujiId = rand2.nextInt(max);
				omikujiForm = omikujiDao.selectById(omikujiId);
				resultDao.insert(omikujiForm, birthday);
			//一度引いていたら書き込みはせずに再度引くだけ
			} else {
				//omikujiDaoからidを取得
				omikujiForm = omikujiDao.selectById(omikujiId);
			}

			req.setAttribute("birthday", birthday);
			req.setAttribute("omikuji", omikujiForm);
			return mapping.findForward("success");

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}
}
