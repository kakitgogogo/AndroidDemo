package top.kakit.chatui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MsgContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_content);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");

        TextView textView = (TextView) findViewById(R.id.msg_content);
        textView.setText(msg);
    }
}
