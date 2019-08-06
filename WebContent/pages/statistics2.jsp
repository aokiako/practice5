<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html:html>
<head>
<title>おみくじ|統計2</title>
<link rel="stylesheet" href="css/stylesheet.css" type="text/css">

</head>
<body>
	<div class="omikuji">

		<h2>
			<span class="line">おみくじの統計</span>
		</h2>

		<p>過去半年の運勢結果</p>
		<table>
			<tr>
				<th>占い日</th>
				<th>運勢</th>
				<th>願い事</th>
				<th>商い</th>
				<th>学問</th>
			</tr>
			<c:forEach var="k" items="${pastresult}">
				<tr>
					<td>${k.fortuneDay}</td>
					<td>${k.unseiName}</td>
					<td>${k.negaigoto}</td>
					<td>${k.akinai}</td>
					<td>${k.gakumon}</td>
				</tr>

			</c:forEach>
		</table>
		<html:form action="/OmikujiResult">
			<input type="submit" value="結果に戻る">
			<input type="hidden" name="birthday" value="${birthday}">
		</html:form>
	</div>

</body>
</html:html>