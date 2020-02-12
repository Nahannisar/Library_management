package com.example.collegelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class StudentsFragment extends Fragment {

    private RecyclerView RVStudents;
    private List<Students> studentsList = new ArrayList<>();
    private Button btnAddStudents;
    private StudentsAdapter mAdapter;

    public StudentsFragment() {
        // Required empty public constructor
    }
    /**
     * @return A new instance of fragment SpeedDialFragment.
     */
    public static StudentsFragment newInstance() {
        return new StudentsFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_students, container, false);

        RVStudents = (RecyclerView) root.findViewById(R.id.list_students);
        btnAddStudents = (Button) root.findViewById(R.id.btn_add_students);
        RVStudents.setLayoutManager(new LinearLayoutManager(getActivity()));

        btnAddStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),NewStudentActivity.class);
                startActivityForResult(intent,2);
            }
        });

        // this is data fro recycler view
       Students students1 = new Students("Jeff","103 Almond street");
       studentsList.add(students1);
        Students students2 = new Students("Han","34 Burgandy street");
        studentsList.add(students2);
        Students students3 = new Students("Deepthi","21 Ivanhoe street");
        studentsList.add(students3);
        Students students4 = new Students("Max","12 Yarra street");
        studentsList.add(students4);


         mAdapter = new StudentsAdapter(studentsList,getContext());
        RVStudents.setAdapter(mAdapter);
        RVStudents.setItemAnimator(new DefaultItemAnimator());

        return root;

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == 2)
        {
            String mName = data.getStringExtra("name");
            String mAddress = data.getStringExtra("address");

            Students students = new Students(mName,mAddress);
            studentsList.add(students);
            mAdapter.notifyDataSetChanged();
        }
    }
}
