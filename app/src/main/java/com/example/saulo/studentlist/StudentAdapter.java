package com.example.saulo.studentlist;

import android.content.Context;
import android.content.res.Resources;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter{
    Context ctx;
    List<Student> students;

    public StudentAdapter(Context ctx, List<Student>students){
        this.ctx = ctx;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Student student = students.get(position);

        ViewHolder holder = null;
        if (convertView == null){
            Log.d("NGVL", "View Nova => position: " + position);
            convertView = LayoutInflater.from(ctx).inflate(R.layout.item_student, null);

            holder = new ViewHolder();
            holder.imgFoto = (ImageView)convertView.findViewById(R.id.imgFoto);
            holder.txtNome = (TextView)convertView.findViewById(R.id.txtNome);
            holder.txtTelefone = (TextView)convertView.findViewById(R.id.txtTelefone);

            convertView.setTag(holder);

        }else{
            Log.d("NGVL", "View existente => position: "+ position);
            holder = (ViewHolder)convertView.getTag();
        }

        Resources res = ctx.getResources();

        holder.txtNome.setText(student.getNome());
        holder.txtTelefone.setText(student.getTelefone());

        return convertView;
    }

    static class ViewHolder {
        ImageView imgFoto;
        TextView txtNome;
        TextView txtTelefone;
    }
}
