package ph.kodego.aragon.janreign.passingdataactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textUserName : TextView
    private lateinit var textPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textUserName = findViewById(R.id.tv_username)
        textPassword  = findViewById(R.id.tv_password)

        val userName = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        textUserName.text = "Username : "+userName
        textPassword.text = "Password : "+password

    }
}