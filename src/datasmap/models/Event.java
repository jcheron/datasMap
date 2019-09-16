package datasmap.models;

import java.time.LocalDateTime;

public class Event {
	private String name;
	private String description;
	private LocalDateTime date;
	private String groups;
	
	public Event(String name,String description,String groups) {
		
	}
	
	public boolean hasGroup(String groupName) {
		return false;
	}
}
