<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/include.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>
      hello
    </title>
    <script type="text/javascript"  src="${ctx} /js/jquery-1.11.2.js">
    </script>
    <script type="text/javascript">
      $(document).ready(function(){
		alert('33');
        });
      </script>
    </head>
    <body>
      <form id="login" action="${ctx}/j_spring_security_check"  method="post" >
        用户名
        <input name="j_username" type="text" />
        <br>
        密码
        <input name="j_password" type="text" />
        <br>
        <input type="submit">

      </form>
    </body>
  </html>
