package com.example.spring.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;
/**
 * 
 * @author MADININA
 * This is a pojo Object that Later will be used b
 * The Serializable Interface is used when we want to 
 * transfer non primitive type on  over the network
 * 
 */
@Component
public class Employee implements Serializable {
 
    String name;
 
    String email;
 
    public String getName() {
   	 return name;
    }
 
    public void setName(String name) {
   	 this.name = name;
    }
 
    public String getEmail() {
   	 return email;
    }
 
    public void setEmail(String email) {
   	 this.email = email;
    }
 
    public Employee() {
    }
    
    @Override
	public String toString() {
		return "Hello , This is CustomerDAO";
	}
 
}