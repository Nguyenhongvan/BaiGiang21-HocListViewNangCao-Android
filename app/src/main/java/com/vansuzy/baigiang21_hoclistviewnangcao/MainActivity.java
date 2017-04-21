package com.vansuzy.baigiang21_hoclistviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.vansuzy.adapter.DanhBaAdapter;
import com.vansuzy.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhBa;
    ArrayList<DanhBa> dsDanhBa;
    DanhBaAdapter danhBaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);

        dsDanhBa = new ArrayList<DanhBa>();
        dsDanhBa.add(new DanhBa(1, "Nguyễn Hồng Vân", "0976444163"));
        dsDanhBa.add(new DanhBa(2, "Trịnh Thảo Vi", "01695929726"));

        danhBaAdapter = new DanhBaAdapter(MainActivity.this, R.layout.item, dsDanhBa);

        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
