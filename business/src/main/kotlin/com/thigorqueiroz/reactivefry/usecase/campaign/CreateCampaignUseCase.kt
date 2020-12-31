package com.thigorqueiroz.reactivefry.usecase.campaign

import com.thigorqueiroz.reactivefry.models.campaign.CreateCampaignRequest as Request
import com.thigorqueiroz.reactivefry.models.campaign.CreateCampaignResponse as Response
import com.thigorqueiroz.reactivefry.usecase.MonoUseCase

import reactor.core.publisher.Mono

class CreateCampaignUseCase : MonoUseCase<Request, Response>{
    override fun execute(request: Request): Mono<Response> {
        TODO("Not yet implemented")
    }
}