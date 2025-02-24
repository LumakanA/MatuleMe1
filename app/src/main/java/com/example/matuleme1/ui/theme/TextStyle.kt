package com.example.matuleme1.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

data class AppTextStyle(
    val bodyRegular12: TextStyle,
    val bodyMedium12: TextStyle,
    val bodyRegular14: TextStyle,
    val bodyMedium14: TextStyle,
    val bodySemiBold14: TextStyle,
    val bodyRegular16: TextStyle,
    val subtitleRegular16: TextStyle,
    val subtitleMedium16: TextStyle,
    val subtitleBold16: TextStyle,
    val subtitleMedium18: TextStyle,
    val headingMedium20: TextStyle,
    val headingSemiBold20: TextStyle,
    val headingMedium24: TextStyle,
    val headingBold24: TextStyle,
    val headingBold36: TextStyle,
    val headingExtraboldExtrabold36 : TextStyle,
    val headingExtraBold64: TextStyle,
    val headingHeadingBlack96 : TextStyle,
    val headingBlack128: TextStyle,
)

val defaultTextStyle = AppTextStyle(
    bodyRegular12 = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    bodyMedium12 = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    bodyRegular14 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    bodyMedium14 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    bodySemiBold14 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    bodyRegular16 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily.Default
    ),
    subtitleRegular16 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 18.sp,
        fontFamily = FontFamily.Default
    ),
    subtitleMedium16 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    subtitleBold16 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.Default
    ),
    subtitleMedium18 = TextStyle(
        fontSize = 18.sp,
        lineHeight = 18.sp,
        fontFamily = FontFamily.Default
    ),
    headingMedium20 = TextStyle(
        fontSize = 20.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily.Default
    ),
    headingSemiBold20 = TextStyle(
        fontSize = 20.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily.Default
    ),
    headingMedium24 = TextStyle(
        fontSize = 24.sp,
        lineHeight = 30.sp,
        fontFamily = FontFamily.Default
    ),
    headingBold24 = TextStyle(
        fontSize = 24.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.Default
    ),
    headingBold36 = TextStyle(
        fontSize = 36.sp,
        lineHeight = 36.sp,
        fontFamily = FontFamily.Default
    ),
    headingExtraboldExtrabold36 = TextStyle(
        fontSize = 36.sp,
        lineHeight = 36.sp,
        fontFamily = FontFamily.Default
    ),
    headingExtraBold64 = TextStyle(
        fontSize = 64.sp,
        lineHeight = 64.sp,
        fontFamily = FontFamily.Default
    ),
    headingHeadingBlack96 = TextStyle(
        fontSize = 96.sp,
        lineHeight = 120.sp,
        fontFamily = FontFamily.Default
    ),
    headingBlack128 = TextStyle(
        fontSize = 128.sp,
        lineHeight = 128.sp,
        fontFamily = FontFamily.Default
    )
)