<%@page import="javax.portlet.RenderURL"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:actionURL var="sendMailURL" name="formPDF"></portlet:actionURL>
<<portlet:renderURL ></portlet:renderURL>

<aui:form action="${sendMailURL}" method="POST">
<aui:input type="text" name="username"/>
<aui:input type="password" name="password"/>
<aui:button  type="submit" value="Enviar" />
</aui:form>