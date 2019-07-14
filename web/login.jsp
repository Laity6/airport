<%--
  Created by IntelliJ IDEA.
  User: xulin
  Date: 2019/7/14
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证码测试</title>
</head>
<body>
<form action="" method="post">
    <table>
      <tr>
          <td>用户名</td>
          <td><input type="text" name="username"> </td>
      </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password"> </td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" size="1"> <img src="valicode"><a href="">看不清</a></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="登录"> <input type="reset" value="重置"> </td>
        </tr>
    </table>

</form>
</body>
</html>
