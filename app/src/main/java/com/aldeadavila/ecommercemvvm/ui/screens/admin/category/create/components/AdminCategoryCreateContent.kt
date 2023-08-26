package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aldeadavila.ecommercemvvm.R
import com.aldeadavila.ecommercemvvm.ui.components.DefaultButton
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTextField

@Composable
fun AdminCategoryCreateContent(paddingValues: PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.image_add),
            contentDescription = "")
        Spacer(modifier = Modifier.weight(1f))
        Card(
            modifier= Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(
                topEnd = 40.dp,
                topStart = 40.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ){
            Column (modifier = Modifier.padding(20.dp))
            {
                Text(
                    modifier = Modifier
                        .padding(bottom = 20.dp),
                    text = "CATEGORÍA",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )

                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = { },
                    label = "Nombre de la categoría",
                    icon = Icons.Default.List,
                    contentDescription = ""
                )

                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = { },
                    label = "Descripción",
                    icon = Icons.Default.Info,
                    contentDescription = ""
                )


            }

            Spacer(modifier = Modifier.height(40.dp))
            DefaultButton(modifier = Modifier.fillMaxWidth(),
                text = "Crear Categoría",
                onClick = {

                }
            )
        }
    }
}