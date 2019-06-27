package com.example.kotlinlearn.classtest

open class KotlinClass public constructor(val name: String, val age: Int) {
    constructor(name: String, age: Int,heigh:Int) :this(name,age){

    }
}