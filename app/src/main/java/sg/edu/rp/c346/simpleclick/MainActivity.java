package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    //Step 1
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtnEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2:Link the field variables  to UI components in layout
        tvDisplay = (TextView)findViewById(R.id.textViewDisplay);
        btnDisplay =(Button)findViewById(R.id.buttonDisplay);
        etInput =(EditText)findViewById(R.id.editText3);
        tbtnEnabled =(ToggleButton) findViewById(R.id.buttonCheck);

        btnDisplay.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        tbtnEnabled.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (tbtnEnabled.isChecked()){
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }

            }
        });
    }
}
