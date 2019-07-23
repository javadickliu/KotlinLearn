package com.example.kotlinlearn

import android.annotation.TargetApi
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.CheckBox
import com.example.kotlinlearn.bean.KotlinBean
import com.example.kotlinlearn.classtest.KotlinClass
import com.example.kotlinlearn.interfacepac.KotlinInterfaceA
import com.example.kotlinlearn.interfacepac.KotlinInterfaceB
import kotlinx.android.synthetic.main.activity_main.*

const val Pii = 3.13

class MainActivity : AppCompatActivity() {
    //    var int = 4
//    var intVar :Int?=4
    var buttn1 :Button?=null
//    var buttn2 :Button= Button(this)
 //   const var double = 0.4
//    val outVar : Int = 0
//        get() = 6
//     set(value){
//         field=value
//     }
//    val string: String? = null//todo Kotlin成员变量初始化的时候

    //     get() = ""
    //  set(value) =
    @TargetApi(Build.VERSION_CODES.N)
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

        //     KotlinClass("1",4)
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

        //  whenUse(1)

//        //==Kotlin list集合的定义和遍历==
//        val list1= listOf<String>("A","B","C","D")//
//        val list2= listOf("A","B","C","D")
//        listof
//         //todo 还有几种方法
////        list1.add()//不可变list没有提供改变和操作集合的方法,比如add,remove,clear
////        list1.remove()//
//
//        for(index in list1){//for循环遍历 list集合
//            Log.d(TAG, "" + index)
//        }
//
//       val mutableList1= mutableListOf<String>("E","F","G","H")
//        mutableList1.add("I")
//        mutableList1.removeAt(0)
//        for(index in mutableList1.indices){//for循环遍历 MutableList集合
//            Log.d(TAG, "" + index)
//        }
//
//        //==Kotlin map集合的定义和遍历==
//        val map1 = mapOf<Int, String>(1 to "d", 4 to "5")
//        val map2 = mapOf(1 to "d", 4 to "5")
//        val mutableMap1 = mutableMapOf<Int, String>(1 to "d", 4 to "5")
//        val mutableMap2 = mutableMapOf(1 to "d", 4 to "5")
//        map1.forEach { key, value ->
//            Log.d(TAG, "key" + key + " value=" + value)
//        }

//        val intarray = intArrayOf()//基本数据类型实例化
//        val floatArray = floatArrayOf(1f, 2f)//其他byte和double同理
//        val arrayTest1 = arrayOf(1.3f, 4,"tt")//可以填不同的数据类型
//        val arrayTest2= arrayOfNulls<Int>(2)//声明一个长度为2的空数组
//       // val arrayTest3=Array<Int>(1,test())//第二个参数传的类型没看懂
//      //  intarray.any(1)
//        typealias ->
//        for (index in arrayTest1) {
//            Log.d(TAG, "index" + index)
//        }


//        //====Kotlin数据类== )
//       val result= KotlinBean("liudongxun", 25).apply {
//           this.name="11"
//           toString()
//        }
//        Log.d(TAG, "result=" + result)

//
//        KotlinBean("liudongxun",25).apply {
//            this.name="liudongxun1"
//            this.age=29
////            name="liudongxun1"
////            age=29
//            Log.d(TAG, "nameA="+this.name+" age="+this.age)
//        }
//        SingleClass.TAG
//        val intArray= intArrayOf(1,4,5)
//        varargMethod(1,2,*intArray)

     //   buttn1.



//        //========Lambda表达式=========
//        mainactivity_btn.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(p0: View?) {
//
//            }
//
//        })
//        mainactivity_btn.setOnClickListener {
//
//        }
//     test()


        //===============
        val list=listOf<Button>()

    }
    val test={
     Log.d("11111","dd")
        if(true){

        }else{

        }
    }//什么意思?


    fun varargMethod(vararg int:Int){

    }

    class InterfaceChild : KotlinInterfaceA, KotlinInterfaceB {
        override val testInt: Int
            get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

        override fun testMethod() {
        }

    }


//    fun test(): Int {
//        return 1
//    }

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

    object SingleClass{
        public const val TAG = "MainActivity"
    }
    companion object {
        private const val TAG = "MainActivity"
    }
}

