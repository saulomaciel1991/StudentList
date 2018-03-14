package com.example.saulo.studentlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listStudent);
        final Button botaoNovo = (Button) findViewById(R.id.btNovo);
        //Student student = new Student();
        ArrayList<String> nomes = new ArrayList<String>();

        /*for (Student s: student.getStudentList()) {
            nomes.add(s.getNome());
        }*/

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, nomes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemPosition = i;
                String nomeItem = (String) lista.getItemAtPosition(i);
            }
        });

        botaoNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formStudent(view);
            }
        });

    }

    public void formStudent(View view){
        Intent intent = new Intent(this, FormStudentActivity.class);
        startActivity(intent);
    }
}
