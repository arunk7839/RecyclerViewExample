package com.example.lenovo.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.recyclerview.R;
import com.example.lenovo.recyclerview.model.Book;
import java.util.List;


public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private List<Book> bookList;


    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView authorName, bookName;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);

            authorName = (TextView) view.findViewById(R.id.author_name);
            bookName = (TextView) view.findViewById(R.id.book_name);
            imageView = (ImageView) view.findViewById(R.id.img_book);
        }


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_row, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.authorName.setText(bookList.get(position).getAuthorName());
        holder.bookName.setText(bookList.get(position).getBookName());
        holder.imageView.setImageResource(bookList.get(position).getImageResource());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


}
