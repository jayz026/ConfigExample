package org.tester.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tester.beans.MyBean;

@RestController
public class SampleController {

	@Autowired
	MyBean bean;
	
	@GetMapping("/example")
	public MyBean getBean() {
		return bean;
	}
}