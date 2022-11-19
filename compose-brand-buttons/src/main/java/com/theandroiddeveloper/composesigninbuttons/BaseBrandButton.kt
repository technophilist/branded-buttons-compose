package com.theandroiddeveloper.composesigninbuttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

/**
 * A button that contains a brand icon followed by [label]. It sets the appearance of the
 * button based on the properties defined in [brandedButtonType].
 * @param brandedButtonType the type of branded button to display.
 * @param label the text that will appear after the brand icon.
 * @param textStyle the [TextStyle] to be applied for the [label].
 * @param onClick the lambda to execute when the button is clicked.
 * @param modifier the modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not
 * be clickable.
 * @param elevation [ButtonElevation] used to resolve the elevation for this button in different
 * @param shape Defines the button's shape as well as its shadow.
 * @param border Border to draw around the button.
 */
@Composable
internal fun BrandButton(
    brandedButtonType: BrandedButtonType,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current,
    enabled: Boolean = true,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null
) {
    Button(
        modifier = Modifier
            .sizeIn(minHeight = 40.dp)
            .then(modifier),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = brandedButtonType.backgroundColor),
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        contentPadding = brandedButtonType.contentPadding
    ) {
        Row(
            modifier = Modifier.semantics(mergeDescendants = true) {
                // TODO test and document
                role = Role.Button
                contentDescription = label
            },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.height(brandedButtonType.iconHeight),
                imageVector = ImageVector.vectorResource(brandedButtonType.iconResId),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(text = label, style = textStyle, color = brandedButtonType.contentColor)
        }
    }
}

/**
 * A button that contains a brand icon followed by the [label]. It sets the appearance of the
 * button based on the properties defined in [brand].
 * @param brand defines the brand of the button based on which the appearance will be set.
 * @param label the text that will appear after the brand icon.
 * @param textStyle the [TextStyle] to be applied for the [label].
 * @param onClick the lambda to execute when the button is clicked.
 * @param modifier the modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not
 * be clickable.
 * @param elevation [ButtonElevation] used to resolve the elevation for this button in different
 * @param shape Defines the button's shape as well as its shadow.
 * @param border Border to draw around the button.
 */
@Composable
fun BrandButton(
    brand: Brand,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current,
    enabled: Boolean = true,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null
) {
    Button(
        modifier = Modifier
            .sizeIn(minHeight = 40.dp)
            .then(modifier),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = brand.backgroundColor),
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        contentPadding = brand.contentPadding
    ) {
        Row(
            modifier = Modifier.semantics(mergeDescendants = true) {
                // TODO test and document
                role = Role.Button
                contentDescription = label
            },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.height(brand.iconHeight),
                imageVector = ImageVector.vectorResource(brand.iconResId),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(text = label, style = textStyle, color = brand.contentColor)
        }
    }
}