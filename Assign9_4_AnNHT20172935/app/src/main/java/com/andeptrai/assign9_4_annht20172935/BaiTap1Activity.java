package com.andeptrai.assign9_4_annht20172935;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BaiTap1Activity extends AppCompatActivity implements ItemClickListenner {

    RecyclerView recycle_view;
    List<Mails> mails, mailsList, findList;
    Button btn_favourite, btn_find;
    EditText edt_find;

    int check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap1);

        recycle_view = findViewById(R.id.recycle_view);
        mails = new ArrayList<>();
        mails.add(new Mails("Nguyen 1", "abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Anh 1", "Anh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Hung 1", "findfind Hung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Quan 1", "Quan abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Tung 1", "Tung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("findfindPhu 1", "Phu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Huong 1", "Huong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Trong 1", "Trong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("My 1", "My abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("findfindNhung 1", "findfindNhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("findfindBinh 1", "Binh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Vu 1", "Vu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Huong 2", "Huong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Trong 2", "Trong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("My 2", "My abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Nhung 2", "Nhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Binh 2", "Binh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Vu 12", "Vu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Huong 12", "findfindHuong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Trong 12", "findfindTrong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("My 12", "findfindMy abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Nhung 12", "findfindNhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Binh 13", "findfindBinh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Vu 14", "findfindVu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Huong 15", "findfindHuong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Trong 16", "findfindTrong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("My 17", "My abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Nhung 18", "Nhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Binh 19", "Binh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Vu 10", "Vu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Huong 01", "Huong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ", true));
        mails.add(new Mails("Trong 01", "Trong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("My 741", "My abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Nhung 136", "Nhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Binh 137", "Binh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Vu 136", "findfindVu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Huong 221", "Huong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Trong 331", "Trong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("My 143", "My abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Nhung 361", "Nhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Binh 31", "Binh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Vu 134", "Vu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));



        edt_find = findViewById(R.id.edt_find);
        btn_find = findViewById(R.id.btn_find);


        final MailRCVAdapter adapter = new MailRCVAdapter(mails);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycle_view.setLayoutManager(layoutManager);

        recycle_view.setAdapter(adapter);

        btn_favourite = findViewById(R.id.btn_favourite);
        btn_favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check == 0){
                    mailsList = new ArrayList<>();
                    for (int i = 0; i < mails.size(); i++){
                        if (mails.get(i).isSelect_star() == true){
                            mailsList.add(mails.get(i));
                        }
                    }
                    MailRCVAdapter adapter1 = new MailRCVAdapter(mailsList);
                    recycle_view.setAdapter(adapter1);
                    adapter1.notifyDataSetChanged();
                    check = 1;
                }
                else{
                    check = 0;
                    recycle_view.setAdapter(adapter);
                }
            }
        });

        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (edt_find.getText().toString().length() < 3){
                     Toast.makeText(BaiTap1Activity.this, "Cần nhiều hơn 2 ký tự!", Toast.LENGTH_SHORT).show();
                     recycle_view.setAdapter(adapter);
                 }
                 else{
                     findList = new ArrayList<>();
                     String vt = edt_find.getText().toString();
                     for (int i = 0; i < mails.size(); i++){
                         if ((mails.get(i).getContent().contains(vt))
                                 || (mails.get(i).getName().contains(vt))){
                             findList.add(mails.get(i));
                         }
                     }
                     MailRCVAdapter adapter2 = new MailRCVAdapter(findList);
                     recycle_view.setAdapter(adapter2);

                 }
            }
        });
    }

    @Override
    public void ItemClick(int i) {

    }
}
