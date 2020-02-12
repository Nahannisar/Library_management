package com.example.collegelibrary;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder> {

    private List<Books> booksList;
    private Context context;

    public class BooksViewHolder extends RecyclerView.ViewHolder {
        public TextView bookName,author,description;
        private Button btnDescription;

        public BooksViewHolder(View view) {
            super(view);
            bookName = (TextView) view.findViewById(R.id.book_name);
            author = (TextView) view.findViewById(R.id.author_name);
            description = (TextView) view.findViewById(R.id.description);
            btnDescription = (Button) view.findViewById(R.id.btn_description);

        }
    }


    public BooksAdapter(List<Books> booksList, Context context) {
        this.booksList = booksList;
        this.context=context;
    }

    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book, parent, false);

        return new BooksViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BooksViewHolder holder, final int position) {
        Books books = booksList.get(position);
        holder.author.setText(books.getAuthor());
        holder.description.setText(books.getDescription());
        holder.bookName.setText(position+1 + " " + books.getBookName());

        holder.btnDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,FullDescriptionActivity.class);
                intent.putExtra("description",booksList.get(position).getFullDescription());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return booksList.size();
    }
}

