/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2013-11-20 22:00:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DoctorViewMode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
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
      out.write(" \t<link rel=\"icon\" type=\"image/png\" href=\"img/icon.PNG\">\r\n");
      out.write("    <title>Doctor View Mode</title>\r\n");
      out.write("    \r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write(" <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\"> \r\n");
      out.write("    <link href=\"css/business-casual.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("     <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">  \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.css\">    \r\n");
      out.write("    <script src=\"js/Three.js\"></script>\r\n");
      out.write("    <script src=\"js/OBJLoader.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("<!-- <script src=\"js/base64.js\"></script>\r\n");
      out.write("   \t <script src=\"js/canvas2image.js\"></script>\r\n");
      out.write("     <script src=\"http://html2canvas.hertzen.com/build/html2canvas.js\"></script> -->\r\n");
      out.write("       \t<script src=\"js/opentip-jquery.js\"></script><!-- Change to the adapter you actually use -->\r\n");
      out.write("\t<link href=\"css/opentip.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("      <script src=\"http://d3js.org/d3.v3.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<!--          <script src=\"js/d3.v3.min.js\"></script> -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$( document ).ready(function() {\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("   \t  \r\n");
      out.write("\r\n");
      out.write("\tvar patientGender = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\tif(patientGender==\"M\" )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t   $(\"#nobody\").remove();\r\n");
      out.write("\t\t   $.getScript(\"js/Male.js\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\telse if (patientGender==\"F\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t $(\"#nobody\").remove();\r\n");
      out.write("\t\t $.getScript(\"js/Female.js\");\r\n");
      out.write("\t\t}\r\n");
      out.write("  \t  \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t $(\"#viewBodyMap\").click(function(e) {\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\r\n");
      out.write("\t\tvar bid = document.getElementById(\"bodyIDInput\").value;\r\n");
      out.write("\r\n");
      out.write("\t\t if(bid)\r\n");
      out.write("  \t\t\t{ \r\n");
      out.write("\t\t\t \tvar page =\"view\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t  \t\tdocument.location.href=\"GetAllAnnotationsAction?bid=\"+bid+\"&page=\"+page;\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t\t else\r\n");
      out.write("  \t\t\t{\r\n");
      out.write("  \t\t\t \r\n");
      out.write("  \t\t\t alert(\"Please Enter a Body Map ID\");\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\t\t/* Only if else is added the \"Required\" Warning method shows! As this is a JQuery Call */\r\n");
      out.write("  \t\t } \r\n");
      out.write("   });   \r\n");
      out.write("\t  \r\n");
      out.write("\t\r\n");
      out.write("\t/* $('canvas') */\r\n");
      out.write("\t\r\n");
      out.write("\t/* \r\n");
      out.write("\t$(\"#image\").click(function() {\t\t */\r\n");
      out.write("\r\n");
      out.write("\t/* \t  html2canvas([document.getElementById('obj')], {\r\n");
      out.write("\t\t    onrendered: function (canvas) { */\r\n");
      out.write("\t\t       \r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t    \t/* var c = document.getElementsByTagName('canvas');\r\n");
      out.write("\t\t  \t\t  var t = c.getContext('2d');\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t        var data = t.toDataURL('image/png');\t\t      \r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t       \tvar img = document.createElement('img');\r\n");
      out.write("\t\t\t\t img.src = data;\r\n");
      out.write("\t\t\t\t document.getElementById('chuma').appendChild(img);\r\n");
      out.write("\t\t\t\t// Download image\r\n");
      out.write("\t\t\t\t window.location = data.replace(\"image/png\", \"image/octet-stream\");  */\r\n");
      out.write("/* \t\t    } */\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t/* });  */\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t/* }); */\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t}); \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("   \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderLayout.jsp", out, false);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("      <div class=\"row\" style=\"overflow: auto;\"> \r\n");
      out.write("        <div class=\"box\" style=\"height: auto;\">    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write(" <!--         <div id=\"wrapper\">  -->\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "DoctorMenuLayout.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <div id=\"page-wrapper\">\r\n");
      out.write(" \r\n");
      out.write(" <!--Col1  -->\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write("   <div class=\"col-lg-3\" style=\"margin-top:0.5%; left: 1%\">\r\n");
      out.write("            <div class=\"panel panel-info\" style=\"width: 100%; height: 520px;\">\r\n");
      out.write("              <div class=\"panel-heading\">\r\n");
      out.write("                <h3 class=\"panel-title\" style=\"text-align: center\"><i class=\"fa fa-user\"></i> Patient Info</h3>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"panel-body\">\r\n");
      out.write("                <div class=\"list-group\">                  \r\n");
      out.write("                  <a class=\"list-group-item\">                    \r\n");
      out.write("                    <i class=\"fa fa-user\"></i> <label> First Name: </label> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <a class=\"list-group-item\">                 \r\n");
      out.write("                    <i class=\"fa fa-user\"></i> <label> Last Name: </label> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.lastName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <a class=\"list-group-item\">                 \r\n");
      out.write("                    <i class=\"fa fa-check\"></i> <label> Age: </label> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                   <a class=\"list-group-item\">                 \r\n");
      out.write("                    <i class=\"fa fa-male\"></i> <label> Gender: </label> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                   <a class=\"list-group-item\">                 \r\n");
      out.write("                    <i class=\"fa fa-envelope\"></i> <label> Email: </label> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                   <a class=\"list-group-item\">                 \r\n");
      out.write("                    <i class=\"fa fa-tag\"></i> <label >Body Map ID: </label> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg.BID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                </div>             \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div> \r\n");
      out.write(" \r\n");
      out.write("<!--  style=\"height: 30px;\" -->\r\n");
      out.write("            \r\n");
      out.write("  <!--Col1 Ends -->\r\n");
      out.write("\r\n");
      out.write("\t <!--Col2 -->\r\n");
      out.write("  \t<div class=\"col-lg-4\" style=\"margin-top:0; padding-left: 1%\">\r\n");
      out.write("      <h2>Body Map <small>View Mode</small></h2>\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("              <li class=\"active\"><i class=\"fa fa-eye\"></i> View Mode</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            \r\n");
      out.write("          <h4 id=\"patientName\" align=\"center\"></h4>\r\n");
      out.write("          \r\n");
      out.write(" <form role=\"form\" id=\"myForm\">\r\n");
      out.write("     <div class=\"form-group\">\r\n");
      out.write("                <label>Body Map ID</label>\r\n");
      out.write("                <input id=\"bodyIDInput\" class=\"form-control\" title=\"Patient Body Map ID\" placeholder=\"Enter Body Map ID\"  autocomplete=\"on\" autofocus=\"autofocus\" required>\r\n");
      out.write("     </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("       \t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"viewBodyMap\">Search Patient</button>\r\n");
      out.write("       \t\t\t\r\n");
      out.write("      </div>            \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("</form> \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("    </div> \r\n");
      out.write("    \r\n");
      out.write("     <!--Col2 Ends -->\r\n");
      out.write("     \r\n");
      out.write("      <!--Col3  -->\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-lg-5\">\r\n");
      out.write(" \r\n");
      out.write("     <div id=\"obj\"  style=\"margin-top:0; width:100% ; border:1px solid;\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" \t<svg style=\"width: 100%; height: 100%; position: absolute; top:0; left:0;\">\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </svg>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("     \r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("    \r\n");
      out.write("     <!--Col3 Ends  -->\r\n");
      out.write("    </div>\r\n");
      out.write(" </div><!--Page Wrapper  -->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div><!-- /.container -->\r\n");
      out.write("    \r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterLayout.jsp", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /DoctorViewMode.jsp(219,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation ne null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /DoctorViewMode.jsp(221,5) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setBegin(0);
    // /DoctorViewMode.jsp(221,5) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(annotation)-1}", java.lang.Integer.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false)).intValue());
    // /DoctorViewMode.jsp(221,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("index");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              \r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t <a href=\"About.jsp\" id=\"annotationsLink\" data-ot=\"Disease Code:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation[index].getDiseaseCode()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" data-ot-hide-trigger=\"trigger\" data-ot-target=\"true\"> <circle cx=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation[index].getX_Coord()+15}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" cy=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation[index].getY_Coord()+4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" r=\"6\" fill=\"yellow\" />\r\n");
          out.write("\t\t\t\t\t<text dx=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation[index].getX_Coord()+30}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" dy=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation[index].getY_Coord()+12}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${annotation[index].getExtraDiseaseName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</text></a>\r\n");
          out.write("\t\t\t\t\t \r\n");
          out.write("\t\t\t\t\t \t \r\n");
          out.write("\t\t\t\t\t \r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}