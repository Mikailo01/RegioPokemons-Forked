# RegioPokemons

A repository to test basic Android work. There is no project setup needed, all dependencies, models, and DIs are set up (except repository module).

You can navigate trough the project using TODOs or following checklist. 

### Git

1. Clone the repository.
2. Check out to a custom branch.
3. After you finish all tasks, commit your changes.

### Tasks

1. **Fetch Pokemons - Retrofit**
   - Define GET endpoint `pokemon` inside `PokeApiService`. Limit max results using query `limit` with value 20.
   - Create remote repository layer to process response from the API with very basic error handling.
   - Use API service as an injected dependency (Add it to the `repositoryModule.kt`).

2. **Show results on the screen**
   - Create an observable state holder in `MainActivityViewModel` to hold current UI State.
   - Create function that will load pokemon list from the repository.
   - In `MainActivity`, collect UI State and implement the screen using Jetpack Compose.
     - The data will be fetched on demand using Button.
     - Show loader when data is being fetched.
     - Show the data to the user in an appropriate way and style it a bit (like text color, some padding, maybe play with the font a bit...).

3. **Local data storage - Room**
   - What if we were to save the data to local database? What components would we need?
     - Define primary key for our local entity `PokemonEntity`.
     - Implement an interface that will communicate with the DB - CRUD operations.
     - How would you process the data now? Don't implement, just showcase/explain.