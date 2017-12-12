package com.kharisma.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class DatauserActivity extends AppCompatActivity {

    private TextView tv_idmember,tv_namamember,tv_emailmember,tv_judulbuku,tv_author,tv_publisher,tv_tglpinjam,tv_tglkembali,tvpinjam,tvkembali;
    private Pinjaman pinjaman;
    private Users user;
    private String id = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datauser);

        tv_idmember = (TextView) findViewById(R.id.tv_idmember);
        tv_namamember = (TextView) findViewById(R.id.tv_namamember);
        tv_emailmember = (TextView) findViewById(R.id.tv_emailmember);
        tv_judulbuku = (TextView) findViewById(R.id.tv_judulbuku);
        tv_author = (TextView) findViewById(R.id.tv_author);
        tv_publisher = (TextView) findViewById(R.id.tv_publisher);
        tv_tglpinjam = (TextView) findViewById(R.id.tv_tglpinjam);
        tv_tglkembali = (TextView) findViewById(R.id.tv_tglkembali);
        tvpinjam = (TextView) findViewById(R.id.tvpinjam);
        tvkembali = (TextView) findViewById(R.id.tvkembali);

        Bundle extras = getIntent().getExtras();
        id = extras.getString(id);
        tv_emailmember.setText(id);
        String id_m = tv_emailmember.getText().toString().trim();

        if (!TextUtils.isEmpty(id_m)){
            user = new Users(id_m);
            tv_namamember.setText(user.getNamalengkap());
            tv_idmember.setText(user.getId_members());
        }

        String id_me = tv_idmember.getText().toString().trim();
        pinjaman = new Pinjaman(id_me);
        String z = pinjaman.getIdm();
        if (z=="1"){
            tv_judulbuku.setText(pinjaman.getBuku().getJudul());
            tv_author.setText(pinjaman.getBuku().getAuthor());
            tv_publisher.setText(pinjaman.getBuku().getPublisher());
            tv_tglpinjam.setText(pinjaman.getTanggalpinjam());
            tv_tglkembali.setText(pinjaman.getTanggalkembali());
        }else {
            tv_judulbuku.setText("Tidak Ada Pinjaman Buku");
            tvpinjam.setText(" ");
            tvkembali.setText(" ");
        }
    }
}
