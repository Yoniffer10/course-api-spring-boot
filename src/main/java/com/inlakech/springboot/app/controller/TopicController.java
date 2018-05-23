package com.inlakech.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inlakech.springboot.app.domain.Topic;
import com.inlakech.springboot.app.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService service;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return service.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return service.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic t) {
		service.addTopic(t);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics")
	public void updateTopic(@RequestBody Topic t) {
		service.updateTopic(t);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		service.deleteTopic(id);
	}
}
