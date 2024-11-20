<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Upload File for Range Sum Calculation</title>
</head>
<body>
    <h1>Upload File for Range Sum Calculation</h1>
    <form action="uploadimage" method="post" enctype="multipart/form-data">
        <label for="file">Choose a file (text format):</label><br>
        <input type="file" id="file" name="file" accept=".txt" required><br><br>

        <label for="left">Enter Left Index:</label><br>
        <input type="number" id="left" name="left" required><br><br>

        <label for="right">Enter Right Index:</label><br>
        <input type="number" id="right" name="right" required><br><br>

        <button type="submit">Upload and Calculate</button>
    </form>
</body>
</html>
