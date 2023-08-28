package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Scaffold
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTopBar
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.components.AdminScreenCategoryListContent
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.components.DeleteCategory
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.components.GetCategories
import com.aldeadavila.ecommercemvvm.ui.screens.profile.components.ClientCategoryListContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminCategoryListScreen(navHostController: NavHostController) {
    Scaffold (

       floatingActionButton = {
           FloatingActionButton(
               modifier = Modifier.padding(bottom = 70.dp),
               onClick = { navHostController.navigate(route = Graph.ADMIN_CATEGORY) },
               containerColor = Color.DarkGray
           )
           {
               Icon(
                   imageVector = Icons.Default.Add,
                   contentDescription = "",
                   tint = Color.White
               )
           }
       }
    ){
       GetCategories(navHostController, it)
    }
    DeleteCategory()

}