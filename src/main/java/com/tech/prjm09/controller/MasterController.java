package com.tech.prjm09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterController {
	
	@RequestMapping("/masterview")
	public String masterview() {
		
		return "masterview";
	}

}
