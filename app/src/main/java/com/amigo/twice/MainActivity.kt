package com.amigo.twice

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // MainActivity에서 버튼을 누르면 ImageInsideActivity로 어떤 버튼을 눌렀는지 데이터를 넘겨서
        // 넘어온 데이터에 따라서, 크게 뜨는 사진이 다르게 나타나도록 만든다.

        val btn1 = findViewById<ImageView>(R.id.member1)
        val btn2 = findViewById<ImageView>(R.id.member2)
        val btn3 = findViewById<ImageView>(R.id.member3)
        val btn4 = findViewById<ImageView>(R.id.member4)
        val btn5 = findViewById<ImageView>(R.id.member5)
        val btn6 = findViewById<ImageView>(R.id.member6)
        val btn7 = findViewById<ImageView>(R.id.member7)
        val btn8 = findViewById<ImageView>(R.id.member8)
        val btn9 = findViewById<ImageView>(R.id.member9)

        btn1.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","1") // Activity가 이동(MainActivity->ImageInsideActivity)할 때 data라는 박스안에 1이라는 값을 넘겨서 보낸다.
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }

        btn7.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }

        btn8.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)
        }

        btn9.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","9")
            startActivity(intent)
        }
    }
}