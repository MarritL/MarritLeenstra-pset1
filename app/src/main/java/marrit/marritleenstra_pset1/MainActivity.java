package marrit.marritleenstra_pset1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;



class bodypart {

    // Properties of the class
    public ImageView part;

    // Constructor of the class
    public bodypart(ImageView aPart) {
        part = aPart;
    }

    // methods
    public void show() {
        part.setVisibility(View.VISIBLE);
    }

    public void hide() {
        part.setVisibility(View.INVISIBLE);
    }

}

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bodypart arms = new bodypart((ImageView) findViewById(R.id.arms));
        bodypart ears = new bodypart((ImageView) findViewById(R.id.ears));
        bodypart eyebrows = new bodypart((ImageView) findViewById(R.id.eyebrows));
        bodypart eyes = new bodypart((ImageView) findViewById(R.id.eyes));
        bodypart glasses = new bodypart((ImageView) findViewById(R.id.glasses));
        bodypart hat = new bodypart((ImageView) findViewById(R.id.hat));
        bodypart mouth = new bodypart((ImageView) findViewById(R.id.Mouth));
        bodypart mustache = new bodypart((ImageView) findViewById(R.id.mustache));
        bodypart nose = new bodypart((ImageView) findViewById(R.id.nose));
        bodypart shoes = new bodypart((ImageView) findViewById(R.id.shoes));

        final CheckBox CBArms = (CheckBox) findViewById(R.id.checkBoxArms) ;
        CheckBox CBEars = (CheckBox) findViewById(R.id.checkBoxEars);
        CheckBox CBEyebrows = (CheckBox) findViewById(R.id.checkboxEyebrows);
        final CheckBox CBEyes = (CheckBox) findViewById(R.id.checkBoxEyes);
        CheckBox CBGlasses = (CheckBox) findViewById(R.id.checkBoxGlasses);

        arms.hide();
        eyes.hide();

        CBEyes.setChecked(true);

        if (CBArms.isChecked()) {
            arms.show();
        }
        if (CBEyes.isChecked()) {
            eyes.show();
        }




}}


/*
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView eyes = (ImageView) findViewById(R.id.eyes);
    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
    ImageView glasses = (ImageView) findViewById(R.id.glasses);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // source: https://developer.android.com/guide/topics/ui/controls/checkbox.html
        public void clicked(View view) {
            // Is the view now checked?
            boolean checked = ((CheckBox) view).isChecked();

            // Check which checkbox was clicked
            switch (view.getId()) {
                case R.id.checkBoxEyes:
                    if (checked)
                        eyes.setVisibility(View.VISIBLE);
                    else
                        eyes.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkboxEyebrows:
                    if (checked)
                        // make eyebrows visible
                        eyebrows.setVisibility(View.VISIBLE);
                    else
                        eyebrows.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkBoxGlasses:
                    if (checked)
                        glasses.setVisibility(View.VISIBLE);
                    else
                        glasses.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    }
}
*/



