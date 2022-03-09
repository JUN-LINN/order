package com.example.index

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Menu_Eat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_eat)

        val rg_Size = findViewById<RadioGroup>(R.id.rg_Size)
        val rg_Taste = findViewById<RadioGroup>(R.id.rg_Taste)


        val bundle = Bundle()
        val taiwan = arrayListOf(
            arrayListOf("中圓鍋燒", "原味鍋燒(70元)", "泡菜鍋燒(80元)", "牛奶起司鍋燒(90元)", "咖哩鍋燒(80元)", "沙茶鍋燒(80元)"),
            arrayListOf("豐穀食堂", "肉絲炒飯(80)", "海苔炒飯(80元)", "沙茶炒飯(80元)", "茄汁炒飯(80元)", "蝦仁炒飯(80元)"),
            arrayListOf(
                "集英會",
                "老甕酸菜牛肉麵(140元)",
                "招牌川味牛肉麵(130元)",
                "原味紅燒牛肉麵(130元)",
                "老滷辣拌麵(60元)",
                "炸醬乾麵(50元)"
            ),
            arrayListOf(
                "重慶酸辣粉",
                "牛肉綜合紅薯粉(95元)",
                "豬肉綜合紅薯粉(90元)",
                "紅油炒手(55元)",
                "口水雞(85元)",
                "酸辣湯餃(85元)"
            ),
            arrayListOf("阿胖鍋燒", "原味鍋燒(70元)", "泡菜鍋燒(80元)", "番茄鍋燒 (80元)", "牛奶鍋燒(80元)", "咖哩鍋燒(80元)"),
            arrayListOf("伊府將鍋燒", "原味鍋燒(70元)", "泡菜鍋燒(80元)", "牛奶起司鍋燒(90元)", "咖哩鍋燒(80元)", "沙茶鍋燒(80元)"),
        )
        val japan = arrayListOf(
            arrayListOf(
                "森沐",
                "鮭魚炒飯(85元)",
                "櫻花蝦炒飯(85元)",
                "日式炒烏龍麵(70元)",
                "泡菜炒烏龍麵(80元)",
                "炙燒鮭魚丼(280元)"
            ),
            arrayListOf(
                "務農人",
                "滑蛋燒豬丼(75元)",
                "日式親子丼(75元)",
                "滑蛋雪花牛丼(90元)",
                "豚肉咖哩飯(80元)",
                "炸豬排咖哩飯(110元)"
            ),
            arrayListOf(
                "麵心無界",
                "雞白湯拉麵(170元)",
                "味噌拉麵(190元)",
                "辛味噌拉麵(200元 )",
                "番茄拉麵(190元)",
                "濃厚味噌拉麵 (210元)"
            ),
            arrayListOf(
                "陳主席咖哩",
                "酥炸大雞腿排(150元)",
                "酥炸去骨牛小排(150元)",
                "酥炸味噌魚排(140元)",
                "酥炸豬排(130元)",
                "雞胸肉片(110元)"
            ),
            arrayListOf(
                "Hiro拉麵",
                "原味拉麵(220元)",
                "叉燒拉麵(320元)",
                "台灣咖哩飯(230元)",
                "炸雞咖哩飯(250元)",
                "炸豬排咖哩飯(250元)"
            ),
            arrayListOf(
                "黑宅拉麵",
                "豚骨拉麵(110元)",
                "黑蒜豚骨拉麵(120元)",
                "焦蔥豚骨拉麵(120元)",
                "地獄豚骨拉麵(120元)",
                "醬油拉麵(110元)"
            ),
        )
        val west = arrayListOf(
            arrayListOf(
                "小米",
                "茄汁牛肉醬義大利麵(120元)",
                "奶油培根義大利麵(120元)",
                "青醬雞柳義大利麵(120元)",
                "粉紅醬鮮蝦義大利麵(140元)",
                "泰式咖哩義大利麵(130元)"
            ),
            arrayListOf(
                "艾佐",
                "酥炸雞球義大利麵(159元)",
                "輕夏海味干貝義大利麵(179元)",
                "地中海青醬蛤蠣義大利麵(159元)",
                "番茄泡菜起司豬肉義大利麵(189元)",
                "鮮味蛤蠣墨魚義大利麵(179元)"
            ),
            arrayListOf(
                "艾隆",
                "蒜炒海鮮麵(110元)",
                "茄汁鮪魚培根(85元)",
                "白酒蛤蜊麵(110元)",
                "奶油燻雞麵(120元)",
                "培根青醬麵(130元)"
            ),
            arrayListOf(
                "Verona",
                "奶油培根義大利麵(110元)",
                "茄汁牛肉義大利麵(140元)",
                "青醬嫩雞義大利麵(130元)",
                "清炒蛤蜊義大利麵(130元)",
                "辣味鮮蝦義大利麵(140元)"
            ),
            arrayListOf(
                "Mint Pasta",
                "奶油煙燻鮭魚義大利麵(145元)",
                "茄汁蛤蜊義大利麵(150元)",
                "辣味蒜香透抽細麵(145元)",
                "法式燻鴨義大利麵(140元)",
                "泰式風味義大利麵(150元)"
            ),
//            arrayListOf("","","","","","")
        )
        val hotpot = arrayListOf(
            arrayListOf(
                "羽之鍋",
                "牛奶起司豬肉鍋(170元)",
                "南瓜豬肉鍋(155元)",
                "咖哩豬肉鍋(155元)",
                "番茄豬肉鍋(155元)",
                "泡菜豬肉鍋(155元)"
            ),
            arrayListOf(
                "三媽",
                "大腸臭臭鍋(130元)",
                "海鮮豆腐鍋(130元)",
                "泡菜鍋(130元)",
                "麻辣鴨血鍋(150元)",
                "南瓜元寶鍋(160元)"
            ),
            arrayListOf(
                "六扇門",
                "泡菜豬肉鍋(140元)",
                "海鮮豬肉鍋(140元)",
                "咖哩豬肉鍋(140元)",
                "原味豬肉鍋(140元)",
                "麻辣豬肉鍋(150元)"
            ),
            arrayListOf(
                "8鍋",
                "泡菜豬肉鍋(135元)",
                "番茄豬肉鍋(145元)",
                "咖哩豬肉鍋(145元)",
                "原味豬肉鍋(125元)",
                "牛奶豬肉鍋(145元)"
            ),
            arrayListOf(
                "老湯鍋",
                "咖哩鍋(140元)",
                "海鮮鍋(140元)",
                "大腸臭臭鍋(140元)",
                "起司牛奶鍋(160元)",
                "麻油雞鍋(160元)"
            ),
            arrayListOf("麗媽", "大腸臭臭鍋(120元)", "海鮮香香鍋(120元)", "泡菜鍋(120元)", "沙茶豬肉鍋(130元)", "藥膳鍋(140元)")
        )
        val branch = arrayListOf(
            arrayListOf(
                "貝克街",
                "牛肉起司奶油丹麥三明治(75元)",
                "海裡的鮪魚奶油丹麥三明治(75元)",
                "薯泥蛋沙拉芭芭拉可頌(65元)",
                "塔塔花枝芭芭拉可頌(105元)",
                "經典果醬鄉村水果吐司(45元)"
            ),
            arrayListOf(
                "再逗留",
                "義式香草雞肉烤土司拼盤(135元)",
                "熱壓法國麵包(170元)",
                "美式德腸蛋捲(170元)",
                "香濃起司雞肉捲(135元)",
                "墨西哥捲餅(165元)"
            ),
            arrayListOf(
                "APPLE早午餐",
                "原味蛋餅(25元)",
                "玉米蛋餅(30元)",
                "火腿蛋餅(35元)",
                "鮪魚蛋餅(39元)",
                "起司蛋餅(35元)"
            ),
            arrayListOf("早啊早午餐", "原味蛋餅(20元)", "玉米蛋餅(30元)", "火腿蛋餅(30元)", "鮪魚蛋餅(35元)", "起司蛋餅(35元)"),
            arrayListOf("晨間廚房", "原味蛋餅(25元)", "玉米蛋餅(30元)", "火腿蛋餅(35元)", "薯餅蛋餅(40元)", "蔬菜蛋餅(35元)"),
            arrayListOf("哈堡堡", "原味蛋餅(25元)", "玉米蛋餅(35元)", "火腿蛋餅(35元)", "鮪魚蛋餅(40元)", "起司蛋餅(35元)")
        )

        val taiwan_price = arrayListOf(
            arrayListOf(0, 70, 80, 90, 80, 80),
            arrayListOf(0, 80, 80, 80, 80, 80),
            arrayListOf(0, 140, 130, 130, 60, 50),
            arrayListOf(0, 95, 90, 55, 85, 85),
            arrayListOf(0, 70, 80, 80, 80, 80),
            arrayListOf(0, 70, 80, 90, 80, 80)
        )
        val japan_price = arrayListOf(
            arrayListOf(0, 85, 85, 70, 80, 280),
            arrayListOf(0, 75, 75, 90, 80, 110),
            arrayListOf(0, 170, 190, 200, 190, 210),
            arrayListOf(0, 150, 150, 140, 130, 110),
            arrayListOf(0, 220, 320, 230, 250, 250),
            arrayListOf(0, 110, 120, 120, 120, 110)
        )
        val west_price = arrayListOf(
            arrayListOf(0, 120, 120, 120, 140, 130),
            arrayListOf(0, 159, 179, 159, 189, 179),
            arrayListOf(0, 110, 85, 110, 120, 130),
            arrayListOf(0, 110, 140, 130, 130, 140),
            arrayListOf(0, 145, 150, 145, 140, 150),

        )
        val branch_price = arrayListOf(
            arrayListOf(0, 75, 75, 65, 105, 45),
            arrayListOf(0, 135, 170, 170, 135, 165),
            arrayListOf(0, 25, 30, 35, 39, 35),
            arrayListOf(0, 20, 30, 30, 35, 35),
            arrayListOf(0, 25, 30, 35, 40, 35),
            arrayListOf(0, 25, 35, 35, 40, 35)
        )

        val hotpot_price = arrayListOf(
            arrayListOf(0, 170, 155, 155, 155, 155),
            arrayListOf(0, 130, 130, 130, 150, 160),
            arrayListOf(0, 140, 140, 140, 140, 150),
            arrayListOf(0, 135, 145, 145, 125, 145),
            arrayListOf(0, 140, 140, 140, 160, 160),
            arrayListOf(0, 120, 120, 120, 130, 140)
        )



        intent?.extras?.let {
            if (it.getString("type") == "japan") {
                for (i in 0 until 6) {
                    if (it.getString("key") == japan[i][0]) {
                        val adapter = ArrayAdapter(
                            this,
                            android.R.layout.simple_spinner_dropdown_item,
                            japan[i]
                        )
                        val mySpinner: Spinner = findViewById(R.id.spinner)
                        mySpinner.adapter = adapter

                        mySpinner.onItemSelectedListener =
                            object : AdapterView.OnItemSelectedListener {
                                override fun onItemSelected(
                                    p0: AdapterView<*>,
                                    p1: View?,
                                    p2: Int,
                                    p3: Long
                                ) {
                                    bundle.putString("food", japan[i][p2])
                                    bundle.putInt("price", japan_price[i][p2])
                                }

                                override fun onNothingSelected(parent: AdapterView<*>?) {
                                    TODO("Not yet implemented")
                                }
                            }
                    }
                }
            }
            if (it.getString("type") == "taiwan") {
                for (i in 0 until 6) {
                    if (it.getString("key") == taiwan[i][0]) {
                        val adapter = ArrayAdapter(
                            this,
                            android.R.layout.simple_spinner_dropdown_item,
                            taiwan[i]
                        )
                        val mySpinner: Spinner = findViewById(R.id.spinner)
                        mySpinner.adapter = adapter

                        mySpinner.onItemSelectedListener =
                            object : AdapterView.OnItemSelectedListener {
                                override fun onItemSelected(
                                    p0: AdapterView<*>,
                                    p1: View?,
                                    p2: Int,
                                    p3: Long
                                ) {
                                    bundle.putString("food", taiwan[i][p2])
                                    bundle.putInt("price", taiwan_price[i][p2])
                                }

                                override fun onNothingSelected(parent: AdapterView<*>?) {
                                    TODO("Not yet implemented")
                                }
                            }
                    }
                }
            }
            if (it.getString("type") == "west") {
                for (i in 0 until 5) {
                    if (it.getString("key") == west[i][0]) {
                        val adapter = ArrayAdapter(
                            this,
                            android.R.layout.simple_spinner_dropdown_item,
                            west[i]
                        )
                        val mySpinner: Spinner = findViewById(R.id.spinner)
                        mySpinner.adapter = adapter

                        mySpinner.onItemSelectedListener =
                            object : AdapterView.OnItemSelectedListener {
                                override fun onItemSelected(
                                    p0: AdapterView<*>,
                                    p1: View?,
                                    p2: Int,
                                    p3: Long
                                ) {
                                    bundle.putString("food", west[i][p2])
                                    bundle.putInt("price", west_price[i][p2])
                                }

                                override fun onNothingSelected(parent: AdapterView<*>?) {
                                    TODO("Not yet implemented")
                                }
                            }
                    }
                }
            }
            if (it.getString("type") == "hotpot") {
                for (i in 0 until 6) {
                    if (it.getString("key") == hotpot[i][0]) {
                        val adapter = ArrayAdapter(
                            this,
                            android.R.layout.simple_spinner_dropdown_item,
                            hotpot[i]
                        )
                        val mySpinner: Spinner = findViewById(R.id.spinner)
                        mySpinner.adapter = adapter

                        mySpinner.onItemSelectedListener =
                            object : AdapterView.OnItemSelectedListener {
                                override fun onItemSelected(
                                    p0: AdapterView<*>,
                                    p1: View?,
                                    p2: Int,
                                    p3: Long
                                ) {
                                    bundle.putString("food", hotpot[i][p2])
                                    bundle.putInt("price", hotpot_price[i][p2])
                                }

                                override fun onNothingSelected(parent: AdapterView<*>?) {
                                    TODO("Not yet implemented")
                                }
                            }
                    }
                }
            }
            if (it.getString("type") == "branch") {
                for (i in 0 until 6) {
                    if (it.getString("key") == branch[i][0]) {
                        val adapter = ArrayAdapter(
                            this,
                            android.R.layout.simple_spinner_dropdown_item,
                            branch[i]
                        )
                        val mySpinner: Spinner = findViewById(R.id.spinner)
                        mySpinner.adapter = adapter

                        mySpinner.onItemSelectedListener =
                            object : AdapterView.OnItemSelectedListener {
                                override fun onItemSelected(
                                    p0: AdapterView<*>,
                                    p1: View?,
                                    p2: Int,
                                    p3: Long
                                ) {
                                    bundle.putString("food", branch[i][p2])
                                    bundle.putInt("price", branch_price[i][p2])
                                }

                                override fun onNothingSelected(parent: AdapterView<*>?) {
                                    TODO("Not yet implemented")
                                }
                            }

                    }
                }
            }
            findViewById<Button>(R.id.btn_Send).setOnClickListener{

                val sizeprice = when(rg_Size.findViewById<RadioButton>(rg_Size.checkedRadioButtonId).text.toString()){
                    "中(+20元)"->20
                    "大(+30元)"->30
                    else->0
                }

                bundle.putString("size",rg_Size.findViewById<RadioButton>(rg_Size.checkedRadioButtonId).text.toString())
                bundle.putInt("sizeprice",sizeprice)
                bundle.putString("taste",rg_Taste.findViewById<RadioButton>(rg_Taste.checkedRadioButtonId).text.toString())
                setResult(Activity.RESULT_OK, Intent().putExtras(bundle))
                finish()

            }


//        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,food[0])
//        val mySpinner: Spinner = findViewById(R.id.spinner)
//        mySpinner.adapter = adapter


        }
    }
}