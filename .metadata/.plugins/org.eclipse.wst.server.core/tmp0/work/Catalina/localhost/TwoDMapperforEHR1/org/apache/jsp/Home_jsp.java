/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2013-11-20 09:05:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Two Dimensional Body Map for EHR</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"img/icon.PNG\">\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/business-casual.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("     <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("     \r\n");
      out.write("     <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">   \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderLayout.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"container\" style=\"height: 100%\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\" style=\"height: 710px\">\r\n");
      out.write("        <div class=\"box\" style=\"height: 100%\">\r\n");
      out.write("          <div class=\"col-lg-12 text-center\">\r\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\">\r\n");
      out.write("              <!-- Indicators -->\r\n");
      out.write("              <ol class=\"carousel-indicators hidden-xs\">\r\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("              </ol>\r\n");
      out.write("            \r\n");
      out.write("              <!-- Wrapper for slides -->\r\n");
      out.write("              <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"item active\">\r\n");
      out.write("                  <img class=\"img-responsive img-full\" src=\"img/Ehr1.jpg\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                  <img class=\"img-responsive img-full\" src=\"img/blender1.jpg\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                  <img class=\"img-responsive img-full\" src=\"img/slide-3.jpg\" >\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            \r\n");
      out.write("              <!-- Controls -->\r\n");
      out.write("              <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\r\n");
      out.write("                <span class=\"icon-prev\"></span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\r\n");
      out.write("                <span class=\"icon-next\"></span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h3><small>Welcome to</small><br><span class=\"brand-name\">Two Dimensional Body Map for EHR</span><hr class=\"tagline-divider\"></h3>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterLayout.jsp", out, false);
      out.write("\r\n");
      out.write("       <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <!-- Make sure to add jQuery - download the most recent version at http://jquery.com/ -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("<!--      <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script> -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("\t  // Activates the Carousel\r\n");
      out.write("\t  $('.carousel').carousel({\r\n");
      out.write("\t\tinterval: 3000\r\n");
      out.write("\t  })\r\n");
      out.write("\t</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}