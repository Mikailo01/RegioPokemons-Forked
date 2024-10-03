package cz.regiojet.regiopokemons.data.repository

import cz.regiojet.regiopokemons.data.model.PokemonEntity
import cz.regiojet.regiopokemons.data.network.PokeApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class PokemonRepository(
    private val pokeApiService: PokeApiService
) {

    suspend fun getPokemons(): List<PokemonEntity> =
        withContext(Dispatchers.IO) {
            val result = pokeApiService.getPokemons()

            result.results.map { PokemonEntity(name = it.name) }
        }
}
