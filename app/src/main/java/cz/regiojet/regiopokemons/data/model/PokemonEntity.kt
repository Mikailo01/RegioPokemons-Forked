package cz.regiojet.regiopokemons.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon")
data class PokemonEntity(

    // TODO: 3. Primary key

    val name: String,
)
