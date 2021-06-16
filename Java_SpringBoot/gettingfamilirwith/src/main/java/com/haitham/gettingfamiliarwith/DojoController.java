package com.haitham.gettingfamiliarwith;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class DojoController {

		@RequestMapping(value="/{input}", method = RequestMethod.GET)
		public String Assignment2(@PathVariable("input") String input) {
			if(input.equals("dojo")) {
				return "The dojo is awesome!";
			}
			else if(input.equals("burbank-dojo")) {
			return "Burbank dojo is located in Southern California";
			}
			else if(input.equals("san-jose")) {
			return "SJ dojo is the headquarters";
			}
			
			return "Invalid route";
		}

	}


