package com.mo.designsystem.theme

import android.graphics.fonts.FontFamily
import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformParagraphStyle
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import uk.org.lta.designsystem.R


val Roboto = FontFamily(
    Font(R.font.roboto_black, FontWeight.Black, FontStyle.Normal),

    Font(R.font.roboto_bold, FontWeight.Bold, FontStyle.Normal),

    Font(R.font.roboto_medium, FontWeight.Medium, FontStyle.Normal),

    Font(R.font.roboto_regular, FontWeight.Normal, FontStyle.Normal),

    Font(R.font.roboto_light, FontWeight.Normal, FontStyle.Normal),

    Font(R.font.roboto_thin, FontWeight.Thin, FontStyle.Normal),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

object Material {
    private val baseFontStyle = TextStyle(
        fontFamily = Roboto,
        platformStyle = PlatformTextStyle(null, PlatformParagraphStyle(false)),
        fontWeight = FontWeight.Normal,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Proportional,
            trim = LineHeightStyle.Trim.Both
        )
    )
    val title32 = baseFontStyle.copy(
        fontSize = 32.sp,
        lineHeight = 40.sp,
    )
    val title28 = baseFontStyle.copy(
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.1.sp
    )

    val title16 = baseFontStyle.copy(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    val title14 = baseFontStyle.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    )
    val subHeadline15 = baseFontStyle.copy(
        fontSize = 15.sp,
        lineHeight = 20.sp,
        letterSpacing = (-0.4).sp
    )

    val searchResultBody = baseFontStyle.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    )

    val navBarStyle = baseFontStyle.copy(
        fontSize = 12.sp,
        fontWeight = FontWeight.W600,
    )

    val body14 = title14.copy(
        letterSpacing = 0.25.sp
    )


    val dialogBody = baseFontStyle.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

    val body = baseFontStyle.copy(
        fontSize = 12.sp,
    )

    val body12 = baseFontStyle.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    )

    val title = baseFontStyle.copy(
        fontSize = 22.sp,
        lineHeight = 28.sp
    )

    val title24 = baseFontStyle.copy(
        fontSize = 24.sp,
        lineHeight = 32.sp,
    )

    val title16Spacing15 = title16.copy(
        letterSpacing = 0.15.sp
    )

    val body20Height25= title16.copy(
        fontSize = 20.sp,
        lineHeight = 25.sp,
    )
}
