package com.example.nguoiaylaai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nguoiaylaai.adapter.BinhChonAdapter;
import com.example.nguoiaylaai.model.BinhChon;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView profile = findViewById(R.id.profile);
        profile.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(profile);

        List<BinhChon> listBinhChon = new ArrayList<>();
        listBinhChon.add(new BinhChon("Bright", "bright", 0, 0, 0));
        listBinhChon.add(new BinhChon("Hayate", "hayate", 0, 0, 0));
        listBinhChon.add(new BinhChon("Murad", "murad", 0, 0, 0));

        BinhChonAdapter adapter = new BinhChonAdapter(listBinhChon);
        profile.setAdapter(adapter);

        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = ((LinearLayoutManager) profile.getLayoutManager()).findFirstVisibleItemPosition();
                BinhChon currentPerson = listBinhChon.get(currentPosition);

                if (v.getId() == R.id.btnDocThan) {
                    currentPerson.setCountDocThan(currentPerson.getCountDocThan() + 1);
                } else if (v.getId() == R.id.btnDaCoChu) {
                    currentPerson.setCountDaCoChu(currentPerson.getCountDaCoChu() + 1);
                } else if (v.getId() == R.id.btnLGBT) {
                    currentPerson.setCountLGBT(currentPerson.getCountLGBT() + 1);
                }
                adapter.notifyDataSetChanged();
            }
        };

        Button btnDocThan = findViewById(R.id.btnDocThan);
        Button btnDaCoChu = findViewById(R.id.btnDaCoChu);
        Button btnLGBT = findViewById(R.id.btnLGBT);

        btnDocThan.setOnClickListener(buttonClickListener);
        btnDaCoChu.setOnClickListener(buttonClickListener);
        btnLGBT.setOnClickListener(buttonClickListener);

    }
}