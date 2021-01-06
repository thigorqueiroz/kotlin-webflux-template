package com.thigorqueiroz.reactivefry.config

import com.thigorqueiroz.reactivefry.interfaces.campaign.CampaignCreator
import com.thigorqueiroz.reactivefry.services.campaign.CampaignCreatorService
import com.thigorqueiroz.reactivefry.usecases.campaign.CreateCampaignUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseConfig {
    @Bean
    fun createCampaignUseCase(campaignCreator: CampaignCreator): CreateCampaignUseCase = CreateCampaignUseCase(campaignCreator)

    @Bean
    fun campaignCreator(): CampaignCreator = CampaignCreatorService()

}