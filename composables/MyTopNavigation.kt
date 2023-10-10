package com.qi.finalproject.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTopNavigation(
    modifier: Modifier = Modifier,
    selected: Int,
    onItemSelected: (Int) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.fillMaxWidth()
    ) {
        TextButton(
            onClick = { onItemSelected(0) },
            enabled = selected != 0,
            content = {
                Text(text = "Para você")
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF000000),
                disabledContentColor = Color(0xFF0074C2)
            )
        )
        TextButton(
            onClick = { onItemSelected(1) },
            enabled = selected != 1,
            content = {
                Text(text = "Explorar")
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF000000),
                disabledContentColor = Color(0xFF0074C2)
            )
        )
        TextButton(
            onClick = { onItemSelected(2) },
            enabled = selected != 2,
            content = {
                Text(text = "Coleção")
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF000000),
                disabledContentColor = Color(0xFF0074C2)
            )
        )
        TextButton(
            onClick = { onItemSelected(3) },
            enabled = selected != 3,
            content = {
                Text(text = "Dicas")
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF000000),
                disabledContentColor = Color(0xFF0074C2)
            )
        )
    }
}


@Composable
fun MyTopNavigationState(
    modifier: Modifier = Modifier
) {
    var itemSelected by remember {
        mutableStateOf(0)
    }

    MyTopNavigation(
        selected = itemSelected,
        onItemSelected = { value -> itemSelected = value },
    )
}


@Preview
@Composable
fun TopNavigationPreview() {
    MyTopNavigationState()
}