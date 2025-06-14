package com.yandex.yandexhw1.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListItem(
    leftTitle: String,
    leftSubtitle: String = "",
    rightTitle: String = "",
    rightSubtitle: String = "",
    leftIcon: String = "",
    rightIcon: ImageVector? = null,
    listHeight: Int = 70,
    listBackground: Color = MaterialTheme.colorScheme.background,
    leftIconBackground: Color = MaterialTheme.colorScheme.secondary,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(listHeight.dp)
            .background(listBackground)
    ) {
        Spacer(modifier = Modifier.width(0.dp))
        if (leftIcon != "") {
            val regex = "^[a-zA-Zа-яА-ЯёЁ0-9]{2}".toRegex()
            if (leftIcon.length >= 2 && regex.containsMatchIn(leftIcon)) {
                Text(
                    leftIcon.substring(0, 2).uppercase(),
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .width(24.dp)
                        .background(leftIconBackground, CircleShape)
                )
            } else {
                Text(
                    leftIcon,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .width(24.dp)
                        .background(leftIconBackground, CircleShape)
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    leftTitle,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                )

                if (leftSubtitle != "") {
                    Text(
                        leftSubtitle,
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.weight(1f)) {
                if (rightTitle != "") {
                    Text(
                        rightTitle,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSurface,
                    )

                    if (rightSubtitle != "") {
                        Text(
                            rightSubtitle,
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
            }
        }

        rightIcon?.let {
            Icon(
                rightIcon,
                contentDescription = "Перейти",
                modifier = Modifier.width(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(0.dp))
    }
}