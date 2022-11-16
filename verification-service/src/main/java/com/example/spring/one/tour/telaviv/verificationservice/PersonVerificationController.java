package com.example.spring.one.tour.telaviv.verificationservice;

import reactor.core.publisher.Mono;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Olga Maciaszek-Sharma
 */
@RestController
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
