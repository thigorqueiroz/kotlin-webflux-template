package com.thigorqueiroz.reactivefry.http.router

import com.thigorqueiroz.reactivefry.http.handler.CampaignHandler
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router

@Component
class CampaignRouter(private val campaignHandler: CampaignHandler) {

    @Bean
    fun campaignRoutes() = router {
        "campaigns".nest {
            POST("/") {
                campaignHandler.create(it)
            }
        }
    }
}