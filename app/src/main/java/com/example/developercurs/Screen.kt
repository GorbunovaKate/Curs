package com.example.developercurs

sealed class Screen(val route: String){
    object MainScreen : Screen("Main_screen")
    object DetailScreen : Screen("Detail_screen")

    fun withArgs(vararg args:  String): String{
        return buildString{
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
