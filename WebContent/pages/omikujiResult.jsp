<%@ page contentType="text/html; charset=Shift_JIS"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html:html>
<head>
<title>���݂���|����</title>
<link rel="stylesheet" href="css/stylesheet.css" type="text/css">

</head>
<body>

	<div class="omikuji">
		<h2>
			<span class="line">���݂�������</span>
		</h2>
		<p>�����̉^����<div class="moji">${omikuji.unseiNm}</div>
		<h3>${omikuji.unseiNm}</h3>
		<table class="paper">

			<tr>
				<th>�肢��</th>
				<th>����</th>
				<th>�w��</th>
			</tr>
			<tr>
				<td>${omikuji.negaigoto}</td>
				<td>${omikuji.akinai}</td>
				<td>${omikuji.gakumon}</td>
			</tr>
		</table>


		<html:form action="/statistics1">
			<input type="submit" value="�ߋ����N�ƍ����̉^���̌���">
			<input type="hidden" name="birthday" value="${birthday}" />
		</html:form>

		<html:form action="/statistics2">

			<input type="submit" value="�ŏ��ɓ��͂��ꂽ�a�����̉ߋ����N�̌���">
			<input type="hidden" name="birthday" value="${birthday}" />
		</html:form>
		<br>
		<html:link action="/ResultReturn">�g�b�v�ɖ߂�</html:link>

	</div>



</body>
</html:html>