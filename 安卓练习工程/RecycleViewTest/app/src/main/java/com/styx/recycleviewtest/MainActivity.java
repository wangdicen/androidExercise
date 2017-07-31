package com.styx.recycleviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActionBar().hide();
        getSupportActionBar().hide();

        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAapter adapter = new FruitAapter(fruitList);
        recyclerView.setAdapter(adapter);
    }



    private void initFruits(){
        for(int i=0; i<10; i++)
        {
            Fruit apple = new Fruit("ApplFDFSAFSSSSSSSSSSSSSFe", R.drawable.cha);
            fruitList.add(apple);
            Fruit orange = new Fruit("oraDFSFSFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDFEGSGGGSnge",R.drawable.xiao);
            fruitList.add(orange);

        }
    }
}
