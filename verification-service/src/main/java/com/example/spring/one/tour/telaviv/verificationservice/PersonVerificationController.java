package com.example.spring.one.tour.telaviv.verificationservice;

import reactor.core.publisher.Mono;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

/**
 * @author Olga Maciaszek-Sharma
 */
@Controller
public class PersonVerificationController {

	private final PersonVerificationService verificationService;

	public PersonVerificationController(PersonVerificationService verificationService) {
		this.verificationService = verificationService;
	}

	@MessageMapping("verify")
	Mono<PersonVerificationResult> verify(Person person) {
		return Mono.just(verificationService.verify(person));
	}

}
