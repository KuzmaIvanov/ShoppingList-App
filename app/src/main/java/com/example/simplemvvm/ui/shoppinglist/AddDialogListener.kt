package com.example.simplemvvm.ui.shoppinglist

import com.example.simplemvvm.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}