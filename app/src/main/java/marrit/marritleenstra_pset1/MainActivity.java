package marrit.marritleenstra_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


// main activity
public class MainActivity extends AppCompatActivity {

    // add boolean variables to save View states
    private boolean mEyesVisible;
    private boolean mMouthVisible;
    private boolean mNoseVisible;
    private boolean mArmsVisible;
    private boolean mEarsVisible;
    private boolean mEyebrowsVisible;
    private boolean mGlassesVisible;
    private boolean mHatVisible;
    private boolean mMustacheVisible;
    private boolean mShoesVisible;

    // add strings for key/value pairs to save View states
    private static final String EYES_VISIBLE = "Eyes Visible";
    private static final String MOUTH_VISIBLE = "Mouth Visible";
    private static final String NOSE_VISIBLE = "Nose Visible";
    private static final String ARMS_VISIBLE = "Arms Visible";
    private static final String EARS_VISIBLE = "Ears Visible";
    private static final String EYEBROWS_VISIBLE = "EyeBrows Visible";
    private static final String GLASSES_VISIBLE = "Glasses Visible";
    private static final String HAT_VISIBLE = "Hat Visible";
    private static final String MUSTACHE_VISIBLE = "Mustache Visible";
    private static final String SHOES_VISIBLE = "Shoes Visible";

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

        // Initiate all ImageViews
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

        if (savedInstanceState != null) {
            mEyesVisible = savedInstanceState.getBoolean(EYES_VISIBLE);
            mMouthVisible = savedInstanceState.getBoolean(MOUTH_VISIBLE);
            mArmsVisible = savedInstanceState.getBoolean(ARMS_VISIBLE);
            mEarsVisible = savedInstanceState.getBoolean(EARS_VISIBLE);
            mEyebrowsVisible = savedInstanceState.getBoolean(EYEBROWS_VISIBLE);
            mGlassesVisible = savedInstanceState.getBoolean(GLASSES_VISIBLE);
            mHatVisible = savedInstanceState.getBoolean(HAT_VISIBLE);
            mMustacheVisible = savedInstanceState.getBoolean(MUSTACHE_VISIBLE);
            mNoseVisible = savedInstanceState.getBoolean(NOSE_VISIBLE);
            mShoesVisible = savedInstanceState.getBoolean(SHOES_VISIBLE);

            if (mEyesVisible)
                mEyes.setVisibility(View.VISIBLE);
            if (mMouthVisible)
                mMouth.setVisibility(View.VISIBLE);
            if (mArmsVisible)
                mArms.setVisibility(View.VISIBLE);
            if (mEarsVisible)
                mEars.setVisibility(View.VISIBLE);
            if (mEyebrowsVisible)
                mEyebrows.setVisibility(View.VISIBLE);
            if (mGlassesVisible)
                mGlasses.setVisibility(View.VISIBLE);
            if (mHatVisible)
                mHat.setVisibility(View.VISIBLE);
            if (mMustacheVisible)
                mMustache.setVisibility(View.VISIBLE);
            if (mNoseVisible)
                mNose.setVisibility(View.VISIBLE);
            if (mShoesVisible)
                mShoes.setVisibility(View.VISIBLE);
        }

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

                if (mCBEyes.isChecked()) {
                    mEyes.setVisibility(View.VISIBLE);
                    mEyesVisible = true;
                }
                else {
                    mEyes.setVisibility(View.INVISIBLE);
                    mEyesVisible = false;
                }
            }
        });

        // listener for arms
        mCBArms.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBArms.isChecked()) {
                    mArms.setVisibility(View.VISIBLE);
                    mArmsVisible = true;
                }
                else {
                    mArms.setVisibility(View.INVISIBLE);
                    mArmsVisible = false;
                }
            }
        });

        // listener for mouth
        mCBMouth.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBMouth.isChecked()) {
                    mMouth.setVisibility(View.VISIBLE);
                    mMouthVisible = true;
                }
                else {
                    mMouth.setVisibility(View.INVISIBLE);
                    mMouthVisible = false;
                }
            }
        });

        // listener for ears
        mCBEars.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBEars.isChecked()) {
                    mEars.setVisibility(View.VISIBLE);
                    mEarsVisible = true;
                }
                else {
                    mEars.setVisibility(View.INVISIBLE);
                    mEarsVisible = false;
                }
            }
        });

        // listener for eyebrows
        mCBEyebrows.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBEyebrows.isChecked()) {
                    mEyebrows.setVisibility(View.VISIBLE);
                    mEyebrowsVisible = true;
                }
                else {
                    mEyebrows.setVisibility(View.INVISIBLE);
                    mEyebrowsVisible = false;
                }
            }
        });

        // listener for glasses
        mCBGlasses.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBGlasses.isChecked()) {
                    mGlasses.setVisibility(View.VISIBLE);
                    mGlassesVisible = true;
                }
                else {
                    mGlasses.setVisibility(View.INVISIBLE);
                    mGlassesVisible = false;
                }
            }
        });

        // listener for hat
        mCBHat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBHat.isChecked()) {
                    mHat.setVisibility(View.VISIBLE);
                    mHatVisible = true;
                }
                else {
                    mHat.setVisibility(View.INVISIBLE);
                    mHatVisible = false;
                }
            }
        });


        // listener for mustache
        mCBMustache.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBMustache.isChecked()) {
                    mMustache.setVisibility(View.VISIBLE);
                    mMustacheVisible = true;
                }
                else {
                    mMustache.setVisibility(View.INVISIBLE);
                    mMustacheVisible = false;
                }
            }
        });

        // listener for shoes
        mCBShoes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBShoes.isChecked()) {
                    mShoes.setVisibility(View.VISIBLE);
                    mShoesVisible = true;
                }
                else {
                    mShoes.setVisibility(View.INVISIBLE);
                    mShoesVisible = false;
                }
            }
        });

        // listener for nose
        mCBNose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mCBNose.isChecked()) {
                    mNose.setVisibility(View.VISIBLE);
                    mNoseVisible = true;
                }
                else {
                    mNose.setVisibility(View.INVISIBLE);
                    mNoseVisible = false;
                }
            }
        });

    }

    // source: Phillips, Stewart and Marsicano (2017). Android Programming: The big nerd ranch guide
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean(EYES_VISIBLE, mEyesVisible);
        savedInstanceState.putBoolean(ARMS_VISIBLE, mArmsVisible);
        savedInstanceState.putBoolean(EARS_VISIBLE, mEarsVisible);
        savedInstanceState.putBoolean(EYEBROWS_VISIBLE, mEyebrowsVisible);
        savedInstanceState.putBoolean(GLASSES_VISIBLE, mGlassesVisible);
        savedInstanceState.putBoolean(MOUTH_VISIBLE, mMouthVisible);
        savedInstanceState.putBoolean(HAT_VISIBLE, mHatVisible);
        savedInstanceState.putBoolean(MUSTACHE_VISIBLE, mMustacheVisible);
        savedInstanceState.putBoolean(NOSE_VISIBLE, mNoseVisible);
        savedInstanceState.putBoolean(SHOES_VISIBLE, mShoesVisible);
    }
}

