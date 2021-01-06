package com.thigorqueiroz.reactivefry.http.router

import com.thigorqueiroz.reactivefry.models.campaign.Campaign
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Flux

@Component
class CampaignRouter {

    val campaigns = Flux.just(Campaign("Campaign1"), Campaign("Campaign2"), Campaign("Campaign3"))

    @Bean
    fun campaignRoutes() = router {
        "campaigns".nest {
            GET("/") {
                ok().body(campaigns, Campaign::class.java)
            }
        }
    }
}