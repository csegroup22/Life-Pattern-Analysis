package org.suggestion.g22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController
{
	@RequestMapping("/aboutus")
	public String aboutUs()
	{
		return "aboutus";
	}
}
