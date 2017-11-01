package top.kakit.contentprovider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    List<String> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        bookList = getIntent().getStringArrayListExtra("book_list");

        ListView listView = (ListView)findViewById(R.id.book_list);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bookList);
        listView.setAdapter(adapter);
    }
}
