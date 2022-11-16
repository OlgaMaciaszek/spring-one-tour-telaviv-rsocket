package com.example.spring.one.tour.telaviv.rsocket.customerservice;

import reactor.core.publisher.Mono;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.rsocket.service.RSocketExchange;

/**
 * @author Olga Maciaszek-Sharma
 */

public interface VerificationService {

	@RSocketExchange("verify")
	Mono<CustomerVerificationResult> verify(@Payload CustomerApplication app);

}
