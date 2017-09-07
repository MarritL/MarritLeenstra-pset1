package marrit.marritleenstra_pset1;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

    ImageView eyes = (ImageView) findViewById(R.id.eyes);
    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
    ImageView glasses = (ImageView) findViewById(R.id.glasses);

    // source: https://developer.android.com/guide/topics/ui/controls/checkbox.html
    public void clicked(View box) {
        // Is the view now checked?
        boolean checked = ((CheckBox) box).isChecked();

        // Check which checkbox was clicked
        switch (box.getId()) {
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
