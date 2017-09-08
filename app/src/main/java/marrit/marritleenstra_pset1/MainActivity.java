package marrit.marritleenstra_pset1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


// declare a seperate class for all bodyparts
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

// main activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // construct all bodyparts onCreate
        final bodypart arms = new bodypart((ImageView) findViewById(R.id.arms));
        final bodypart ears = new bodypart((ImageView) findViewById(R.id.ears));
        final bodypart eyebrows = new bodypart((ImageView) findViewById(R.id.eyebrows));
        final bodypart eyes = new bodypart((ImageView) findViewById(R.id.eyes));
        final bodypart glasses = new bodypart((ImageView) findViewById(R.id.glasses));
        final bodypart hat = new bodypart((ImageView) findViewById(R.id.hat));
        final bodypart mouth = new bodypart((ImageView) findViewById(R.id.Mouth));
        final bodypart mustache = new bodypart((ImageView) findViewById(R.id.mustache));
        final bodypart nose = new bodypart((ImageView) findViewById(R.id.nose));
        final bodypart shoes = new bodypart((ImageView) findViewById(R.id.shoes));

        // construct all checkboxes onCreate
        final CheckBox CBArms = (CheckBox) findViewById(R.id.checkBoxArms) ;
        final CheckBox CBEars = (CheckBox) findViewById(R.id.checkBoxEars);
        final CheckBox CBEyebrows = (CheckBox) findViewById(R.id.checkboxEyebrows);
        final CheckBox CBEyes = (CheckBox) findViewById(R.id.checkBoxEyes);
        final CheckBox CBGlasses = (CheckBox) findViewById(R.id.checkBoxGlasses);

        // hide all bodyparts when app is started (onCreate)
        arms.hide();
        eyes.hide();
        ears.hide();
        eyebrows.hide();
        glasses.hide();
        hat.hide();
        mouth.hide();
        mustache.hide();
        nose.hide();
        shoes.hide();

        // set listener for clicks on checkboxes
        // method learned from: http://tekeye.uk/android/examples/code-android-event-listeners
        CBEyes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBEyes.isChecked())
                    eyes.show();
                else
                    eyes.hide();
            }
        });

        //CBEyes.setChecked(true);

       // if (CBArms.isChecked()) {
       //     arms.show();
       // }
       // if (CBEyes.isChecked()) {
       //     eyes.show();
       // }

    }




}


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



