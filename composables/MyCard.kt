package com.qi.finalproject.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.finalproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCard(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
    text: String,
) {
    Card(
        modifier = modifier.padding(5.dp),
        content = {
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = modifier.padding(5.dp)
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = modifier.fillMaxWidth()
                )
                Column(
                    modifier = modifier.padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = modifier.fillMaxWidth()
                                           .padding(horizontal = 15.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = text)
                    } //Row
                } //Column
            } //Box
        }
    )
}

@Composable
fun MyCardState(
    modifier: Modifier = Modifier,
    @DrawableRes img: Int = R.drawable.ic_launcher_background,
    txt: String = "Texto"
) {
    var checkState by rememberSaveable {
        mutableStateOf(false)
    }

    MyCard(
        image = img,
        text = txt,
    )
}

///////////////////////////////////
@Preview
@Composable
fun CardPreview() {
    MyCardState()
}