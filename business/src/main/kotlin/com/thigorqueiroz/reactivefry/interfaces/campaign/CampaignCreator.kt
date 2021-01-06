package com.thigorqueiroz.reactivefry.interfaces.campaign

import com.thigorqueiroz.reactivefry.models.campaign.Campaign
import reactor.core.publisher.Mono

interface CampaignCreator {
    fun create(name: String): Mono<Campaign>
}
