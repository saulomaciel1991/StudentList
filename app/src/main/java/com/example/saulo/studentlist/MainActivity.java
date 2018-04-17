package com.example.saulo.studentlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.view.Menu;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Student> students;
    Student student = new Student();
    StudentAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button botaoNovo = (Button) findViewById(R.id.btNovo);
        listView = (ListView) findViewById(R.id.listStudent);
        listView.setEmptyView(findViewById(R.id.empty));

        students = student.getStudentList();

        adapter = new StudentAdapter(this, students);

        listView.setAdapter(adapter);
        registerForContextMenu(listView);

        botaoNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formStudent(view);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        if (view.getId() == R.id.listStudent){
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu_aluno, menu);
        }
    }

    public void formStudent(View view){
        Intent intent = new Intent(this, FormStudentActivity.class);
        startActivityForResult(intent, 2);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        nomes.add(data.getStringExtra("nome").toString());
    }*/
}
