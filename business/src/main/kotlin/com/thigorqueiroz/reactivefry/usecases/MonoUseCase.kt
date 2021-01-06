package com.thigorqueiroz.reactivefry.usecases

import reactor.core.publisher.Mono

interface MonoUseCase<I,O> {
    fun execute(input: I): Mono<O>
}