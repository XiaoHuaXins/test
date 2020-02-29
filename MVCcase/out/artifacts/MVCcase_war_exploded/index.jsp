<%--
  Created by IntelliJ IDEA.
  User: pro
  Date: 2020/2/16
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆</title>
  </head>
  <body>
      <form action="Servlet" method="post" >
        用户名：<input type="text" name="uname"><br>
        密码：<input type="password" name="upwd"><br>
        <input type="submit" value="登陆">
        <input type="submit" value="注册">
      </form>
  </body>
</html>
