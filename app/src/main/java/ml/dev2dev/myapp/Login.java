package ml.dev2dev.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by benson on 10/13/15.
 */
public class Login extends Activity {

    //Declare the views login page

    EditText username,password;
    Button Login,Register;
    TextView forgotpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//assign variables
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.login);
        Register=(Button)findViewById( R.id.register);
        forgotpassword=(TextView)findViewById(R.id.forg);
     Register.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent R=new Intent(Login.this,Register.class);
             startActivity(R);
             finish();
         }
     });
    }


}
