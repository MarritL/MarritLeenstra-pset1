package marrit.marritleenstra_pset1;


import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

 import static marrit.marritleenstra_pset1.R.drawable.arms;


// declare a seperate class for all bodyparts
class bodypart  {

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

    //View arms = findViewById(R.id.arms);

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
        final CheckBox CBMouth = (CheckBox) findViewById(R.id.checkBoxMouth);
        final CheckBox CBHat = (CheckBox) findViewById(R.id.checkBoxHat);
        final CheckBox CBMustache = (CheckBox) findViewById(R.id.checkBoxMustache);
        final CheckBox CBNose = (CheckBox) findViewById(R.id.checkBoxNose);
        final CheckBox CBShoes = (CheckBox) findViewById(R.id.checkBoxShoes);

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

        // set listener for clicks on (all) checkboxes (however is 1-by-1)
        // method learned from: http://tekeye.uk/android/examples/code-android-event-listeners

        // listener for eyes
        CBEyes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBEyes.isChecked())
                    eyes.show();
                else
                    eyes.hide();
            }
        });

        // listener for arms
        CBArms.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBArms.isChecked())
                    arms.show();
                else
                    arms.hide();
            }
        });

        // listener for mouth
        CBMouth.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBMouth.isChecked())
                    mouth.show();
                else
                    mouth.hide();
            }
        });

        // listener for ears
        CBEars.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBEars.isChecked())
                    ears.show();
                else
                    ears.hide();
            }
        });

        // listener for eyebrows
        CBEyebrows.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBEyebrows.isChecked())
                    eyebrows.show();
                else
                    eyebrows.hide();
            }
        });

        // listener for glasses
        CBGlasses.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBGlasses.isChecked())
                    glasses.show();
                else
                    glasses.hide();
            }
        });

        // listener for hat
        CBHat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBHat.isChecked())
                    hat.show();
                else
                    hat.hide();
            }
        });

        // listener for mouth
        CBMouth.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBMouth.isChecked())
                    mouth.show();
                else
                    mouth.hide();
            }
        });

        // listener for mustache
        CBMustache.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBMustache.isChecked())
                    mustache.show();
                else
                    mustache.hide();
            }
        });

        // listener for shoes
        CBShoes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBShoes.isChecked())
                    shoes.show();
                else
                    shoes.hide();
            }
        });

        // listener for nose
        CBNose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (CBNose.isChecked())
                    nose.show();
                else
                    nose.hide();
            }
        });

    }

    /*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("arms", arms.getVisibility());
        super.onSaveInstanceState(outState);

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        arms.setVisibility(savedInstanceState.getInt("arms"));
    }
    */

}




