package com.example.android.devgidi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.devgidi.Classes.Developer;
import com.example.android.devgidi.Helpers.DeveloperAdapter;
import com.example.android.devgidi.Interfaces.IDeveloper;

import java.util.ArrayList;
import java.util.List;

public class DevelopersActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        List<IDeveloper> developers = new ArrayList<>();
        developers.add(new Developer(R.drawable.man, "LM10"));
        developers.add(new Developer(R.drawable.man, "CR7"));
        developers.add(new Developer(R.drawable.man, "Tom Cruise"));
        developers.add(new Developer(R.drawable.man, "Shoemaker"));
        developers.add(new Developer(R.drawable.man, "Suarez"));
        developers.add(new Developer(R.drawable.man, "Sure boy"));
        developers.add(new Developer(R.drawable.man, "Real G"));
        developers.add(new Developer(R.drawable.man, "This Boy"));

        ListView devListView = (ListView) findViewById(R.id.developer_list_view);

        DeveloperAdapter developerAdapter = new DeveloperAdapter(this, developers);

        devListView.setAdapter(developerAdapter);
    }
}
