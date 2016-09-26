package badebaba.tscore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import badebaba.tscore.SMS.SmsActivity;

/**
 * Created by badebaba on 9/25/2016.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, SmsActivity.class);
        startActivity(intent);
        finish();
    }
}