package com.qi.finalproject.composables

import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBottomBar(
    modifier: Modifier = Modifier,
    selected: Boolean,
    onItemSelected: (Boolean) -> Unit
) {
    NavigationBar(
        containerColor = Color(0xFFFFFFFF),
        contentColor = Color(0xFF0074C2),
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                modifier = modifier.size(150.dp),
                onClick = { onItemSelected(true) },
                enabled = selected != true,
                content = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Home,
                            contentDescription = "Início",
                        )
                        Text(text = "Início")
                    }
                },
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color(0xFF000000),
                    disabledContentColor = Color(0xFF0074C2)
                )
            )
            IconButton(
                modifier = modifier.size(150.dp),
                onClick = { onItemSelected(false) },
                enabled = selected != false,
                content = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Email,
                            contentDescription = "Mensagens"
                        )
                        Text(text = "Mensagens")
                    }
                },
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color(0xFF000000),
                    disabledContentColor = Color(0xFF0074C2)
                )
            )
        }
    }
}

@Composable
fun MyBottomBarState(
    modifier: Modifier = Modifier
) {
    var itemSelected by remember {
            mutableStateOf(true)
    }

    MyBottomBar(
        selected = itemSelected,
        onItemSelected = { value -> itemSelected = value },
    )
}


@Preview
@Composable
fun BottomBarPreview() {
    MyBottomBarState()
}