package cn.edu.ustc.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/setView")
	public String setView(ModelMap model){
		return "setView";
	}
}
