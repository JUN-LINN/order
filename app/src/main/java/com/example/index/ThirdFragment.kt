package com.example.index

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity




class ThirdFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        val btn1=activity?.findViewById<Button>(R.id.btn_toast1)
//        val btn2=activity?.findViewById<Button>(R.id.btn_toast2)
//        val btn3=activity?.findViewById<Button>(R.id.btn_toast3)
//        val btn4=activity?.findViewById<Button>(R.id.btn_toast4)
//        val btn5=activity?.findViewById<Button>(R.id.btn_toast5)
//        val btn6=activity?.findViewById<Button>(R.id.btn_toast6)

        btn1?.setOnClickListener {view->
            val intent = Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type", "japan")
            intent.putExtras(bundle)
            startActivity(intent)
        }

//        btn1?.setOnClickListener{
//
//            val intent = Intent(this@ThirdFragment.context, Store::class.java)
//            val bundle = Bundle()
//            bundle.putString("type", "japan")
//            intent.putExtras(bundle)
//            startActivity(intent)
//
//
//        }

//        btn1?.setOnClickListener{
//            activity?.let { callingActivity -> startActivity(Intent(callingActivity, Store::class.java)) }
////            activity?.let {
////                val intent = Intent(it, Store::class.java)
////                val bundle = Bundle()
////                bundle.putString("type", "japan")
////                intent.putExtras(bundle)
////                it.startActivity(intent)
//////                btn1.text="c9 kdjojor"
////            }
//        }
//        btn2?.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","taiwan")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn3?.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","hotpot")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn4?.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","west")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn5?.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","branch")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn6?.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","drink")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_third, container, false)

        val btn1=view.findViewById<Button>(R.id.btn_toast1)
        val btn2=view.findViewById<Button>(R.id.btn_toast2)
        val btn3=view.findViewById<Button>(R.id.btn_toast3)
        val btn4=view.findViewById<Button>(R.id.btn_toast4)
        val btn5=view.findViewById<Button>(R.id.btn_toast5)
        val btn6=view.findViewById<Button>(R.id.btn_toast6)
        btn1?.setOnClickListener {view->
            val intent = Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type", "japan")
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btn2?.setOnClickListener({
            val intent= Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type","taiwan")
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btn3?.setOnClickListener({
            val intent= Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type","west")
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btn4?.setOnClickListener({
            val intent= Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type","branch")
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btn5?.setOnClickListener({
            val intent= Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type","hotpot")
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btn6?.setOnClickListener({
            val intent= Intent(this@ThirdFragment.context, Store::class.java)
            val bundle = Bundle()
            bundle.putString("type","drink")
            intent.putExtras(bundle)
            startActivity(intent)
        })

        return view
//        return inflater.inflate(R.layout.fragment_third,container, false)
    }

}


//override fun onCreateView(
//    inflater: LayoutInflater,
//    container: ViewGroup?,
//    savedInstanceState: Bundle?
//
//): View? {
//    return inflater.inflate(R.layout.fragment_third,container, false)
//}







//class Test : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_third)
//
//        val btn1=findViewById<Button>(R.id.btn_toast1)
//        val btn2=findViewById<Button>(R.id.btn_toast2)
//        val btn3=findViewById<Button>(R.id.btn_toast3)
//        val btn4=findViewById<Button>(R.id.btn_toast4)
//        val btn5=findViewById<Button>(R.id.btn_toast5)
//        val btn6=findViewById<Button>(R.id.btn_toast6)
//
//        btn1.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","japan")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn2.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","taiwan")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn3.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","hotpot")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn4.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","west")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn5.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","branch")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//        btn6.setOnClickListener({
//            val intent= Intent(this,MainActivity::class.java)
//            val bundle = Bundle()
//            bundle.putString("type","drink")
//            intent.putExtras(bundle)
//            startActivity(intent)
//        })
//
//    }
//}