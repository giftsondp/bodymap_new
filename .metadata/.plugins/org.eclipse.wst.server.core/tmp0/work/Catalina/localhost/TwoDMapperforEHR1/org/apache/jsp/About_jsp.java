/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2013-11-20 09:07:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>About 2DBM</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"img/icon.PNG\">\r\n");
      out.write("<link href=\"css/business-casual.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write(" <script src=\"js/Three.js\"></script>\r\n");
      out.write(" <script src=\"js/OBJLoader.js\"></script>    \r\n");
      out.write(" \r\n");
      out.write(" <style>\r\n");
      out.write("   #content{\r\n");
      out.write(" \r\n");
      out.write("/*    margin-left:400px;\r\n");
      out.write("   margin-right:400px;\r\n");
      out.write("   margin-bottom: 200px;*/\r\n");
      out.write("   text-align:justify;\r\n");
      out.write("  \r\n");
      out.write("   width: 200%\r\n");
      out.write("     }\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("</style>\r\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write(" <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write(" <script src=\"js/jquery.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">   \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <script id=\"vertexShader\" type=\"x-shader/x-vertex\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("varying vec2 vUv;\r\n");
      out.write("varying vec3 vNormal;\r\n");
      out.write("varying vec3 vViewPosition;\r\n");
      out.write("\r\n");
      out.write("void main() {\r\n");
      out.write("\r\n");
      out.write("\tvec4 mvPosition = modelViewMatrix * vec4( position, 1.0 );\r\n");
      out.write("\r\n");
      out.write("\tvUv = uv;\r\n");
      out.write("\tvNormal = normalize( normalMatrix * normal );\r\n");
      out.write("\tvViewPosition = -mvPosition.xyz;\r\n");
      out.write("\r\n");
      out.write("\tgl_Position = projectionMatrix * modelViewMatrix * vec4( position, 1.0 );\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"fragmentShader\" type=\"x-shader/x-fragment\">\r\n");
      out.write("uniform sampler2D texture1;\r\n");
      out.write("uniform sampler2D texture2;\r\n");
      out.write("\r\n");
      out.write("varying vec2 vUv;\r\n");
      out.write("varying vec3 vNormal;\r\n");
      out.write("varying vec3 vViewPosition;\r\n");
      out.write("\r\n");
      out.write("void main() {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tvec3 c;\r\n");
      out.write("\tvec4 Ca = texture2D( texture1, vUv );\r\n");
      out.write("\tvec4 Cb = texture2D( texture2, vUv );\r\n");
      out.write("\r\n");
      out.write("\t// hack in a fake pointlight at camera location, plus ambient\r\n");
      out.write("\tvec3 normal = normalize( vNormal );\r\n");
      out.write("\tvec3 lightDir = normalize( vViewPosition );\r\n");
      out.write("\r\n");
      out.write("\tfloat dotProduct = max( dot( normal, lightDir ),0.0 ) + 0.2;\r\n");
      out.write("\r\n");
      out.write("\t//gl_FragColor = vec4( mix( tColor.rgb, tColor2.rgb, tColor2.a ), 1.0 )* dotProduct;\r\n");
      out.write("\t//gl_FragColor = vec4( 5.5, 4.5, 4.0, 2.0 )* dotProduct;\r\n");
      out.write("\r\n");
      out.write(" \tc = Ca.rgb * Ca.a + Cb.rgb * Cb.a * (1.0 - Ca.a);  // blending equation\r\n");
      out.write("    gl_FragColor= vec4(c, 1.0)* dotProduct;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$( document ).ready(function() {\r\n");
      out.write("\tconsole.log( \"ready!\" );\r\n");
      out.write("\t$.getScript(\"js/HumanModel.js\");\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("        \r\n");
      out.write("             \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderLayout.jsp", out, false);
      out.write("\r\n");
      out.write("\t    <div class=\"container\" style=\"height: 100%\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\" style=\"height: 710px\">\r\n");
      out.write("        <div class=\"box\" style=\"height: 100%\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t<h2 class=\"intro-text text-center\">\r\n");
      out.write("\t\t\t\t\t\tAbout <strong>2DBM</strong>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t<form role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id = \"content\">\r\n");
      out.write("<p> We develop a pictorial medical record system called Two Dimensional Human Body Map that serves as image based mapper for the physicians to annotate diseases and ailments on the human body map.This \r\n");
      out.write("gives an easy understanding of diseases for the patients due to presence of image based report rather than text report.This application will display the entire medical history \r\n");
      out.write("of a patient, thus assisting the doctors to know the condition of the patient</p> \r\n");
      out.write("The application consists of following options:\r\n");
      out.write("<p>\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><h3><b>View Mode:</b></h3>In view mode, \r\n");
      out.write("the body map will be displayed read only and will contain notification on parts where the patient \r\n");
      out.write("has a disease. This will give patients more understanding of their current and historical disease information on body map.</li><br>\r\n");
      out.write("\t<li><h3><b>Edit Mode:</b></h3>In the edit mode, the doctor will be able to edit the body map based on the \r\n");
      out.write("diseases diagnosed on any specific part.</li>\r\n");
      out.write("\t<li><h3><b>Print Report:</b></h3> This option lets the user print the entire report including the bodymap for records.</li>\r\n");
      out.write("\t\r\n");
      out.write("</ul>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id='obj' style=\"float: right; height: 200px;\"></div>  \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterLayout.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
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
