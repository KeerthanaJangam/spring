package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService 
{

	@Autowired
	private EventRepository eventRepository;
	
	
	@Override
	public String EventRegistration(Event e)
	{
		eventRepository.save(e);
		return "Event Registration Successfully";
	}


	@Override
	public Event displayAllEvents(int eid) 
	{
		return  eventRepository.findById(eid).get();
	}

	

}
