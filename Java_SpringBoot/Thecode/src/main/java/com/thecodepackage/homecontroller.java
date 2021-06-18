package com.thecodepackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class homecontroller {
@RequestMapping("")
public String home(){
	return "index.jsp";
}
@RequestMapping(value="/thecode", method= RequestMethod.POST)
public String correctcode(@RequestParam(value="thecode") String thecode) {
if (thecode.equals("bushido")) {
	return "codes.jsp";			
} else {
	return "redirect:/flasherror";
}
}
@RequestMapping(value="/flasherror")
public String flashMessages(RedirectAttributes redirectAttributes) {
    redirectAttributes.addFlashAttribute("error", "Train Harder MOFO!");
    return "redirect:/";

}
}


