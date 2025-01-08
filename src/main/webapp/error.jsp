<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h2>Error occurred</h2>
    <p><strong>Message:</strong> <%= exception.getMessage() %></p>
    <p><strong>Stack Trace:</strong></p>
    <pre><%= exception.toString() %></pre>
</body>
</html>
