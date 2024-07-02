package cz.regiojet.regiopokemons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cz.regiojet.regiopokemons.ui.theme.RegioPokemonsTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegioPokemonsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainActivityScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
private fun MainActivityScreen(
    modifier: Modifier,
    viewModel: MainActivityViewModel = koinViewModel(),
) {

    // TODO 2.
    //  - add button to fetch pokemon list
    //  - optionally: add loading state
    //  - print pokemon list on the screen

    // Todo uncomment to collect state from the VM
    //val state = viewModel.uiState.collectAsState()

}