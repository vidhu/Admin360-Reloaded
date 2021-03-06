package com.vidhucraft.Admin360.commands;

public enum A3Enum {
	//Queues a players request
	HELP,
	
	//Teleports the admin to the next player
	NEXT,
	
	//Removes a request from the request queue
	CLOSE,
	
	//Marks a request as handled satisfactory
	YES,
	
	//Marks a request as handled unsatisfactory
	NO,
	
	//Gets honor points of an admin of given name.
	GET,
	
	//Gets top admins with respect to honor points
	TOP,
	
	//Removes all requests in queue
	PURGE,
	
	//Reloads admin360
	RELOAD,
	
	//Cancels request
	CANCEL,
	
	//Gets the player's request status
	STATUS,
	
	//Gets the number of requests in the queue
	COUNT;
	
	public static A3Enum getEnum(String value){
		if(value == null)
			return null;
		for(A3Enum v : values())
            if(value.equalsIgnoreCase(v.name())) return v;
		return null;
	}
}
