package com.shadow.service.message;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/*
 * @Author Satyam Pandey
 * @Description Service level implementation for messaging demonstration
 * */
@Service
public class MessagingServiceImpl implements MessagingService {

	/*
	 * @Author Satyam Pandey
	 * @Param sender info
	 * @Return sender info & the message composed in a Hashmap object
	 * */
	@Override
	public Map<String, String> message(String sender) {
		Map<String, String> response=new HashMap<>();
		response.put("sender", sender);
		response.put("Message", "This is message is being sent from the service module & the sender service of "+sender);
		return response;
	}
	
}
