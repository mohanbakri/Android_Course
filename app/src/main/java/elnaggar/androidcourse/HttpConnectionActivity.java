package elnaggar.androidcourse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HttpConnectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_connection);
    }
    public void onClick(View view) {
        httpTask httpTask=new httpTask(this);
        httpTask.execute("https://api.github.com/users/3bdoelnaggar");

    }
}