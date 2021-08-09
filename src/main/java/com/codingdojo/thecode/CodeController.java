package com.codingdojo.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String codeCheck(HttpSession session,
			@RequestParam(value="code") String code,
			RedirectAttributes redirectAttributes) {
		if(code.equals("bushido")) {	
			return "code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "Code not correct, try again!");
			return "redirect:/";
		}
	}
}
