package com.thigorqueiroz.reactivefry.usecases

import reactor.core.publisher.Mono

interface MonoUseCase<I,O> {
    operator fun invoke(input: Mono<I>): Mono<O>
}