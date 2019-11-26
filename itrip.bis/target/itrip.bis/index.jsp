<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
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
<a class="show" href="javascript:;">显示</a>
<div id="mydiv"></div>
</body>
    <script src="statics/js/jquery.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".show").click(function(){
                alert("666");
                $.ajax({
                    url:"api/hotel/queryhotels",
                    type:"get",
                    dataType:"json",
                    success:function(data){
                        alert(data.message);
                    },
                    error:function(data){
                        alert(data.errorCode);
                    }
                });
            });

        });
    </script>
</html>
