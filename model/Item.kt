package com.qi.finalproject.model

import com.qi.finalproject.R

data class Item(
    var image: Int,
    var text: String
)

val listItem = listOf<Item>(
    Item(R.drawable.ic_launcher_foreground, "Artigo 1"),
    Item(R.drawable.ic_launcher_foreground, "Artigo 2"),
    Item(R.drawable.ic_launcher_foreground, "Artigo 3"),
    Item(R.drawable.ic_launcher_foreground, "Artigo 4")
)