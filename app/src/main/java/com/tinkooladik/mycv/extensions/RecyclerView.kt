package com.tinkooladik.mycv.extensions

import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView
import com.tinkooladik.mycv.R

fun RecyclerView.addVerticalSpacingItemDecoration(
    @DimenRes spacing: Int = R.dimen.spacing_medium
) {
    addItemDecoration(
        object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                outRect.bottom = context.resources.getDimensionPixelSize(spacing)
            }
        }
    )
}