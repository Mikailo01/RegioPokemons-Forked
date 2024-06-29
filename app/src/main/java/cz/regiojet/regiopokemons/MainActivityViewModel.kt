package cz.regiojet.regiopokemons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cz.regiojet.regiopokemons.data.model.PokemonEntity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val remoteRepository: Nothing // Todo 2. Add class type
) : ViewModel() {

    // TODO 2.
    //  - define observable state
    //  - load pokemons

}