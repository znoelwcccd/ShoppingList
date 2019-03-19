package com.example.zach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView[] itemViews = new TextView[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
        loadItemViews();
        String itemToAdd = "";
        if (extras != null) {
            itemToAdd = extras.getString("item");
            if (isItemOnList(itemToAdd)) {
                //duplicate item
            } else {
                int index = getItemListIndex();
                itemViews[index].setText(itemToAdd);
                itemViews[index].setVisibility(View.VISIBLE);
            }
        }
    }

    public void loadItemViews() {
        itemViews[0] = findViewById(R.id.item1);
        itemViews[1] = findViewById(R.id.item2);
        itemViews[2] = findViewById(R.id.item3);
        itemViews[3] = findViewById(R.id.item4);
        itemViews[4] = findViewById(R.id.item5);
        itemViews[5] = findViewById(R.id.item6);
        itemViews[6] = findViewById(R.id.item7);
        itemViews[7] = findViewById(R.id.item8);
        itemViews[8] = findViewById(R.id.item9);
        itemViews[9] = findViewById(R.id.item10);
    }

    public void launchItemList(View view) {
        Intent intent = new Intent(this, ItemList.class);

        startActivity(intent);
    }

    public boolean isItemOnList(String item) {
        for (int i = 0; i < itemViews.length; i++) {
            String viewString = itemViews[i].getText().toString();
            if (viewString.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public int getItemListIndex() {
        for (int i = 0; i < itemViews.length; i++) {
            String viewString = itemViews[i].getText().toString();
            if (viewString.length() == 0) {
                return i;
            }
        }
        return 0;
    }
}
