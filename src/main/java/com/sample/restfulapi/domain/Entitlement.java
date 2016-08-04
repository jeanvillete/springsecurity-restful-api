package com.sample.restfulapi.domain;

import java.util.ArrayList;
import java.util.List;

public class Entitlement {

	private List< String > rights;

	public Entitlement() {
		
	}
	
	public Entitlement( List< String > rights ) {
		this.rights = rights;
	}
	
	public List< String > getRights() {
		return rights;
	}
	
	public void addRight( String right ) {
		if ( this.rights == null ) {
			this.rights = new ArrayList< String >();
		}
		this.rights.add( right );
	}
	
}
