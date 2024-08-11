package dev.kerimbr.baselineprofillerexample

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

@Composable
fun MyGrid(
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        modifier = modifier.testTag("my_grid"),
        columns = GridCells.Fixed(2),
    ) {
        items(50) {
            key(it) {
                MyGridItem(
                    modifier = Modifier.padding(16.dp),
                    id = it
                )
            }
        }
    }
}