package com.consistent.form.portlet;

import com.consistent.form.constants.FormularioCuervoPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.annotations.RenderMethod;

import org.osgi.service.component.annotations.Component;

/**
 * @author bernardohernandez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FormularioCuervoPortletKeys.FormularioCuervo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FormularioCuervoPortlet extends MVCPortlet {
	
	public void formPDF(ActionRequest request,  ActionResponse response)
			throws PortletException, IOException {
			System.out.println("jjjj");
			String username = ParamUtil.getString(request, "username");
			String password = ParamUtil.getString(request, "password");
			System.out.println(username);
			System.out.println(password);
	}
	
}