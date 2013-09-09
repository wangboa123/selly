package com.meehoo.selly.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping(value="/men",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("Welcome men");
		return "men";
	}
	
	@RequestMappng(value="/scrollfour.html",method=ReuestMethod.GET)
	public String ScrollFour(Model model){

		//testcode here. and later will test in javascript
		List<String> picList = new ArrayList<String>();
		picList.add("../../resources/assets/img/slider/1.jpg");
		picList.add("../../resources/assets/img/slider/2.jpg");
		picList.add("../../resources/assets/img/slider/3.jpg");
		picList.add("../../resources/assets/img/slider/4.jpg");

		HashMap<String,String> retData = new HashMap<String,String>();
		retData.push("name","scroll");
		retData.push("num","4");
		retData.push("values",picList);
		model.addAttribute("scrollfour",retData);
	}

}
