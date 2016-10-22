package com.oedipus.api.base.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
class RootController {

	@Value("${root.message:${spring.application.name:Application} is up and running.}")
	String message;

	@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
	String root() {
		return message;
	}
}
