package com.thigorqueiroz.reactivefry.config

import com.thigorqueiroz.reactivefry.usecase.campaign.CreateCampaignUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseConfig {
    @Bean
    fun createCampaignUseCase(): CreateCampaignUseCase = CreateCampaignUseCase()
}