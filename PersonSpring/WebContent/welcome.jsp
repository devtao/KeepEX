<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Welcome dat</title>
    <style type="text/css">
	html {
		background-color: #E9EEF0
	}
	.wrapper {
		margin: 140px auto;
		width: 884px;
	}
	.loginBox {
		background-color: #FEFEFE;
		border: 1px solid #BfD6E1;
		border-radius: 5px;
		color: #444;
		font: 14px 'Microsoft YaHei','微软雅黑';
		margin: 0 auto;
		width: 388px
	}
	.loginBox .loginBoxCenter {
		border-bottom: 1px solid #DDE0E8;
		padding: 24px;
	}
	.loginBox .loginBoxCenter p {
		margin-bottom: 10px
	}
	.loginBox .loginBoxButtons {
		background-color: #F0F4F6;
		border-top: 1px solid #FFF;
		border-bottom-left-radius: 5px;
		border-bottom-right-radius: 5px;
		line-height: 28px;
		overflow: hidden;
		padding: 20px 24px;
		vertical-align: center;
	}
	.loginBox .loginInput {
		border: 1px solid #D2D9dC;
		border-radius: 2px;
		color: #444;
		font: 12px 'Microsoft YaHei','微软雅黑';
		padding: 8px 14px;
		margin-bottom: 8px;
		width: 310px;
	}
	.loginBox .loginInput:FOCUS {
		border: 1px solid #B7D4EA;
		box-shadow: 0 0 8px #B7D4EA;
	}
	.loginBox .loginBtn {
		background-image: -moz-linear-gradient(to bottom, #B5DEF2, #85CFEE);
		border: 1px solid #98CCE7;
		border-radius: 20px;
		box-shadow:inset rgba(255,255,255,0.6) 0 1px 1px, rgba(0,0,0,0.1) 0 1px 1px;
		color: #FFF;
		cursor: pointer;
		float: right;
		font: bold 13px Arial;
		padding: 5px 14px;
	}
	.loginBox .loginBtn:HOVER {
		background-image: -moz-linear-gradient(to top, #B5DEF2, #85CFEE);
	}
	.loginBox a.forgetLink {
		color: #ABABAB;
		cursor: pointer;
		float: right;
		font: 11px/20px Arial;
		text-decoration: none;
		vertical-align: middle;
	}
	.loginBox a.forgetLink:HOVER {
		text-decoration: underline;
	}
	.loginBox input#remember {
		vertical-align: middle;
	}
	.loginBox label[for="remember"] {
		font: 11px Arial;
	}
	</style>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

	<body>
		<div class="wrapper">
			<form action="login.do" method="post">
				<div class="loginBox">
					<div class="loginBoxCenter">
						<p>
							<label for="username">
								电子邮箱(用户名)：
							</label>
						</p>
						<p>
							<input type="email" id="email" name="email" class="loginInput"
								autofocus="autofocus" required="required" autocomplete="off"
								placeholder="请输入电子邮箱" value="" />
						</p>
						<p>
							<label for="password">
								密码：
							</label>
							<a class="forgetLink" href="#">忘记密码?</a>
						</p>
						<p>
							<input type="password" id="password" name="password"
								class="loginInput" required="required" placeholder="请输入密码"
								value="" />
						</p>
					</div>
					<div class="loginBoxButtons">
						<input id="remember" type="checkbox" name="remember" />
						<label for="remember">
							记住登录状态
						</label>
						<button type="submit" class="loginBtn">
							登录
						</button>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>
