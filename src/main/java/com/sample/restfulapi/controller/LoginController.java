package com.sample.restfulapi.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.restfulapi.domain.Entitlement;
import com.sample.restfulapi.service.EntitlementService;

@RestController
@RequestMapping( value = "/data" )
public class LoginController implements InitializingBean {

	@Autowired
	private EntitlementService service;

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull( this.service, "Property 'service' was not properly initialized." );
	}
	
	@RequestMapping( value = "/login/{userName}", method = RequestMethod.GET )
	public Entitlement initialize( @PathVariable String userName ) {
		return this.service.get( userName );
	}
	
}
