package com.example.passdataactivityfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        button_send.setOnClickListener {

            var name = edit_text_name.text.toString()

            var blankFragment = BlankFragment.newInstance(name)


            supportFragmentManager.beginTransaction().add(R.id.fragment_container,blankFragment).commit()
        }
    }
}