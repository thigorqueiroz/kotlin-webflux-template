package com.thigorqueiroz.reactivefry.usecases

import reactor.core.publisher.Flux

interface FluxUseCase<I,O> {
   operator fun invoke(input: I): Flux<O>
}