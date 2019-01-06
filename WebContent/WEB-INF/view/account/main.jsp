<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="head.jsp" %>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<%@ include file="../home/header.jsp" %>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<%@ include file="navi-bar.jsp" %>
			</td>
		</tr>
		<tr style="height: 300px">
			<td style="width: 30%">
				<%@ include file="side-menu.jsp" %>
			</td>
			<td>
				<div >
					<%@ include file="open-account.jsp" %>
					
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<%@ include file="../home/footer.jsp" %>
			</td>
		</tr>
	</table>
</body>
</html>