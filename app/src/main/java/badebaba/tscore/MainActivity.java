package badebaba.tscore;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.util.HashMap;

import badebaba.tscore.Tscore.Generic;
import badebaba.tscore.SMS.SmsActivity;
import badebaba.tscore.SMS.helper.PrefManager;


public class MainActivity extends AppCompatActivity {

    // BottomBar bottomBar;
    Context context;
    //Fragment fragment;
    int validation = 0;
    int region = 0;
    ProgressBar progressBar;
    private Toolbar toolbar;
    private PrefManager pref;
    private TextView name, email, mobile;
    //Intent intent = new Intent();

    public static void hideKeyboardFrom(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //   name = (TextView) findViewById(R.id.name);
        //   email = (TextView) findViewById(R.id.email);
        //  mobile = (TextView) findViewById(R.id.mobile);

        // enabling toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        pref = new PrefManager(getApplicationContext());

        context = getApplicationContext();
        // Checking if user session
        // if not logged in, take user to sms screen
        if (!pref.isLoggedIn()) {
            logout();
        }



        // Displaying user information from shared preferences

        HashMap<String, String> profile = pref.getUserDetails();

        //  name.setText("Name: " + profile.get("name"));
        // email.setText("Email: " + profile.get("email"));
        // mobile.setText("Mobile: " + profile.get("mobile"));


        findViewById(R.id.main).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                return false;
            }
        });


        initialisefragment(profile.get("name"));
    }

    public void initialisefragment(String name) {

        new AlertDialog.Builder(this).setTitle("Branch Details").setMessage("Hi " + name + ", This section contains a dropdown list so that you can choose" +
                "which region or branch you belong to").setPositiveButton("Proceed", null).show();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.contentContainer, new RegionActivity());
        // fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        // }


    }

    /**
     * Logging out user
     * will clear all user shared preferences and navigate to
     * sms activation screen
     */

    public void region(String item) {
        if (item == "Gorai")
            region = 1;
        else
            region = 0;
    }
    public void countprogress(int number) {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(3);
        progressBar.setProgress(number);
    }

    public void logout() {
        pref.clearSession();

        Intent intent = new Intent(MainActivity.this, SmsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);

        finish();
    }


    public int getRegion() {
        return region;
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
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("Developer : DrManhattan\nCopyright:Parshva Publication")
                    .show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void setbool(int n) {
        validation = n;

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("ALERT")
                .setMessage("You can not resend the data and go back")
                .setPositiveButton("OK", null)
                .show();
        //finish();
    }

}