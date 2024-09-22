/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2024-07-26 05:08:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/CSS/register.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section class=\"sign-up\">\n");
      out.write("            <form action=\"/MediaTech/registration\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <h1>Sign Up</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"image-field\" id=\"image-field\">\n");
      out.write("                        <img src=\"data:image/png;base64,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\"\n");
      out.write("                            class=\"showImage\" width=\"200px\" height=\"240px\">\n");
      out.write("                        <input type=\"file\" id=\"file\" name=\"image\" class=\"imageChooser\" value=\"profile-eg.png\"\n");
      out.write("                            onchange=\"onImageChange()\" required />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"fields\">\n");
      out.write("                        <span class=\"name\">\n");
      out.write("                            <label for=\"name\">Name:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter Full Name\" required>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"email\">\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Your Email Address\" required>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"password\">\n");
      out.write("                            <label for=\"password\">Password: </label>\n");
      out.write("                            <input type=\"password\" id=\"password\" placeholder=\"Enter Password\"\n");
      out.write("                                name=\"password\"=\"Enter Password\" required>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"confirm-password\">\n");
      out.write("                            <label for=\"confirm-password\">Confirm Password: </label>\n");
      out.write("                            <input type=\"password\" name=\"confirm-password\" id=\"confirm-password\"\n");
      out.write("                                placeholder=\"Re-Enter Password\" required>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 if(request.getAttribute("emailMsg") !=null){ 
      out.write("\n");
      out.write("                        <p class=\"message\">\n");
      out.write("                            ");
      out.print( request.getAttribute("emailMsg"));
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        ");
} 
      out.write("\n");
      out.write("                            ");
 if(request.getAttribute("passMsg") !=null){ 
      out.write("\n");
      out.write("                                <p class=\"message\">\n");
      out.write("                                    ");
      out.print( request.getAttribute("passMsg"));
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                                ");
} 
      out.write("\n");
      out.write("                                    <br>\n");
      out.write("                                    <input type=\"submit\" value=\"Sign Up\">\n");
      out.write("\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/Login.jsp\" class=\"login-btn\">Log\n");
      out.write("                                        In</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        <script>\n");
      out.write("            function onImageChange() {\n");
      out.write("                var imageChooser = document.querySelector(\".imageChooser\");\n");
      out.write("                var showImage = document.querySelector(\".showImage\");\n");
      out.write("                showImage.src = URL.createObjectURL(imageChooser.files[0]);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
