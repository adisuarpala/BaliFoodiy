package com.example.adisuarpala.balifoodiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

public class EnMenuActivity extends AppCompatActivity {

    private ExpandableListView elv;
    /**
     * THIS DATA CAN BE FETCHED FROM DATABASES OR FROM WEB USING WEB API'S AND LOAD TO ADAPTER

     * **/


    private static final String[] groupname = {"Tipat Blayag","Loloh Cemcem","Cincau Hijau"};

    private static final String[][] data =
            {{"Ingredients","How to Make"},
                    {"Ingredients","How to Make"},
                    {"Ingredients","How to Make"}};

    private static final String[][] listinfo =
            {{"<br>1. Ketupat <br> 2. Chicken <br> 3. Soybeans <br> 4. Spice Herbs Seasoning" +
                    "<br> 5. Young Cassava",
                    "<br>1. First prepare rice to make stewed. Boil approximately 5 hours.<br>" +
                            "<br> 2. waiting for the stewed boiled, you can cut the chicken meat by way of disisit..<br>" +
                            "<br> 3. Prepare dried fried soy beans.<br>" +
                            "<br> 4. To make delicious spices soup, preferably raw materials burned with embers before smoothing.<br>" +
                            "<br> 5. For vegetables, you can use young cassava cut into small pieces and then mixed with spices.<br>" +
                            "<br> 6. Finally, do not forget to serve with extra chili to make it more delicious.<br>"},
                    {"<br>1. Cemcem leaves" +
                            "<br>2. Cinnamon" +
                            "<br>3. Betel leaf" +
                            "<br>4. Jatropha leaves" +
                            "<br>5. Dhadhap leaves" +
                            "<br>6. Coconut water" +
                            "<br>7. Coconut" +
                            "<br>8. Palm sugar.",
                            "<br>1. Cem - cem leaves are washed and then kneaded or mashed.<br>" +
                                    "<br>2. Plus warm water as needed.<br>" +
                                    "<br>3. Mixed with cinnamon, betel leaf, jatropha, dhadhap leaves.<br>" +
                                    "<br>4. Served with coconut water and palm sugar.<br>" +
                                    "<br>5. Add pieces of coconut fruit in loloh.<br>" +
                                    "<br>6. Loloh cemcem can also be added with ice cubes.<br>"},
                    {"<br>1. 1/4 teaspoon salt" +
                            "<br>2. 500 coconut milk" +
                            "<br>3. 2 pandan leaves" +
                            "<br>4. red syrup, to taste" +
                            "<br>5. green grass, cut into pieces" +
                            "<br>6. sago pearls, to taste" +
                            "<br>7. shaved ice, to taste" +
                            "<br>8. 1 pound of young coconut take the flesh.",
                            "<br>1. First we boil first coconut milk.<br>" +
                                    "<br>2. Add also dnegan pandan leaves and salt to taste alone.<br>" +
                                    "<br>3. Stir until evenly until boiling stew, turn off.<br>" +
                                    "<br>4. Next we prepare a serving glass, input the cincau into it.<br>" +
                                    "<br>5. Add also dnegan sago pearls and coconut meat to taste.<br>" +
                                    "<br>6. Finally then we enter the ice cubes and syrup then kucuri coconut milk that has been boiled into it.<br>" +
                                    "<br>7. Es Daluman Sweet Typical Island of the Gods ready to serve.<br>"}};


    private static final int[] ImgBckgrnd = {R.drawable.blayag,R.drawable.cemcem,R.drawable.cincau};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_menu);
        elv  = (ExpandableListView) findViewById(R.id.lvExp1);
        elv.setFocusable(false);

        /**
         * THIS CAN BE USED IN ACTIVITY OR FRAGMENTS
         * **/

        elv.setAdapter(new CustomELVAdapter(this, EnMenuActivity.this, groupname, ImgBckgrnd, listinfo,data));



        elv.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                /**
                 * TODO:return true to enable group click
                 */

                // DO SOMETHING

                return false;
            }
        });

    }


}
