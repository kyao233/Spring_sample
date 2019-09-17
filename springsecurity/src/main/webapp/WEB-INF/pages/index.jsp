<%--
  Created by IntelliJ IDEA.
  User: K.Yao
  Date: 2019/9/17
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Home page</title>
</head>
<body>
<!-- see jsp 2.3 spec -->
<a href="<%= request.getContextPath() %>product/add">add a product</a>
<a href="<%= request.getContextPath() %>product/update">update a product</a>
<a href="<%= request.getContextPath() %>product/list">list all product</a>
<a href="<%= request.getContextPath() %>product/del">delete a product</a>

</body>
</html>
