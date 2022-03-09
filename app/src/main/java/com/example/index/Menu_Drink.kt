package com.example.index

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_menu_eat.*

class Menu_Drink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_drink)

        val rg_Suger=findViewById<RadioGroup>(R.id.rg_Suger)
        val rg_Ice=findViewById<RadioGroup>(R.id.rg_Ice)


        val bundle = Bundle()
        val drink = arrayListOf(arrayListOf("沐白","沐白紅茶(30元)","伯爵紅茶拿鐵(45元)","布丁紅茶拿鐵(55元)","黑糖鮮奶(60元)","沐白黑糖波霸鮮奶(65元)"),
            arrayListOf("迷客夏","大正紅茶(30元)","大正紅茶拿鐵(45元)","珍珠紅茶拿鐵(55元)","珍珠鮮奶(65元)","茉莉綠茶拿鐵(45元)"),
            arrayListOf("BONCHU創意鮮果茶飲 狗頭","碳焙鐵觀音(30元)","蔓越莓果茶(45元)","紅茶拿鐵(55元)","輕纖冰柚(45元)","金鑽凍檸茶(55元)"),
            arrayListOf("老賴茶棧","老賴紅茶(25元)","豆香紅茶(35元)","招牌奶茶(40元)","青草紅茶(35元)","太后牛乳(55元)"),
            arrayListOf("可不可熟成紅茶","熟成紅茶(30元)","春芽冰茶(40元)","胭脂多多(45元)","熟成冷露(30元)","白玉歐雷(55元)"),
            arrayListOf("50嵐","四季春青茶(30元)","8冰綠(50元)","波霸奶茶(50元)","布丁紅茶(50元)","可可芭蕾(60元)"))


        val drink_price = arrayListOf(arrayListOf(0,30,45,55,60,65),
            arrayListOf(0,30,45,55,65,45),
            arrayListOf(0,30,45,55,45,55),
            arrayListOf(0,25,35,40,35,55),
            arrayListOf(0,30,40,45,30,55),
            arrayListOf(0,30,50,50,50,60))

        intent?.extras?.let {
            if(it.getString("type") == "drink"){
                for (i in 0 until 6){
                    if(it.getString("key") == drink[i][0]){

                        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,drink[i])
                        val mySpinner: Spinner = findViewById(R.id.spinner)
                        mySpinner.adapter = adapter

                        mySpinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
                            override fun onItemSelected(p0: AdapterView<*>, p1: View?, p2:Int, p3:Long){
                                bundle.putString("drink",drink[0][p2])
                                bundle.putInt("drink_price",drink_price[0][p2])
                            }

                            override fun onNothingSelected(parent: AdapterView<*>?) {
                                TODO("Not yet implemented")
                            }
                        }
                        findViewById<Button>(R.id.btn_Send).setOnClickListener{

                            bundle.putString("suger",rg_Suger.findViewById<RadioButton>(rg_Suger.checkedRadioButtonId).text.toString())
                            bundle.putString("ice",rg_Ice.findViewById<RadioButton>(rg_Ice.checkedRadioButtonId).text.toString())
//

                            setResult(Activity.RESULT_OK, Intent().putExtras(bundle))
                            finish()

                        }
                    }
                }
            }
        }






    }
}