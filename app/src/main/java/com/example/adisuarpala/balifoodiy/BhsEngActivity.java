package com.example.adisuarpala.balifoodiy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import me.anshulagarwal.expandablemenuoption.ExpandableMenuView;

public class BhsEngActivity extends AppCompatActivity {

    ExpandableMenuView expandableMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhs_eng);

        expandableMenuView = (ExpandableMenuView)findViewById(R.id.expandable_menu);
        expandableMenuView.setOnMenuListener(new ExpandableMenuView.MenuListener() {

            @Override
            public void rightPressed() {

                Intent intent = new Intent(
                        BhsEngActivity.this, EnLocationActivity.class);
                startActivity(intent);

                Toast.makeText(BhsEngActivity.this, "Location", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void leftPressed() {

                Intent intent = new Intent(
                        BhsEngActivity.this, EnMenuActivity.class);
                startActivity(intent);

                Toast.makeText(BhsEngActivity.this, "Food Menu", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void topPressed() {

            }

            @Override
            public void bottomPressed() {

            }
        });
    }
}
