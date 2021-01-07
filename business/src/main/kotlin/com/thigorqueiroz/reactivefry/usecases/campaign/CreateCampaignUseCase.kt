package com.thigorqueiroz.reactivefry.usecases.campaign

import com.thigorqueiroz.reactivefry.interfaces.campaign.CampaignCreator
import com.thigorqueiroz.reactivefry.models.campaign.CreateCampaignRequest as Request
import com.thigorqueiroz.reactivefry.models.campaign.CreateCampaignResponse as Response
import com.thigorqueiroz.reactivefry.usecases.MonoUseCase

import reactor.core.publisher.Mono

class CreateCampaignUseCase(
       private val campaignCreator: CampaignCreator
) : MonoUseCase<Request, Response>{
    override fun invoke(input: Mono<Request>): Mono<Response> {
        return campaignCreator.create(input).map { Response(it) }
    }
}