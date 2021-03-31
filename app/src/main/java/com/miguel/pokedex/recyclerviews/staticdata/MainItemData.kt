package com.miguel.pokedex.recyclerviews.staticdata

import com.miguel.pokedex.R

object MainItemData {
    val MENU_ITEMS = arrayListOf(MainMenuItem("Pokedex", R.drawable.background_menu_item_pokedex),
    MainMenuItem("Moves",R.drawable.background_menu_item_moves),
            MainMenuItem("Abilities", R.drawable.background_menu_item_abilities),
    MainMenuItem("Items", R.drawable.background_menu_item_items),
            MainMenuItem("Locations",R.drawable.background_menu_item_locations),
    MainMenuItem("Type Charts",R.drawable.background_menu_item_type_charts))
}