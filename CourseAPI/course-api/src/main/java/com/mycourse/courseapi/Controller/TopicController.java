package com.mycourse.courseapi.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mycourse.Services.*;


@RestController
public class TopicController {
	
	@Autowired
	private TopicServices topicService;
	
	@GetMapping("/topics")
	public List<Topic>  getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/topics/new")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
}
