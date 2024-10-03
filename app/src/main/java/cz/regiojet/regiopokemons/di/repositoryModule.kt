package cz.regiojet.regiopokemons.di

import cz.regiojet.regiopokemons.data.repository.PokemonRepository
import org.koin.dsl.module

val repositoryModule = module {

     single { PokemonRepository(get()) }
}