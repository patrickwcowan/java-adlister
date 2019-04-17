
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Hi, ${name}</h1>
<form method="post" action="login.jsp">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">

    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">

    <br>
    <input type="submit">

</form>


<script>


</script>
</body>
</html>
