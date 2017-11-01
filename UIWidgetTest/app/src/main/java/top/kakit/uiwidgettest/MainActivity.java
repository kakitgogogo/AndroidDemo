package top.kakit.uiwidgettest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.image_view);
        Button buttonProc = (Button)findViewById(R.id.button_proc);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);

        button.setOnClickListener(this);
        buttonProc.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                if(inputText.equals("")) {
                    Intent intent = new Intent("top.kakit.uiwidgettest.ACTION_ONE");
                    intent.addCategory("top.kakit.uiwidgettest.CATEGORY_ONE");
                    startActivity(intent);
                }
                break;
            case R.id.image_view:
                int num = (int)(Math.random() * 3);
                if(num > 0)
                    imageView.setImageResource(R.drawable.img_2);
                else
                    imageView.setImageResource(R.drawable.img_1);
                break;
            case R.id.button_proc:
                int proc = progressBar.getProgress() + 10;
                if(proc > 100) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Full!");
                    dialog.setMessage("BaGa!");
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.show();
                    proc = 0;
                }
                progressBar.setProgress(proc);
                break;
            default:
                break;
        }
    }
}
