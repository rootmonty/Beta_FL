package badebaba.tscore;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import badebaba.tscore.SMS.SmsActivity;
import badebaba.tscore.SMS.helper.PrefManager;
import badebaba.tscore.Tscore.Generic;

/**
 * Created by badebaba on 10/21/2016.
 */

public class RegionActivity extends Fragment {

    Button tv1, tv2;
    PrefManager prefManager;
    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.regionselecormain, container, false);


        (getActivity()).setTitle("Branch");

        tv1 = (Button) root.findViewById(R.id.yogi);

        tv2 = (Button) root.findViewById(R.id.gorai);

        View.OnClickListener clicklistener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).region("Gorai");
                tv1.setBackgroundResource(R.color.standardwhite);
                tv2.setBackgroundResource(R.color.colorPrimary);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(v.getContext());
                alertDialogBuilder.setTitle("Hello");
                alertDialogBuilder.setMessage("This activity contains the general feedback" +
                        "form.Please fill the respective form and submit and only then move" +
                        "to the next section" +
                        "\nclick below to the activity ");

                alertDialogBuilder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();


                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contentContainer, new Generic());
                // fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        };
        View.OnClickListener clicklistener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setBackgroundResource(R.color.standardwhite);
                tv1.setBackgroundResource(R.color.colorPrimary);
                //  Bundle bindle = new Bundle();
                //  Intent intent = new Intent(RegionActivity.this,MainActivity.class);
                //  bindle.putString("Region","Yogi");
                //  intent.putExtras(bindle);
                //
                //  startActivity(intent);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(v.getContext());
                alertDialogBuilder.setTitle("Hello");
                alertDialogBuilder.setMessage("This activity contains the general feedback" +
                        "form.Please fill the respective form and submit and only then move" +
                        "to the next section" +
                        "\nclick below to the activity ");

                alertDialogBuilder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();


                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contentContainer, new Generic());
                // fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        };

        tv1.setOnClickListener(clicklistener2);
        tv2.setOnClickListener(clicklistener1);


        return root;
    }
}
