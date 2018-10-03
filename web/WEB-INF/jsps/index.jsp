<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.2.1.js"></script>
</head>
<body>
<form id="form" action="user/register" method="post" onsubmit="return checkUser1()">
    帐号：<input type="text" name="userName"  id="userName"><br>
    密码：<input type="password" name="password" id="password"><br>
    <input type="submit" value="注册">
    <input id="login" type="button" value="登陆" onclick="checkUser2()">
</form>
</body>
</html>
<script>
    //使用表单提交事件进行验证提交
    function checkUser1() {
        var userName = $('#userName').val();
        var password = $('#password').val();
        if ('' == userName) {
            alert('用户名不能为空！');
            return false;
        }
        if ('' == password) {
            alert('密码不能为空！');
            return false;
        }
        return true;
    }

    //使用单击事件进行验证提交
    function checkUser2() {
        var userName = $('#userName').val();
        var password = $('#password').val();
        if ('' == userName) {
            alert('用户名不能为空！');
            return false;
        }
        if ('' == password) {
            alert('密码不能为空！');
            return false;
        }
        $('#form').get(0).action = 'user/login';
        $('#form').get(0).submit();
    }</script>
