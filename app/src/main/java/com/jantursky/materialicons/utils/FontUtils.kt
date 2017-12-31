package com.jantursky.materialicons.utils

import android.content.Context
import android.graphics.Typeface

import java.util.HashMap

object FontUtils {

    internal val ICON = "MaterialIcon"

    /**
     * MAP of font types to font paths in assets
     */
    internal var fontMap: MutableMap<String, String> = HashMap()

    /* cache for loaded typefaces */
    private val typefaceCache = HashMap<String, Typeface>()

    init {
        fontMap.put(ICON, "fonts/MaterialIcons-Regular.ttf")
    }

    private fun getRobotoTypeface(context: Context, fontType: String): Typeface? {
        val fontPath = fontMap[fontType]
        if (!typefaceCache.containsKey(fontType)) {
            typefaceCache.put(fontType, Typeface.createFromAsset(context.assets, fontPath))
        }
        return typefaceCache[fontType]
    }

    fun getIconTypeface(context: Context): Typeface? {
        return getRobotoTypeface(context, ICON)
    }

}
