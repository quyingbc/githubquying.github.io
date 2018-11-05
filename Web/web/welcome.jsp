<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/11/4
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>管理员界面</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link rel="stylesheet" type="text/css" href="Manger.css">

</head>

<body>
<header>
    <h1>Welcome!</h1>
</header>

    <form action="LoginServlet?method=logout" method="post">
        <div class="display">
            <center>
                <label>input:</label>
                <input type="text" name="Search" >
            </center>
        </div>

        <section >
            <div class="function">
                <div class="manger-teach">
                    <div class="manger-svg">
                        <img src="image/manager1.svg" alt="" style="vertical-align: middle ">
                        <a href="#teach">Teaching Laboratory</a>
                    </div>



                </div>


                <div class="manger-open">

                    <div class="manger-svg">
                        <img src="image/archive.svg" alt=""  style="vertical-align: middle ">
                        <a href="#open">Opening Laboratory</a>
                    </div>
                </div>

                <div class="manger-course">

                    <div class="manger-svg">
                        <img src="image/books.svg" alt=""  style="vertical-align: middle ">
                        <a href="#course">Course  Laboratory</a>
                    </div>
                </div>


            </div>
        </section>

        <footer>
            @Copyright-Changzhou Institute of Technology 2018-2020
        </footer>
    </form>
</body>
</html>
