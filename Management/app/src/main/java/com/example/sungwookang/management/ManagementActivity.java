package com.example.sungwookang.management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ManagementActivity extends AppCompatActivity {

    private ListView listView;
    private UserListAdapter adapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        Intent intent = getIntent();

        listView = (ListView) findViewById(R.id.listView);
        userList = new ArrayList<User>();

        userList.add(new User("홍길동", "홍길동", "홍길동", "20"));
        userList.add(new User("김갑수", "김갑수", "김갑수", "50"));
        userList.add(new User("송중기", "송중기", "송중기", "25"));

        adapter = new UserListAdapter(getApplicationContext(), userList);
        listView.setAdapter(adapter);
    }
}
