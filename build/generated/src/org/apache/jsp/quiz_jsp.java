package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/fotter.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Quiz System</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"header.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fotter.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("    background-color: #fff;\n");
      out.write("    color: #000;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".quiz-container {\n");
      out.write("    max-width: 800px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("    font-size: 24px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    margin: 10px;\n");
      out.write("    padding: 10px;\n");
      out.write("    width: 200px;\n");
      out.write("    background-color: #fff;\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover {\n");
      out.write("    background-color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-body {\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-title {\n");
      out.write("    font-size: 18px;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 6px 12px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    font-size: 14px;\n");
      out.write("    font-weight: 400;\n");
      out.write("    line-height: 1.42857143;\n");
      out.write("    text-align: center;\n");
      out.write("    white-space: nowrap;\n");
      out.write("    vertical-align: middle;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border: 1px solid transparent;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background-color: #428bca;\n");
      out.write("    color: #fff;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    background-color: #357ebd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Java Quizzes - Header</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"header.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-container\">\n");
      out.write("            <h1>Java Quiz</h1>\n");
      out.write("            <p>Welcome to the Java Quizzes website. Test your Java knowledge and improve your skills!</p>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <h1>Java Quiz</h1>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">");
      out.print( subject );
      out.write("</h5>\n");
      out.write("            <a href=\"question.jsp?subject=");
      out.print( subject );
      out.write("\" class=\"btn btn-primary\">Start Quiz</a>\n");
      out.write("        </div>\n");
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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Java Quiz - Footer</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"footer.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-container\">\n");
      out.write("            <p>&copy; 2023 Java Quizzes. All rights reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
