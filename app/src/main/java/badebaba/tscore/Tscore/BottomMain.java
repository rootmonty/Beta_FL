package badebaba.tscore.Tscore;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import badebaba.tscore.R;


/**
 * Created by badebaba on 9/18/2016.
 */
public class BottomMain extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_developer:
                Toast.makeText(getApplicationContext(), "Architected By DrManhattan", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_logout:
                // mauth.signOut();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
