package com.example.zach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemList extends AppCompatActivity {

    String itemToReturn = "";
    String[] ITEMS = {"Milk", "Cheese", "Eggs", "Bread", "Juice", "Steak", "Chicken", "Vegetables"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }

    public void buttonOne(View view) {
        itemToReturn = ITEMS[0];
        process();
    }

    public void buttonTwo(View view) {
        itemToReturn = ITEMS[1];
        process();
    }

    public void buttonThree(View view) {
        itemToReturn = ITEMS[2];
        process();
    }

    public void buttonFour(View view) {
        itemToReturn = ITEMS[3];
        process();
    }

    public void buttonFive(View view) {
        itemToReturn = ITEMS[4];
        process();
    }

    public void buttonSix(View view) {
        itemToReturn = ITEMS[5];
        process();
    }

    public void buttonSeven(View view) {
        itemToReturn = ITEMS[6];
        process();
    }

    public void buttonEight(View view) {
        itemToReturn = ITEMS[7];
        process();
    }

    private void process() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("item", itemToReturn);

        startActivity(intent);
    }
}
