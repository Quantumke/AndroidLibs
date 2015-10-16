package ml.dev2dev.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by benson on 10/13/15.
 */
public class Register extends Activity{

    EditText useruser, userpass, useremail;
    Button userregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reigister);

        useruser=(EditText)findViewById(R.id.useruser);
        userpass=(EditText)findViewById(R.id.userpass);
        useremail=(EditText)findViewById(R.id.useremail);
        userregister=(Button)findViewById(R.id.userregister);
        userregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Register.this, MenuLinks.class);
                startActivity(a);
                finish();
            }
        });

        
    }
}
