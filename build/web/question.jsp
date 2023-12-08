<%-- 
    Document   : question.jsp
    Created on : Jun 27, 2023, 2:50:28 AM
    Author     : Shravan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Quiz System</title>
     <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .question {
            margin-bottom: 20px;
        }

        h3 {
            font-size: 18px;
            margin: 10px 0 5px;
        }

        p {
            margin: 0;
        }

        input[type="radio"] {
            margin-top: 5px;
        }

        input[type="submit"] {
            display: inline-block;
            padding: 8px 16px;
            font-size: 16px;
            font-weight: bold;
            line-height: 1.5;
            text-align: center;
            white-space: nowrap;
            vertical-align: middle;
            cursor: pointer;
            border: 1px solid #ccc;
            border-radius: 4px;
            background-color: #f5f5f5;
            color: #333;
        }

        input[type="submit"]:hover {
            background-color: #e0e0e0;
        }
    </style>
</head>
<body>
    <h1>Quiz Questions</h1>
    <form action="QuizServlet" method="post">
        <%
            String subject = request.getParameter("subject");

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                // Connect to the database
                 Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizze", "root", "");
                // Retrieve the questions for the selected subject
                stmt = conn.createStatement();
                rs = stmt.executeQuery("SELECT * FROM questions WHERE subject='" + subject + "'");

                // Display the questions and options
                while (rs.next()) {
                    int questionId = rs.getInt("question_id");
                    String question = rs.getString("question");
                    String option1 = rs.getString("option1");
                    String option2 = rs.getString("option2");
                    String option3 = rs.getString("option3");
                    String option4 = rs.getString("option4");
    %>
    <div class="question">
        <h3>Question <%= questionId %>:</h3>
        <p><%= question %></p>
        <input type="radio" name="answer<%= questionId %>" value="<%= option1 %>"><%= option1 %><br>
        <input type="radio" name="answer<%= questionId %>" value="<%= option2 %>"><%= option2 %><br>
        <input type="radio" name="answer<%= questionId %>" value="<%= option3 %>"><%= option3 %><br>
        <input type="radio" name="answer<%= questionId %>" value="<%= option4 %>"><%= option4 %><br>
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
    <input type="submit" value="Submit">
    </form>
</body>
</html>