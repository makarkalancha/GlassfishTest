package com.mycompany;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
//after change in class remove it from glassfish 
//and then run as->run on server->glassfish->finish

@Path("sample")
public class SimpleService {
	//http://localhost:8080/GlassfishTest/rest/sample/greet
	@Path("/greet")
	@GET
	public String doGreet(){
		return "Hello Stranger, the time is "+new Date();
	}
	
	//http://localhost:8080/GlassfishTest/rest/sample/sayHello/bitch
	@Path("/sayHello/{name}")
	@GET
	public String doSayHello(@PathParam("name") String name){
		return "Hello there, "+name;
	}
}
