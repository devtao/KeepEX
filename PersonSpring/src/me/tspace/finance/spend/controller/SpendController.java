package me.tspace.finance.spend.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/finance/spend")
@Scope("prototype")
public class SpendController {
	@RequestMapping(method = RequestMethod.GET)
	public String init(HttpSession session) {
		
		return "finance/spend";
	}
	
	
}
