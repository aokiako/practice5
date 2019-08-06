<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html:html>
<head>
<title>おみくじ|統計1</title>
<link rel="stylesheet" href="css/stylesheet.css" type="text/css">

</head>
<body>
	<div class="omikuji">

		<h2>
			<span class="line">おみくじの統計</span>
		</h2>

		<p>今日の運勢結果の割合</p>
		<table>
			<c:forEach var="i" items="${percent}">
				<tr>
					<th>${i.key}</th>
					<td>${i.value}%<br></td>
				</tr>
			</c:forEach>
		</table>

		<p>過去半年の運勢結果の割合</p>
		<table>
			<c:forEach var="j" items="${percent2}">
				<tr>
					<th>${j.key}</th>
					<td>${j.value}%<br></td>
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