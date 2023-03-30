package ph.kodego.aragon.janreign.passingdataactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData : Button
    private lateinit var editUserName : EditText
    private lateinit var editPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.btn_sendData)
        editUserName = findViewById(R.id.et_username)
        editPassword = findViewById(R.id.et_password)

        btnSendData.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("username", editUserName.text.toString())
                .putExtra("password", editPassword.text.toString()))

        }
    }
}



