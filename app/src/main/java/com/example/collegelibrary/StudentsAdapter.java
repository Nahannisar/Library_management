package com.example.collegelibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder> {

    private List<Students> studentsList;
    private Context context;

    public class StudentsViewHolder extends RecyclerView.ViewHolder {
        public TextView studentName, address;

        public StudentsViewHolder(View view) {
            super(view);
            studentName = (TextView) view.findViewById(R.id.student_name);
            address = (TextView) view.findViewById(R.id.txt_address);

        }
    }

    public StudentsAdapter(List<Students> studentsList, Context context) {
        this.studentsList = studentsList;
        this.context=context;
    }

    @NonNull
    @Override
    public StudentsAdapter.StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);

        return new StudentsViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(@NonNull StudentsAdapter.StudentsViewHolder holder, int position) {

        Students students = studentsList.get(position);
        holder.studentName.setText(position+1 + " " + students.getName());
        holder.address.setText(students.getAddress());

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}
