package com.example.lenovo.recyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.recyclerview.R;
import com.example.lenovo.recyclerview.adapter.BookAdapter;
import com.example.lenovo.recyclerview.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Book> bookList = new ArrayList<Book>();
    private BookAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        prepareBookData();


        //vertical RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //horizontal RecyclerView
        //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        //provides basic animations on remove, add, and move events that happen to the items in a RecyclerView.
        //RecyclerView uses a DefaultItemAnimator by default.
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(new BookAdapter(bookList));
    }

    //preparing bookList data
    private void prepareBookData() {
        Book book = new Book("Munshi Premchand", "Nirmala", R.drawable.nirmala);
        bookList.add(book);
        book = new Book("Harivansh Rai Bachchan", "Madhushala", R.drawable.madhushala2);
        bookList.add(book);
        book = new Book("Ramdhari Singh Dinkar", "Rashmirathi", R.drawable.rashmirathi);
        bookList.add(book);
        book = new Book("Dharamvir Bharti", "Gunahon Ka Devta", R.drawable.gunahokedevta2);
        bookList.add(book);
        book = new Book("Munshi Premchand", "Shatranj Ke Khiladi", R.drawable.shatranj2);
        bookList.add(book);
        book = new Book("Bhisham Sahni", "Tamas", R.drawable.tamas);
        bookList.add(book);
        book = new Book("Dharamvir Bharti", "Suraj Ka Satva Ghoda", R.drawable.suraj);
        bookList.add(book);
        book = new Book("Munshi Premchand", "Karmabhumi", R.drawable.karmabhumi);
        bookList.add(book);
        book = new Book("Kashinath Singh", "Kassi Ka Assi", R.drawable.kashi_ka_assi);
        bookList.add(book);
        book = new Book("Bhagwati Charan Verma", "Chitralekha", R.drawable.chitralekha);
        bookList.add(book);

    }
}
