package com.thigorqueiroz.reactivefry.usecase

import reactor.core.publisher.Flux

interface FluxUseCase<I,O> {
    fun execute(input: I): Flux<O>
}