package badebaba.tscore;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.HashMap;

import badebaba.tscore.SMS.SmsActivity;
import badebaba.tscore.SMS.helper.PrefManager;
import badebaba.tscore.Tscore.General;
import badebaba.tscore.Tscore.Staff;
import badebaba.tscore.Tscore.Teacher;


public class MainActivity extends AppCompatActivity {

    BottomBar bottomBar;
    private Toolbar toolbar;
    private PrefManager pref;
    private TextView name, email, mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //   name = (TextView) findViewById(R.id.name);
        //   email = (TextView) findViewById(R.id.email);
        //  mobile = (TextView) findViewById(R.id.mobile);

        // enabling toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        pref = new PrefManager(getApplicationContext());


        // Checking if user session
        // if not logged in, take user to sms screen
       /* if (!pref.isLoggedIn()) {
            logout();
        }
        */

        // Displaying user information from shared preferences
       /*
        HashMap<String, String> profile = pref.getUserDetails();

        name.setText("Name: " + profile.get("name"));
        email.setText("Email: " + profile.get("email"));
        mobile.setText("Mobile: " + profile.get("mobile"));

        */

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.general) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    initialisefragment(tabId);
                } else if (tabId == R.id.staff) {
                    initialisefragment(tabId);

                } else {
                    initialisefragment(tabId);

                }
            }
        });
    }

    public void initialisefragment(int tabId) {
        Fragment fragment = null;
        switch (tabId) {
            case R.id.general:
                fragment = new General();
                break;
            case R.id.staff:
                fragment = new Staff();
                break;
            case R.id.teacher:
                fragment = new Teacher();
                break;
            default:
                break;
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contentContainer, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }


    }


    /**
     * Logging out user
     * will clear all user shared preferences and navigate to
     * sms activation screen
     */
    private void logout() {
        pref.clearSession();

        Intent intent = new Intent(MainActivity.this, SmsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);

        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {
            logout();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}