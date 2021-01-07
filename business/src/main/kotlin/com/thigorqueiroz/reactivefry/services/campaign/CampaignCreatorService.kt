package com.thigorqueiroz.reactivefry.services.campaign

import com.thigorqueiroz.reactivefry.interfaces.campaign.CampaignCreator
import com.thigorqueiroz.reactivefry.models.campaign.Campaign
import com.thigorqueiroz.reactivefry.models.campaign.CreateCampaignRequest
import reactor.core.publisher.Mono

class CampaignCreatorService : CampaignCreator{
    override fun create(createCampaignRequest: Mono<CreateCampaignRequest>) = Mono.just(Campaign("DUMMY"))
}