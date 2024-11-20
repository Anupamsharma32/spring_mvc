
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>
</head>
<body>
    <h1>Hello, World!</h1>
    <%
         String name=(String)request.getAttribute("name");
    %>
    <h1>Name is <%=name%></h1>
</body>
</html>
