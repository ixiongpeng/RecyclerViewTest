package com.example.xiongpeng.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    public static String[] strings = {"AA", "BB", "CC", "DD", "EE", "FF","AA", "BB", "CC", "DD", "EE", "FF", "AA", "BB", "CC", "DD", "EE", "FF"};
    RecyclerView recyclerView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter());
    }

    class MyAdapter extends RecyclerView.Adapter<MyHoldView>{
        @Override
        public MyHoldView onCreateViewHolder(ViewGroup parent, int viewType) {
            View view  = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_list, null);
            MyHoldView myHoldView = new MyHoldView(view);
            return myHoldView;
        }

        @Override
        public void onBindViewHolder(MyHoldView holder, int position) {
            holder.textView.setText(strings[position]);

        }

        @Override
        public int getItemCount() {
            return strings.length;
        }


    }

    class MyHoldView extends RecyclerView.ViewHolder {
        public MyHoldView(View itemView) {
            super(itemView);
        }
        TextView textView = (TextView) itemView.findViewById(R.id.text);
    }






}
