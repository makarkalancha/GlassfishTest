
package com.mycompany;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RestApplication extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(SimpleService.class);
		classes.add(NameServlet.class);
		return classes;
	}
//
//	@Override
//	public Set<Object> getSingletons() {
//		Set<Object> singletons = new HashSet<>();
//		return singletons;
//	}
//	// all request scoped resources and providers
	

}