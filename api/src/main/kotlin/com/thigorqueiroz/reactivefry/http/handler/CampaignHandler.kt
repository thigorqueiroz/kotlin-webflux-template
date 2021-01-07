package com.thigorqueiroz.reactivefry.http.handler

import com.thigorqueiroz.reactivefry.models.campaign.Campaign
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Component
class CampaignHandler {
    fun create(serverRequest: ServerRequest): Mono<ServerResponse> =
            ok().body(Campaign("Campaign Created by Thiago").toMono(), Campaign::class.java)
}