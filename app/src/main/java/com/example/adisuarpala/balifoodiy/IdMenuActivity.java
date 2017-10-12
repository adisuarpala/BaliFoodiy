package com.example.adisuarpala.balifoodiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

public class IdMenuActivity extends AppCompatActivity {


    private ExpandableListView elv;
    /**
     * THIS DATA CAN BE FETCHED FROM DATABASES OR FROM WEB USING WEB API'S AND LOAD TO ADAPTER

     * **/


    private static final String[] groupname = {"Tipat Blayag","Loloh Cemcem","Cincau Hijau"};

    private static final String[][] data =
            {{"Bahan","Cara Pembuatan"},
            {"Bahan","Cara Pembuatan"},
            {"Bahan","Cara Pembuatan"}};

    private static final String[][] listinfo =
            {{"<br>1. Ketupat <br> 2. Ayam sisit <br> 3. Kacang Kedelai <br> 4. Bumbu rempah kuah" +
                    "<br> 5. Singkong muda",
                    "<br>1. Pertama siapkan beras untuk dibuatkan ketupat. Rebus kurang lebih 5 jam.<br>" +
                            "<br> 2. Sambil menunggu tipat direbus, anda dapat memotong daging ayam dengan cara disisit.<br>" +
                            "<br> 3. Siapkan kacang kedelai goreng kering.<br>" +
                            "<br> 4. Untuk membuat bumbu rempah kuah yang sedap, sebaiknya bahan baku di bakar dengan bara api sebelum dihaluskan.<br>" +
                            "<br> 5. Untuk sayur, anda bisa menggunakan singkong muda dipotong kecil-kecil lalu dicamput dengan bumbu lengkap.<br>" +
                            "<br> 6. Terakhir, jangan lupa sajikan dengan tambahan sambal agar lebih nikmat.<br>"},
            {"<br>1. Daun cemcem <br> 2. Kayu manis <br> 3. Kayu manis <br> 4. Daun jarak pagar <br> 5. Daun dhadhap" +
                    "<br> 6. Air kelapa <br> 7. Buah kelapa <br> 8. Gula aren",
                    "<br>1. Daun cem – cem dicuci bersih kemudian diremas atau dihaluskan.<br>" +
                            "<br>2. Ditambah air hangat sesuai kebutuhan.<br>" +
                            "<br>3. Dicampur dengan kayu manis, daun sirih, jarak pagar, daun dhadhap<br>" +
                            "<br>4. Disajikan dengan air kelapa dan gula aren<br>" +
                            "<br>5. Tambahkan potongan buah kelapa dalam loloh<br>" +
                            "<br>6. Loloh cemcem ini juga bisa ditambahkan dengan es batu<br>"},
            {"<br>1. 1/4 sdt garam" +
                    "<br>2. 500 santan" +
                    "<br>3. 2 lbr daun pandan" +
                    "<br>4. sirup merah, secukupnya" +
                    "<br>5. cincau hijau, potong-potong" +
                    "<br>6. sagu mutiara, secukupnya" +
                    "<br>7. es serut, secukupnya" +
                    "<br>8. 1 bh kelapa muda ambil daging buahnya.",
                    "<br>1.Pertama-tama kita rebus terlebih dahulu santan." +
                            "<br>2.Tambahkan juga dnegan daun pandan dan garam secukupnya saja.<br>" +
                            "<br>3.Aduk-aduk sampai merata hingga rebusan mendidih, matikan.<br>" +
                            "<br>4.Selanjutnya kita siapkan gelas saji, masukan cincau kedalamnya.<br>" +
                            "<br>5.Tambahkan juga dnegan sagu mutiara dan daging buah kelapa secukupnya.<br>" +
                            "<br>6.Terakhir barulah kita masukan es batu dan sirup lalu kucuri santan yang sudah di rebus kedalamnya.<br>" +
                            "<br>7.Es Daluman Manis Khas Pulau Dewata siap di hidangkan.<br>"}};


    private static final int[] ImgBckgrnd = {R.drawable.blayag,R.drawable.cemcem,R.drawable.cincau};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_menu);
        elv  = (ExpandableListView) findViewById(R.id.lvExp1);
        elv.setFocusable(false);

        /**
         * THIS CAN BE USED IN ACTIVITY OR FRAGMENTS
         * **/

        elv.setAdapter(new CustomELVAdapter(this, IdMenuActivity.this, groupname, ImgBckgrnd, listinfo,data));



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
