package marrit.marritleenstra_pset1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;



// main activity
public class MainActivity extends AppCompatActivity {

    // add member variables for checkboxes
    private CheckBox mCBEyes;
    private CheckBox mCBMouth;
    private CheckBox mCBNose;
    private CheckBox mCBArms;
    private CheckBox mCBEars;
    private CheckBox mCBEyebrows;
    private CheckBox mCBGlasses;
    private CheckBox mCBHat;
    private CheckBox mCBMustache;
    private CheckBox mCBShoes;

    // add member variables for ImageViews (bodyparts)
    private ImageView mEyes;
    private ImageView mMouth;
    private ImageView mNose;
    private ImageView mArms;
    private ImageView mEars;
    private ImageView mEyebrows;
    private ImageView mGlasses;
    private ImageView mHat;
    private ImageView mMustache;
    private ImageView mShoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initate all ImageViews
        mArms = (ImageView) findViewById(R.id.arms);
        mEars = (ImageView) findViewById(R.id.ears);
        mEyebrows = (ImageView) findViewById(R.id.eyebrows);
        mEyes = (ImageView) findViewById(R.id.eyes);
        mGlasses = (ImageView) findViewById(R.id.glasses);
        mHat = (ImageView) findViewById(R.id.hat);
        mMouth = (ImageView) findViewById(R.id.Mouth);
        mMustache = (ImageView) findViewById(R.id.mustache);
        mNose = (ImageView) findViewById(R.id.nose);
        mShoes = (ImageView) findViewById(R.id.shoes);

        // Make all ImageViews invisible
        mArms.setVisibility(View.INVISIBLE);
        mEars.setVisibility(View.INVISIBLE);
        mEyebrows.setVisibility(View.INVISIBLE);
        mEyes.setVisibility(View.INVISIBLE);
        mGlasses.setVisibility(View.INVISIBLE);
        mHat.setVisibility(View.INVISIBLE);
        mMouth.setVisibility(View.INVISIBLE);
        mMustache.setVisibility(View.INVISIBLE);
        mNose.setVisibility(View.INVISIBLE);
        mShoes.setVisibility(View.INVISIBLE);

        // Initate all CheckBoxes
        mCBArms = (CheckBox) findViewById(R.id.checkBoxArms);
        mCBEars = (CheckBox) findViewById(R.id.checkBoxEars);
        mCBEyebrows = (CheckBox) findViewById(R.id.checkboxEyebrows);
        mCBEyes = (CheckBox) findViewById(R.id.checkBoxEyes);
        mCBGlasses = (CheckBox) findViewById(R.id.checkBoxGlasses);
        mCBMouth = (CheckBox) findViewById(R.id.checkBoxMouth);
        mCBHat = (CheckBox) findViewById(R.id.checkBoxHat);
        mCBMustache = (CheckBox) findViewById(R.id.checkBoxMustache);
        mCBNose = (CheckBox) findViewById(R.id.checkBoxNose);
        mCBShoes = (CheckBox) findViewById(R.id.checkBoxShoes);

        // set listener for clicks on (all) checkboxes (however is 1-by-1)
        // method learned from: http://tekeye.uk/android/examples/code-android-event-listeners

        // listener for eyes
        mCBEyes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBEyes.isChecked())
                    mEyes.setVisibility(View.VISIBLE);
                else
                    mEyes.setVisibility(View.INVISIBLE);
            }
        });

        // listener for arms
        mCBArms.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBArms.isChecked())
                    mArms.setVisibility(View.VISIBLE);
                else
                    mArms.setVisibility(View.INVISIBLE);
            }
        });

        // listener for mouth
        mCBMouth.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBMouth.isChecked())
                    mMouth.setVisibility(View.VISIBLE);
                else
                    mMouth.setVisibility(View.INVISIBLE);
            }
        });

        // listener for ears
        mCBEars.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBEars.isChecked())
                    mEars.setVisibility(View.VISIBLE);
                else
                    mEars.setVisibility(View.INVISIBLE);
            }
        });

        // listener for eyebrows
        mCBEyebrows.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBEyebrows.isChecked())
                    mEyebrows.setVisibility(View.VISIBLE);
                else
                    mEyebrows.setVisibility(View.INVISIBLE);
            }
        });

        // listener for glasses
        mCBGlasses.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBGlasses.isChecked())
                    mGlasses.setVisibility(View.VISIBLE);
                else
                    mGlasses.setVisibility(View.INVISIBLE);
            }
        });

        // listener for hat
        mCBHat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBHat.isChecked())
                    mHat.setVisibility(View.VISIBLE);
                else
                    mHat.setVisibility(View.INVISIBLE);
            }
        });


        // listener for mustache
        mCBMustache.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBMustache.isChecked())
                    mMustache.setVisibility(View.VISIBLE);
                else
                    mMustache.setVisibility(View.INVISIBLE);
            }
        });

        // listener for shoes
        mCBShoes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBShoes.isChecked())
                    mShoes.setVisibility(View.VISIBLE);
                else
                    mShoes.setVisibility(View.INVISIBLE);
            }
        });

        // listener for nose
        mCBNose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBNose.isChecked())
                    mNose.setVisibility(View.VISIBLE);
                else
                    mNose.setVisibility(View.INVISIBLE);
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




