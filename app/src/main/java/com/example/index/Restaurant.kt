package com.example.index

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Restaurant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
//        val japan1= arrayOf("森沐","週六 休息 週日~週五11:30 – 14:30、17:30 - 20:00","(03)437-2009","320桃園市中壢區大仁二街33號")
        val japan = arrayOf(
            arrayOf(
                "森沐",
                "週六 休息 週日~週五11:30 – 14:30、17:30 - 20:00",
                "(03)437-2009",
                "320桃園市中壢區大仁二街33號"
            ),
            arrayOf("務農人", "週一~週日 11:30 – 21:00", "0912-611-978", "32081桃園市中壢區大仁二街37號"),
            arrayOf("麵心無界", "週一~週日 17:30–21:00 週四 休息", "", "320桃園市中壢區力行北街21號"),
            arrayOf("陳主席咖哩", "週一~週日 11:30–14:00, 17:00–21:00", "0926-216-116", "320桃園市中壢區實踐路91巷2號"),
            arrayOf("Hiro拉麵", "週一休息週二~週日17:30 - 21:00", "0975-090-893", "320桃園市中壢區中北路70號"),
            arrayOf(
                "黑宅拉麵",
                "星期一  休息星期二~日11:30–14:00, 17:00–21:00",
                "(03)416-3511",
                "320桃園市中壢區實踐路216號"
            )
        )

        val taiwan = arrayOf(
            arrayOf(
                "中圓鍋燒",
                "週六~週四 11:00 – 20:30 週五 11:00–14:00, 17:00–00:00",
                "(03)438-6833",
                "320桃園市中壢區大仁二街23號"
            ),
            arrayOf(
                "豐穀食堂",
                "週二 休息週一~週日 11:00–14:00, 17:00–20:30",
                "0966-515-490",
                "320桃園市中壢區力行北街35號"
            ),
            arrayOf("集英會", "週一~週日 11:00–21:30", "0900-347-347", "320桃園市中壢區三和一街27號"),
            arrayOf(
                "重慶酸辣粉",
                "週一~週日 11:30 – 14:00  16:30 – 20:00",
                "(03)465-1763",
                "320桃園市中壢區實踐路36號"
            ),
            arrayOf(
                "阿胖鍋燒",
                "週一~週五11:00 – 14:00  16:30 – 20:00 週六12:00 - 14:00 16:30 - 20:00 週日休息",
                "0955-886-442",
                "320桃園市中壢區大仁二街21號1樓"
            ),
            arrayOf("伊府將鍋燒", "星期一~日10:00–21:00", "0985-433-933", "320桃園市中壢區中北路68號")
        )

        val west = arrayOf(
            arrayOf("小米", "週日 休息週一~週六 11:00–21:00 ", "(03)466-5502", "320桃園市中壢區弘揚路84號2樓"),
            arrayOf(
                "艾佐",
                "週一、週六 休息週二~週日 11:30 - 14:00、17:00 – 21:00",
                "(03)456-5666",
                "320桃園市中壢區力行北街48號"
            ),
            arrayOf("艾隆", "週一~週日 11:00 – 21:30", "(03)465-5738", "320桃園市中壢區三和一街5號"),
            arrayOf(
                "Verona",
                "週六 休息 週一~週日 11:30 – 14:00、17:00 – 21:00",
                "(03)466-2909",
                "320桃園市中壢區大仁二街25號"
            ),
            arrayOf("Mint Past", "星期一\t休息 星期二~日11:00–20:00", "(03)436-9920", "320桃園市中壢區新中北路61號"),
            arrayOf("", "", "", "")
        )

        val branch = arrayOf(
            arrayOf("貝克街", "週一~週日 09:00 – 16:00", "0900-437-446", "320桃園市中壢區實踐路91巷7號*對面*"),
            arrayOf("再逗留", "週一~週日 09:00 – 18:00", "(03)438-3319", "320桃園市中壢區大仁二街18號之7號"),
            arrayOf("APPLE早午餐", "星期一 休息\n星期二~日07:00–16:00\n", "(03)437-9911", "320桃園市中壢區實踐路95號"),
            arrayOf(
                "早啊早午餐",
                "星期一~五:6:00 - 14:00\n星期六~日:6:30 - 14:30\n",
                "(03)438-8138",
                " 32081 桃園市桃園區中壢區中北路183號1樓"
            ),
            arrayOf("晨間廚房", "星期一~日06:30–13:30", "(03)283-0564", "320桃園市中壢區弘揚路95號"),
            arrayOf("哈堡堡", "星期一~五06:00–13:30星期六~日06:00–14:30", "(03)438-7077", "320桃園市中壢區弘揚路101號")
        )

        val hotpot = arrayOf(
            arrayOf("羽之鍋", "週一~週日 11:00 – 22:00", "(03)466-6512", "320桃園市中壢區中北路160號"),
            arrayOf("三媽", "週一~週日 11:00 – 02:00", "(03)283-0518", "320桃園市中壢區實踐路23號"),
            arrayOf("六扇門", "週一~週日 11:00 – 02:00", "(03)456-8777", "320桃園市中壢區新中北路210號"),
            arrayOf("8鍋", "週二~週日 11:00 – 23:00 週一 休息", "(03)466-3238", "320桃園市中壢區新中北路222號1樓"),
            arrayOf("老湯鍋", "星期一~日24 小時營業", "(03)438-5522", "320桃園市中壢區新中北路198號"),
            arrayOf("麗媽", "星期一~日11:00–04:00", "(03)466-8555", "320桃園市中壢區中北路26號")
        )

        val drink = arrayOf(
            arrayOf("沐白", "週一~週日 10:00 – 23:00", "(03)333-0633", "330桃園市桃園區中正路40-1號"),
            arrayOf("迷客夏", "週一~週日 10:00 – 23:00", "(03)456-5246", "32081桃園市中壢區實踐路66號"),
            arrayOf("BONCHU創意鮮果茶飲 狗頭", "週一~週日 11:00 – 23:00", "(03)456-8278", "320桃園市中壢區實踐路66號"),
            arrayOf("老賴茶棧", "週一~週日 11:00 – 23:00", "(03)466-0010", "32081桃園市中壢區實踐路138號"),
            arrayOf("可不可熟成紅茶", "週一~週日 10:00 – 23:00", "(03)437-0066", "320桃園市中壢區實踐路96號"),
            arrayOf("50嵐", "週一~週日 09:30 – 23:00", "(03)456-4366", "320桃園市中壢區日新路8號")
        )

        intent?.extras?.let {
            if (it.getString("type") == "japan") {
                for (i in 0 until 6) {
                    if (it.getString("key") == japan[i][0]) {
                        findViewById<TextView>(R.id.tv_name).text = "店名：" + it.getString("key")
                        findViewById<TextView>(R.id.tv_time).text = "營業時間：" + japan[i][1]
                        findViewById<TextView>(R.id.tv_phone_number).text = "電話：" + japan[i][2]
                        findViewById<TextView>(R.id.tv_address).text = "地址：" + japan[i][3]
                        val intent = Intent(this, Menu_Eat::class.java)
                        val bundle = Bundle()
                        bundle.putString("key", it.getString("key"))
                        bundle.putString("type", it.getString("type"))
                        intent.putExtras(bundle)
                        findViewById<Button>(R.id.btn_start_order).setOnClickListener {
                            //val intent = Intent(this,Menu_Eat::class.java)
                            startActivityForResult(intent,2)

                        }

                    }
                }
            }
            if (it.getString("type") == "taiwan") {
                for (i in 0 until 6) {
                    if (it.getString("key") == taiwan[i][0]) {
                        findViewById<TextView>(R.id.tv_name).text = "店名：" + it.getString("key")
                        findViewById<TextView>(R.id.tv_time).text = "營業時間：" + taiwan[i][1]
                        findViewById<TextView>(R.id.tv_phone_number).text = "電話：" + taiwan[i][2]
                        findViewById<TextView>(R.id.tv_address).text = "地址：" + taiwan[i][3]
                        val intent = Intent(this, Menu_Eat::class.java)
                        val bundle = Bundle()
                        bundle.putString("key", it.getString("key"))
                        bundle.putString("type", it.getString("type"))
                        intent.putExtras(bundle)
                        findViewById<Button>(R.id.btn_start_order).setOnClickListener {
                            //val intent = Intent(this,Menu_Eat::class.java)
                            startActivityForResult(intent,2)

                        }

                    }
                }
            }
            if (it.getString("type") == "west") {
                for (i in 0 until 5) {
                    if (it.getString("key") == west[i][0]) {
                        findViewById<TextView>(R.id.tv_name).text = "店名：" + it.getString("key")
                        findViewById<TextView>(R.id.tv_time).text = "營業時間：" + west[i][1]
                        findViewById<TextView>(R.id.tv_phone_number).text = "電話：" + west[i][2]
                        findViewById<TextView>(R.id.tv_address).text = "地址：" + west[i][3]
                        val intent = Intent(this, Menu_Eat::class.java)
                        val bundle = Bundle()
                        bundle.putString("key", it.getString("key"))
                        bundle.putString("type", it.getString("type"))
                        intent.putExtras(bundle)
                        findViewById<Button>(R.id.btn_start_order).setOnClickListener {
                            //val intent = Intent(this,Menu_Eat::class.java)
                            startActivityForResult(intent,2)

                        }

                    }
                }
            }
            if (it.getString("type") == "branch") {
                for (i in 0 until 6) {
                    if (it.getString("key") == branch[i][0]) {
                        findViewById<TextView>(R.id.tv_name).text = "店名：" + it.getString("key")
                        findViewById<TextView>(R.id.tv_time).text = "營業時間：" + branch[i][1]
                        findViewById<TextView>(R.id.tv_phone_number).text = "電話：" + branch[i][2]
                        findViewById<TextView>(R.id.tv_address).text = "地址：" + branch[i][3]
                        val intent = Intent(this, Menu_Eat::class.java)
                        val bundle = Bundle()
                        bundle.putString("key", it.getString("key"))
                        bundle.putString("type", it.getString("type"))
                        intent.putExtras(bundle)
//                        startActivity(intent)
                        findViewById<Button>(R.id.btn_start_order).setOnClickListener {
                            //val intent = Intent(this,Menu_Eat::class.java)
                            startActivityForResult(intent,2)

                        }

                    }
                }
            }
            if (it.getString("type") == "hotpot") {
                for (i in 0 until 6) {
                    if (it.getString("key") == hotpot[i][0]) {
                        findViewById<TextView>(R.id.tv_name).text = "店名：" + it.getString("key")
                        findViewById<TextView>(R.id.tv_time).text = "營業時間：" + hotpot[i][1]
                        findViewById<TextView>(R.id.tv_phone_number).text = "電話：" + hotpot[i][2]
                        findViewById<TextView>(R.id.tv_address).text = "地址：" + hotpot[i][3]
                        val intent = Intent(this, Menu_Eat::class.java)
                        val bundle = Bundle()
                        bundle.putString("key", it.getString("key"))
                        bundle.putString("type", it.getString("type"))
                        intent.putExtras(bundle)
                        findViewById<Button>(R.id.btn_start_order).setOnClickListener {
                            //val intent = Intent(this,Menu_Eat::class.java)
                            startActivityForResult(intent,2)

                        }

                    }
                }
            }
            if (it.getString("type") == "drink") {
                for (i in 0 until 6) {
                    if (it.getString("key") == drink[i][0]) {
                        findViewById<TextView>(R.id.tv_name).text = "店名：" + it.getString("key")
                        findViewById<TextView>(R.id.tv_time).text = "營業時間：" + drink[i][1]
                        findViewById<TextView>(R.id.tv_phone_number).text = "電話：" + drink[i][2]
                        findViewById<TextView>(R.id.tv_address).text = "地址：" + drink[i][3]
                        val intent = Intent(this, Menu_Drink::class.java)
                        val bundle = Bundle()
                        bundle.putString("key", it.getString("key"))
                        bundle.putString("type", it.getString("type"))
                        intent.putExtras(bundle)

                        findViewById<Button>(R.id.btn_start_order).setOnClickListener {
                            //val intent = Intent(this,Menu_Drink::class.java)
                            startActivityForResult(intent,1)

                        }




                    }
                }
            }
            findViewById<Button>(R.id.btn_home).setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                findViewById<TextView>(R.id.tv_Result).text =
                    "飲料: ${it.getString("drink")}\n\n" +
                            "甜度: ${it.getString("suger")}\n\n" +
                            "冰塊: ${it.getString("ice")}\n\n" +
                            "金額:${it.getInt("drink_price")}元"
            }
            if (requestCode == 2 && resultCode == Activity.RESULT_OK) {
                findViewById<TextView>(R.id.tv_Result).text =
                    "餐點: ${it.getString("food")}\n\n" +
                            "份量: ${it.getString("size")}\n\n" +
                            "鹹度: ${it.getString("taste")}\n\n" +
                            "金額:${it.getInt("price")+it.getInt("sizeprice")}元"
            }


        }
    }


}
