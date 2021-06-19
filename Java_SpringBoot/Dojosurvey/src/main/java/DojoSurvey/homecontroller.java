package DojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homecontroller {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}


	@RequestMapping(value="surveydata", method = RequestMethod.POST )

	public String handleData(Model model, @RequestParam("name") String name,
			@RequestParam("dojolocation") String dojolocation, @RequestParam("favlang") String favlang,
			@RequestParam("comments") String comments){

		model.addAttribute("name", name);
		model.addAttribute("dojolocation", dojolocation);
		model.addAttribute("favlang", favlang);
		model.addAttribute("comments", comments);
//		return "redirect:/result";
		return "survey.jsp";
	}
	
		@RequestMapping("/result")
		public String result() {
			return "survey.jsp";
}
}