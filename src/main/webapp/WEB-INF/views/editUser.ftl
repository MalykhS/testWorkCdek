<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${user.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${user.name}">
    <input type="submit" value="Ok">
</form>
<br>
<a href="/">Back</a>
</body>
</html>