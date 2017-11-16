package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class smprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Space Manager Profile</title>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("        .jumbotron, .footer{\n");
      out.write("            background-color: #1b6d85;\n");
      out.write("            color:#fff;\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                background-color: #ebebeb;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">ADIOS@UTM</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"smprofile.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"ViewSession.jsp\">View Session</a></li>\n");
      out.write("      <li><a href=\"login.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<br><br> <center>\n");
      out.write("    <div class=\"jumbotron text-center\">\n");
      out.write("        <h1>Space Management Booking System</h1>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"container-fluid text-center bg-grey\">\n");
      out.write("    <h2>Space Manager Information</h2><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <A><img src=\"img/profiles.png\" style=\"width:150px;height:150px;\"/></A>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"editSM.jsp\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info\" value=\"EDIT PROFILE\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                    <table style=\"text-align:left\">\n");
      out.write("                    <tr>\n");
      out.write("                    <td><b>ID</td>\n");
      out.write("                    <td> : </td>\n");
      out.write("                    <tr></tr>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <tr> </tr>\n");
      out.write("                    <td><b>Name</td>\n");
      out.write("                    <td>: </td>\n");
      out.write("                    <tr></tr>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <tr> </tr>\n");
      out.write("                    <td><b>Email</td>\n");
      out.write("                    <td>: </td>\n");
      out.write("                    <tr></tr>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <tr> </tr>\n");
      out.write("                    <td><b>Phone No</td>\n");
      out.write("                    <td>: </td>\n");
      out.write("                    <tr></tr>\n");
      out.write("                </tr>\n");
      out.write("                <br><br>\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\t\n");
      out.write("           \n");
      out.write("<div class=\"footer\"> \n");
      out.write("<center><br><p>Copyright@Universiti Teknologi Malaysia</p><br></center>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
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
