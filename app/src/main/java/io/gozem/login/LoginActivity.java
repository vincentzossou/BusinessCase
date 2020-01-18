package io.gozem.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import io.gozem.R;
import io.gozem.login.helpers.Functions;
import io.gozem.maps.MapsActivity;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputEmail, inputPassword;
    private MaterialButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide Keyboard
                Functions.hideSoftKeyboard(LoginActivity.this);

                final String emailToCheck = inputEmail.getEditText().getText().toString().trim();
                final String passwordToCheck = inputPassword.getEditText().getText().toString().trim();

                String email = "gozem@gmail.com";
                String password = "gozem";

            // Check for empty data in the form
            if (!emailToCheck.isEmpty() && !passwordToCheck.isEmpty()) {
                if (Functions.isValidEmailAddress(emailToCheck)) {
                    // login user
                    if (!emailToCheck.equals(email) && !passwordToCheck.equals(password)) {
                        Toast.makeText(getApplicationContext(), "Wrong email or password!", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(LoginActivity.this, MapsActivity.class);
                        startActivity(intent);
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Email is not valid!", Toast.LENGTH_SHORT).show();
                }
            } else {
                // Prompt user to enter credentials
                Toast.makeText(getApplicationContext(), "Please enter the credentials!", Toast.LENGTH_LONG).show();
            }
            }
        });
    }
}
