package com.gltrusov.deeplinktest.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.gltrusov.deeplinktest.utils.HyperlinkText
import com.gltrusov.deeplinktest.utils.createLinkToFileFunction

@Composable
fun ComposeScreenInFile() {

    val newLink = createLinkToFileFunction(
        context = LocalContext.current,
        pack = object {}::class.java.`package`,
        method = object {}::class.java.enclosingMethod
    )

    HyperlinkText(fullText = "Link to GitHub", linkText = newLink)
}