package com.thigorqueiroz.reactivefry.services.campaign

import com.thigorqueiroz.reactivefry.interfaces.campaign.CampaignCreator
import com.thigorqueiroz.reactivefry.models.campaign.Campaign
import reactor.core.publisher.Mono

class CampaignCreatorService : CampaignCreator{
    override fun create(name: String) = Mono.just(Campaign("DUMMY"))
}