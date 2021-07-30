// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.IntSize

const val DEFAULT_WIDTH = 500
const val DEFAULT_HEIGHT = 500


fun main() = Window(
    title = "Une calculatrice en kotlinCompose",
    size = IntSize(DEFAULT_WIDTH, DEFAULT_HEIGHT),
   // icon = Assets.WindowIcon
) {
MaterialTheme {
    val mainOutput = remember { mutableStateOf(TextFieldValue("0")) }
    Column(Modifier.fillMaxHeight()) {
        DisplayPanel(
            Modifier.weight(1f),
            mainOutput
        )
        Keyboard(
            Modifier.weight(4f),
            mainOutput
        )
    }
}
}
@Composable
fun Keyboard(weight: Modifier, mainOutput: MutableState<TextFieldValue>) {

}

@Composable
fun DisplayPanel(weight: Modifier, mainOutput: MutableState<TextFieldValue>) {

}
