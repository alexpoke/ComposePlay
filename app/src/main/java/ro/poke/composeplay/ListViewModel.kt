package ro.poke.composeplay

import androidx.lifecycle.ViewModel

class ListViewModel: ViewModel() {

    fun getNames() = getDummyNameList()

}

private fun getDummyNameList(): List<String> {
    return (1..100).map { "Item $it" }.toList()
}
