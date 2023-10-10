package com.qi.finalproject.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyTopBar(
    modifier: Modifier = Modifier,
    selected: Int,
    onItemSelected: (Int) -> Unit
) {
    SmallTopAppBar(
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color(0xFFFFFFFF),
            actionIconContentColor = Color(0xFF696969),
            navigationIconContentColor = Color(0xFF696969),
            titleContentColor = Color(0xFFFF9800)
        ),
        title = {
            Text(
                text = "LifeFit",
                modifier = modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        actions = {
            IconButton(
                onClick = { onItemSelected(1) },
                enabled = selected != 1,
                content = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Menu"
                    )
                },
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color(0xFF000000),
                    disabledContentColor = Color(0xFFFF9800)
                )
            )//IconButton
            IconButton(
                onClick = { onItemSelected(2) },
                enabled = selected != 2,
                content = {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Menu"
                    )
                },
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color(0xFF000000),
                    disabledContentColor = Color(0xFFFF9800)
                )
            )
        }
    )
}

@Composable
fun MyTopBarState(
    modifier: Modifier = Modifier
) {
    var itemSelected by remember {
        mutableStateOf(0)
    }

    MyTopBar(
        selected = itemSelected,
        onItemSelected = { value -> itemSelected = value },
    )
}

/////////////////////////////
@Preview
@Composable
fun TopBarStatePreview() {
    MyTopBarState()
}