package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animalList = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animalList.add(new Animal("Cat" , R.mipmap.mustbetrue));
        animalList.add(new Animal("Dog" , R.mipmap.mustbetrue));
        animalList.add(new Animal("Bird" , R.mipmap.mustbetrue));
        animalList.add(new Animal("Elephant" , R.mipmap.mustbetrue));
        animalList.add(new Animal("Lion" , R.mipmap.mustbetrue));
        animalList.add(new Animal("Eagle" , R.mipmap.mustbetrue));

        final ListView listView = (ListView) findViewById(R.id.listView);
        AnimalAdapter adapter = new AnimalAdapter(this , animalList);
        listView.setAdapter(adapter);

    }
}