package com.jantursky.materialicons.views

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import com.jantursky.materialicons.utils.FontUtils

class IconTextView : TextView {

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context) : super(context) {
        init(context)
    }

    private fun init(context: Context) {
        typeface = FontUtils.getIconTypeface(context)
    }
}