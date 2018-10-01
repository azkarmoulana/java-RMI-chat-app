/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import client.ChatClient3IF;

/**
 *
 * @author Azkar
 */
public class Chatter {

	public String name;
	public ChatClient3IF client;
	
	//constructor
	public Chatter(String name, ChatClient3IF client){
		this.name = name;
		this.client = client;
	}

	
	//getters and setters
	public String getName(){
		return name;
	}
	public ChatClient3IF getClient(){
		return client;
	}
	
	
}
