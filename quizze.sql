-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2023 at 06:49 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizze`
--

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `question_id` int(11) NOT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `question` text DEFAULT NULL,
  `option1` varchar(255) DEFAULT NULL,
  `option2` varchar(255) DEFAULT NULL,
  `option3` varchar(255) DEFAULT NULL,
  `option4` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`question_id`, `subject`, `question`, `option1`, `option2`, `option3`, `option4`, `answer`) VALUES
(1, 'JDBC', 'What does JDBC stand for?', 'Java Database Connection', 'Java Database Connectivity', 'Java Data Binding Connector', 'Java Database Collaboration', 'Java Database Connectivity'),
(2, 'JDBC', 'Which interface is used to establish a connection to a database using JDBC?', 'Connection', 'Statement', 'ResultSet', 'DriverManager', 'DriverManager'),
(3, 'JDBC', 'What is the purpose of the PreparedStatement interface in JDBC?', 'To execute parameterized SQL queries', 'To execute stored procedures', 'To handle batch updates efficiently', 'To retrieve and manipulate database metadata', 'To execute parameterized SQL queries'),
(4, 'JDBC', 'How can you retrieve data from a database using JDBC?', 'Using the executeQuery() method of the Statement interface', 'Using the executeUpdate() method of the Statement interface', 'Using the execute() method of the Statement interface', 'Using the execute() method of the PreparedStatement interface', 'Using the executeQuery() method of the Statement interface'),
(5, 'JDBC', 'Which method is used to close a JDBC connection?', 'close()', 'shutdown()', 'disconnect()', 'endConnection()', 'close()'),
(6, 'JDBC', 'How can you handle database transactions in JDBC?', 'By using the setAutoCommit() method of the Connection interface', 'By using the commit() method of the Connection interface', 'By using the rollback() method of the Connection interface', 'All of the above', 'All of the above'),
(7, 'JDBC', 'Which interface is used to execute SQL statements and retrieve results in JDBC?', 'Connection', 'Statement', 'ResultSet', 'DriverManager', 'Statement'),
(8, 'JDBC', 'What is the purpose of the ResultSet interface in JDBC?', 'To represent the result of a database query', 'To represent a connection to a database', 'To represent a prepared SQL statement', 'To represent a connection pool', 'To represent the result of a database query'),
(9, 'JDBC', 'Which exception is thrown when a database connection cannot be established in JDBC?', 'SQLException', 'ClassNotFoundException', 'IOException', 'NullPointerException', 'SQLException'),
(10, 'JDBC', 'What is the recommended way to handle JDBC resources like connections and statements?', 'Close them explicitly in a finally block', 'Let the JVM automatically clean them up', 'Use a garbage collector to free the resources', 'None of the above', 'Close them explicitly in a finally block'),
(11, 'Servlets', 'What is a servlet?', 'A Java program that extends the functionality of a web server', 'A JavaScript code that runs on the client-side', 'A markup language used for web page design', 'A database management system', 'A Java program that extends the functionality of a web server'),
(12, 'Servlets', 'Which method is called when a servlet is initialized?', 'init()', 'service()', 'doGet()', 'doPost()', 'init()'),
(13, 'Servlets', 'What is the purpose of the doGet() method in a servlet?', 'To handle HTTP GET requests', 'To handle HTTP POST requests', 'To initialize the servlet', 'To destroy the servlet', 'To handle HTTP GET requests'),
(14, 'Servlets', 'Which HTTP method is used for submitting form data to a servlet?', 'POST', 'GET', 'PUT', 'DELETE', 'POST'),
(15, 'Servlets', 'What is the purpose of the doPost() method in a servlet?', 'To handle HTTP POST requests', 'To handle HTTP GET requests', 'To initialize the servlet', 'To destroy the servlet', 'To handle HTTP POST requests'),
(16, 'Servlets', 'What is the ServletConfig object?', 'An object that provides configuration information to a servlet', 'An object that represents the client browser', 'An object that handles session tracking', 'An object that represents the servlet container', 'An object that provides configuration information to a servlet'),
(17, 'Servlets', 'Which method is called for every request processed by a servlet?', 'service()', 'init()', 'doGet()', 'doPost()', 'service()'),
(18, 'Servlets', 'What is the purpose of the ServletContext object?', 'An object that provides information about the servlet container', 'An object that represents the client browser', 'An object that handles session tracking', 'An object that provides configuration information to a servlet', 'An object that provides information about the servlet container'),
(19, 'Servlets', 'What is the role of the web.xml file in a servlet application?', 'To configure servlets and other components', 'To write Java code for servlets', 'To store HTML templates', 'To define the web page layout', 'To configure servlets and other components'),
(20, 'Servlets', 'What is the purpose of the HttpServletResponse object?', 'An object that represents the HTTP response', 'An object that represents the HTTP request', 'An object that handles session tracking', 'An object that represents the servlet container', 'An object that represents the HTTP response'),
(21, 'JSP', 'What is JSP?', 'Java Server Pages', 'JavaScript Pages', 'Java Scripting Pages', 'Java Servlet Pages', 'Java Server Pages'),
(22, 'JSP', 'What is the full form of EL in JSP?', 'Expression Language', 'Element Language', 'Embedded Language', 'Extended Language', 'Expression Language'),
(23, 'JSP', 'What is the purpose of JSP directives?', 'To provide instructions to the JSP container', 'To define Java classes in JSP', 'To handle user input', 'To define page layout', 'To provide instructions to the JSP container'),
(24, 'JSP', 'Which JSP directive is used to import Java packages?', 'page import', 'page include', 'page language', 'page session', 'page import'),
(25, 'JSP', 'What is the purpose of JSP expressions?', 'To evaluate and display dynamic content', 'To define Java methods in JSP', 'To handle user input', 'To define page layout', 'To evaluate and display dynamic content'),
(26, 'JSP', 'What is the syntax for a JSP expression?', '<%= expression %>', '{{ expression }}', '${ expression }', '<# expression #>', '<%= expression %>'),
(27, 'JSP', 'What is the purpose of JSP scriptlets?', 'To write Java code in JSP', 'To define CSS styles', 'To handle user input', 'To define page layout', 'To write Java code in JSP'),
(28, 'JSP', 'Which JSP element is used to include external files?', 'jsp:include', 'jsp:useBean', 'jsp:forward', 'jsp:taglib', 'jsp:include'),
(29, 'JSP', 'What is the purpose of JSP actions?', 'To perform specific tasks in JSP', 'To define Java classes in JSP', 'To handle user input', 'To define page layout', 'To perform specific tasks in JSP'),
(30, 'JSP', 'Which JSP action is used to iterate over a collection?', 'jsp:forEach', 'jsp:if', 'jsp:choose', 'jsp:set', 'jsp:forEach'),
(31, 'JSTL', 'What is JSTL?', 'JavaServer Pages Standard Tag Library', 'JavaScript Template Library', 'Java Servlet Tag Library', 'Java Server Template Language', 'JavaServer Pages Standard Tag Library'),
(32, 'JSTL', 'What is the purpose of JSTL?', 'To simplify the development of JSP pages', 'To define CSS styles', 'To handle user input', 'To define page layout', 'To simplify the development of JSP pages'),
(33, 'JSTL', 'Which tag library is used for core functionalities in JSTL?', 'c', 'fmt', 'sql', 'xml', 'c'),
(34, 'JSTL', 'What is the purpose of the <c:if> tag in JSTL?', 'To conditionally display content', 'To define variables', 'To iterate over a collection', 'To format data', 'To conditionally display content'),
(35, 'JSTL', 'Which JSTL tag is used for looping?', 'c:forEach', 'c:if', 'c:choose', 'c:set', 'c:forEach'),
(36, 'JSTL', 'What is the purpose of the <c:set> tag in JSTL?', 'To define variables', 'To conditionally display content', 'To format data', 'To include external files', 'To define variables'),
(37, 'JSTL', 'Which JSTL tag is used for conditional statements?', 'c:choose', 'c:if', 'c:forEach', 'c:set', 'c:choose'),
(38, 'JSTL', 'What is the purpose of the <c:forEach> tag in JSTL?', 'To iterate over a collection', 'To conditionally display content', 'To format data', 'To include external files', 'To iterate over a collection'),
(39, 'JSTL', 'Which JSTL tag is used for formatting data?', 'fmt:format', 'c:if', 'c:choose', 'c:set', 'fmt:format'),
(40, 'JSTL', 'What is the purpose of the <fmt:format> tag in JSTL?', 'To format data', 'To conditionally display content', 'To define variables', 'To include external files', 'To format data'),
(41, 'XML', 'What does XML stand for?', 'eXtensible Markup Language', 'eXecutable Markup Language', 'eXtreme Markup Language', 'eXplicit Markup Language', 'eXtensible Markup Language'),
(42, 'XML', 'What is the purpose of XML?', 'To store and transport data', 'To define programming logic', 'To style web pages', 'To perform database queries', 'To store and transport data'),
(43, 'XML', 'What is the syntax for creating an XML element?', '<elementName>elementValue</elementName>', '(elementName)elementValue(/elementName)', '[elementName]elementValue[/elementName]', '{elementName}elementValue{/elementName}', '<elementName>elementValue</elementName>'),
(44, 'XML', 'What is the purpose of XML namespaces?', 'To avoid element name conflicts', 'To define programming logic', 'To style web pages', 'To perform database queries', 'To avoid element name conflicts'),
(45, 'XML', 'What is the role of XML schema?', 'To define the structure of XML documents', 'To perform data calculations', 'To define CSS styles', 'To define web page layout', 'To define the structure of XML documents'),
(46, 'XML', 'Which language is used to define XML schemas?', 'XML Schema Definition (XSD)', 'Extensible Stylesheet Language (XSL)', 'Document Type Definition (DTD)', 'JavaScript Object Notation (JSON)', 'XML Schema Definition (XSD)'),
(47, 'XML', 'What is the purpose of the XML prolog?', 'To specify the XML version and encoding', 'To define the root element', 'To perform database queries', 'To define CSS styles', 'To specify the XML version and encoding'),
(48, 'XML', 'What is the difference between well-formed XML and valid XML?', 'Well-formed XML follows the syntax rules, while valid XML additionally conforms to a defined structure (schema)', 'Well-formed XML can contain any elements, while valid XML has restrictions on element names', 'Well-formed XML can only be used for data storage, while valid XML is used for programming logic', 'Well-formed XML can be nested indefinitely, while valid XML has a maximum nesting level', 'Well-formed XML follows the syntax rules, while valid XML additionally conforms to a defined structure (schema)'),
(49, 'XML', 'Which language is used to transform XML data?', 'Extensible Stylesheet Language (XSL)', 'XML Schema Definition (XSD)', 'Document Type Definition (DTD)', 'JavaScript Object Notation (JSON)', 'Extensible Stylesheet Language (XSL)'),
(50, 'XML', 'What is the purpose of XML comments?', 'To add explanatory notes within the XML code', 'To define the root element', 'To perform database queries', 'To define CSS styles', 'To add explanatory notes within the XML code');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `email` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `date_of_registration` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`email`, `password`, `name`, `date_of_registration`) VALUES
('karan.j@somaiya.edu', 'karan', 'Karan Jain', '2023-06-23 00:00:00'),
('manish@gmail.com', 'manish', 'Manish Chanda', '2023-06-23 01:20:20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`question_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
