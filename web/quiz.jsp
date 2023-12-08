<%-- 
    Document   : quiz
    Created on : Jun 26, 2023, 11:13:44 PM
    Author     : Shravan
--%>




<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Quiz System</title>
    <link rel="stylesheet" type="text/css" href="header.css">
    <link rel="stylesheet" type="text/css" href="fotter.css">
    <style>
        body {
    background-color: #fff;
    color: #000;
    font-family: Arial, sans-serif;
}

.quiz-container {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
}

h2 {
    font-size: 24px;
    margin-bottom: 20px;
}

.card {
    border: 1px solid #ccc;
    border-radius: 4px;
    margin: 10px;
    padding: 10px;
    width: 200px;
    background-color: #fff;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.card:hover {
    background-color: #f5f5f5;
}

.card-body {
    padding: 10px;
}

.card-title {
    font-size: 18px;
    margin: 0;
}

.btn {
    display: inline-block;
    padding: 6px 12px;
    margin-top: 10px;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    cursor: pointer;
    border: 1px solid transparent;
    border-radius: 4px;
    background-color: #428bca;
    color: #fff;
    text-decoration: none;
}

.btn:hover {
    background-color: #357ebd;
}

    </style>
</head>
<%@ include file="header.jsp" %>
<body>
    <h1>Java Quiz</h1>
    <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizze", "root", "");

            // Retrieve the subjects from the database
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT DISTINCT subject FROM questions");

            // Display the subjects in cards
            while (rs.next()) {
                String subject = rs.getString("subject");
    %>
    <div class="card">
        <div class="card-body">
            <h5 class="card-title"><%= subject %></h5>
            <a href="question.jsp?subject=<%= subject %>" class="btn btn-primary">Start Quiz</a>
        </div>
    </div>
    <%
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the database connections
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    %>
    <%@ include file="fotter.jsp" %>
</body>
</html>


