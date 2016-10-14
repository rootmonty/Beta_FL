package badebaba.tscore;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import badebaba.tscore.Bruteforce.Generic;
import badebaba.tscore.SMS.SmsActivity;
import badebaba.tscore.SMS.helper.PrefManager;
import badebaba.tscore.Tscore.General;
import badebaba.tscore.Tscore.Staff;
import badebaba.tscore.Tscore.Teacher;


public class MainActivity extends AppCompatActivity {

    BottomBar bottomBar;
    Context context;
    private Toolbar toolbar;
    private PrefManager pref;
    private TextView name, email, mobile;
    //Fragment fragment;

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
       /*
        HashMap<String, String> profile = pref.getUserDetails();

        name.setText("Name: " + profile.get("name"));
        email.setText("Email: " + profile.get("email"));
        mobile.setText("Mobile: " + profile.get("mobile"));

        */

        findViewById(R.id.main).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                return false;
            }
        });
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
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("This activity contains the general feedback" +
                        "form.Please fill the respective form and submit and only then move" +
                        "to the next section" +
                        "\nclick below to the activity ");

                alertDialogBuilder.setPositiveButton("General Section", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();


                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                // fragment = new General();
                fragment = new Generic();
                break;
            case R.id.staff:
                AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(this);
                alertDialogBuilder1.setMessage("This activity contains the Staff feedback" +
                        "form.Please fill with unbiased opinion,the respective form and submit and only then move" +
                        "to the next section" +
                        "\nclick below to the activity ");

                alertDialogBuilder1.setPositiveButton("Staff Section", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();


                    }
                });
                AlertDialog alertDialog1 = alertDialogBuilder1.create();
                alertDialog1.show();
                fragment = new Staff();
                break;
            case R.id.teacher:
                AlertDialog.Builder alertDialogBuilder2 = new AlertDialog.Builder(this);
                alertDialogBuilder2.setMessage("This activity contains the teacher feedback" +
                        "form.Please fill the respective form.\n " +
                        "NOTE: Individual forms are needed to be submitted not all at once" +
                        "\nclick below to the activity ");

                alertDialogBuilder2.setPositiveButton("Teachers Section", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();


                    }
                });
                AlertDialog alertDialog2 = alertDialogBuilder2.create();
                alertDialog2.show();

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

    public void open(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("This activity contains the feedback options for general, staff and Teachers" +
                "click on yes to go to the activity and no to exit the app");

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "You clicked yes button", Toast.LENGTH_LONG).show();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}