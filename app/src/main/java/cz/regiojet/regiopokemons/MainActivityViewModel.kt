package cz.regiojet.regiopokemons

import androidx.lifecycle.ViewModel
import cz.regiojet.regiopokemons.data.model.PokemonEntity

class MainActivityViewModel(
    private val remoteRepository: Nothing // Todo 2. Add class type
) : ViewModel() {

    // Todo 2.
    //  - define observable state holder
    //  - load pokemons

    data class UiState(
        val list: List<PokemonEntity> = emptyList(),
        val isLoading: Boolean = false
    )

}