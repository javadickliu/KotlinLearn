package com.example.kotlinlearn.classtest

open class KotlinSonClass : KotlinClass{
   constructor(name: String, age: Int,heigh:Int):super("d",5,5)

   override  fun fatherMethod() {
       super.fatherMethod()
    }

    inner class InnerClass{
        fun method(){
            fatherMethod()
            super@KotlinSonClass.fatherMethod()
        }
    }
}