package com.thigorqueiroz.reactivefry.interfaces.campaign

import com.thigorqueiroz.reactivefry.models.campaign.Campaign
import com.thigorqueiroz.reactivefry.models.campaign.CreateCampaignRequest
import reactor.core.publisher.Mono

interface CampaignCreator {
    fun create(createCampaignRequest: Mono<CreateCampaignRequest>): Mono<Campaign>
}
