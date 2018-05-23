package com.inlakech.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;


import com.inlakech.springboot.app.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

	
}
