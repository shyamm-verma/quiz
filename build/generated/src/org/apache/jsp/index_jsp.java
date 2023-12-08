package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quiz App</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"navbar.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .custom-category-list {\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-category-list li {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                padding: 5px;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                color: #343a40;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-latest-quizzes .custom-card {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-latest-quizzes .custom-card-body {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-latest-quizzes .custom-card-title {\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-latest-quizzes .custom-card-text {\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-btn-primary {\n");
      out.write("                background-color: #343a40;\n");
      out.write("                border-color: #343a40;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-btn-primary:hover {\n");
      out.write("                background-color: #212529;\n");
      out.write("                border-color: #212529;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-container {\n");
      out.write("                margin-top: 60px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-category-list li:hover {\n");
      out.write("                background-color: #f8f9fa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-card {\n");
      out.write("                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("                transition: transform 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom-card:hover {\n");
      out.write("                transform: translateY(-5px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn_start_quiz {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Main Content -->\n");
      out.write("        <div class=\"container custom-container\">\n");
      out.write("            <!-- Jumbotron -->\n");
      out.write("            <div class=\"jumbotron custom-jumbotron\">\n");
      out.write("                <h1>Welcome to the Quiz App</h1>\n");
      out.write("                <p>Test your knowledge and have fun!</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Quiz Categories and Latest Quizzes -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Categories -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <h2>Categories</h2>\n");
      out.write("                    <ul class=\"custom-category-list\">\n");
      out.write("                        <li>Java</li>\n");
      out.write("                        <li>C++</li>\n");
      out.write("                        <li>Data Structure</li>\n");
      out.write("                        <li>DBMS</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Latest Quizzes -->\n");
      out.write("                <div class=\"col-md-8 custom-latest-quizzes\">\n");
      out.write("                    <h2>Latest Quizzes</h2>\n");
      out.write("                    <div class=\"card custom-card\" data-aos=\"fade-up\">\n");
      out.write("                        <div class=\"card-body custom-card-body\">\n");
      out.write("                            <h5 class=\"card-title custom-card-title\">Quiz 1: Java Quiz</h5>\n");
      out.write("                            <p class=\"card-text custom-card-text\">Test your knowledge in Java.</p>\n");
      out.write("                            <a href=\"quiz.jsp?subject=Java\" class=\"btn custom-btn-primary btn_start_quiz\">Start Quiz</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card custom-card\" data-aos=\"fade-up\">\n");
      out.write("                        <div class=\"card-body custom-card-body\">\n");
      out.write("                            <h5 class=\"card-title custom-card-title\">Quiz 2: DBMS</h5>\n");
      out.write("                            <p class=\"card-text custom-card-text\">Test your knowledge of Database Management Systems.</p>\n");
      out.write("                            <a href=\"quiz.jsp?subject=DBMS\" class=\"btn custom-btn-primary btn_start_quiz btn_start_quiz\">Start Quiz</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
