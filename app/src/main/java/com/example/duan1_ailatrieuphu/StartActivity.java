package com.example.duan1_ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.duan1_ailatrieuphu.adapter.MoneyAdapter;
import com.example.duan1_ailatrieuphu.model.Question;

import java.util.ArrayList;
import java.util.Random;

public class StartActivity extends AppCompatActivity {
    TextView tvCauhoi,tvCautl1,tvCautl2,tvCautl3,tvCautl4;
    ListView lvTienthuong;
    MoneyAdapter moneyAdapter;
    ArrayList<String> arrayListtien;
    Question cauhoi;
    int vitricauHoi = 1;
    ImageView Img50, Imgcall, Imgkhangia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        init();
        anhXa();
        setUp();
        setClick();
    }
    public void init(){
        arrayListtien = new ArrayList<>();
        arrayListtien.add("1000000");
        arrayListtien.add("500000");
        arrayListtien.add("250000");
        arrayListtien.add("125000");
        arrayListtien.add("64000");
        arrayListtien.add("32000");
        arrayListtien.add("16000");
        arrayListtien.add("8000");
        arrayListtien.add("4000");
        arrayListtien.add("2000");
        arrayListtien.add("1000");
        arrayListtien.add("500");
        arrayListtien.add("300");
        arrayListtien.add("200");
        arrayListtien.add("100");












        moneyAdapter = new MoneyAdapter(this,1,arrayListtien);

        cauhoi = new Question();

    }
    public void anhXa(){
        lvTienthuong = findViewById(R.id.lvlist);
        tvCauhoi = findViewById(R.id.tvch);
        tvCautl1 = findViewById(R.id.tvctl1);
        tvCautl2 = findViewById(R.id.tvctl2);
        tvCautl3 = findViewById(R.id.tvctl3);
        tvCautl4 = findViewById(R.id.tvctl4);

    } public void setUp(){
        setCauHoi();
        lvTienthuong.setAdapter(moneyAdapter);
        showcauhoi();
    }
    public void setClick(){

    }

    public void setCauHoi(){
        cauhoi.setNoiDung("Đâu là một động từ ");
        cauhoi.setDapAnDung("Đi");
        ArrayList<String> arraySai = new ArrayList<>();
        arraySai.add("Sâu");
        arraySai.add("Rộng");
        arraySai.add("Nông");
        cauhoi.setArrayDapansai(arraySai);
    }
    public  void showcauhoi(){
        tvCauhoi.setText(cauhoi.getNoiDung());
        ArrayList<String > arrcauTL = new ArrayList<>(cauhoi.getArrayDapansai());
        arrcauTL.add(cauhoi.getDapAnDung());

        Random random = new Random();
        for (int i = 0; i <5 ; i++) {
            int vt1 =random.nextInt(arrcauTL.size());
            int vt2 =random.nextInt(arrcauTL.size());
            String a = arrcauTL.get(vt1);//0123
            arrcauTL.set(vt1,arrcauTL.get(vt2));
            arrcauTL.set(vt2,a);

        }



        tvCautl1.setText(arrcauTL.get(0));
        tvCautl2.setText(arrcauTL.get(1));
        tvCautl3.setText(arrcauTL.get(2));
        tvCautl4.setText(arrcauTL.get(3));

        moneyAdapter.setViTricauhoi(vitricauHoi);
    }

    public void trogiup(){

    }

}