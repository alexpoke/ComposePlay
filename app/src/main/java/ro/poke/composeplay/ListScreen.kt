package ro.poke.composeplay

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    listViewModel: ListViewModel = viewModel()
) {
    NameList(names = listViewModel.getNames())
}