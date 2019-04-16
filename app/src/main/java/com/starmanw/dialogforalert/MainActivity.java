package com.starmanw.dialogforalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    private AlertDialog.Builder alBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAlertDialog();
    }

    private void initAlertDialog() {
        alBuilder = new AlertDialog.Builder(this);

        // Set buttons and click listeners
        alBuilder.setPositiveButton("OK", this);
        alBuilder.setNegativeButton("Cancel", this);
    }

    public void showAlert(View view) {
        alBuilder.setTitle("Alert");
        alBuilder.setMessage("Click OK to continue, or Cancel to stop:");
        alBuilder.show();
    }

    /**
     * Alert Dialog click listeners
     * @param dialog
     * @param which
     */
    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_POSITIVE) {
            Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
        } else if (which == DialogInterface.BUTTON_NEGATIVE) {
            Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
        }
    }
}
