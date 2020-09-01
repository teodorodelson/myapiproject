package com.mycourse.courseapi.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicServices {

	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("ENG 7","Technical Writing","3"),
			new Topic("BINARY","Binary Computing","3"),
			new Topic("PRG 2","Programming 2","3"),
			new Topic("PRG 2L","Programming 2 Lab","3")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}

	public void addTopic(Topic topic) {
	topics.add(topic);		
	}
	}

