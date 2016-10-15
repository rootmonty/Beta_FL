package badebaba.tscore.Tscore;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import badebaba.tscore.Bruteforce.Dbobj;
import badebaba.tscore.R;
import badebaba.tscore.SMS.helper.PrefManager;
import badebaba.tscore.Tscore.Staff;

/**
 * Created by badebaba on 10/7/2016.
 */

public class Generic extends Fragment {

    TextView tv1, tv2, tv3, tv4, tv5;
    TextView tv21, tv22, tv23, tv24, tv25;
    TextView tv31, tv32, tv33, tv34, tv35;
    TextView tv41, tv42, tv43, tv44, tv45;
    TextView tv51, tv52, tv53, tv54, tv55;
    TextView tv61, tv62, tv63, tv64, tv65;
    TextView tv71, tv72, tv73, tv74, tv75;
    TextView tv81, tv82, tv83, tv84, tv85;
    TextView tv91, tv92, tv93, tv94, tv95;
    TextView tv101, tv102, tv103, tv104, tv105;
    TextView tv111, tv112, tv113, tv114, tv115;
    TextView tv121, tv122, tv123, tv124, tv125;
    TextView tv131, tv132, tv133, tv134, tv135;
    TextView tv141, tv142, tv143, tv144, tv145;
    TextView tv151, tv152, tv153, tv154, tv155;
    TextView tv161, tv162, tv163, tv164, tv165;
    TextView tv171, tv172, tv173, tv174, tv175;

    EditText comment;
    Button submit;
    //Database starts
    Dbobj db = new Dbobj();
    Firebase mref;
    PrefManager pref;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View itemView = inflater.inflate(R.layout.testing_genericlayout, container, false);
        //counter = (LinearLayout) itemView.findViewById(R.id.tv_counter);
        //ques = (TextView) itemView.findViewById(R.id.setQuestion);
        pref = new PrefManager(itemView.getContext());
        mref = new Firebase("https://tscore-c9523.firebaseio.com/General");
        tv1 = (TextView) itemView.findViewById(R.id.one);
        tv2 = (TextView) itemView.findViewById(R.id.two);
        tv3 = (TextView) itemView.findViewById(R.id.three);
        tv4 = (TextView) itemView.findViewById(R.id.four);
        tv5 = (TextView) itemView.findViewById(R.id.five);
        tv21 = (TextView) itemView.findViewById(R.id.one2);
        tv22 = (TextView) itemView.findViewById(R.id.two2);
        tv23 = (TextView) itemView.findViewById(R.id.three2);
        tv24 = (TextView) itemView.findViewById(R.id.four2);
        tv25 = (TextView) itemView.findViewById(R.id.five2);
        tv31 = (TextView) itemView.findViewById(R.id.one3);
        tv32 = (TextView) itemView.findViewById(R.id.two3);
        tv33 = (TextView) itemView.findViewById(R.id.three3);
        tv34 = (TextView) itemView.findViewById(R.id.four3);
        tv35 = (TextView) itemView.findViewById(R.id.five3);
        tv41 = (TextView) itemView.findViewById(R.id.one4);
        tv42 = (TextView) itemView.findViewById(R.id.two4);
        tv43 = (TextView) itemView.findViewById(R.id.three4);
        tv44 = (TextView) itemView.findViewById(R.id.four4);
        tv45 = (TextView) itemView.findViewById(R.id.five4);
        tv51 = (TextView) itemView.findViewById(R.id.one5);
        tv52 = (TextView) itemView.findViewById(R.id.two5);
        tv53 = (TextView) itemView.findViewById(R.id.three5);
        tv54 = (TextView) itemView.findViewById(R.id.four5);
        tv55 = (TextView) itemView.findViewById(R.id.five5);
        tv61 = (TextView) itemView.findViewById(R.id.one6);
        tv62 = (TextView) itemView.findViewById(R.id.two6);
        tv63 = (TextView) itemView.findViewById(R.id.three6);
        tv64 = (TextView) itemView.findViewById(R.id.four6);
        tv65 = (TextView) itemView.findViewById(R.id.five6);
        tv71 = (TextView) itemView.findViewById(R.id.one7);
        tv72 = (TextView) itemView.findViewById(R.id.two7);
        tv73 = (TextView) itemView.findViewById(R.id.three7);
        tv74 = (TextView) itemView.findViewById(R.id.four7);
        tv75 = (TextView) itemView.findViewById(R.id.five7);
        tv81 = (TextView) itemView.findViewById(R.id.one8);
        tv82 = (TextView) itemView.findViewById(R.id.two8);
        tv83 = (TextView) itemView.findViewById(R.id.three8);
        tv84 = (TextView) itemView.findViewById(R.id.four8);
        tv85 = (TextView) itemView.findViewById(R.id.five8);
        tv91 = (TextView) itemView.findViewById(R.id.one9);
        tv92 = (TextView) itemView.findViewById(R.id.two9);
        tv93 = (TextView) itemView.findViewById(R.id.three9);
        tv94 = (TextView) itemView.findViewById(R.id.four9);
        tv95 = (TextView) itemView.findViewById(R.id.five9);
        tv101 = (TextView) itemView.findViewById(R.id.one10);
        tv102 = (TextView) itemView.findViewById(R.id.two10);
        tv103 = (TextView) itemView.findViewById(R.id.three10);
        tv104 = (TextView) itemView.findViewById(R.id.four10);
        tv105 = (TextView) itemView.findViewById(R.id.five10);
        tv111 = (TextView) itemView.findViewById(R.id.one11);
        tv112 = (TextView) itemView.findViewById(R.id.two11);
        tv113 = (TextView) itemView.findViewById(R.id.three11);
        tv114 = (TextView) itemView.findViewById(R.id.four11);
        tv115 = (TextView) itemView.findViewById(R.id.five11);
        tv121 = (TextView) itemView.findViewById(R.id.one12);
        tv122 = (TextView) itemView.findViewById(R.id.two12);
        tv123 = (TextView) itemView.findViewById(R.id.three12);
        tv124 = (TextView) itemView.findViewById(R.id.four12);
        tv125 = (TextView) itemView.findViewById(R.id.five12);
        tv131 = (TextView) itemView.findViewById(R.id.one13);
        tv132 = (TextView) itemView.findViewById(R.id.two13);
        tv133 = (TextView) itemView.findViewById(R.id.three13);
        tv134 = (TextView) itemView.findViewById(R.id.four13);
        tv135 = (TextView) itemView.findViewById(R.id.five13);
        tv141 = (TextView) itemView.findViewById(R.id.one14);
        tv142 = (TextView) itemView.findViewById(R.id.two14);
        tv143 = (TextView) itemView.findViewById(R.id.three14);
        tv144 = (TextView) itemView.findViewById(R.id.four14);
        tv145 = (TextView) itemView.findViewById(R.id.five14);
        tv151 = (TextView) itemView.findViewById(R.id.one15);
        tv152 = (TextView) itemView.findViewById(R.id.two15);
        tv153 = (TextView) itemView.findViewById(R.id.three15);
        tv154 = (TextView) itemView.findViewById(R.id.four15);
        tv155 = (TextView) itemView.findViewById(R.id.five15);
        tv161 = (TextView) itemView.findViewById(R.id.one16);
        tv162 = (TextView) itemView.findViewById(R.id.two16);
        tv163 = (TextView) itemView.findViewById(R.id.three16);
        tv164 = (TextView) itemView.findViewById(R.id.four16);
        tv165 = (TextView) itemView.findViewById(R.id.five16);
        tv171 = (TextView) itemView.findViewById(R.id.one17);
        tv172 = (TextView) itemView.findViewById(R.id.two17);
        tv173 = (TextView) itemView.findViewById(R.id.three17);
        tv174 = (TextView) itemView.findViewById(R.id.four17);
        tv175 = (TextView) itemView.findViewById(R.id.five17);

        comment = (EditText) itemView.findViewById(R.id.comment);
        submit = (Button) itemView.findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.setEdt(comment.getText().toString());

                Log.i("The database:", db.toString() + "");

                new AlertDialog.Builder(v.getContext())
                        .setMessage("Sure to move to another form")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                                // Toast.makeText(getContext(), "Your submission is done,go to another activity and submit", Toast.LENGTH_LONG).show();
                                mref.push().child(pref.getMobileNumber()).push().setValue(db);
                                tv1.setBackgroundResource(R.color.standardwhite);
                                tv2.setBackgroundResource(R.color.standardwhite);
                                tv3.setBackgroundResource(R.color.standardwhite);
                                tv4.setBackgroundResource(R.color.standardwhite);
                                tv5.setBackgroundResource(R.color.standardwhite);
                                tv21.setBackgroundResource(R.color.standardwhite);
                                tv22.setBackgroundResource(R.color.standardwhite);
                                tv23.setBackgroundResource(R.color.standardwhite);
                                tv24.setBackgroundResource(R.color.standardwhite);
                                tv25.setBackgroundResource(R.color.standardwhite);
                                tv31.setBackgroundResource(R.color.standardwhite);
                                tv32.setBackgroundResource(R.color.standardwhite);
                                tv33.setBackgroundResource(R.color.standardwhite);
                                tv34.setBackgroundResource(R.color.standardwhite);
                                tv35.setBackgroundResource(R.color.standardwhite);
                                tv41.setBackgroundResource(R.color.standardwhite);
                                tv42.setBackgroundResource(R.color.standardwhite);
                                tv43.setBackgroundResource(R.color.standardwhite);
                                tv44.setBackgroundResource(R.color.standardwhite);
                                tv45.setBackgroundResource(R.color.standardwhite);
                                tv51.setBackgroundResource(R.color.standardwhite);
                                tv52.setBackgroundResource(R.color.standardwhite);
                                tv53.setBackgroundResource(R.color.standardwhite);
                                tv54.setBackgroundResource(R.color.standardwhite);
                                tv55.setBackgroundResource(R.color.standardwhite);
                                tv61.setBackgroundResource(R.color.standardwhite);
                                tv62.setBackgroundResource(R.color.standardwhite);
                                tv63.setBackgroundResource(R.color.standardwhite);
                                tv64.setBackgroundResource(R.color.standardwhite);
                                tv65.setBackgroundResource(R.color.standardwhite);
                                tv71.setBackgroundResource(R.color.standardwhite);
                                tv72.setBackgroundResource(R.color.standardwhite);
                                tv73.setBackgroundResource(R.color.standardwhite);
                                tv74.setBackgroundResource(R.color.standardwhite);
                                tv75.setBackgroundResource(R.color.standardwhite);
                                tv81.setBackgroundResource(R.color.standardwhite);
                                tv82.setBackgroundResource(R.color.standardwhite);
                                tv83.setBackgroundResource(R.color.standardwhite);
                                tv84.setBackgroundResource(R.color.standardwhite);
                                tv85.setBackgroundResource(R.color.standardwhite);
                                tv91.setBackgroundResource(R.color.standardwhite);
                                tv92.setBackgroundResource(R.color.standardwhite);
                                tv93.setBackgroundResource(R.color.standardwhite);
                                tv94.setBackgroundResource(R.color.standardwhite);
                                tv95.setBackgroundResource(R.color.standardwhite);
                                tv101.setBackgroundResource(R.color.standardwhite);
                                tv102.setBackgroundResource(R.color.standardwhite);
                                tv103.setBackgroundResource(R.color.standardwhite);
                                tv104.setBackgroundResource(R.color.standardwhite);
                                tv105.setBackgroundResource(R.color.standardwhite);
                                tv111.setBackgroundResource(R.color.standardwhite);
                                tv112.setBackgroundResource(R.color.standardwhite);
                                tv113.setBackgroundResource(R.color.standardwhite);
                                tv114.setBackgroundResource(R.color.standardwhite);
                                tv115.setBackgroundResource(R.color.standardwhite);
                                tv121.setBackgroundResource(R.color.standardwhite);
                                tv122.setBackgroundResource(R.color.standardwhite);
                                tv123.setBackgroundResource(R.color.standardwhite);
                                tv124.setBackgroundResource(R.color.standardwhite);
                                tv125.setBackgroundResource(R.color.standardwhite);
                                tv131.setBackgroundResource(R.color.standardwhite);
                                tv132.setBackgroundResource(R.color.standardwhite);
                                tv133.setBackgroundResource(R.color.standardwhite);
                                tv134.setBackgroundResource(R.color.standardwhite);
                                tv135.setBackgroundResource(R.color.standardwhite);
                                tv141.setBackgroundResource(R.color.standardwhite);
                                tv142.setBackgroundResource(R.color.standardwhite);
                                tv143.setBackgroundResource(R.color.standardwhite);
                                tv144.setBackgroundResource(R.color.standardwhite);
                                tv145.setBackgroundResource(R.color.standardwhite);
                                tv151.setBackgroundResource(R.color.standardwhite);
                                tv152.setBackgroundResource(R.color.standardwhite);
                                tv153.setBackgroundResource(R.color.standardwhite);
                                tv154.setBackgroundResource(R.color.standardwhite);
                                tv155.setBackgroundResource(R.color.standardwhite);
                                tv161.setBackgroundResource(R.color.standardwhite);
                                tv162.setBackgroundResource(R.color.standardwhite);
                                tv163.setBackgroundResource(R.color.standardwhite);
                                tv164.setBackgroundResource(R.color.standardwhite);
                                tv165.setBackgroundResource(R.color.standardwhite);
                                tv171.setBackgroundResource(R.color.standardwhite);
                                tv172.setBackgroundResource(R.color.standardwhite);
                                tv173.setBackgroundResource(R.color.standardwhite);
                                tv174.setBackgroundResource(R.color.standardwhite);
                                tv175.setBackgroundResource(R.color.standardwhite);
                                FragmentManager fragmentManager = getFragmentManager();
                                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.contentContainer, new Staff()).addToBackStack(null).commit();
                            }
                        })
                        .setNegativeButton("NO", null)
                        .create().show();
                //Toast.makeText(v.getContext(), "Your submission is done,go to another activity and submit", Toast.LENGTH_LONG).show();

            }
        });
        View.OnClickListener clicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one:
                        if (tv4.getBackground() != null || tv2.getBackground() != null || tv3.getBackground() != null
                                || tv5.getBackground() != null) {
                            tv4.setBackgroundResource(R.color.standardwhite);
                            tv2.setBackgroundResource(R.color.standardwhite);
                            tv3.setBackgroundResource(R.color.standardwhite);
                            tv5.setBackgroundResource(R.color.standardwhite);
                        }


                        tv1.setBackgroundResource(R.drawable.fill);
                        db.setA1("1");
                        break;
                    case R.id.two:
                        if (tv4.getBackground() != null || tv1.getBackground() != null || tv3.getBackground() != null
                                || tv5.getBackground() != null) {
                            tv4.setBackgroundResource(R.color.standardwhite);
                            tv1.setBackgroundResource(R.color.standardwhite);
                            tv3.setBackgroundResource(R.color.standardwhite);
                            tv5.setBackgroundResource(R.color.standardwhite);
                        }

                        tv2.setBackgroundResource(R.drawable.fill);
                        db.setA1("2");
                        break;
                    case R.id.three:
                        if (tv1.getBackground() != null || tv2.getBackground() != null || tv4.getBackground() != null
                                || tv5.getBackground() != null) {
                            tv1.setBackgroundResource(R.color.standardwhite);
                            tv2.setBackgroundResource(R.color.standardwhite);
                            tv4.setBackgroundResource(R.color.standardwhite);
                            tv5.setBackgroundResource(R.color.standardwhite);
                        }

                        tv3.setBackgroundResource(R.drawable.fill);
                        db.setA1("3");
                        break;
                    case R.id.four:
                        if (tv1.getBackground() != null || tv2.getBackground() != null || tv3.getBackground() != null
                                || tv5.getBackground() != null) {
                            tv1.setBackgroundResource(R.color.standardwhite);
                            tv2.setBackgroundResource(R.color.standardwhite);
                            tv3.setBackgroundResource(R.color.standardwhite);
                            tv5.setBackgroundResource(R.color.standardwhite);
                        }

                        tv4.setBackgroundResource(R.drawable.fill);
                        db.setA1("4");
                        break;
                    case R.id.five:
                        if (tv4.getBackground() != null || tv2.getBackground() != null || tv3.getBackground() != null
                                || tv1.getBackground() != null) {
                            tv1.setBackgroundResource(R.color.standardwhite);
                            tv2.setBackgroundResource(R.color.standardwhite);
                            tv3.setBackgroundResource(R.color.standardwhite);
                            tv4.setBackgroundResource(R.color.standardwhite);
                        }

                        tv5.setBackgroundResource(R.drawable.fill);
                        db.setA1("5");
                        break;
                    default:
                        db.setA1("0");
                        break;
                }
                Toast.makeText(view.getContext(), "Rating set : " + db.getA1(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener16 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one17:
                        if (tv174.getBackground() != null || tv172.getBackground() != null || tv173.getBackground() != null
                                || tv175.getBackground() != null) {
                            tv174.setBackgroundResource(R.color.standardwhite);
                            tv172.setBackgroundResource(R.color.standardwhite);
                            tv173.setBackgroundResource(R.color.standardwhite);
                            tv175.setBackgroundResource(R.color.standardwhite);
                        }


                        tv171.setBackgroundResource(R.drawable.fill);
                        db.setA17("1");
                        break;
                    case R.id.two17:
                        if (tv174.getBackground() != null || tv171.getBackground() != null || tv173.getBackground() != null
                                || tv175.getBackground() != null) {
                            tv174.setBackgroundResource(R.color.standardwhite);
                            tv171.setBackgroundResource(R.color.standardwhite);
                            tv173.setBackgroundResource(R.color.standardwhite);
                            tv175.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA17("2");
                        tv172.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three17:
                        if (tv171.getBackground() != null || tv172.getBackground() != null || tv174.getBackground() != null
                                || tv175.getBackground() != null) {
                            tv171.setBackgroundResource(R.color.standardwhite);
                            tv172.setBackgroundResource(R.color.standardwhite);
                            tv174.setBackgroundResource(R.color.standardwhite);
                            tv175.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA17("3");
                        tv173.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four17:
                        if (tv171.getBackground() != null || tv172.getBackground() != null || tv173.getBackground() != null
                                || tv175.getBackground() != null) {
                            tv171.setBackgroundResource(R.color.standardwhite);
                            tv172.setBackgroundResource(R.color.standardwhite);
                            tv173.setBackgroundResource(R.color.standardwhite);
                            tv175.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA17("4");
                        tv174.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five17:
                        if (tv174.getBackground() != null || tv172.getBackground() != null || tv173.getBackground() != null
                                || tv171.getBackground() != null) {
                            tv171.setBackgroundResource(R.color.standardwhite);
                            tv172.setBackgroundResource(R.color.standardwhite);
                            tv173.setBackgroundResource(R.color.standardwhite);
                            tv174.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA17("5");
                        tv175.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA17("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener15 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one16:
                        if (tv164.getBackground() != null || tv162.getBackground() != null || tv163.getBackground() != null
                                || tv165.getBackground() != null) {
                            tv164.setBackgroundResource(R.color.standardwhite);
                            tv162.setBackgroundResource(R.color.standardwhite);
                            tv163.setBackgroundResource(R.color.standardwhite);
                            tv165.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA16("1");
                        tv161.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two16:
                        if (tv164.getBackground() != null || tv161.getBackground() != null || tv163.getBackground() != null
                                || tv165.getBackground() != null) {
                            tv164.setBackgroundResource(R.color.standardwhite);
                            tv161.setBackgroundResource(R.color.standardwhite);
                            tv163.setBackgroundResource(R.color.standardwhite);
                            tv165.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA16("2");
                        tv162.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three16:
                        if (tv161.getBackground() != null || tv162.getBackground() != null || tv164.getBackground() != null
                                || tv165.getBackground() != null) {
                            tv161.setBackgroundResource(R.color.standardwhite);
                            tv162.setBackgroundResource(R.color.standardwhite);
                            tv164.setBackgroundResource(R.color.standardwhite);
                            tv165.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA16("3");
                        tv163.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four16:
                        if (tv161.getBackground() != null || tv162.getBackground() != null || tv163.getBackground() != null
                                || tv165.getBackground() != null) {
                            tv161.setBackgroundResource(R.color.standardwhite);
                            tv162.setBackgroundResource(R.color.standardwhite);
                            tv163.setBackgroundResource(R.color.standardwhite);
                            tv165.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA16("4");
                        tv164.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five16:
                        if (tv164.getBackground() != null || tv162.getBackground() != null || tv163.getBackground() != null
                                || tv161.getBackground() != null) {
                            tv161.setBackgroundResource(R.color.standardwhite);
                            tv162.setBackgroundResource(R.color.standardwhite);
                            tv163.setBackgroundResource(R.color.standardwhite);
                            tv164.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA16("5");
                        tv165.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA16("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener14 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one15:
                        if (tv154.getBackground() != null || tv152.getBackground() != null || tv153.getBackground() != null
                                || tv155.getBackground() != null) {
                            tv154.setBackgroundResource(R.color.standardwhite);
                            tv152.setBackgroundResource(R.color.standardwhite);
                            tv153.setBackgroundResource(R.color.standardwhite);
                            tv155.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA15("1");
                        tv151.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two15:
                        if (tv154.getBackground() != null || tv151.getBackground() != null || tv153.getBackground() != null
                                || tv155.getBackground() != null) {
                            tv154.setBackgroundResource(R.color.standardwhite);
                            tv151.setBackgroundResource(R.color.standardwhite);
                            tv153.setBackgroundResource(R.color.standardwhite);
                            tv155.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA15("2");
                        tv152.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three15:
                        if (tv151.getBackground() != null || tv152.getBackground() != null || tv154.getBackground() != null
                                || tv155.getBackground() != null) {
                            tv151.setBackgroundResource(R.color.standardwhite);
                            tv152.setBackgroundResource(R.color.standardwhite);
                            tv154.setBackgroundResource(R.color.standardwhite);
                            tv155.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA15("3");
                        tv153.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four15:
                        if (tv151.getBackground() != null || tv152.getBackground() != null || tv153.getBackground() != null
                                || tv155.getBackground() != null) {
                            tv151.setBackgroundResource(R.color.standardwhite);
                            tv152.setBackgroundResource(R.color.standardwhite);
                            tv153.setBackgroundResource(R.color.standardwhite);
                            tv155.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA15("4");
                        tv154.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five15:
                        if (tv154.getBackground() != null || tv152.getBackground() != null || tv153.getBackground() != null
                                || tv151.getBackground() != null) {
                            tv151.setBackgroundResource(R.color.standardwhite);
                            tv152.setBackgroundResource(R.color.standardwhite);
                            tv153.setBackgroundResource(R.color.standardwhite);
                            tv154.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA15("5");
                        tv155.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA15("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener13 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one14:
                        if (tv144.getBackground() != null || tv142.getBackground() != null || tv143.getBackground() != null
                                || tv145.getBackground() != null) {
                            tv144.setBackgroundResource(R.color.standardwhite);
                            tv142.setBackgroundResource(R.color.standardwhite);
                            tv143.setBackgroundResource(R.color.standardwhite);
                            tv145.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA14("1");
                        tv141.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two14:
                        if (tv144.getBackground() != null || tv141.getBackground() != null || tv143.getBackground() != null
                                || tv145.getBackground() != null) {
                            tv144.setBackgroundResource(R.color.standardwhite);
                            tv141.setBackgroundResource(R.color.standardwhite);
                            tv143.setBackgroundResource(R.color.standardwhite);
                            tv145.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA14("2");
                        tv142.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three14:
                        if (tv141.getBackground() != null || tv142.getBackground() != null || tv144.getBackground() != null
                                || tv145.getBackground() != null) {
                            tv141.setBackgroundResource(R.color.standardwhite);
                            tv142.setBackgroundResource(R.color.standardwhite);
                            tv144.setBackgroundResource(R.color.standardwhite);
                            tv145.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA14("3");
                        tv143.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four14:
                        if (tv141.getBackground() != null || tv142.getBackground() != null || tv143.getBackground() != null
                                || tv145.getBackground() != null) {
                            tv141.setBackgroundResource(R.color.standardwhite);
                            tv142.setBackgroundResource(R.color.standardwhite);
                            tv143.setBackgroundResource(R.color.standardwhite);
                            tv145.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA14("4");
                        tv144.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five14:
                        if (tv144.getBackground() != null || tv142.getBackground() != null || tv143.getBackground() != null
                                || tv141.getBackground() != null) {
                            tv141.setBackgroundResource(R.color.standardwhite);
                            tv142.setBackgroundResource(R.color.standardwhite);
                            tv143.setBackgroundResource(R.color.standardwhite);
                            tv144.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA14("5");
                        tv145.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA14("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener12 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one13:
                        if (tv134.getBackground() != null || tv132.getBackground() != null || tv133.getBackground() != null
                                || tv135.getBackground() != null) {
                            tv134.setBackgroundResource(R.color.standardwhite);
                            tv132.setBackgroundResource(R.color.standardwhite);
                            tv133.setBackgroundResource(R.color.standardwhite);
                            tv135.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA13("1");
                        tv131.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two13:
                        if (tv134.getBackground() != null || tv131.getBackground() != null || tv133.getBackground() != null
                                || tv135.getBackground() != null) {
                            tv134.setBackgroundResource(R.color.standardwhite);
                            tv131.setBackgroundResource(R.color.standardwhite);
                            tv133.setBackgroundResource(R.color.standardwhite);
                            tv135.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA13("2");
                        tv132.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three13:
                        if (tv131.getBackground() != null || tv132.getBackground() != null || tv134.getBackground() != null
                                || tv135.getBackground() != null) {
                            tv131.setBackgroundResource(R.color.standardwhite);
                            tv132.setBackgroundResource(R.color.standardwhite);
                            tv134.setBackgroundResource(R.color.standardwhite);
                            tv135.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA13("3");
                        tv133.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four13:
                        if (tv131.getBackground() != null || tv132.getBackground() != null || tv133.getBackground() != null
                                || tv135.getBackground() != null) {
                            tv131.setBackgroundResource(R.color.standardwhite);
                            tv132.setBackgroundResource(R.color.standardwhite);
                            tv133.setBackgroundResource(R.color.standardwhite);
                            tv135.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA13("2");
                        tv134.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five13:
                        if (tv134.getBackground() != null || tv132.getBackground() != null || tv133.getBackground() != null
                                || tv131.getBackground() != null) {
                            tv131.setBackgroundResource(R.color.standardwhite);
                            tv132.setBackgroundResource(R.color.standardwhite);
                            tv133.setBackgroundResource(R.color.standardwhite);
                            tv134.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA13("5");
                        tv135.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA13("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener11 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one12:
                        if (tv124.getBackground() != null || tv122.getBackground() != null || tv123.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv124.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA12("1");
                        tv121.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two12:
                        if (tv124.getBackground() != null || tv121.getBackground() != null || tv123.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv124.setBackgroundResource(R.color.standardwhite);
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA12("2");
                        tv122.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three12:
                        if (tv121.getBackground() != null || tv122.getBackground() != null || tv124.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv124.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA12("3");
                        tv123.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four12:
                        if (tv121.getBackground() != null || tv122.getBackground() != null || tv123.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA12("4");
                        tv124.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five12:
                        if (tv124.getBackground() != null || tv122.getBackground() != null || tv123.getBackground() != null
                                || tv121.getBackground() != null) {
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv124.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA12("5");
                        tv125.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA12("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener10 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one11:
                        if (tv114.getBackground() != null || tv112.getBackground() != null || tv113.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv114.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA11("1");
                        tv111.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two11:
                        if (tv114.getBackground() != null || tv111.getBackground() != null || tv113.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv114.setBackgroundResource(R.color.standardwhite);
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA11("2");
                        tv112.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three11:
                        if (tv111.getBackground() != null || tv112.getBackground() != null || tv114.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv114.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA11("3");
                        tv113.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four11:
                        if (tv111.getBackground() != null || tv112.getBackground() != null || tv113.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA11("4");
                        tv114.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five11:
                        if (tv114.getBackground() != null || tv112.getBackground() != null || tv113.getBackground() != null
                                || tv111.getBackground() != null) {
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv114.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA11("5");
                        tv115.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA11("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one10:
                        if (tv104.getBackground() != null || tv102.getBackground() != null || tv103.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv104.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA10("1");
                        tv101.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two10:
                        if (tv104.getBackground() != null || tv101.getBackground() != null || tv103.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv104.setBackgroundResource(R.color.standardwhite);
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA10("2");
                        tv102.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three10:
                        if (tv101.getBackground() != null || tv102.getBackground() != null || tv104.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv104.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA10("3");
                        tv103.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four10:
                        if (tv101.getBackground() != null || tv102.getBackground() != null || tv103.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA10("4");
                        tv104.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five10:
                        if (tv104.getBackground() != null || tv102.getBackground() != null || tv103.getBackground() != null
                                || tv101.getBackground() != null) {
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv104.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA10("5");
                        tv105.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA10("0");
                        break;


                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one9:
                        if (tv94.getBackground() != null || tv92.getBackground() != null || tv93.getBackground() != null
                                || tv95.getBackground() != null) {
                            tv94.setBackgroundResource(R.color.standardwhite);
                            tv92.setBackgroundResource(R.color.standardwhite);
                            tv93.setBackgroundResource(R.color.standardwhite);
                            tv95.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA9("1");

                        tv91.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two9:
                        if (tv94.getBackground() != null || tv91.getBackground() != null || tv93.getBackground() != null
                                || tv95.getBackground() != null) {
                            tv94.setBackgroundResource(R.color.standardwhite);
                            tv91.setBackgroundResource(R.color.standardwhite);
                            tv93.setBackgroundResource(R.color.standardwhite);
                            tv95.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA9("2");

                        tv92.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three9:
                        if (tv91.getBackground() != null || tv92.getBackground() != null || tv94.getBackground() != null
                                || tv95.getBackground() != null) {
                            tv91.setBackgroundResource(R.color.standardwhite);
                            tv92.setBackgroundResource(R.color.standardwhite);
                            tv94.setBackgroundResource(R.color.standardwhite);
                            tv95.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA9("3");

                        tv93.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four9:
                        if (tv91.getBackground() != null || tv92.getBackground() != null || tv93.getBackground() != null
                                || tv95.getBackground() != null) {
                            tv91.setBackgroundResource(R.color.standardwhite);
                            tv92.setBackgroundResource(R.color.standardwhite);
                            tv93.setBackgroundResource(R.color.standardwhite);
                            tv95.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA9("4");

                        tv94.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five9:
                        if (tv94.getBackground() != null || tv92.getBackground() != null || tv93.getBackground() != null
                                || tv91.getBackground() != null) {
                            tv91.setBackgroundResource(R.color.standardwhite);
                            tv92.setBackgroundResource(R.color.standardwhite);
                            tv93.setBackgroundResource(R.color.standardwhite);
                            tv94.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA9("5");

                        tv95.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA9("0");
                        break;
                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one8:
                        if (tv84.getBackground() != null || tv82.getBackground() != null || tv83.getBackground() != null
                                || tv85.getBackground() != null) {
                            tv84.setBackgroundResource(R.color.standardwhite);
                            tv82.setBackgroundResource(R.color.standardwhite);
                            tv83.setBackgroundResource(R.color.standardwhite);
                            tv85.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA8("1");

                        tv81.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two8:
                        if (tv84.getBackground() != null || tv81.getBackground() != null || tv83.getBackground() != null
                                || tv85.getBackground() != null) {
                            tv84.setBackgroundResource(R.color.standardwhite);
                            tv81.setBackgroundResource(R.color.standardwhite);
                            tv83.setBackgroundResource(R.color.standardwhite);
                            tv85.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA8("2");

                        tv82.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three8:
                        if (tv81.getBackground() != null || tv82.getBackground() != null || tv84.getBackground() != null
                                || tv85.getBackground() != null) {
                            tv81.setBackgroundResource(R.color.standardwhite);
                            tv82.setBackgroundResource(R.color.standardwhite);
                            tv84.setBackgroundResource(R.color.standardwhite);
                            tv85.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA8("3");

                        tv83.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four8:
                        if (tv81.getBackground() != null || tv82.getBackground() != null || tv83.getBackground() != null
                                || tv85.getBackground() != null) {
                            tv81.setBackgroundResource(R.color.standardwhite);
                            tv82.setBackgroundResource(R.color.standardwhite);
                            tv83.setBackgroundResource(R.color.standardwhite);
                            tv85.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA8("4");

                        tv84.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five8:
                        if (tv84.getBackground() != null || tv82.getBackground() != null || tv83.getBackground() != null
                                || tv81.getBackground() != null) {
                            tv81.setBackgroundResource(R.color.standardwhite);
                            tv82.setBackgroundResource(R.color.standardwhite);
                            tv83.setBackgroundResource(R.color.standardwhite);
                            tv84.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA8("5");

                        tv85.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA8("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one7:
                        if (tv74.getBackground() != null || tv72.getBackground() != null || tv73.getBackground() != null
                                || tv75.getBackground() != null) {
                            tv74.setBackgroundResource(R.color.standardwhite);
                            tv72.setBackgroundResource(R.color.standardwhite);
                            tv73.setBackgroundResource(R.color.standardwhite);
                            tv75.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA7("1");

                        tv71.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two7:
                        if (tv74.getBackground() != null || tv1.getBackground() != null || tv3.getBackground() != null
                                || tv5.getBackground() != null) {
                            tv74.setBackgroundResource(R.color.standardwhite);
                            tv71.setBackgroundResource(R.color.standardwhite);
                            tv73.setBackgroundResource(R.color.standardwhite);
                            tv75.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA7("2");

                        tv72.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three7:
                        if (tv71.getBackground() != null || tv72.getBackground() != null || tv74.getBackground() != null
                                || tv75.getBackground() != null) {
                            tv71.setBackgroundResource(R.color.standardwhite);
                            tv72.setBackgroundResource(R.color.standardwhite);
                            tv74.setBackgroundResource(R.color.standardwhite);
                            tv75.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA7("3");

                        tv73.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four7:
                        if (tv71.getBackground() != null || tv72.getBackground() != null || tv73.getBackground() != null
                                || tv75.getBackground() != null) {
                            tv71.setBackgroundResource(R.color.standardwhite);
                            tv72.setBackgroundResource(R.color.standardwhite);
                            tv73.setBackgroundResource(R.color.standardwhite);
                            tv75.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA7("4");

                        tv74.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five7:
                        if (tv74.getBackground() != null || tv72.getBackground() != null || tv73.getBackground() != null
                                || tv71.getBackground() != null) {
                            tv71.setBackgroundResource(R.color.standardwhite);
                            tv72.setBackgroundResource(R.color.standardwhite);
                            tv73.setBackgroundResource(R.color.standardwhite);
                            tv74.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA7("5");

                        tv75.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA7("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one6:
                        if (tv64.getBackground() != null || tv62.getBackground() != null || tv63.getBackground() != null
                                || tv65.getBackground() != null) {
                            tv64.setBackgroundResource(R.color.standardwhite);
                            tv62.setBackgroundResource(R.color.standardwhite);
                            tv63.setBackgroundResource(R.color.standardwhite);
                            tv65.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA6("1");

                        tv61.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two6:
                        if (tv64.getBackground() != null || tv61.getBackground() != null || tv63.getBackground() != null
                                || tv65.getBackground() != null) {
                            tv64.setBackgroundResource(R.color.standardwhite);
                            tv61.setBackgroundResource(R.color.standardwhite);
                            tv63.setBackgroundResource(R.color.standardwhite);
                            tv65.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA6("2");

                        tv62.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three6:
                        if (tv61.getBackground() != null || tv62.getBackground() != null || tv64.getBackground() != null
                                || tv65.getBackground() != null) {
                            tv61.setBackgroundResource(R.color.standardwhite);
                            tv62.setBackgroundResource(R.color.standardwhite);
                            tv64.setBackgroundResource(R.color.standardwhite);
                            tv65.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA6("3");

                        tv63.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four6:
                        if (tv61.getBackground() != null || tv62.getBackground() != null || tv63.getBackground() != null
                                || tv65.getBackground() != null) {
                            tv61.setBackgroundResource(R.color.standardwhite);
                            tv62.setBackgroundResource(R.color.standardwhite);
                            tv63.setBackgroundResource(R.color.standardwhite);
                            tv65.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA6("4");

                        tv64.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five6:
                        if (tv64.getBackground() != null || tv62.getBackground() != null || tv63.getBackground() != null
                                || tv61.getBackground() != null) {
                            tv61.setBackgroundResource(R.color.standardwhite);
                            tv62.setBackgroundResource(R.color.standardwhite);
                            tv63.setBackgroundResource(R.color.standardwhite);
                            tv64.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA6("5");

                        tv65.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA6("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one5:
                        if (tv54.getBackground() != null || tv52.getBackground() != null || tv53.getBackground() != null
                                || tv55.getBackground() != null) {
                            tv54.setBackgroundResource(R.color.standardwhite);
                            tv52.setBackgroundResource(R.color.standardwhite);
                            tv53.setBackgroundResource(R.color.standardwhite);
                            tv55.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA5("1");

                        tv51.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two5:
                        if (tv54.getBackground() != null || tv51.getBackground() != null || tv53.getBackground() != null
                                || tv55.getBackground() != null) {
                            tv54.setBackgroundResource(R.color.standardwhite);
                            tv51.setBackgroundResource(R.color.standardwhite);
                            tv53.setBackgroundResource(R.color.standardwhite);
                            tv55.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA5("2");

                        tv52.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three5:
                        if (tv51.getBackground() != null || tv52.getBackground() != null || tv54.getBackground() != null
                                || tv55.getBackground() != null) {
                            tv51.setBackgroundResource(R.color.standardwhite);
                            tv52.setBackgroundResource(R.color.standardwhite);
                            tv54.setBackgroundResource(R.color.standardwhite);
                            tv55.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA5("3");

                        tv53.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four5:
                        if (tv51.getBackground() != null || tv52.getBackground() != null || tv53.getBackground() != null
                                || tv55.getBackground() != null) {
                            tv51.setBackgroundResource(R.color.standardwhite);
                            tv52.setBackgroundResource(R.color.standardwhite);
                            tv53.setBackgroundResource(R.color.standardwhite);
                            tv55.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA5("4");

                        tv54.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five5:
                        if (tv54.getBackground() != null || tv52.getBackground() != null || tv53.getBackground() != null
                                || tv51.getBackground() != null) {
                            tv51.setBackgroundResource(R.color.standardwhite);
                            tv52.setBackgroundResource(R.color.standardwhite);
                            tv53.setBackgroundResource(R.color.standardwhite);
                            tv54.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA5("5");

                        tv55.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA5("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one4:
                        if (tv44.getBackground() != null || tv42.getBackground() != null || tv43.getBackground() != null
                                || tv45.getBackground() != null) {
                            tv44.setBackgroundResource(R.color.standardwhite);
                            tv42.setBackgroundResource(R.color.standardwhite);
                            tv43.setBackgroundResource(R.color.standardwhite);
                            tv45.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA4("1");

                        tv41.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two4:
                        if (tv44.getBackground() != null || tv41.getBackground() != null || tv43.getBackground() != null
                                || tv45.getBackground() != null) {
                            tv44.setBackgroundResource(R.color.standardwhite);
                            tv41.setBackgroundResource(R.color.standardwhite);
                            tv43.setBackgroundResource(R.color.standardwhite);
                            tv45.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA4("2");

                        tv42.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three4:
                        if (tv41.getBackground() != null || tv42.getBackground() != null || tv44.getBackground() != null
                                || tv45.getBackground() != null) {
                            tv41.setBackgroundResource(R.color.standardwhite);
                            tv42.setBackgroundResource(R.color.standardwhite);
                            tv44.setBackgroundResource(R.color.standardwhite);
                            tv45.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA4("3");

                        tv43.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four4:
                        if (tv41.getBackground() != null || tv42.getBackground() != null || tv43.getBackground() != null
                                || tv5.getBackground() != null) {
                            tv41.setBackgroundResource(R.color.standardwhite);
                            tv42.setBackgroundResource(R.color.standardwhite);
                            tv43.setBackgroundResource(R.color.standardwhite);
                            tv45.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA4("4");

                        tv44.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five4:
                        if (tv44.getBackground() != null || tv42.getBackground() != null || tv43.getBackground() != null
                                || tv41.getBackground() != null) {
                            tv41.setBackgroundResource(R.color.standardwhite);
                            tv42.setBackgroundResource(R.color.standardwhite);
                            tv43.setBackgroundResource(R.color.standardwhite);
                            tv44.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA4("5");

                        tv45.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA4("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one3:
                        if (tv34.getBackground() != null || tv32.getBackground() != null || tv33.getBackground() != null
                                || tv35.getBackground() != null) {
                            tv34.setBackgroundResource(R.color.standardwhite);
                            tv32.setBackgroundResource(R.color.standardwhite);
                            tv33.setBackgroundResource(R.color.standardwhite);
                            tv35.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA3("1");

                        tv31.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two3:
                        if (tv34.getBackground() != null || tv31.getBackground() != null || tv33.getBackground() != null
                                || tv35.getBackground() != null) {
                            tv34.setBackgroundResource(R.color.standardwhite);
                            tv31.setBackgroundResource(R.color.standardwhite);
                            tv33.setBackgroundResource(R.color.standardwhite);
                            tv35.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA3("2");

                        tv32.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three3:
                        if (tv31.getBackground() != null || tv32.getBackground() != null || tv34.getBackground() != null
                                || tv35.getBackground() != null) {
                            tv31.setBackgroundResource(R.color.standardwhite);
                            tv32.setBackgroundResource(R.color.standardwhite);
                            tv34.setBackgroundResource(R.color.standardwhite);
                            tv35.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA3("3");

                        tv33.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four3:
                        if (tv31.getBackground() != null || tv32.getBackground() != null || tv33.getBackground() != null
                                || tv35.getBackground() != null) {
                            tv31.setBackgroundResource(R.color.standardwhite);
                            tv32.setBackgroundResource(R.color.standardwhite);
                            tv33.setBackgroundResource(R.color.standardwhite);
                            tv35.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA3("4");

                        tv34.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five3:
                        if (tv34.getBackground() != null || tv32.getBackground() != null || tv33.getBackground() != null
                                || tv31.getBackground() != null) {
                            tv31.setBackgroundResource(R.color.standardwhite);
                            tv32.setBackgroundResource(R.color.standardwhite);
                            tv33.setBackgroundResource(R.color.standardwhite);
                            tv34.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA3("5");

                        tv35.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA3("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one2:
                        if (tv24.getBackground() != null || tv22.getBackground() != null || tv23.getBackground() != null
                                || tv25.getBackground() != null) {
                            tv24.setBackgroundResource(R.color.standardwhite);
                            tv22.setBackgroundResource(R.color.standardwhite);
                            tv23.setBackgroundResource(R.color.standardwhite);
                            tv25.setBackgroundResource(R.color.standardwhite);
                        }

                        db.setA2("1");

                        tv21.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.two2:
                        if (tv24.getBackground() != null || tv21.getBackground() != null || tv23.getBackground() != null
                                || tv25.getBackground() != null) {
                            tv24.setBackgroundResource(R.color.standardwhite);
                            tv21.setBackgroundResource(R.color.standardwhite);
                            tv23.setBackgroundResource(R.color.standardwhite);
                            tv25.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA2("2");

                        tv22.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.three2:
                        if (tv21.getBackground() != null || tv22.getBackground() != null || tv24.getBackground() != null
                                || tv25.getBackground() != null) {
                            tv21.setBackgroundResource(R.color.standardwhite);
                            tv22.setBackgroundResource(R.color.standardwhite);
                            tv24.setBackgroundResource(R.color.standardwhite);
                            tv25.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA2("3");

                        tv23.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.four2:
                        if (tv21.getBackground() != null || tv22.getBackground() != null || tv23.getBackground() != null
                                || tv25.getBackground() != null) {
                            tv21.setBackgroundResource(R.color.standardwhite);
                            tv22.setBackgroundResource(R.color.standardwhite);
                            tv23.setBackgroundResource(R.color.standardwhite);
                            tv25.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA2("4");

                        tv24.setBackgroundResource(R.drawable.fill);
                        break;
                    case R.id.five2:
                        if (tv24.getBackground() != null || tv22.getBackground() != null || tv23.getBackground() != null
                                || tv21.getBackground() != null) {
                            tv21.setBackgroundResource(R.color.standardwhite);
                            tv22.setBackgroundResource(R.color.standardwhite);
                            tv23.setBackgroundResource(R.color.standardwhite);
                            tv24.setBackgroundResource(R.color.standardwhite);
                        }
                        db.setA2("5");

                        tv25.setBackgroundResource(R.drawable.fill);
                        break;
                    default:
                        db.setA2("0");
                        break;

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };


        tv1.setOnClickListener(clicklistener);
        tv2.setOnClickListener(clicklistener);
        tv3.setOnClickListener(clicklistener);
        tv4.setOnClickListener(clicklistener);
        tv5.setOnClickListener(clicklistener);

        tv21.setOnClickListener(clicklistener1);
        tv22.setOnClickListener(clicklistener1);
        tv23.setOnClickListener(clicklistener1);
        tv24.setOnClickListener(clicklistener1);
        tv25.setOnClickListener(clicklistener1);

        tv31.setOnClickListener(clicklistener2);
        tv32.setOnClickListener(clicklistener2);
        tv33.setOnClickListener(clicklistener2);
        tv34.setOnClickListener(clicklistener2);
        tv35.setOnClickListener(clicklistener2);

        tv41.setOnClickListener(clicklistener3);
        tv42.setOnClickListener(clicklistener3);
        tv43.setOnClickListener(clicklistener3);
        tv44.setOnClickListener(clicklistener3);
        tv45.setOnClickListener(clicklistener3);

        tv51.setOnClickListener(clicklistener4);
        tv52.setOnClickListener(clicklistener4);
        tv53.setOnClickListener(clicklistener4);
        tv54.setOnClickListener(clicklistener4);
        tv55.setOnClickListener(clicklistener4);

        tv61.setOnClickListener(clicklistener5);
        tv62.setOnClickListener(clicklistener5);
        tv63.setOnClickListener(clicklistener5);
        tv64.setOnClickListener(clicklistener5);
        tv65.setOnClickListener(clicklistener5);

        tv71.setOnClickListener(clicklistener6);
        tv72.setOnClickListener(clicklistener6);
        tv73.setOnClickListener(clicklistener6);
        tv74.setOnClickListener(clicklistener6);
        tv75.setOnClickListener(clicklistener6);

        tv81.setOnClickListener(clicklistener7);
        tv82.setOnClickListener(clicklistener7);
        tv83.setOnClickListener(clicklistener7);
        tv84.setOnClickListener(clicklistener7);
        tv85.setOnClickListener(clicklistener7);

        tv91.setOnClickListener(clicklistener8);
        tv92.setOnClickListener(clicklistener8);
        tv93.setOnClickListener(clicklistener8);
        tv94.setOnClickListener(clicklistener8);
        tv95.setOnClickListener(clicklistener8);

        tv101.setOnClickListener(clicklistener9);
        tv102.setOnClickListener(clicklistener9);
        tv103.setOnClickListener(clicklistener9);
        tv104.setOnClickListener(clicklistener9);
        tv105.setOnClickListener(clicklistener9);

        tv111.setOnClickListener(clicklistener10);
        tv112.setOnClickListener(clicklistener10);
        tv113.setOnClickListener(clicklistener10);
        tv114.setOnClickListener(clicklistener10);
        tv115.setOnClickListener(clicklistener10);

        tv121.setOnClickListener(clicklistener11);
        tv122.setOnClickListener(clicklistener11);
        tv123.setOnClickListener(clicklistener11);
        tv124.setOnClickListener(clicklistener11);
        tv125.setOnClickListener(clicklistener11);

        tv131.setOnClickListener(clicklistener12);
        tv132.setOnClickListener(clicklistener12);
        tv133.setOnClickListener(clicklistener12);
        tv134.setOnClickListener(clicklistener12);
        tv135.setOnClickListener(clicklistener12);

        tv141.setOnClickListener(clicklistener13);
        tv142.setOnClickListener(clicklistener13);
        tv143.setOnClickListener(clicklistener13);
        tv144.setOnClickListener(clicklistener13);
        tv145.setOnClickListener(clicklistener13);

        tv151.setOnClickListener(clicklistener14);
        tv152.setOnClickListener(clicklistener14);
        tv153.setOnClickListener(clicklistener14);
        tv154.setOnClickListener(clicklistener14);
        tv155.setOnClickListener(clicklistener14);

        tv161.setOnClickListener(clicklistener15);
        tv162.setOnClickListener(clicklistener15);
        tv163.setOnClickListener(clicklistener15);
        tv164.setOnClickListener(clicklistener15);
        tv165.setOnClickListener(clicklistener15);

        tv171.setOnClickListener(clicklistener16);
        tv172.setOnClickListener(clicklistener16);
        tv173.setOnClickListener(clicklistener16);
        tv174.setOnClickListener(clicklistener16);
        tv175.setOnClickListener(clicklistener16);
        return itemView;
    }
}
