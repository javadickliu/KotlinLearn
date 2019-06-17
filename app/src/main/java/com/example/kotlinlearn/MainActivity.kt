package com.example.kotlinlearn

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {
    //    var int = 4
//    var intVar :Int?=4
//    var buttn1 :Button?=null
//    var buttn2 :Button= Button(this)
//    var double = 0.4
//    val outVar : Int=4
    var string: String?=null  //todo Kotlin成员变量初始化的时候

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   //     toast(string[0] + "")
        if(string!=null) {
            toast(string?.length+"")
        }

       //==Kotlin类型检查
        typeCheck(5)



        //==Kotlin匿名内部类====
        mainactivity_btn.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        mainactivity_btn.setOnClickListener {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


        //====类型转换as关键字
        typeConvert(6)


        //==


    }


    /**
     * 定义内部类继承自BroadcastReceiver
     */
    private inner class MyBroadcast : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
    /**
     * 内部类的形式实现匿名内部类
     */


    /**
     * Kotlin类型检查
     */
    fun typeCheck(x :Any){
         if(x is String){//Kotlin智能转换情形一
             x.substring(0)
         }

        if(x !is String)//Kotlin智能转换情形二
            return
        x.substring(0)

        if(x is String && x.substring(0).equals("")){//Kotlin智能转换情形三

        }
    }


    /**
     * Kotlin类型转换
     */
    fun typeConvert(x :Any){
//        val y:String=x as String//不安全的类型转换
//        val y:String?=x as? String//安全的类型转换
    }
}

