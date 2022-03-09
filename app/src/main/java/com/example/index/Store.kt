package com.example.index

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class Store : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.store)
        val listView = findViewById<ListView>(R.id.listview)
        val tv_type=findViewById<TextView>(R.id.tv_type)

        val count = ArrayList<String>()
        val item = ArrayList<Item>()

        val country= arrayOf(arrayOf("japan","森沐","務農人","麵心無界","陳主席咖哩","Hiro拉麵","黑宅拉麵"),
            arrayOf("taiwan","中圓鍋燒","豐穀食堂","集英會","重慶酸辣粉","阿胖鍋燒","伊府將鍋燒"),
            arrayOf("drink","沐白","迷客夏","BONCHU創意鮮果茶飲 狗頭","老賴茶棧","可不可熟成紅茶","50嵐"),
            arrayOf("branch","貝克街","再逗留","APPLE早午餐","早啊早午餐","晨間廚房","哈堡堡"),
            arrayOf("hotpot","羽之鍋","三媽","六扇門","8鍋","老湯鍋","麗媽"),
            arrayOf("west","小米","艾佐","艾隆","Verona","Mint Pasta"))
        val japan= arrayOf("森沐","務農人","麵心無界","陳主席咖哩","Hiro拉麵","黑宅拉麵")
        val taiwan=arrayOf("中圓鍋燒","豐穀食堂","集英會","重慶酸辣粉","阿胖鍋燒","伊府將鍋燒")
        val drink=arrayOf("沐白","迷客夏","BONCHU創意鮮果茶飲 狗頭","老賴茶棧","可不可熟成紅茶","50嵐")
        val branch=arrayOf("貝克街","再逗留","APPLE早午餐","早啊早午餐","晨間廚房","哈堡堡")
        val hotpot=arrayOf("羽之鍋","三媽","六扇門","8鍋","老湯鍋","麗媽")
        val west=arrayOf("小米","艾佐","艾隆","Verona","Mint Pasta")

        val array1 = resources.obtainTypedArray(R.array.image_japan)
        val array2 = resources.obtainTypedArray(R.array.image_taiwan)
        val array3 = resources.obtainTypedArray(R.array.image_drink)
        val array4 = resources.obtainTypedArray(R.array.image_branch)
        val array5 = resources.obtainTypedArray(R.array.image_hotpot)
        val array6 = resources.obtainTypedArray(R.array.image_west)


        intent?.extras?.let {
            if (it.getString("type") == "japan") {
                tv_type.text="日式料理"
                for (i in 0 until array1.length()) {
                    val photo = array1.getResourceId(i, 0)
                    item.add(Item(photo, japan[i],"japan"))
                }
                array1.recycle()
            }
            else if (it.getString("type") == "taiwan") {
                tv_type.text="台式料理"
                for (i in 0 until array2.length()) {
                    val photo = array2.getResourceId(i, 0)
                    item.add(Item(photo, taiwan[i],"taiwan"))
                }
                array2.recycle()
            }
            else if (it.getString("type") == "drink") {
                tv_type.text="飲料"
                for (i in 0 until array3.length()) {
                    val photo = array3.getResourceId(i, 0)
                    item.add(Item(photo, drink[i],"drink"))
                }
                array3.recycle()
            }
            else if (it.getString("type") == "branch") {
                tv_type.text="早午餐"
                for (i in 0 until array4.length()) {
                    val photo = array4.getResourceId(i, 0)
                    item.add(Item(photo, branch[i],"branch"))
                }
                array4.recycle()
            }
            else if (it.getString("type") == "hotpot") {
                tv_type.text="火鍋"
                for (i in 0 until array5.length()) {
                    val photo = array5.getResourceId(i, 0)
                    item.add(Item(photo, hotpot[i],"hotpot"))
                }
                array5.recycle()
            }
            else if (it.getString("type") == "west") {
                tv_type.text="西式料理"
                for (i in 0 until array6.length()) {
                    val photo = array6.getResourceId(i, 0)
                    item.add(Item(photo, west[i],"west"))
                }
                array6.recycle()
            }
        }

//        for (i in 0 until array.length()) {
//            val photo = array.getResourceId(i, 0)
//            val type=
//            item.add(Item(photo, name_japan[i],type))
//        }
//        array.recycle()

        listView.adapter = MyAdapter(this, R.layout.adapter_horizontal, item)

        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "你選的是${item[position].name}", Toast.LENGTH_SHORT).show()
            for (i in 0 until 6){
                if (item[position].type==country[i][0]){
                    for (j in 1 until 7) {
                        if (item[position].name == country[i][j]) {
                            val intent = Intent(this, Restaurant::class.java)
                            val bundle = Bundle()
                            bundle.putString("key", item[position].name)
                            bundle.putString("type", item[position].type)
                            intent.putExtras(bundle)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}


data class Item(
    val photo:Int,
    val name:String,
    val type:String
)