package dev.kerimbr.baselineprofillerexample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import dev.kerimbr.baselineprofillerexample.ui.theme.BaselineProfillerExampleTheme

@Composable
fun MyGridItem(
    modifier: Modifier = Modifier,
    id: Int = 0
) {

    Surface(
        modifier = modifier,
        tonalElevation = 4.dp,
        shadowElevation = 4.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            AsyncImage(
                modifier = Modifier
                    .size(200.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 8.dp,
                            topEnd = 8.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    ),
                model = "https://xsgames.co/randomusers/assets/avatars/pixel/$id.jpg",
                contentDescription = "Image",
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Avatar $id"
            )
        }
    }

}

@Preview
@Composable
private fun PreviewMyGridItem() {
    BaselineProfillerExampleTheme {
        MyGridItem(modifier = Modifier.padding(16.dp))
    }
}