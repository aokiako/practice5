<%@ page contentType="text/html; charset=Shift_JIS"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
<head>
<title>‚¨‚Ý‚­‚¶|’a¶“ú“ü—Í</title>
<link rel="stylesheet" href="css/stylesheet.css" type="text/css">
</head>
<body>
	<div class="omikuji">
		<h1>‚¨‚Ý‚­‚¶</h1>
		<img src="image/omikuji.sihme.png" alt="‚µ‚ß“ê" width="280" height="150">
		<p>‚ ‚È‚½‚Ì¡“ú‚Ì‰^¨‚ðè‚¢‚Ü‚·</p>
		<p>’a¶“ú‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(—á 19990101)</p>
		<html:errors header="false" property="errBirthday" />
		<bean:write name="msg" ignore="true" />

		<form action="/omikuji3.0/OmikujiResult.do">
			<input type="text" name="birthday" /> <input type="submit"
				value="‚¨‚Ý‚­‚¶‚ðˆø‚­" />
		</form>

	</div>
</body>
</html:html>
