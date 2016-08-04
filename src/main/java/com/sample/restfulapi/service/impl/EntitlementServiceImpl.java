package com.sample.restfulapi.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sample.restfulapi.domain.Entitlement;
import com.sample.restfulapi.service.EntitlementService;

@Service
public class EntitlementServiceImpl implements EntitlementService {

	public Entitlement get( String userName ) {
		if ( StringUtils.hasText( userName ) && userName.equals( "bob" ) ) {
			Entitlement entitlement = new Entitlement();
			entitlement.addRight( "accessright_1" );
			entitlement.addRight( "accessright_2" );
			entitlement.addRight( "accessright_3" );
			entitlement.addRight( "accessright_4" );
			entitlement.addRight( "accessright_5" );
			entitlement.addRight( "accessright_6" );
			
			return entitlement;
		}
		return null;
	}

}
