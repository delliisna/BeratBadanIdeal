package com.example.beratbadanideal_delliisna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var input_nama : EditText
    private lateinit var input_tb:EditText
    private lateinit var rb_lakilaki:RadioButton
    private lateinit var rb_perempuan:RadioButton
    private lateinit var t_hasil:TextView
    private lateinit var proses:Button
    private var t_Badan :Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input_nama = findViewById(R.id.et_nmsis)
        input_tb= findViewById(R.id.et_tbsis)
        rb_lakilaki = findViewById(R.id.rb_lk)
        rb_perempuan = findViewById(R.id.rb_pr)
        t_hasil = findViewById(R.id.t_hasil)
        proses = findViewById(R.id.btn_proses)

        proses.setOnClickListener{
            val tinggi = input_tb.text.toString().toInt()

            if(rb_lakilaki.isChecked){
                t_Badan= (tinggi-100)-((tinggi-100)*10/100)
                t_hasil.setText(t_Badan.toString()+ "kg")
            }else{
                t_Badan=(tinggi-100)-((tinggi-100)*15/100)
                t_hasil.setText(t_Badan.toString()+"kg")
            }
        }







    }
}