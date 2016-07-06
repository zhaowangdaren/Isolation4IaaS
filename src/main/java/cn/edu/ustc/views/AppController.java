package cn.edu.ustc.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ustc.CloudInfo;

@Controller
public class AppController {

	@RequestMapping("/setView")
	public String setView(ModelMap model){
		return "setView";
	}
	
//	@RequestMapping("/setInfo")
//	public String setInfo(String computeEP, String networkEP, String adminUsername, 
//			String adminPassword, String mqURL){
//		if(computeEP != null)CloudInfo.COMPUTE_EP = computeEP;
//		if(networkEP != null)CloudInfo.NETWORK_EP = networkEP;
//		if(adminUsername != null) CloudInfo.ADMIN_USERNAME = adminUsername;
//		if(adminPassword != null)CloudInfo.ADMIN_PASSWORD = adminPassword;
//		if(mqURL != null) CloudInfo.MQ_URL = mqURL;
//		
//		JSONObject result = new JSONObject();
//		result.append("computeEP", CloudInfo.COMPUTE_EP);
//		result.append("networkEP", CloudInfo.NETWORK_EP);
//		result.append("adminUsername", CloudInfo.ADMIN_USERNAME);
//		result.append("adminPassword", CloudInfo.ADMIN_PASSWORD);
//		result.append("mqURL", CloudInfo.MQ_URL);
//		
//		return result.toString();
//	}
	
	@RequestMapping("/test")
	public ModelAndView testView(){
		ModelAndView result = new ModelAndView("test");
		return result;
	}
	
	@RequestMapping(value = "/setInfo", method=RequestMethod.POST)
	public void setInfo(HttpServletRequest request, HttpServletResponse response){
		String computeEP = request.getParameter("computeEP");
		String networkEP = request.getParameter("networkEP");
		String adminUsername = request.getParameter("adminUsername");
		String adminPassword = request.getParameter("adminPassword");
		String mqURL = request.getParameter("mqURL");
		if(computeEP != null && computeEP.length() > 0)CloudInfo.COMPUTE_EP = computeEP;
		if(networkEP != null && networkEP.length() > 0)CloudInfo.NETWORK_EP = networkEP;
		if(adminUsername != null && adminUsername.length() > 0) CloudInfo.ADMIN_USERNAME = adminUsername;
		if(adminPassword != null && adminPassword.length() > 0)CloudInfo.ADMIN_PASSWORD = adminPassword;
		if(mqURL != null && mqURL.length() > 0) CloudInfo.MQ_URL = mqURL;
		
		JSONObject result = new JSONObject();
		result.append("computeEP", CloudInfo.COMPUTE_EP);
		result.append("networkEP", CloudInfo.NETWORK_EP);
		result.append("adminUsername", CloudInfo.ADMIN_USERNAME);
		result.append("adminPassword", CloudInfo.ADMIN_PASSWORD);
		result.append("mqURL", CloudInfo.MQ_URL);
		try {
			response.getWriter().write(result.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
