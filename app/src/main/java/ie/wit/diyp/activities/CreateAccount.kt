package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import ie.wit.diyp.R
import kotlinx.android.synthetic.main.content_createaccount.*

class CreateAccount : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_createaccount)
        auth = FirebaseAuth.getInstance()

        newAccount.setOnClickListener {
            createAccount()
        }

    }

    private fun createAccount() {
        if (staffID.text.toString().isEmpty()) {
            staffID.error = "Please enter ID"
            staffID.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(staffID.text.toString()).matches()) {
            staffID.error = "Please enter valid ID"
            staffID.requestFocus()
            return
        }

        if (login.text.toString().isEmpty()) {
            login.error = "Please enter login"
            login.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(staffID.text.toString(), login.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this,Login::class.java))
                    finish()
                } else {
                    Toast.makeText(baseContext, "Create failed. Try again.",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }
}