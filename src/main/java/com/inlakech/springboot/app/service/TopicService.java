package com.inlakech.springboot.app.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inlakech.springboot.app.domain.Topic;
import com.inlakech.springboot.app.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository repository;

	private List<Topic> topics = Arrays.asList(
		new Topic("spring","Spring Framework","The best java framework"),
		new Topic("java","Java Core","The best programming language"),
		new Topic("hibernate","Hibernate Framework","The best ORM framework")
	);
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopicById(String id) {
		//return this.topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return repository.findById(id).get();
	}

	public void addTopic(Topic t) {
		repository.save(t);
	}

	public void updateTopic(Topic t) {
		repository.save(t);
	}

	public void deleteTopic(String id) {
		repository.deleteById(id);
	}
}
