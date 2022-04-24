package com.example.app_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")//data를 받아 온다

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)
        //id가 m-Area 인걸 찾아서 memberImage에 저장한다
        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        //if 문 getData 가 1이면 drawable에서 member_1을 띄워라
        if(getData == "1" ){
            memberImage.setImageResource(R.drawable.member_1)
        }
        if(getData == "2" ){
            memberImage.setImageResource(R.drawable.member_2)
        }
        if(getData == "3" ){
            memberImage.setImageResource(R.drawable.member_3)
        }
        if(getData == "4" ){
            memberImage.setImageResource(R.drawable.member_4)
        }
        if(getData == "5" ){
            memberImage.setImageResource(R.drawable.member_5)
        }
        if(getData == "6" ){
            memberImage.setImageResource(R.drawable.member_6)
        }
        if(getData == "7" ){
            memberImage.setImageResource(R.drawable.member_7)
        }
        if(getData == "8" ){
            memberImage.setImageResource(R.drawable.member_8)
        }
        if(getData == "9" ){
            memberImage.setImageResource(R.drawable.member_9)
        }

    }
}