<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1> Users list </h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th colspan="2">Action</th>
    </tr>
    <#list users as user>
    <tr>
        <td><a href="/user/${user.id}">${user.id}</a></td>
        <td>${user.name}</td>
        <td><a href="/delete/${user.id}">Delete</a> </td>
        <td><a href="/update/${user.id}">Update</a> </td>
    </tr>
    </#list>
</table>
<br>
<a href="/addUser">Create user</a>
</body>
</html>