<%@ page contentType="text/html; charset=Shift_JIS"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html:html>
<head>
<title>おみくじ|結果</title>
<link rel="stylesheet" href="css/stylesheet.css" type="text/css">

</head>
<body>

	<div class="omikuji">
		<h2>
			<span class="line">おみくじ結果</span>
		</h2>
		<p>今日の運勢は<div class="moji">${omikuji.unseiNm}</div>
		<h3>${omikuji.unseiNm}</h3>
		<table class="paper">

			<tr>
				<th>願い事</th>
				<th>商い</th>
				<th>学問</th>
			</tr>
			<tr>
				<td>${omikuji.negaigoto}</td>
				<td>${omikuji.akinai}</td>
				<td>${omikuji.gakumon}</td>
			</tr>
		</table>


		<html:form action="/statistics1">
			<input type="submit" value="過去半年と今日の運勢の結果">
			<input type="hidden" name="birthday" value="${birthday}" />
		</html:form>

		<html:form action="/statistics2">

			<input type="submit" value="最初に入力された誕生日の過去半年の結果">
			<input type="hidden" name="birthday" value="${birthday}" />
		</html:form>
		<br>
		<html:link action="/ResultReturn">トップに戻る</html:link>

	</div>



</body>
</html:html>