package org.ikea.maven.restful.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ikea.maven.restful.messenger.database.DatabaseClass;
import org.ikea.maven.restful.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "Radhe Radhe", "Rahul Kumar Pandey"));
		messages.put(2L, new Message(2, "Ram Ram", "Girija shankar Pandey"));
		messages.put(3L, new Message(3, "Shaym Murali", "Badrinath Choubey"));
	}
	
	public List<Message> getAllMessages(){
		
		return new ArrayList<Message>(messages.values());
		
	}
	
	public Message getMessage(long id){
		
		return messages.get(id);
		
	}

	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message  updateMessage(Message message){
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		
		return messages.remove(id);
		
	}
}