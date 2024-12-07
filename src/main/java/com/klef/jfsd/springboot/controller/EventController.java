package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.service.EventService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EventController 
{

	@Autowired
	private EventService eventService;
	
	@GetMapping("/")
	public ModelAndView Home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("eventreg")
	public ModelAndView eventreg()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventreg");
		return mv;
	}
	@GetMapping("viewallevents")
	public ModelAndView viewallevents()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewallevents");
		return mv;
	}
	
	@PostMapping("insertevent")
	   public ModelAndView insertemp(HttpServletRequest request)
	   {
		String id= request.getParameter("eve_id");
	    String name = request.getParameter("eve_name");
	    String location = request.getParameter("eve_location");
	    String date = request.getParameter("eve_date");
	    String description = request.getParameter("eve_description");
	    double organizer = Double.parseDouble(request.getParameter("eve_organizer"));
	    
	     Event e = new Event();
	     e.setId(0);
	     e.setName(name);
	     e.setLocation(location);
	     e.setDate(date);
	     e.setDescription(description);
	     e.setOrganizer(description);
	     
	      
	      String msg = eventService.EventRegistration(e);
	      
	      ModelAndView mv = new ModelAndView("regsuccess");
	      mv.addObject("message", msg);
	    
	      return mv;
	   }
}
