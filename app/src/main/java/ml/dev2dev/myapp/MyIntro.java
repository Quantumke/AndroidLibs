package ml.dev2dev.myapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by benson on 10/13/15.
 */
public class MyIntro extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("Pied Piper", "WELCOME TO PIED PIPER",
                R.drawable.logo, Color.parseColor("#272730")));

        setBarColor(Color.parseColor("#2E9E48"));
        setSeparatorColor(Color.parseColor("#2E9E48"));
        showSkipButton(false);

        setVibrate(true);
        setVibrateIntensity(30);
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        Toast.makeText(getApplicationContext(),"You Skipped",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDonePressed() {
        Toast.makeText(getApplicationContext(),"You Done",Toast.LENGTH_SHORT).show();


    }

}
