<%@ page contentType="text/html; charset=UTF-8"%>

<%@ page import="java.sql.*"%>

<html>
<title>相约书店</title>
  
  <body>
     <form action="/register.action" method="post">
       名字:<input type="text" name="user.name">
       <br>
       性别:<input type="text" name="user.gender">
       <br>
       <input type="submit" name="submit" value="提交">
      </form>

</body>


</html>