package kr.ac.kopo.listviewtest0620

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var imgv : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list)
        imgv = findViewById<ImageView>(R.id.imgv)

        var items = arrayOf("바닐라라떼", "아이스아메리카노", "모카라떼", "아이스티", "돌체라떼", "요거트스무디", "자바칩프라푸치노")
        var imgRes = arrayOf(R.drawable.img01, R.drawable.img02, R.drawable.img03, R.drawable.img04, R.drawable.img05, R.drawable.img06, R.drawable.img07)

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->
            imgv.setImageResource(imgRes[position])
            Toast.makeText(applicationContext, items[position] + "는(은) 되게 맛있어요.", Toast.LENGTH_SHORT).show()
        }
    }
}