package com.JUMPD.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.JUMPD.models.Client;

@Controller
public class HelloWorldController { 
	ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() { 
    	Query searchUserQuery = new Query(Criteria.where("fName").is("Johnny"));
    	Client savedUser = mongoOperation.findOne(searchUserQuery, Client.class);

    	return new ModelAndView("hellopage", "respMessage", savedUser);  
    }
}  
