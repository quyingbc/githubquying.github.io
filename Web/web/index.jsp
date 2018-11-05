<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/11/4
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录界面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <%--<link rel="stylesheet" type="text/css" href="index.css">--%>

    <style type="text/css">
      html{
        margin: 0;
        padding: 0;
      }
      html{
        height: 100%;
      }

      body{
        display: flex;
        flex-direction: column;
        min-height: 100%;
        color: #63A479;
        background-color: #3D4D54;
      }

      header{
        text-align: left;
        width: 100%;
        height: 20%;
        margin-left: 20px;
        font-size: 2rem;
        font-family: 'Oswald', sans-serif;

      }

      form{

        font-size: 50px;
        color: #63A479;
        margin:auto;
        padding:10px;
        line-height:4 ;
      }

      label{
        font-size: 50px;
        color: #63A479;
        display: flex;

        align-items: center;
        justify-content: center;
        vertical-align: middle ;
      }
      input{
        height: 1.5em;
        vertical-align: middle ;
      }


      .login_click input
      {
          text-decoration:none;
          background:#63A479;
          color:#f2f2f2;

          padding: 10px 30px 10px 30px;
          font-size:50px;
          font-family: 微软雅黑,宋体,Arial,Helvetica,Verdana,sans-serif;
          font-weight:bold;
          border-radius:3px;
          height:2em;
          width:5em;



      }

    </style>
  </head>

  <body>
  <header>
    <h1>Welcome!</h1>
  </header>

  <form class="form-inline" action="LoginServlet?method=login" method="post">
    <div class="form-group">
      <label  >UserName:<input type="username" name="username" class="form-control"/></label>
    </div>

    <div class="form-group">
      <label>PassWord:<input type="password" name="password" class="form-control"/></label>
    </div>

    <div class="login_click">
      <input type="submit" value="登录" /> <a href="register.jsp">注册</a>
    </div>



  </form>
  </body>
</html>

