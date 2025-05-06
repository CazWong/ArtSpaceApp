package com.example.artspaceapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.Artwork

@Composable
fun CarouselButtons(
    modifier: Modifier = Modifier,
    currentIndex: Int,
    artworkList: List<Artwork>,
    onIndexChanged: (Int) -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        PrimaryButton(
            onClick = {
                val newIndex = (currentIndex - 1).takeIf { it >= 0 } ?: (artworkList.size - 1)
                onIndexChanged(newIndex)
            },
            icon = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "Previous",
        )
        PrimaryButton(
            onClick = {
                val newIndex = (currentIndex + 1) % artworkList.size
                onIndexChanged(newIndex)
            },
            icon = Icons.AutoMirrored.Filled.ArrowForward,
            contentDescription = "Next"
        )
    }
}

@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    icon: ImageVector,
    contentDescription: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    iconColor: Color = MaterialTheme.colorScheme.onPrimary,
) {
    Button(
        onClick = onClick,
        modifier = modifier.semantics { this.contentDescription = contentDescription },
        enabled = enabled,
        shape = CircleShape,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(24.dp),
                tint = iconColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonWithArrow() {
    PrimaryButton(
        onClick = { },
        icon = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescription = "Button with Arrow",
        modifier = Modifier,
    )
}
