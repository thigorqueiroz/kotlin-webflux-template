package com.thigorqueiroz.reactivefry.usecase

import reactor.core.publisher.Mono

interface MonoUseCase<I,O> {
    fun execute(input: I): Mono<O>
}