package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class question_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Quiz System</title>\n");
      out.write("     <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            font-size: 24px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .question {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h3 {\n");
      out.write("            font-size: 18px;\n");
      out.write("            margin: 10px 0 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"radio\"] {\n");
      out.write("            margin-top: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 8px 16px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            line-height: 1.5;\n");
      out.write("            text-align: center;\n");
      out.write("            white-space: nowrap;\n");
      out.write("            vertical-align: middle;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #e0e0e0;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Quiz Questions</h1>\n");
      out.write("    <form action=\"QuizServlet\" method=\"post\">\n");
      out.write("        ");

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
    
      out.write("\n");
      out.write("    <div class=\"question\">\n");
      out.write("        <h3>Question ");
      out.print( questionId );
      out.write(":</h3>\n");
      out.write("        <p>");
      out.print( question );
      out.write("</p>\n");
      out.write("        <input type=\"radio\" name=\"answer");
      out.print( questionId );
      out.write("\" value=\"");
      out.print( option1 );
      out.write('"');
      out.write('>');
      out.print( option1 );
      out.write("<br>\n");
      out.write("        <input type=\"radio\" name=\"answer");
      out.print( questionId );
      out.write("\" value=\"");
      out.print( option2 );
      out.write('"');
      out.write('>');
      out.print( option2 );
      out.write("<br>\n");
      out.write("        <input type=\"radio\" name=\"answer");
      out.print( questionId );
      out.write("\" value=\"");
      out.print( option3 );
      out.write('"');
      out.write('>');
      out.print( option3 );
      out.write("<br>\n");
      out.write("        <input type=\"radio\" name=\"answer");
      out.print( questionId );
      out.write("\" value=\"");
      out.print( option4 );
      out.write('"');
      out.write('>');
      out.print( option4 );
      out.write("<br>\n");
      out.write("    </div>\n");
      out.write("    ");

                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the database connections
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
    
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
