package com.example.kotlinlearn

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    val string: String? = null  //todo Kotlin成员变量初始化的时候

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //     toast(string[0] + "")
        // if(string!=null) {
        //    string?.length
        //  }
        //  val stringTemp:Int=if (string!=null) string.length else -1
        //  val stringTemp1:Int=string!!.length

        //==Kotlin类型检查
        //  typeCheck(5)


        //==Kotlin匿名内部类====
//        mainactivity_btn.setOnClickListener(object :View.OnClickListener{
//            override fun onClick(p0: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        })
//        mainactivity_btn.setOnClickListener {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }


        //====类型转换as关键字
        //   typeConvert(6)


        //==伴生类调用==
        // TestKotlinClass.testBoolean

        //=====遍历for==
       // forTest()


//
//        val intValue:Int=4
//        val intValue:int=4

        //==Kotlin数字==
//        val shijinzhi = 11
//        val shiliujinzhi = 0x0f
//        val erjinzhi = 0b0010
//        val doubleValue = 0.4
//        val floatValue = 0.4f
//        val largeValue = 100_0000_1000
        // largeValue.to

        whenUse(1)
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
    fun typeCheck(x: Any) {
        if (x is String) {//Kotlin智能转换情形一
            x.substring(0)
        }

        if (x !is String)//Kotlin智能转换情形二
            return
        x.substring(0)

        if (x is String && x.substring(0).equals("")) {//Kotlin智能转换情形三

        }
    }


    /**
     * Kotlin类型转换
     */
    fun typeConvert(x: Any) {
//        val y:String=x as String//不安全的类型转换
//        val y:String?=x as? String//安全的类型转换
    }

    /**
     * kotlin遍历循环
     */
    fun forTest() {
        //==Kotlin遍历数组==
        val arrayTest = arrayOf("dongxun1", "dongpeng", "dongin")
        for (index in arrayTest) {//数组index表示的是索引
            Log.d(TAG, "" + index)
        }

        //===Kotlin遍历list集合

        //===Kotlin遍历map集合

        //===Kotlin遍历set集合

    }

    /**
     * when关键字的使用
     */
    fun whenUse(int: Int) {

        when (int) {
            in 1..10 -> {
                Log.d(TAG, "int==1..10")
            }
            1 -> {
                Log.d(TAG, "int==1!!!")
            }
            11, 12 -> {
                Log.d(TAG, "int==11,12")
            }
            13 -> {
                Log.d(TAG, "int==13")
            }
            is Int -> {
                Log.d(TAG, "int is int")
            }
            else -> {
                Log.d(TAG, "int==else")
            }
        }
        when {
            true -> {
                Log.d(TAG, "true")
            }
            false -> {
                Log.d(TAG, "false")
            }
            true -> {
                Log.d(TAG, "true11111")
            }
        }
    }


    companion object {
        private val TAG = "MainActivity"
    }
}

