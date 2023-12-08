<%-- 
    Document   : result.jsp
    Created on : Jun 27, 2023, 3:18:44 AM
    Author     : Shravan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Quiz Result</title>
    
         <style>
        body {
            font-family: Arial, sans-serif;
        }
        
        h1 {
            color: #333;
        }
        
        h2 {
            color: red;
        }
        
        .score {
            font-size: 24px;
            font-weight: bold;
        }
        
        .correct-answer {
            color: green;
            font-weight: bold;
        }
        
        .incorrect-answer {
            color: red;
            font-weight: bold;
        }
        
        .question {
            font-size: 20px;
            font-weight: bold;
        }
    </style>
    
</head>
<body>
    <h1>Quiz Result</h1>
    <p class="score">Your score: ${score}</p>
    
    
</body>
</html>








