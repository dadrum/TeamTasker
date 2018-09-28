package ru.devrum.teamtasker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.devrum.teamtasker.selectrole.SelectRoleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val page = 1

        when(page){
            1 -> {

                startActivity(Intent(this, SelectRoleActivity::class.java))

                finish()
            }
        }
    }
}
