package com.example.myapplication

object Profile {
    var password: String? = null
    var login: String? = null
    var name: String? = null
    var height: String? = null
    var weight: String? = null
    var age: String? = null
    var sex: String? = null
    var disease: MutableList<Disease> = mutableListOf()
}