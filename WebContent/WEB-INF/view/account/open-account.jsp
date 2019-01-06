<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="content">
	<form action="account.do">
		<h1>계좌 개설</h1>
		입 금 액 : <input type="text" name="money" />
		<input type="submit" id="btn" value="확 인"/>
		<input type="hidden" name="cmd" value="open-account" />
		<input type="hidden" name="page" value="open-result" />
	</form>
</div>