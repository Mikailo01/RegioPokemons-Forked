package cz.regiojet.regiopokemons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cz.regiojet.regiopokemons.data.model.PokemonEntity
import cz.regiojet.regiopokemons.data.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val remoteRepository: PokemonRepository
) : ViewModel() {

    private val _uiState: MutableStateFlow<List<PokemonEntity>> = MutableStateFlow(emptyList())
    val uiState: StateFlow<List<PokemonEntity>> = _uiState.asStateFlow()

    fun getPokemons() {
        viewModelScope.launch {
            val result = remoteRepository.getPokemons()

            _uiState.value = result
        }
    }
}