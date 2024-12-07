package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Event;

public interface EventService
{
	 public String EventRegistration(Event e);
	 public Event displayAllEvents(int eid);
	 
}
