package com.example.sprintpressing


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_authentication.*


class Authentication : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        mAuth = FirebaseAuth.getInstance();
        val currentUser = mAuth!!.getCurrentUser()
        submit.setOnClickListener {
            if (submit() == true) {
                loader.visibility= View.VISIBLE
                signin()
            }
        }

    }

    private fun submit(): Boolean {
        if (email.text.isEmpty()) {
            email.setError("add your email")
            return false
        } else {
            if (password.text.isEmpty()) {
                password.setError("fill the password")
                return false
            } else {
                return true
            }
        }
    }

    private fun singup() {
        mAuth!!.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
            .addOnCompleteListener(
                this
            ) { task ->
                if (task.isSuccessful) { // Sign in success, update UI with the signed-in user's information
                    Log.d("authentication", "createUserWithEmail:success")
                    val user = mAuth!!.currentUser

                } else { // If sign in fails, display a message to the user.
                    Log.w(
                        "authentication",
                        "createUserWithEmail:failure",
                        task.exception
                    )
                    Toast.makeText(
                        this@Authentication, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()

                }
                // ...
            }
    }

    private fun signin() {
        mAuth!!.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
            .addOnCompleteListener(
                this
            ) { task ->
                if (task.isSuccessful) { // Sign in success, update UI with the signed-in user's information
                    Log.d("Authentication", "signInWithEmail:success")
                    val user = mAuth!!.currentUser
                    loader.visibility=View.GONE
                    var intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else { // If sign in fails, display a message to the user.

                    Toast.makeText(
                        this@Authentication, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.w("Authentication Failed", "signInWithEmail:failure", task.getException());
                }
                // ...
            }
    }
}
