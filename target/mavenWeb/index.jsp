<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Hi,friends</title>
</head>
<body>
<form action="<%=basePath %>test" method="post">
    <input name="name">
    return:${name}
    <input value="提交" type="submit">
</form>
</body>
</html>