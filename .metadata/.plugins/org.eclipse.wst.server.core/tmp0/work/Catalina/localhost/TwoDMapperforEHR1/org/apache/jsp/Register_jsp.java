/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2013-11-20 09:51:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Registration</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"img/icon.PNG\">\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/business-casual.css\" rel=\"stylesheet\">\r\n");
      out.write("     \r\n");
      out.write("     <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("     <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\"> \r\n");
      out.write("    \r\n");
      out.write("    <!-- Add custom CSS here -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".hide {\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write(" // function to make AJAX call to the server\r\n");
      out.write("\t $(document).ready(function(){  \r\n");
      out.write("\t\t \r\n");
      out.write("\r\n");
      out.write("\t$(\"#register\").submit(function(e){\r\n");
      out.write("\t  console.log(\"in submit\");\r\n");
      out.write("\t     e.preventDefault();\r\n");
      out.write("\t   var success=\"SignUp Successful, Please Login.\";\r\n");
      out.write("  \t   var failure=\"Unable to Register! Please Verify and try again!\";\r\n");
      out.write("  \t   var alreadyRegistered=\"The email ID is already registered. Please try another email ID\";\r\n");
      out.write("  \t   var formdata = new Object();\r\n");
      out.write("\t     var inpele = document.getElementsByTagName(\"input\");\r\n");
      out.write("\t     \r\n");
      out.write("\t     \r\n");
      out.write("\t     for (var i = 0; i < inpele.length; i++) {\r\n");
      out.write("\t       \t\r\n");
      out.write("\t\t\t\tif(inpele[i].name == 'gender'|| inpele[i].name == \"role\"){\r\n");
      out.write("\t\t\t\t\t if(inpele[i].checked == true) \r\n");
      out.write("\t\t\t\t\t\tformdata[inpele[i].name] = inpele[i].value;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tformdata[inpele[i].name] = inpele[i].value;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("             \t     \r\n");
      out.write(" }\r\n");
      out.write("\t     frmd = JSON.stringify(formdata);\r\n");
      out.write("\t    \r\n");
      out.write("\t     \t$.ajax({\r\n");
      out.write("\t        \t\t\turl : \"RegisterUser\",\r\n");
      out.write("\t        \t\t\ttype : \"POST\",\r\n");
      out.write("\t        \t\t\tdata : frmd,\r\n");
      out.write("\t     \t            success : function(data, textStatus, jqXHR){\r\n");
      out.write("\t     \t        \t   console.log('In success!');    \t     \t        \t   \r\n");
      out.write("\t     \t        \t        \t   \r\n");
      out.write("\t     \t        \t \r\n");
      out.write("\t     \t        \t   if(data==success)\r\n");
      out.write("\t \t\t\t\t    \t\t{\r\n");
      out.write("\t     \t        \t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\tlocation.href = 'Login.jsp?msg='+ success;\r\n");
      out.write("\t \t\t\t\t    \t\t\r\n");
      out.write("\t \t\t\t\t    \t\t}\r\n");
      out.write("\t \t\t\t\t    \telse if(data==failure)\r\n");
      out.write("\t \t\t\t\t    \t\t{\r\n");
      out.write("\t \t\t\t\t    \t\t  \t \t\t\t\t    \t\t\r\n");
      out.write("\t \t\t\t\t    \t\t\tlocation.href = 'Register.jsp?msg='+ failure;\r\n");
      out.write("\t \t\t\t\t    \t\t\tdocument.getElementById('errorDiv').style.visibility='visible'; \r\n");
      out.write("\t \t\t\t\t    \t\t\r\n");
      out.write("\t \t\t\t\t    \t\t}  \r\n");
      out.write("\t     \t        \t   \r\n");
      out.write("\t \t\t\t\t    \telse if(data==alreadyRegistered)\r\n");
      out.write("\t\t\t\t    \t\t{\r\n");
      out.write("\t\t\t\t    \t\t  \t \t\t\t\t    \t\t\r\n");
      out.write("\t\t\t\t    \t\t\tlocation.href = 'Register.jsp?msg='+ alreadyRegistered;\r\n");
      out.write("\t\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t\t    \t\t\t$('#errorDiv').show().removeClass('hide');\r\n");
      out.write("\t\t\t\t    /* \t\tdocument.getElementById('errorDiv').style.visibility='visible';  \r\n");
      out.write("\t\t\t\t    \t\t\t \t$(\"#errorDiv\").html(alreadyRegistered); */\r\n");
      out.write("\t\t\t\t    \t\t\t\t/*  $(\"#errorDiv\").show(); */\r\n");
      out.write("\t\t\t\t    \t\t\r\n");
      out.write("\t\t\t\t    \t\t}  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t        \t\t\t},\r\n");
      out.write("\t        \t\t\terror : function(jqXHR, textStatus, errorThrown){\r\n");
      out.write("\t          \t\t\t\tconsole.log('fail');\r\n");
      out.write("\t          \t\t\t\tlocation.href = 'Register.jsp?msg='+ failure;;\r\n");
      out.write("\t        \t\t\t}\r\n");
      out.write("\t      \t\t });\r\n");
      out.write("\t    \t\r\n");
      out.write("\t });   \r\n");
      out.write("\t return false;\r\n");
      out.write("}); \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("  var pwdvalid = false;\r\n");
      out.write("  function matches(){\r\n");
      out.write("  \tvar pwd = document.getElementById(\"pwd\").value;\r\n");
      out.write("  \tvar cpwd = document.getElementById(\"cpwd\").value;\r\n");
      out.write("  \tif(pwd!=cpwd){\r\n");
      out.write("  \t\talert(\"Your password and confirm password do not match!\");\r\n");
      out.write("  \tdocument.getElementById(\"cpwd\").value = \"\";\r\n");
      out.write("  \t}\t\r\n");
      out.write("  }\r\n");
      out.write("  function show(){\r\n");
      out.write("  \tvar val = document.getElementById(\"age\").value;\r\n");
      out.write("  \tdocument.getElementById(\"agevalue\").innerHTML = val;\r\n");
      out.write("  \t\r\n");
      out.write("  }\r\n");
      out.write("  function strength()\r\n");
      out.write("  {\r\n");
      out.write("  \t   var uc=0; var lc=0; var sp=0;\r\n");
      out.write("  \t   var upcase  = new RegExp(\"[A-Z]\");\r\n");
      out.write("  \t   //document.write(upcase);\t\r\n");
      out.write("  \t   var locase  = new RegExp(\"[a-z]\");\r\n");
      out.write("  \t   var special =  new RegExp(\"[!@#$%^&*_-]\");\r\n");
      out.write("  \t   var pass = document.getElementById(\"pwd\").value;\r\n");
      out.write("  \t   var pg = document.getElementById(\"prgs\");\r\n");
      out.write("  \t   var subdisable = document.getElementById(\"sub\");\r\n");
      out.write("  \t   for (var i = 0; i< pass.length;i++) {\r\n");
      out.write("  \t          if(pass.charAt(i).match(upcase))\r\n");
      out.write("  \t            {\r\n");
      out.write("  \t                uc++;\r\n");
      out.write("  \t            }\r\n");
      out.write("  \t          else if (pass.charAt(i).match(locase))\r\n");
      out.write("  \t            {\r\n");
      out.write("  \t               lc++;\r\n");
      out.write("  \t            }\r\n");
      out.write("  \t          else\r\n");
      out.write("  \t               sp++;\r\n");
      out.write("  \t   }\r\n");
      out.write("   \t   if (uc>=3&& lc>= 2&&sp == 2)\r\n");
      out.write("  \t   {\r\n");
      out.write("  \t         pg.value = 10;\r\n");
      out.write("  \t         document.getElementById(\"lbl\").innerHTML = \"Normal\";          \r\n");
      out.write("  \t         pwdvalid = true;\r\n");
      out.write("  \t         subdisable.disabled = false;\r\n");
      out.write("  \t         \r\n");
      out.write("  \t   }\t\r\n");
      out.write("  \t   else if (uc >= 3&&lc >=2&&(sp>3&&sp<5)) {\r\n");
      out.write("  \t         pg.value = 50;\r\n");
      out.write("  \t         document.getElementById(\"lbl\").innerHTML =  \"Medium\";\r\n");
      out.write("  \t         pwdvalid = true;\r\n");
      out.write("  \t         subdisable.disabled = false;\r\n");
      out.write("  \t   }\r\n");
      out.write("  \t   else if (uc >=3&& lc >=2 && sp>5) {\r\n");
      out.write("  \t         pg.value = 100;\r\n");
      out.write("  \t         document.getElementById(\"lbl\").innerHTML = \"Strong\";\r\n");
      out.write("  \t         pwdvalid = true;\r\n");
      out.write("  \t         subdisable.disabled = false;\r\n");
      out.write("  \t   }\r\n");
      out.write("  \t   else if (pass.length == 0) {\r\n");
      out.write("  \t         pg.value = 0;\r\n");
      out.write("  \t         document.getElementById(\"lbl\").innerHTML =\"\";\r\n");
      out.write("  \t   }\r\n");
      out.write("  \t    \t\r\n");
      out.write("  }\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("      \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderLayout.jsp", out, false);
      out.write("\r\n");
      out.write("       <div class=\"container\">    \r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\" style=\"overflow: auto;\">\r\n");
      out.write("        <div class=\"box\" style=\"height: auto;\">\r\n");
      out.write("          <div class=\"row\" style=\"border:1px solid; position: relative;border-radius:25px; width: 50%; margin: 0 0 0 -200px; left: 44%;\"  > \r\n");
      out.write("          <div class=\"col-lg-12\">\r\n");
      out.write("            <hr>\r\n");
      out.write("            <h2 class=\"intro-text text-center\">Registration <strong>form</strong></h2>\r\n");
      out.write("            <hr>\r\n");
      out.write("          \r\n");
      out.write("                 <form role=\"form\" id = \"register\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                  <div class=\"row\" >\r\n");
      out.write("                  \r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>First Name: <span class=\"required\">*</span></label>\r\n");
      out.write("                      <input id = \"fname\" type = \"text\" class=\"form-control\" name = \"fname\" placeholder = \"John\" required/>                     \r\n");
      out.write("                    </div>\r\n");
      out.write(" \t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Last Name: <span class=\"required\">*</span> </label>\r\n");
      out.write("                      <input id = \"lname\" class=\"form-control\" type = \"text\" name = \"lname\" placeholder = \"Beetham\" required >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                   <div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Age: <span class=\"required\">*</span>  </label>                      \r\n");
      out.write("                     <input id = \"age\" type = \"range\" name = \"age\" value = \"50\" required onchange=\"show()\" style=\"width: 70%; position: relative; left: 22px; top: 7px;\"><div id = \"agevalue\"  style = \"float:right; position: relative;  top: 7px;\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \t<div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Gender: <span class=\"required\">*</span> </label>\r\n");
      out.write("                      Male: <input id = \"mgender\" type = \"radio\" name = \"gender\" value= \"M\"/>\r\n");
      out.write("                    Female: <input id = \"fgender\" type = \"radio\" name = \"gender\" value= \"F\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Email: <span class=\"required\">*</span> </label>\r\n");
      out.write("                      <input id = \"email\" class=\"form-control\" type = \"email\" name = \"email\" placeholder= \"johnb@gmail.com\" required/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Password: <span class=\"required\">*</span> </label>\r\n");
      out.write("                      <input id = \"pwd\" class=\"form-control\" type = \"password\" name = \"pwd\" required onkeyup = \"strength()\" title =\"Password must contain atleast 3 Upper-case 2 lower-case and 2 special chars\"/> <progress value = \"0\" max = \"100\" id = \"prgs\" style=\"left: 102%; visibility:hidden; top: -28px; position: relative\"></progress>\r\n");
      out.write("                   \t  <label id = \"lbl\" for = \"prgs\"></label>                   \t  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Confirm Password: <span class=\"required\">*</span> </label>\r\n");
      out.write("                     <input id = \"cpwd\" class=\"form-control\" type = \"password\" name = \"cpwd\"  required onchange = \"matches()\"/>  \r\n");
      out.write("                   \t    <label id = \"mismatch\"></label>                  \t  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                    <div class=\"form-group col-lg-8\" style=\"left: 2%;\">\r\n");
      out.write("                      <label>Role: <span class=\"required\">*</span> </label>\r\n");
      out.write("                      Doctor: <input id = \"drole\" type = \"radio\" name = \"role\" value= \"Doctor\"/>\r\n");
      out.write("                      Patient: <input id = \"prole\" type = \"radio\" name = \"role\" value= \"Patient\"/>           \t  \r\n");
      out.write("                    </div>                 \r\n");
      out.write("              \r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                      <div class=\"form-group col-lg-12\" style=\"left: 2%;\">                   \r\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-primary\" style=\"width:100px;\">Register</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"alert alert-danger alert-dismissable hide\" id=\"errorDiv\">\r\n");
      out.write("          <!--     <button type=\"button\" class=\"close\" data-dismiss=\"alert\" id=\"error\" aria-hidden=\"true\">&times;</button> -->\r\n");
      out.write("           asdasdasdasdasdasdasdasdasd\r\n");
      out.write("            </div> \r\n");
      out.write("             <p class=\"change_linkreg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAlready Registered ?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Login.jsp\" class=\"to_register\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("              </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div><!-- /.container -->\r\n");
      out.write("    \r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterLayout.jsp", out, false);
      out.write("\r\n");
      out.write("         \r\n");
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
