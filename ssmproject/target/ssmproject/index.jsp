<%--
  Created by IntelliJ IDEA.
  User: 16862
  Date: 2020/5/11
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/stu/findAll">查询所有</a><br>

新增：
<form method="post" action="/stu/add">
    姓名：<input type="text" name="name"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" name="添加"><br>
</form><br>

修改：
<form method="post" action="/stu/update">
    id：<input type="text" name="id"><br>
    姓名：<input type="text" name="name"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" name="修改"><br>
</form><br>

删除：
<form method="post" action="/stu/delete">
    删除的id：<input type="text" name="id"><br>
    <input type="submit" name="删除"><br>
</form><br>

</body>
</html>
