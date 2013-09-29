package com.meehoo.selly.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value="/menu/men",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("Welcome men");
		return "men";
	}
	

	@RequestMapping(value="/menu/women",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("Welcome women");
		return "women";
	}

	@RequestMapping(value="/menu/about",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("Welcome about");
		return "contact";
	}


	@RequestMapping(value="/menu/contact",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("Welcome contact");
		return "contact";
	}


	@RequestMapping(value="/menu/services",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("Welcome services");
		return "services";
	}
	@RequestMapping(value="/menu/index.html",method=RequestMethod.GET)
	public String Men(Model model){
		logger.info("click /menu/index link");
		return "index";
	}

	@RequestMapping(value="/scrollfour",method=RequestMethod.GET)
	@ResponseBody
	public Map ScrollFour(Model model){

		logger.info("scroll four mapping");
		//testcode here. and later will test in javascript
		List<String> picList = new ArrayList<String>();
		picList.add("../../selly/resources/assets/img/slider/1.jpg");
		picList.add("../../selly/resources/assets/img/slider/2.jpg");
		picList.add("../../selly/resources/assets/img/slider/3.jpg");
		picList.add("../../selly/resources/assets/img/slider/4.jpg");

		Map retData = new HashMap();
		retData.put("name","scroll");
		retData.put("num","4");
		retData.put("values",picList);
		//model.addAttribute("scrollfour",retData);
		return retData;
	}
	@RequestMapping(value="/getpic",method=RequestMethod.GET)
	@ResponseBody
	public Map GetPic(){
		logger.info("homepage to get 16 pics");
		
			//json���������������: ret{name:16pic,num:16,values:[{img:pic1,title:h1,content:p,price:120,discountPrice:80},{pic2},...,{pic16}]}

		//文件名字
		List<String> img = new ArrayList<string>();
		for(int i=0;i<16;i++){
			String imgName= "../../selly/resources/assets/img/slider/1.jpg";
			imgName += Integer.toString(i);
			img.add(imgName);
		}

		List<HashMap> picList = new ArrayList<HashMap>();
		for(int i=0;i<16;i++){
			HashMap<String,String> data = new HashMap<String,String>();
			data.put("img",img[i]);
			data.put("title","短袖");
			data.put("content","短袖针织衫");
			data.put("price",120):
			data.put("discountPrice",80);
			picList.add(data);
			
		}
		Map retData = new HashMap();
		retData.put("name","16pic");
		retData.put("num","16");
		retData.put("values",picList);
		return retData;
	}


}
