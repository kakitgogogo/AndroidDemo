package top.kakit.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        String errorContent = getIntent().getStringExtra("error_content");
        TextView errorText = (TextView)findViewById(R.id.error_text);
        errorText.setText(errorContent);
    }
}
