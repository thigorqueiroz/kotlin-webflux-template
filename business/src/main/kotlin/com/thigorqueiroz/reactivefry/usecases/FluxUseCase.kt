package com.thigorqueiroz.reactivefry.usecases

import reactor.core.publisher.Flux

interface FluxUseCase<I,O> {
    fun execute(input: I): Flux<O>
}