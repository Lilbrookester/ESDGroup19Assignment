package org.apache.jsp.WEB_002dINF.docs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome to XYZ Associates</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"80\" height=\"100\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td width=\"500\" height=\"100\" bgcolor=\"#DB8B28\" \n");
      out.write("                    valign=\"top\" halign=\"center\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, true);
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <!--  Left Menu  -->\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"90\" height=\"300\"  bgcolor=\"#DB8B28\" valign=\"top\">\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/Front\">Home:</a>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td width=\"500\"  valign=\"top\" cellpadding=\"15\" cellspacing=\"15\">\n");
      out.write("\n");
      out.write("                    <br />\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
 String included = (String) request.getAttribute("doco");
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"UserService.do\">\n");
      out.write("                        <p />\n");
      out.write("                        View a table <br />\n");
      out.write("                        <input type=\"radio\" name=\"tbl\" value=\"List\">List Users<br />\n");
      out.write("                        <input type=\"radio\" name=\"tbl\" value=\"NewUser\">New User<br />\n");
      out.write("                        <input type=\"radio\" name=\"tbl\" value=\"Update\">Password Change<br />\n");
      out.write("                        <input type=\"radio\" name=\"tbl\" value=\"Delete\">Delete a User<br />\n");
      out.write("                        <input type=submit value=\"Action\"> <br />\n");
      out.write("                    </form> \n");
      out.write("                    <br />\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, included, out, true);
      out.write(" \n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
