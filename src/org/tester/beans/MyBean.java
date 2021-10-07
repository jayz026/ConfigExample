package org.tester.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Value("${myproperty}")
	public String name;

    @Value("${envVariable}")
	public String envVal;

    @Value("${envVariable2}")
	public String envVal2;
    
    @Value("${mvnVariable}")
	public String mvnVal;
}