/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-23 06:41:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.AdminView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.*;

public final class CheckSkill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("bean");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      dto.SkillDTO skdto = null;
      skdto = (dto.SkillDTO) _jspx_page_context.getAttribute("skdto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (skdto == null){
        skdto = new dto.SkillDTO();
        _jspx_page_context.setAttribute("skdto", skdto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
String name = (String) session.getAttribute("name");
      out.write('\r');
      out.write('\n');
Integer staff_lv = (Integer)session.getAttribute("staff_lv") ;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/view/Css/Style.css\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"hamburger-menu\">\r\n");
      out.write("        <input type=\"checkbox\" id=\"menu-btn-check\">\r\n");
      out.write("        <label for=\"menu-btn-check\" class=\"menu-btn\"><span></span></label>\r\n");
      out.write("        <div class=\"menu-content\">\r\n");
      out.write("            <ul>\r\n");
      out.write("	            <li><p>");
      out.print(name );
      out.write("さん。</p></li>\r\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/LoginView/Menu.jsp\">メニュー</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/GeneralView/MyPage.jsp\">マイページ</a></li>\r\n");
      out.write("                ");
if(staff_lv == 1 ){ 
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/view/AdminView/AdminMenu.jsp\">管理者ページ</a></li>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/LogoutServlet\">ログアウト</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("	<br><br><br>\r\n");
      out.write("	<div style=\"text-align: center;\">\r\n");
      out.write("		<h1>申請一覧</h1>\r\n");
      out.write("		<form method=get name=form1 action=\"");
      out.print(request.getContextPath());
      out.write("/ManagementServlet\">\r\n");
      out.write("			<table align = \"center\" border=\"1\" >\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th width=\"100\"></th>\r\n");
      out.write("					<th width=\"100\">名前</th>\r\n");
      out.write("					<th width=\"100\">スキル名</th>\r\n");
      out.write("					<th width=\"100\">スキルレベル</th>\r\n");
      out.write("					<th width=\"500\">スキルアピール文</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				for (int i = 0; i < skdto.size(); i++) {
					SkillBean skbe = skdto.get(i);
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"center\"><input type=\"checkbox\" name=\"name\" value=\"");
      out.print(skbe.getName());
      out.write("\"></td>\r\n");
      out.write("					<td align=\"center\">");
      out.print(skbe.getName());
      out.write("</td>\r\n");
      out.write("					<td align=\"center\">");
      out.print(skbe.getSkill_name());
      out.write("</td>\r\n");
      out.write("					<td align=\"center\">");
      out.print(skbe.getSkill_lv());
      out.write("</td>\r\n");
      out.write("					<td align=\"center\">");
      out.print(skbe.getSkill_appeal());
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("			<br>\r\n");
      out.write("			<input type=\"submit\" name=\"ok\" value=\"承認\"> <input type=\"submit\" name=\"out\" value=\"否認\">\r\n");
      out.write("			<br>\r\n");
      out.write("			</form>\r\n");
      out.write("	</div><br/>\r\n");
      out.write("	<p style=\"text-align: center;\">-----------------------------------------------------------------------------------------</p>\r\n");
      out.write("	<br/>\r\n");
      out.write("	<div align = \"center\">\r\n");
      out.write("		<form method=\"get\" name=\"form1\" action=\"");
      out.print( request.getContextPath() );
      out.write("/view/AdminView/AdminMenu.jsp\">\r\n");
      out.write("			<input type=\"submit\" value=\"管理者メニュー\">\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
