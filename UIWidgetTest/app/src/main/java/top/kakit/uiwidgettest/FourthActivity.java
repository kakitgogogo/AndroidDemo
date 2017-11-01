package top.kakit.uiwidgettest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FourthActivity extends AppCompatActivity {

    private String[] data = {"Apple", "Banana", "Orange", "Watermelon",
                                "Pear", "Grape", "Pineapple", "Cherry", "Mango",
                                "Apple", "Banana", "Orange", "Watermelon",
                                "Pear", "Grape", "Pineapple", "Cherry", "Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_layout);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FourthActivity.this, android.R.layout.simple_list_item_1, data);
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

        final List<Fruit> fruitList = new ArrayList<>();
        for(int i = 0; i < data.length; ++i) {
            Fruit fruit = new Fruit(data[i], R.drawable.fruit);
            fruitList.add(fruit);
        }

        FruitAdapter adapter = new FruitAdapter(FourthActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(FourthActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
