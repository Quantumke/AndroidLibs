package ml.dev2dev.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by benson on 10/13/15.
 */
public class Login extends Activity {

    //Define the views

    EditText username,password;
    Button Login,Register;
    TextView forgotpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.login);
        Register=(Button)findViewById( R.id.register);
        forgotpassword=(TextView)findViewById(R.id.forg);

    }


}
