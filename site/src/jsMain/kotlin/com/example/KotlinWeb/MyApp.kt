package com.example.KotlinWeb

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.MutableSilkPalette
import com.varabyte.kobweb.silk.theme.colors.MutableSilkPalettes

import org.jetbrains.compose.web.css.*

@InitSilk
fun updateTheme(ctx: InitSilkContext) {
    ctx.theme.palettes = MutableSilkPalettes(
        light = MutableSilkPalette(
            background = Colors.White,
            color = Colors.Black,
            link = MutableSilkPalette.Link(
                default = Colors.Black,
                visited = Colors.Blue
            ),
            button = MutableSilkPalette.Button(
                default = Colors.DarkGrey,
                hover = Colors.LightGray,
                focus = Colors.LightGray,
                pressed = Colors.Gray,

            ),
            switch = MutableSilkPalette.Switch(
                backgroundOff = Colors.White,
                backgroundOn = Colors.Blue
            ),
            tab = MutableSilkPalette.Tab(color = Colors.Blue,
                                  background = Colors.DarkBlue,
                                   selectedColor = Colors.Blue,
                                   disabled = Colors.Blue,
                                    hover = Colors.LightGray,
                                   pressed = Colors.Gray)
        )
        ,

        dark = MutableSilkPalette(
            background = Colors.Black,
            color = Colors.White,
            link = MutableSilkPalette.Link(
                default = Colors.White,
                visited = Colors.Blue
            ),
            button = MutableSilkPalette.Button(
                default = Colors.Blue,
                hover = Colors.MediumBlue,
                focus = Colors.MediumBlue,
                pressed = Colors.DarkBlue


                ),

            switch = MutableSilkPalette.Switch(
                backgroundOff = Colors.White,
                backgroundOn = Colors.Blue
            ),
            tab = MutableSilkPalette.Tab(color = Colors.Blue,
                background = Colors.White,
                selectedColor = Colors.Blue,
                disabled = Colors.Blue,
                hover = Colors.LightGray,
                pressed = Colors.Gray)
        )
            )

}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
