package ph.kodego.aragon.janreign.tutorials

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Opening second activity after clicking the button//
        val secondActbutton = findViewById<Button>(R.id.second_act_btn)
        secondActbutton.setOnClickListener{
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)
        }
    }
}