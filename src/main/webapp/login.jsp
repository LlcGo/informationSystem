<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆页面</title>
    <link rel="stylesheet" type="text/css" href="./css/login.css" />
    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
    <script type="text/javascript" src="./js/login.js"></script>
</head>
<body style="background-color: aliceblue" >
<div id="bigBox">
    <h1>登录</h1>
    <div class="inputBox">
        <form action="login" method="post">
            <input type="hidden" name="sendName"  value="login">
            <div class="inputText">
                <i class="fa fa-user-circle" style="color: whitesmoke;"></i>
                <input type="text" placeholder="用户账户" name="userAccount"/>
            </div>
            <div class="inputText">
                <i class="fa fa-key" style="color: whitesmoke;"></i>
                <input type="password" placeholder="密码" name="userPassword"/>
            </div>
            <input type="submit" class="inputButton" value="登录" />
            <input type="button" class="inputButton" onclick="reg()" value="注册" />
        </form>
    </div>
</div>
</body>
</html>

