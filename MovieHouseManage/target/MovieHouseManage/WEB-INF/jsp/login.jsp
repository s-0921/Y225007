<%--
  Created by IntelliJ IDEA.
  User: 呵呵丶丶呵呵
  Date: 2019/12/13
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#btn").click(function(){
                $.ajax({
                    url:"${pageContext.request.contextPath}/user/login",
                    type: "POST",
                    data: $("#form").serialize(),
                    dataType: "json",
                    success: function(respData){
                        if(respData == false){
                            alert("账号或密码有误！")
                        }else{
                            window.location.href="${pageContext.request.contextPath}/main";
                        }
                    }
                });
            });
        });
    </script>
</head>
<body>

<form id="form">
    <table>
        <tr>
            <td>手机号：</td>
            <td><input type="text" name="phone" /></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="pwd" /></td>
        </tr>
        <tr>
            <td><input type="button" id="btn" value="登陆" /></td>
            <td><a href="${pageContext.request.contextPath}/registerUI">注册</a></td>
        </tr>
    </table>
</form>
</body>
</html>
