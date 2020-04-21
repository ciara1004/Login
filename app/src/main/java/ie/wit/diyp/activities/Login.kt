package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import kotlinx.android.synthetic.main.content_createaccount.*
import kotlinx.android.synthetic.main.content_login.*
import kotlinx.android.synthetic.main.content_login.login
import kotlinx.android.synthetic.main.content_login.newAccount
import kotlinx.android.synthetic.main.content_login.staffID


class Login : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_login)
        auth = FirebaseAuth.getInstance()

        newAccount.setOnClickListener {
            startActivity(Intent(this, CreateAccount::class.java))
            finish()
        }

        loginbtn.setOnClickListener() {
            startLogin()
        }

    }

    fun startLogin() {
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

        auth.signInWithEmailAndPassword(staffID.text.toString(), login.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    updateUI(null)
                }

            }

    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }

    private fun updateUI(currentUser: FirebaseUser?) {

        if (currentUser != null) {
            startActivity(Intent(this, Table::class.java))
        } else {
            Toast.makeText(
                baseContext, "Login failed.",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}