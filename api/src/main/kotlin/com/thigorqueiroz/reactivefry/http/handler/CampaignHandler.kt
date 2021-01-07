package com.thigorqueiroz.reactivefry.http.handler

import com.thigorqueiroz.reactivefry.usecases.campaign.CreateCampaignUseCase
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.status
import org.springframework.web.reactive.function.server.bodyToMono
import org.springframework.web.reactive.function.BodyInserters.fromValue

import reactor.core.publisher.Mono

@Component
class CampaignHandler(private val campaignUseCase: CreateCampaignUseCase) {
    fun create(serverRequest: ServerRequest): Mono<ServerResponse> {
        return campaignUseCase(serverRequest.bodyToMono()).flatMap {
            status(HttpStatus.CREATED).body(fromValue(it))
        }
    }

}