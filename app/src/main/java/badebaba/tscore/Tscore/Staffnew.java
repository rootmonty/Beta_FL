package badebaba.tscore.Tscore;


import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import badebaba.tscore.Bruteforce.Dbstaff;
import badebaba.tscore.MainActivity;
import badebaba.tscore.R;

/**
 * Created by badebaba on 10/15/2016.
 */

public class Staffnew extends Fragment {

    TextView tv001, tv002, tv003, tv004, tv005;
    TextView tv101, tv102, tv103, tv104, tv105;
    TextView tv201, tv202, tv203, tv204, tv205;
    TextView tv301, tv302, tv303, tv304, tv305;
    TextView tv401, tv402, tv403, tv404, tv405;
    TextView tv011, tv012, tv013, tv014, tv015;
    TextView tv111, tv112, tv113, tv114, tv115;
    TextView tv211, tv212, tv213, tv214, tv215;
    TextView tv311, tv312, tv313, tv314, tv315;
    TextView tv411, tv412, tv413, tv414, tv415;
    TextView tv021, tv022, tv023, tv024, tv025;
    TextView tv121, tv122, tv123, tv124, tv125;
    TextView tv221, tv222, tv223, tv224, tv225;
    TextView tv321, tv322, tv323, tv324, tv325;
    TextView tv421, tv422, tv423, tv424, tv425;
    EditText edt1, edt2, edt3, edt4, edt5, comment;
    Button submit;

    Dbstaff db = new Dbstaff();
    // char c = "0";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.staffnew, container, false);

        getActivity().setTitle(getString(R.string.stafftab));
        submit = (Button) root.findViewById(R.id.button);

        tv001 = (TextView) root.findViewById(R.id.stb001);
        tv002 = (TextView) root.findViewById(R.id.stb002);
        tv003 = (TextView) root.findViewById(R.id.stb003);
        tv004 = (TextView) root.findViewById(R.id.stb004);
        tv005 = (TextView) root.findViewById(R.id.stb005);
        tv011 = (TextView) root.findViewById(R.id.stb011);
        tv012 = (TextView) root.findViewById(R.id.stb012);
        tv013 = (TextView) root.findViewById(R.id.stb013);
        tv014 = (TextView) root.findViewById(R.id.stb014);
        tv015 = (TextView) root.findViewById(R.id.stb015);
        tv021 = (TextView) root.findViewById(R.id.stb021);
        tv022 = (TextView) root.findViewById(R.id.stb022);
        tv023 = (TextView) root.findViewById(R.id.stb023);
        tv024 = (TextView) root.findViewById(R.id.stb024);
        tv025 = (TextView) root.findViewById(R.id.stb025);

        tv101 = (TextView) root.findViewById(R.id.stb201);
        tv102 = (TextView) root.findViewById(R.id.stb202);
        tv103 = (TextView) root.findViewById(R.id.stb203);
        tv104 = (TextView) root.findViewById(R.id.stb204);
        tv105 = (TextView) root.findViewById(R.id.stb205);
        tv111 = (TextView) root.findViewById(R.id.stb211);
        tv112 = (TextView) root.findViewById(R.id.stb212);
        tv113 = (TextView) root.findViewById(R.id.stb213);
        tv114 = (TextView) root.findViewById(R.id.stb214);
        tv115 = (TextView) root.findViewById(R.id.stb215);
        tv121 = (TextView) root.findViewById(R.id.stb221);
        tv122 = (TextView) root.findViewById(R.id.stb222);
        tv123 = (TextView) root.findViewById(R.id.stb223);
        tv124 = (TextView) root.findViewById(R.id.stb224);
        tv125 = (TextView) root.findViewById(R.id.stb225);

        tv201 = (TextView) root.findViewById(R.id.stb301);
        tv202 = (TextView) root.findViewById(R.id.stb302);
        tv203 = (TextView) root.findViewById(R.id.stb303);
        tv204 = (TextView) root.findViewById(R.id.stb304);
        tv205 = (TextView) root.findViewById(R.id.stb305);
        tv211 = (TextView) root.findViewById(R.id.stb311);
        tv212 = (TextView) root.findViewById(R.id.stb312);
        tv213 = (TextView) root.findViewById(R.id.stb313);
        tv214 = (TextView) root.findViewById(R.id.stb314);
        tv215 = (TextView) root.findViewById(R.id.stb315);
        tv221 = (TextView) root.findViewById(R.id.stb321);
        tv222 = (TextView) root.findViewById(R.id.stb322);
        tv223 = (TextView) root.findViewById(R.id.stb323);
        tv224 = (TextView) root.findViewById(R.id.stb324);
        tv225 = (TextView) root.findViewById(R.id.stb325);

        tv301 = (TextView) root.findViewById(R.id.stb401);
        tv302 = (TextView) root.findViewById(R.id.stb402);
        tv303 = (TextView) root.findViewById(R.id.stb403);
        tv304 = (TextView) root.findViewById(R.id.stb404);
        tv305 = (TextView) root.findViewById(R.id.stb405);
        tv311 = (TextView) root.findViewById(R.id.stb411);
        tv312 = (TextView) root.findViewById(R.id.stb412);
        tv313 = (TextView) root.findViewById(R.id.stb413);
        tv314 = (TextView) root.findViewById(R.id.stb414);
        tv315 = (TextView) root.findViewById(R.id.stb415);
        tv321 = (TextView) root.findViewById(R.id.stb421);
        tv322 = (TextView) root.findViewById(R.id.stb422);
        tv323 = (TextView) root.findViewById(R.id.stb423);
        tv324 = (TextView) root.findViewById(R.id.stb424);
        tv325 = (TextView) root.findViewById(R.id.stb425);

        tv401 = (TextView) root.findViewById(R.id.stb501);
        tv402 = (TextView) root.findViewById(R.id.stb502);
        tv403 = (TextView) root.findViewById(R.id.stb503);
        tv404 = (TextView) root.findViewById(R.id.stb504);
        tv405 = (TextView) root.findViewById(R.id.stb505);
        tv411 = (TextView) root.findViewById(R.id.stb511);
        tv412 = (TextView) root.findViewById(R.id.stb512);
        tv413 = (TextView) root.findViewById(R.id.stb513);
        tv414 = (TextView) root.findViewById(R.id.stb514);
        tv415 = (TextView) root.findViewById(R.id.stb515);
        tv421 = (TextView) root.findViewById(R.id.stb521);
        tv422 = (TextView) root.findViewById(R.id.stb522);
        tv423 = (TextView) root.findViewById(R.id.stb523);
        tv424 = (TextView) root.findViewById(R.id.stb524);
        tv425 = (TextView) root.findViewById(R.id.stb525);

        edt1 = (EditText) root.findViewById(R.id.edt1);
        edt2 = (EditText) root.findViewById(R.id.edt2);
        edt3 = (EditText) root.findViewById(R.id.edt3);
        edt4 = (EditText) root.findViewById(R.id.edt4);
        edt5 = (EditText) root.findViewById(R.id.edt5);

        comment = (EditText) root.findViewById(R.id.comment);


        db.setAns11("0");
        db.setAns12("0");
        db.setAns13("0");
        db.setAns21("0");
        db.setAns22("0");
        db.setAns23("0");
        db.setAns31("0");
        db.setAns32("0");
        db.setAns33("0");
        db.setAns41("0");
        db.setAns42("0");
        db.setAns43("0");
        db.setAns51("0");
        db.setAns52("0");
        db.setAns53("0");

        ((MainActivity) getActivity()).setbool(2);

        View.OnClickListener clicklistener001 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb001:
                        if (tv001.getBackground() != null || tv002.getBackground() != null || tv003.getBackground() != null
                                || tv005.getBackground() != null) {
                            tv004.setBackgroundResource(R.color.standardwhite);
                            tv002.setBackgroundResource(R.color.standardwhite);
                            tv003.setBackgroundResource(R.color.standardwhite);
                            tv005.setBackgroundResource(R.color.standardwhite);
                        }


                        tv001.setBackgroundResource(R.drawable.fill);
                        db.setAns11("1");
                        break;
                    case R.id.stb002:
                        if (tv004.getBackground() != null || tv001.getBackground() != null || tv003.getBackground() != null
                                || tv005.getBackground() != null) {
                            tv004.setBackgroundResource(R.color.standardwhite);
                            tv001.setBackgroundResource(R.color.standardwhite);
                            tv003.setBackgroundResource(R.color.standardwhite);
                            tv005.setBackgroundResource(R.color.standardwhite);
                        }

                        tv002.setBackgroundResource(R.drawable.fill);
                        db.setAns11("2");
                        break;
                    case R.id.stb003:
                        if (tv001.getBackground() != null || tv002.getBackground() != null || tv004.getBackground() != null
                                || tv005.getBackground() != null) {
                            tv001.setBackgroundResource(R.color.standardwhite);
                            tv002.setBackgroundResource(R.color.standardwhite);
                            tv004.setBackgroundResource(R.color.standardwhite);
                            tv005.setBackgroundResource(R.color.standardwhite);
                        }

                        tv003.setBackgroundResource(R.drawable.fill);
                        db.setAns11("3");
                        break;
                    case R.id.stb004:
                        if (tv001.getBackground() != null || tv002.getBackground() != null || tv003.getBackground() != null
                                || tv005.getBackground() != null) {
                            tv001.setBackgroundResource(R.color.standardwhite);
                            tv002.setBackgroundResource(R.color.standardwhite);
                            tv003.setBackgroundResource(R.color.standardwhite);
                            tv005.setBackgroundResource(R.color.standardwhite);
                        }

                        tv004.setBackgroundResource(R.drawable.fill);
                        db.setAns11("4");
                        break;
                    case R.id.stb005:
                        if (tv004.getBackground() != null || tv002.getBackground() != null || tv003.getBackground() != null
                                || tv001.getBackground() != null) {
                            tv001.setBackgroundResource(R.color.standardwhite);
                            tv002.setBackgroundResource(R.color.standardwhite);
                            tv003.setBackgroundResource(R.color.standardwhite);
                            tv004.setBackgroundResource(R.color.standardwhite);
                        }

                        tv005.setBackgroundResource(R.drawable.fill);
                        db.setAns11("5");
                        break;
                    default:
                        db.setAns11("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns11(),Toast.LENGTH_LONG).show();
            }
        };

        View.OnClickListener clicklistener002 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb011:
                        if (tv011.getBackground() != null || tv012.getBackground() != null || tv013.getBackground() != null
                                || tv015.getBackground() != null) {
                            tv014.setBackgroundResource(R.color.standardwhite);
                            tv012.setBackgroundResource(R.color.standardwhite);
                            tv013.setBackgroundResource(R.color.standardwhite);
                            tv015.setBackgroundResource(R.color.standardwhite);
                        }


                        tv011.setBackgroundResource(R.drawable.fill);
                        db.setAns12("1");
                        break;
                    case R.id.stb012:
                        if (tv014.getBackground() != null || tv011.getBackground() != null || tv013.getBackground() != null
                                || tv015.getBackground() != null) {
                            tv014.setBackgroundResource(R.color.standardwhite);
                            tv011.setBackgroundResource(R.color.standardwhite);
                            tv013.setBackgroundResource(R.color.standardwhite);
                            tv015.setBackgroundResource(R.color.standardwhite);
                        }

                        tv012.setBackgroundResource(R.drawable.fill);
                        db.setAns12("2");
                        break;
                    case R.id.stb013:
                        if (tv011.getBackground() != null || tv012.getBackground() != null || tv014.getBackground() != null
                                || tv015.getBackground() != null) {
                            tv011.setBackgroundResource(R.color.standardwhite);
                            tv012.setBackgroundResource(R.color.standardwhite);
                            tv014.setBackgroundResource(R.color.standardwhite);
                            tv015.setBackgroundResource(R.color.standardwhite);
                        }

                        tv013.setBackgroundResource(R.drawable.fill);
                        db.setAns12("3");
                        break;
                    case R.id.stb014:
                        if (tv011.getBackground() != null || tv012.getBackground() != null || tv013.getBackground() != null
                                || tv015.getBackground() != null) {
                            tv011.setBackgroundResource(R.color.standardwhite);
                            tv012.setBackgroundResource(R.color.standardwhite);
                            tv013.setBackgroundResource(R.color.standardwhite);
                            tv015.setBackgroundResource(R.color.standardwhite);
                        }

                        tv014.setBackgroundResource(R.drawable.fill);
                        db.setAns12("4");
                        break;
                    case R.id.stb015:
                        if (tv014.getBackground() != null || tv012.getBackground() != null || tv013.getBackground() != null
                                || tv011.getBackground() != null) {
                            tv011.setBackgroundResource(R.color.standardwhite);
                            tv012.setBackgroundResource(R.color.standardwhite);
                            tv013.setBackgroundResource(R.color.standardwhite);
                            tv014.setBackgroundResource(R.color.standardwhite);
                        }

                        tv015.setBackgroundResource(R.drawable.fill);
                        db.setAns12("5");
                        break;
                    default:
                        db.setAns12("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns12(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener003 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb021:
                        if (tv021.getBackground() != null || tv022.getBackground() != null || tv023.getBackground() != null
                                || tv025.getBackground() != null) {
                            tv024.setBackgroundResource(R.color.standardwhite);
                            tv022.setBackgroundResource(R.color.standardwhite);
                            tv023.setBackgroundResource(R.color.standardwhite);
                            tv025.setBackgroundResource(R.color.standardwhite);
                        }


                        tv021.setBackgroundResource(R.drawable.fill);
                        db.setAns13("1");
                        break;
                    case R.id.stb022:
                        if (tv024.getBackground() != null || tv021.getBackground() != null || tv023.getBackground() != null
                                || tv025.getBackground() != null) {
                            tv024.setBackgroundResource(R.color.standardwhite);
                            tv021.setBackgroundResource(R.color.standardwhite);
                            tv023.setBackgroundResource(R.color.standardwhite);
                            tv025.setBackgroundResource(R.color.standardwhite);
                        }

                        tv022.setBackgroundResource(R.drawable.fill);
                        db.setAns13("2");
                        break;
                    case R.id.stb023:
                        if (tv021.getBackground() != null || tv022.getBackground() != null || tv024.getBackground() != null
                                || tv025.getBackground() != null) {
                            tv021.setBackgroundResource(R.color.standardwhite);
                            tv022.setBackgroundResource(R.color.standardwhite);
                            tv024.setBackgroundResource(R.color.standardwhite);
                            tv025.setBackgroundResource(R.color.standardwhite);
                        }

                        tv023.setBackgroundResource(R.drawable.fill);
                        db.setAns13("3");
                        break;
                    case R.id.stb024:
                        if (tv021.getBackground() != null || tv022.getBackground() != null || tv023.getBackground() != null
                                || tv025.getBackground() != null) {
                            tv021.setBackgroundResource(R.color.standardwhite);
                            tv022.setBackgroundResource(R.color.standardwhite);
                            tv023.setBackgroundResource(R.color.standardwhite);
                            tv025.setBackgroundResource(R.color.standardwhite);
                        }

                        tv024.setBackgroundResource(R.drawable.fill);
                        db.setAns13("4");
                        break;
                    case R.id.stb025:
                        if (tv024.getBackground() != null || tv022.getBackground() != null || tv023.getBackground() != null
                                || tv021.getBackground() != null) {
                            tv021.setBackgroundResource(R.color.standardwhite);
                            tv022.setBackgroundResource(R.color.standardwhite);
                            tv023.setBackgroundResource(R.color.standardwhite);
                            tv024.setBackgroundResource(R.color.standardwhite);
                        }

                        tv025.setBackgroundResource(R.drawable.fill);
                        db.setAns13("5");
                        break;
                    default:
                        db.setAns13("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns13(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener011 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb201:
                        if (tv101.getBackground() != null || tv102.getBackground() != null || tv103.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv104.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }


                        tv101.setBackgroundResource(R.drawable.fill);
                        db.setAns21("1");
                        break;
                    case R.id.stb202:
                        if (tv104.getBackground() != null || tv101.getBackground() != null || tv103.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv104.setBackgroundResource(R.color.standardwhite);
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }

                        tv102.setBackgroundResource(R.drawable.fill);
                        db.setAns21("2");
                        break;
                    case R.id.stb203:
                        if (tv101.getBackground() != null || tv102.getBackground() != null || tv104.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv104.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }

                        tv103.setBackgroundResource(R.drawable.fill);
                        db.setAns21("3");
                        break;
                    case R.id.stb204:
                        if (tv101.getBackground() != null || tv102.getBackground() != null || tv103.getBackground() != null
                                || tv105.getBackground() != null) {
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv105.setBackgroundResource(R.color.standardwhite);
                        }

                        tv104.setBackgroundResource(R.drawable.fill);
                        db.setAns21("4");
                        break;
                    case R.id.stb205:
                        if (tv104.getBackground() != null || tv102.getBackground() != null || tv103.getBackground() != null
                                || tv101.getBackground() != null) {
                            tv101.setBackgroundResource(R.color.standardwhite);
                            tv102.setBackgroundResource(R.color.standardwhite);
                            tv103.setBackgroundResource(R.color.standardwhite);
                            tv104.setBackgroundResource(R.color.standardwhite);
                        }

                        tv105.setBackgroundResource(R.drawable.fill);
                        db.setAns21("5");
                        break;
                    default:
                        db.setAns21("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns21(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener012 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb211:
                        if (tv111.getBackground() != null || tv112.getBackground() != null || tv113.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv114.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }


                        tv111.setBackgroundResource(R.drawable.fill);
                        db.setAns22("1");
                        break;
                    case R.id.stb212:
                        if (tv114.getBackground() != null || tv111.getBackground() != null || tv113.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv114.setBackgroundResource(R.color.standardwhite);
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }

                        tv112.setBackgroundResource(R.drawable.fill);
                        db.setAns22("2");
                        break;
                    case R.id.stb213:
                        if (tv111.getBackground() != null || tv112.getBackground() != null || tv114.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv114.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }

                        tv113.setBackgroundResource(R.drawable.fill);
                        db.setAns22("3");
                        break;
                    case R.id.stb214:
                        if (tv111.getBackground() != null || tv112.getBackground() != null || tv113.getBackground() != null
                                || tv115.getBackground() != null) {
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv115.setBackgroundResource(R.color.standardwhite);
                        }

                        tv114.setBackgroundResource(R.drawable.fill);
                        db.setAns22("4");
                        break;
                    case R.id.stb215:
                        if (tv114.getBackground() != null || tv112.getBackground() != null || tv113.getBackground() != null
                                || tv111.getBackground() != null) {
                            tv111.setBackgroundResource(R.color.standardwhite);
                            tv112.setBackgroundResource(R.color.standardwhite);
                            tv113.setBackgroundResource(R.color.standardwhite);
                            tv114.setBackgroundResource(R.color.standardwhite);
                        }

                        tv115.setBackgroundResource(R.drawable.fill);
                        db.setAns22("5");
                        break;
                    default:
                        db.setAns22("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns22(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener013 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb221:
                        if (tv121.getBackground() != null || tv122.getBackground() != null || tv123.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv124.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }


                        tv121.setBackgroundResource(R.drawable.fill);
                        db.setAns23("1");
                        break;
                    case R.id.stb222:
                        if (tv124.getBackground() != null || tv121.getBackground() != null || tv123.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv124.setBackgroundResource(R.color.standardwhite);
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }

                        tv122.setBackgroundResource(R.drawable.fill);
                        db.setAns23("2");
                        break;
                    case R.id.stb223:
                        if (tv121.getBackground() != null || tv122.getBackground() != null || tv124.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv124.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }

                        tv123.setBackgroundResource(R.drawable.fill);
                        db.setAns23("3");
                        break;
                    case R.id.stb224:
                        if (tv121.getBackground() != null || tv122.getBackground() != null || tv123.getBackground() != null
                                || tv125.getBackground() != null) {
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv125.setBackgroundResource(R.color.standardwhite);
                        }

                        tv124.setBackgroundResource(R.drawable.fill);
                        db.setAns23("4");
                        break;
                    case R.id.stb225:
                        if (tv124.getBackground() != null || tv122.getBackground() != null || tv123.getBackground() != null
                                || tv121.getBackground() != null) {
                            tv121.setBackgroundResource(R.color.standardwhite);
                            tv122.setBackgroundResource(R.color.standardwhite);
                            tv123.setBackgroundResource(R.color.standardwhite);
                            tv124.setBackgroundResource(R.color.standardwhite);
                        }

                        tv125.setBackgroundResource(R.drawable.fill);
                        db.setAns23("5");
                        break;
                    default:
                        db.setAns23("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns23(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener021 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb301:
                        if (tv201.getBackground() != null || tv202.getBackground() != null || tv203.getBackground() != null
                                || tv205.getBackground() != null) {
                            tv204.setBackgroundResource(R.color.standardwhite);
                            tv202.setBackgroundResource(R.color.standardwhite);
                            tv203.setBackgroundResource(R.color.standardwhite);
                            tv205.setBackgroundResource(R.color.standardwhite);
                        }


                        tv201.setBackgroundResource(R.drawable.fill);
                        db.setAns31("1");
                        break;
                    case R.id.stb302:
                        if (tv204.getBackground() != null || tv201.getBackground() != null || tv203.getBackground() != null
                                || tv205.getBackground() != null) {
                            tv204.setBackgroundResource(R.color.standardwhite);
                            tv201.setBackgroundResource(R.color.standardwhite);
                            tv203.setBackgroundResource(R.color.standardwhite);
                            tv205.setBackgroundResource(R.color.standardwhite);
                        }

                        tv202.setBackgroundResource(R.drawable.fill);
                        db.setAns31("2");
                        break;
                    case R.id.stb303:
                        if (tv201.getBackground() != null || tv202.getBackground() != null || tv204.getBackground() != null
                                || tv205.getBackground() != null) {
                            tv201.setBackgroundResource(R.color.standardwhite);
                            tv202.setBackgroundResource(R.color.standardwhite);
                            tv204.setBackgroundResource(R.color.standardwhite);
                            tv205.setBackgroundResource(R.color.standardwhite);
                        }

                        tv203.setBackgroundResource(R.drawable.fill);
                        db.setAns31("3");
                        break;
                    case R.id.stb304:
                        if (tv201.getBackground() != null || tv202.getBackground() != null || tv203.getBackground() != null
                                || tv205.getBackground() != null) {
                            tv201.setBackgroundResource(R.color.standardwhite);
                            tv202.setBackgroundResource(R.color.standardwhite);
                            tv203.setBackgroundResource(R.color.standardwhite);
                            tv205.setBackgroundResource(R.color.standardwhite);
                        }

                        tv204.setBackgroundResource(R.drawable.fill);
                        db.setAns31("4");
                        break;
                    case R.id.stb305:
                        if (tv204.getBackground() != null || tv202.getBackground() != null || tv203.getBackground() != null
                                || tv201.getBackground() != null) {
                            tv201.setBackgroundResource(R.color.standardwhite);
                            tv202.setBackgroundResource(R.color.standardwhite);
                            tv203.setBackgroundResource(R.color.standardwhite);
                            tv204.setBackgroundResource(R.color.standardwhite);
                        }

                        tv205.setBackgroundResource(R.drawable.fill);
                        db.setAns31("5");
                        break;
                    default:
                        db.setAns31("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns31(),Toast.LENGTH_LONG).show();

            }
        };

        View.OnClickListener clicklistener022 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb311:
                        if (tv211.getBackground() != null || tv212.getBackground() != null || tv213.getBackground() != null
                                || tv215.getBackground() != null) {
                            tv214.setBackgroundResource(R.color.standardwhite);
                            tv212.setBackgroundResource(R.color.standardwhite);
                            tv213.setBackgroundResource(R.color.standardwhite);
                            tv215.setBackgroundResource(R.color.standardwhite);
                        }


                        tv211.setBackgroundResource(R.drawable.fill);
                        db.setAns32("1");
                        break;
                    case R.id.stb312:
                        if (tv214.getBackground() != null || tv211.getBackground() != null || tv213.getBackground() != null
                                || tv215.getBackground() != null) {
                            tv214.setBackgroundResource(R.color.standardwhite);
                            tv211.setBackgroundResource(R.color.standardwhite);
                            tv213.setBackgroundResource(R.color.standardwhite);
                            tv215.setBackgroundResource(R.color.standardwhite);
                        }

                        tv212.setBackgroundResource(R.drawable.fill);
                        db.setAns32("2");
                        break;
                    case R.id.stb313:
                        if (tv211.getBackground() != null || tv212.getBackground() != null || tv214.getBackground() != null
                                || tv215.getBackground() != null) {
                            tv211.setBackgroundResource(R.color.standardwhite);
                            tv212.setBackgroundResource(R.color.standardwhite);
                            tv214.setBackgroundResource(R.color.standardwhite);
                            tv215.setBackgroundResource(R.color.standardwhite);
                        }

                        tv213.setBackgroundResource(R.drawable.fill);
                        db.setAns32("3");
                        break;
                    case R.id.stb314:
                        if (tv211.getBackground() != null || tv212.getBackground() != null || tv213.getBackground() != null
                                || tv215.getBackground() != null) {
                            tv211.setBackgroundResource(R.color.standardwhite);
                            tv212.setBackgroundResource(R.color.standardwhite);
                            tv213.setBackgroundResource(R.color.standardwhite);
                            tv215.setBackgroundResource(R.color.standardwhite);
                        }

                        tv214.setBackgroundResource(R.drawable.fill);
                        db.setAns32("4");
                        break;
                    case R.id.stb315:
                        if (tv214.getBackground() != null || tv212.getBackground() != null || tv213.getBackground() != null
                                || tv211.getBackground() != null) {
                            tv211.setBackgroundResource(R.color.standardwhite);
                            tv212.setBackgroundResource(R.color.standardwhite);
                            tv213.setBackgroundResource(R.color.standardwhite);
                            tv214.setBackgroundResource(R.color.standardwhite);
                        }

                        tv215.setBackgroundResource(R.drawable.fill);
                        db.setAns32("5");
                        break;
                    default:
                        db.setAns32("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns32(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener023 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb321:
                        if (tv221.getBackground() != null || tv222.getBackground() != null || tv223.getBackground() != null
                                || tv225.getBackground() != null) {
                            tv224.setBackgroundResource(R.color.standardwhite);
                            tv222.setBackgroundResource(R.color.standardwhite);
                            tv223.setBackgroundResource(R.color.standardwhite);
                            tv225.setBackgroundResource(R.color.standardwhite);
                        }


                        tv221.setBackgroundResource(R.drawable.fill);
                        db.setAns33("1");
                        break;
                    case R.id.stb322:
                        if (tv224.getBackground() != null || tv221.getBackground() != null || tv223.getBackground() != null
                                || tv225.getBackground() != null) {
                            tv224.setBackgroundResource(R.color.standardwhite);
                            tv221.setBackgroundResource(R.color.standardwhite);
                            tv223.setBackgroundResource(R.color.standardwhite);
                            tv225.setBackgroundResource(R.color.standardwhite);
                        }

                        tv222.setBackgroundResource(R.drawable.fill);
                        db.setAns33("2");
                        break;
                    case R.id.stb323:
                        if (tv221.getBackground() != null || tv222.getBackground() != null || tv224.getBackground() != null
                                || tv225.getBackground() != null) {
                            tv221.setBackgroundResource(R.color.standardwhite);
                            tv222.setBackgroundResource(R.color.standardwhite);
                            tv224.setBackgroundResource(R.color.standardwhite);
                            tv225.setBackgroundResource(R.color.standardwhite);
                        }

                        tv223.setBackgroundResource(R.drawable.fill);
                        db.setAns33("3");
                        break;
                    case R.id.stb324:
                        if (tv221.getBackground() != null || tv222.getBackground() != null || tv223.getBackground() != null
                                || tv225.getBackground() != null) {
                            tv221.setBackgroundResource(R.color.standardwhite);
                            tv222.setBackgroundResource(R.color.standardwhite);
                            tv223.setBackgroundResource(R.color.standardwhite);
                            tv225.setBackgroundResource(R.color.standardwhite);
                        }

                        tv224.setBackgroundResource(R.drawable.fill);
                        db.setAns33("4");
                        break;
                    case R.id.stb325:
                        if (tv224.getBackground() != null || tv222.getBackground() != null || tv223.getBackground() != null
                                || tv221.getBackground() != null) {
                            tv221.setBackgroundResource(R.color.standardwhite);
                            tv222.setBackgroundResource(R.color.standardwhite);
                            tv223.setBackgroundResource(R.color.standardwhite);
                            tv224.setBackgroundResource(R.color.standardwhite);
                        }

                        tv225.setBackgroundResource(R.drawable.fill);
                        db.setAns33("5");
                        break;
                    default:
                        db.setAns33("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns33(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener031 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb401:
                        if (tv301.getBackground() != null || tv302.getBackground() != null || tv303.getBackground() != null
                                || tv305.getBackground() != null) {
                            tv304.setBackgroundResource(R.color.standardwhite);
                            tv302.setBackgroundResource(R.color.standardwhite);
                            tv303.setBackgroundResource(R.color.standardwhite);
                            tv305.setBackgroundResource(R.color.standardwhite);
                        }


                        tv301.setBackgroundResource(R.drawable.fill);
                        db.setAns41("1");
                        break;
                    case R.id.stb402:
                        if (tv304.getBackground() != null || tv301.getBackground() != null || tv303.getBackground() != null
                                || tv305.getBackground() != null) {
                            tv304.setBackgroundResource(R.color.standardwhite);
                            tv301.setBackgroundResource(R.color.standardwhite);
                            tv303.setBackgroundResource(R.color.standardwhite);
                            tv305.setBackgroundResource(R.color.standardwhite);
                        }

                        tv302.setBackgroundResource(R.drawable.fill);
                        db.setAns41("2");
                        break;
                    case R.id.stb403:
                        if (tv301.getBackground() != null || tv302.getBackground() != null || tv304.getBackground() != null
                                || tv305.getBackground() != null) {
                            tv301.setBackgroundResource(R.color.standardwhite);
                            tv302.setBackgroundResource(R.color.standardwhite);
                            tv304.setBackgroundResource(R.color.standardwhite);
                            tv305.setBackgroundResource(R.color.standardwhite);
                        }

                        tv303.setBackgroundResource(R.drawable.fill);
                        db.setAns41("3");
                        break;
                    case R.id.stb404:
                        if (tv301.getBackground() != null || tv302.getBackground() != null || tv303.getBackground() != null
                                || tv305.getBackground() != null) {
                            tv301.setBackgroundResource(R.color.standardwhite);
                            tv302.setBackgroundResource(R.color.standardwhite);
                            tv303.setBackgroundResource(R.color.standardwhite);
                            tv305.setBackgroundResource(R.color.standardwhite);
                        }

                        tv304.setBackgroundResource(R.drawable.fill);
                        db.setAns41("4");
                        break;
                    case R.id.stb405:
                        if (tv304.getBackground() != null || tv302.getBackground() != null || tv303.getBackground() != null
                                || tv301.getBackground() != null) {
                            tv301.setBackgroundResource(R.color.standardwhite);
                            tv302.setBackgroundResource(R.color.standardwhite);
                            tv303.setBackgroundResource(R.color.standardwhite);
                            tv304.setBackgroundResource(R.color.standardwhite);
                        }

                        tv305.setBackgroundResource(R.drawable.fill);
                        db.setAns41("5");
                        break;
                    default:
                        db.setAns41("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns41(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener032 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb411:
                        if (tv311.getBackground() != null || tv312.getBackground() != null || tv313.getBackground() != null
                                || tv315.getBackground() != null) {
                            tv314.setBackgroundResource(R.color.standardwhite);
                            tv312.setBackgroundResource(R.color.standardwhite);
                            tv313.setBackgroundResource(R.color.standardwhite);
                            tv315.setBackgroundResource(R.color.standardwhite);
                        }


                        tv311.setBackgroundResource(R.drawable.fill);
                        db.setAns42("1");
                        break;
                    case R.id.stb412:
                        if (tv314.getBackground() != null || tv311.getBackground() != null || tv313.getBackground() != null
                                || tv005.getBackground() != null) {
                            tv314.setBackgroundResource(R.color.standardwhite);
                            tv311.setBackgroundResource(R.color.standardwhite);
                            tv313.setBackgroundResource(R.color.standardwhite);
                            tv315.setBackgroundResource(R.color.standardwhite);
                        }

                        tv312.setBackgroundResource(R.drawable.fill);
                        db.setAns42("2");
                        break;
                    case R.id.stb413:
                        if (tv311.getBackground() != null || tv312.getBackground() != null || tv314.getBackground() != null
                                || tv315.getBackground() != null) {
                            tv311.setBackgroundResource(R.color.standardwhite);
                            tv312.setBackgroundResource(R.color.standardwhite);
                            tv314.setBackgroundResource(R.color.standardwhite);
                            tv315.setBackgroundResource(R.color.standardwhite);
                        }

                        tv313.setBackgroundResource(R.drawable.fill);
                        db.setAns42("3");
                        break;
                    case R.id.stb414:
                        if (tv311.getBackground() != null || tv312.getBackground() != null || tv313.getBackground() != null
                                || tv315.getBackground() != null) {
                            tv311.setBackgroundResource(R.color.standardwhite);
                            tv312.setBackgroundResource(R.color.standardwhite);
                            tv313.setBackgroundResource(R.color.standardwhite);
                            tv315.setBackgroundResource(R.color.standardwhite);
                        }

                        tv004.setBackgroundResource(R.drawable.fill);
                        db.setAns42("4");
                        break;
                    case R.id.stb415:
                        if (tv314.getBackground() != null || tv312.getBackground() != null || tv313.getBackground() != null
                                || tv311.getBackground() != null) {
                            tv311.setBackgroundResource(R.color.standardwhite);
                            tv312.setBackgroundResource(R.color.standardwhite);
                            tv313.setBackgroundResource(R.color.standardwhite);
                            tv314.setBackgroundResource(R.color.standardwhite);
                        }

                        tv315.setBackgroundResource(R.drawable.fill);
                        db.setAns42("5");
                        break;
                    default:
                        db.setAns42("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns42(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener033 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb421:
                        if (tv321.getBackground() != null || tv322.getBackground() != null || tv323.getBackground() != null
                                || tv325.getBackground() != null) {
                            tv324.setBackgroundResource(R.color.standardwhite);
                            tv322.setBackgroundResource(R.color.standardwhite);
                            tv323.setBackgroundResource(R.color.standardwhite);
                            tv325.setBackgroundResource(R.color.standardwhite);
                        }


                        tv321.setBackgroundResource(R.drawable.fill);
                        db.setAns43("1");
                        break;
                    case R.id.stb422:
                        if (tv324.getBackground() != null || tv321.getBackground() != null || tv323.getBackground() != null
                                || tv325.getBackground() != null) {
                            tv324.setBackgroundResource(R.color.standardwhite);
                            tv321.setBackgroundResource(R.color.standardwhite);
                            tv323.setBackgroundResource(R.color.standardwhite);
                            tv325.setBackgroundResource(R.color.standardwhite);
                        }

                        tv322.setBackgroundResource(R.drawable.fill);
                        db.setAns43("2");
                        break;
                    case R.id.stb423:
                        if (tv321.getBackground() != null || tv322.getBackground() != null || tv324.getBackground() != null
                                || tv325.getBackground() != null) {
                            tv321.setBackgroundResource(R.color.standardwhite);
                            tv322.setBackgroundResource(R.color.standardwhite);
                            tv324.setBackgroundResource(R.color.standardwhite);
                            tv325.setBackgroundResource(R.color.standardwhite);
                        }

                        tv323.setBackgroundResource(R.drawable.fill);
                        db.setAns43("3");
                        break;
                    case R.id.stb424:
                        if (tv321.getBackground() != null || tv322.getBackground() != null || tv323.getBackground() != null
                                || tv325.getBackground() != null) {
                            tv321.setBackgroundResource(R.color.standardwhite);
                            tv322.setBackgroundResource(R.color.standardwhite);
                            tv323.setBackgroundResource(R.color.standardwhite);
                            tv325.setBackgroundResource(R.color.standardwhite);
                        }

                        tv324.setBackgroundResource(R.drawable.fill);
                        db.setAns43("4");
                        break;
                    case R.id.stb425:
                        if (tv324.getBackground() != null || tv322.getBackground() != null || tv323.getBackground() != null
                                || tv321.getBackground() != null) {
                            tv321.setBackgroundResource(R.color.standardwhite);
                            tv322.setBackgroundResource(R.color.standardwhite);
                            tv323.setBackgroundResource(R.color.standardwhite);
                            tv324.setBackgroundResource(R.color.standardwhite);
                        }

                        tv325.setBackgroundResource(R.drawable.fill);
                        db.setAns43("5");
                        break;
                    default:
                        db.setAns43("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns43(),Toast.LENGTH_LONG).show();

            }
        };

        View.OnClickListener clicklistener041 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb501:
                        if (tv401.getBackground() != null || tv402.getBackground() != null || tv403.getBackground() != null
                                || tv405.getBackground() != null) {
                            tv404.setBackgroundResource(R.color.standardwhite);
                            tv402.setBackgroundResource(R.color.standardwhite);
                            tv403.setBackgroundResource(R.color.standardwhite);
                            tv405.setBackgroundResource(R.color.standardwhite);
                        }


                        tv401.setBackgroundResource(R.drawable.fill);
                        db.setAns51("1");
                        break;
                    case R.id.stb502:
                        if (tv404.getBackground() != null || tv401.getBackground() != null || tv403.getBackground() != null
                                || tv405.getBackground() != null) {
                            tv404.setBackgroundResource(R.color.standardwhite);
                            tv401.setBackgroundResource(R.color.standardwhite);
                            tv403.setBackgroundResource(R.color.standardwhite);
                            tv405.setBackgroundResource(R.color.standardwhite);
                        }

                        tv402.setBackgroundResource(R.drawable.fill);
                        db.setAns51("2");
                        break;
                    case R.id.stb503:
                        if (tv401.getBackground() != null || tv402.getBackground() != null || tv404.getBackground() != null
                                || tv405.getBackground() != null) {
                            tv401.setBackgroundResource(R.color.standardwhite);
                            tv402.setBackgroundResource(R.color.standardwhite);
                            tv404.setBackgroundResource(R.color.standardwhite);
                            tv405.setBackgroundResource(R.color.standardwhite);
                        }

                        tv403.setBackgroundResource(R.drawable.fill);
                        db.setAns51("3");
                        break;
                    case R.id.stb504:
                        if (tv401.getBackground() != null || tv402.getBackground() != null || tv403.getBackground() != null
                                || tv405.getBackground() != null) {
                            tv401.setBackgroundResource(R.color.standardwhite);
                            tv402.setBackgroundResource(R.color.standardwhite);
                            tv403.setBackgroundResource(R.color.standardwhite);
                            tv405.setBackgroundResource(R.color.standardwhite);
                        }

                        tv404.setBackgroundResource(R.drawable.fill);
                        db.setAns51("4");
                        break;
                    case R.id.stb505:
                        if (tv404.getBackground() != null || tv402.getBackground() != null || tv403.getBackground() != null
                                || tv401.getBackground() != null) {
                            tv401.setBackgroundResource(R.color.standardwhite);
                            tv402.setBackgroundResource(R.color.standardwhite);
                            tv403.setBackgroundResource(R.color.standardwhite);
                            tv404.setBackgroundResource(R.color.standardwhite);
                        }

                        tv405.setBackgroundResource(R.drawable.fill);
                        db.setAns51("5");
                        break;
                    default:
                        db.setAns51("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns51(),Toast.LENGTH_LONG).show();

            }
        };

        View.OnClickListener clicklistener042 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb511:
                        if (tv411.getBackground() != null || tv412.getBackground() != null || tv413.getBackground() != null
                                || tv415.getBackground() != null) {
                            tv414.setBackgroundResource(R.color.standardwhite);
                            tv412.setBackgroundResource(R.color.standardwhite);
                            tv413.setBackgroundResource(R.color.standardwhite);
                            tv415.setBackgroundResource(R.color.standardwhite);
                        }


                        tv411.setBackgroundResource(R.drawable.fill);
                        db.setAns52("1");
                        break;
                    case R.id.stb512:
                        if (tv414.getBackground() != null || tv411.getBackground() != null || tv413.getBackground() != null
                                || tv415.getBackground() != null) {
                            tv414.setBackgroundResource(R.color.standardwhite);
                            tv411.setBackgroundResource(R.color.standardwhite);
                            tv413.setBackgroundResource(R.color.standardwhite);
                            tv415.setBackgroundResource(R.color.standardwhite);
                        }

                        tv412.setBackgroundResource(R.drawable.fill);
                        db.setAns52("2");
                        break;
                    case R.id.stb513:
                        if (tv411.getBackground() != null || tv412.getBackground() != null || tv414.getBackground() != null
                                || tv415.getBackground() != null) {
                            tv411.setBackgroundResource(R.color.standardwhite);
                            tv412.setBackgroundResource(R.color.standardwhite);
                            tv414.setBackgroundResource(R.color.standardwhite);
                            tv415.setBackgroundResource(R.color.standardwhite);
                        }

                        tv413.setBackgroundResource(R.drawable.fill);
                        db.setAns52("3");
                        break;
                    case R.id.stb514:
                        if (tv411.getBackground() != null || tv412.getBackground() != null || tv413.getBackground() != null
                                || tv415.getBackground() != null) {
                            tv411.setBackgroundResource(R.color.standardwhite);
                            tv412.setBackgroundResource(R.color.standardwhite);
                            tv413.setBackgroundResource(R.color.standardwhite);
                            tv415.setBackgroundResource(R.color.standardwhite);
                        }

                        tv414.setBackgroundResource(R.drawable.fill);
                        db.setAns52("4");
                        break;
                    case R.id.stb515:
                        if (tv414.getBackground() != null || tv412.getBackground() != null || tv413.getBackground() != null
                                || tv411.getBackground() != null) {
                            tv411.setBackgroundResource(R.color.standardwhite);
                            tv412.setBackgroundResource(R.color.standardwhite);
                            tv413.setBackgroundResource(R.color.standardwhite);
                            tv414.setBackgroundResource(R.color.standardwhite);
                        }

                        tv415.setBackgroundResource(R.drawable.fill);
                        db.setAns52("5");
                        break;
                    default:
                        db.setAns52("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns52(),Toast.LENGTH_LONG).show();

            }
        };


        View.OnClickListener clicklistener043 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.stb521:
                        if (tv421.getBackground() != null || tv422.getBackground() != null || tv423.getBackground() != null
                                || tv425.getBackground() != null) {
                            tv424.setBackgroundResource(R.color.standardwhite);
                            tv422.setBackgroundResource(R.color.standardwhite);
                            tv423.setBackgroundResource(R.color.standardwhite);
                            tv425.setBackgroundResource(R.color.standardwhite);
                        }


                        tv421.setBackgroundResource(R.drawable.fill);
                        db.setAns53("1");
                        break;
                    case R.id.stb522:
                        if (tv424.getBackground() != null || tv421.getBackground() != null || tv423.getBackground() != null
                                || tv425.getBackground() != null) {
                            tv424.setBackgroundResource(R.color.standardwhite);
                            tv421.setBackgroundResource(R.color.standardwhite);
                            tv423.setBackgroundResource(R.color.standardwhite);
                            tv425.setBackgroundResource(R.color.standardwhite);
                        }

                        tv422.setBackgroundResource(R.drawable.fill);
                        db.setAns53("2");
                        break;
                    case R.id.stb523:
                        if (tv421.getBackground() != null || tv422.getBackground() != null || tv424.getBackground() != null
                                || tv425.getBackground() != null) {
                            tv421.setBackgroundResource(R.color.standardwhite);
                            tv422.setBackgroundResource(R.color.standardwhite);
                            tv424.setBackgroundResource(R.color.standardwhite);
                            tv425.setBackgroundResource(R.color.standardwhite);
                        }

                        tv423.setBackgroundResource(R.drawable.fill);
                        db.setAns53("3");
                        break;
                    case R.id.stb524:
                        if (tv421.getBackground() != null || tv422.getBackground() != null || tv423.getBackground() != null
                                || tv425.getBackground() != null) {
                            tv421.setBackgroundResource(R.color.standardwhite);
                            tv422.setBackgroundResource(R.color.standardwhite);
                            tv423.setBackgroundResource(R.color.standardwhite);
                            tv425.setBackgroundResource(R.color.standardwhite);
                        }

                        tv424.setBackgroundResource(R.drawable.fill);
                        db.setAns53("4");
                        break;
                    case R.id.stb525:
                        if (tv424.getBackground() != null || tv422.getBackground() != null || tv423.getBackground() != null
                                || tv421.getBackground() != null) {
                            tv421.setBackgroundResource(R.color.standardwhite);
                            tv422.setBackgroundResource(R.color.standardwhite);
                            tv423.setBackgroundResource(R.color.standardwhite);
                            tv424.setBackgroundResource(R.color.standardwhite);
                        }

                        tv425.setBackgroundResource(R.drawable.fill);
                        db.setAns53("5");
                        break;
                    default:
                        db.setAns53("0");
                        break;
                }
                //Toast.makeText(v.getContext(),"Rating:"+db.getAns53(),Toast.LENGTH_LONG).show();

            }
        };


        tv001.setOnClickListener(clicklistener001);
        tv002.setOnClickListener(clicklistener001);
        tv003.setOnClickListener(clicklistener001);
        tv004.setOnClickListener(clicklistener001);
        tv005.setOnClickListener(clicklistener001);

        tv011.setOnClickListener(clicklistener002);
        tv012.setOnClickListener(clicklistener002);
        tv013.setOnClickListener(clicklistener002);
        tv014.setOnClickListener(clicklistener002);
        tv015.setOnClickListener(clicklistener002);

        tv021.setOnClickListener(clicklistener003);
        tv022.setOnClickListener(clicklistener003);
        tv023.setOnClickListener(clicklistener003);
        tv024.setOnClickListener(clicklistener003);
        tv025.setOnClickListener(clicklistener003);


        tv101.setOnClickListener(clicklistener011);
        tv102.setOnClickListener(clicklistener011);
        tv103.setOnClickListener(clicklistener011);
        tv104.setOnClickListener(clicklistener011);
        tv105.setOnClickListener(clicklistener011);

        tv111.setOnClickListener(clicklistener012);
        tv112.setOnClickListener(clicklistener012);
        tv113.setOnClickListener(clicklistener012);
        tv114.setOnClickListener(clicklistener012);
        tv115.setOnClickListener(clicklistener012);

        tv121.setOnClickListener(clicklistener013);
        tv122.setOnClickListener(clicklistener013);
        tv123.setOnClickListener(clicklistener013);
        tv124.setOnClickListener(clicklistener013);
        tv125.setOnClickListener(clicklistener013);


        tv201.setOnClickListener(clicklistener021);
        tv202.setOnClickListener(clicklistener021);
        tv203.setOnClickListener(clicklistener021);
        tv204.setOnClickListener(clicklistener021);
        tv205.setOnClickListener(clicklistener021);

        tv211.setOnClickListener(clicklistener022);
        tv212.setOnClickListener(clicklistener022);
        tv213.setOnClickListener(clicklistener022);
        tv214.setOnClickListener(clicklistener022);
        tv215.setOnClickListener(clicklistener022);

        tv221.setOnClickListener(clicklistener023);
        tv222.setOnClickListener(clicklistener023);
        tv223.setOnClickListener(clicklistener023);
        tv224.setOnClickListener(clicklistener023);
        tv225.setOnClickListener(clicklistener023);


        tv301.setOnClickListener(clicklistener031);
        tv302.setOnClickListener(clicklistener031);
        tv303.setOnClickListener(clicklistener031);
        tv304.setOnClickListener(clicklistener031);
        tv305.setOnClickListener(clicklistener031);

        tv311.setOnClickListener(clicklistener032);
        tv312.setOnClickListener(clicklistener032);
        tv313.setOnClickListener(clicklistener032);
        tv314.setOnClickListener(clicklistener032);
        tv315.setOnClickListener(clicklistener032);

        tv321.setOnClickListener(clicklistener033);
        tv322.setOnClickListener(clicklistener033);
        tv323.setOnClickListener(clicklistener033);
        tv324.setOnClickListener(clicklistener033);
        tv325.setOnClickListener(clicklistener033);


        tv401.setOnClickListener(clicklistener041);
        tv402.setOnClickListener(clicklistener041);
        tv403.setOnClickListener(clicklistener041);
        tv404.setOnClickListener(clicklistener041);
        tv405.setOnClickListener(clicklistener041);

        tv411.setOnClickListener(clicklistener042);
        tv412.setOnClickListener(clicklistener042);
        tv413.setOnClickListener(clicklistener042);
        tv414.setOnClickListener(clicklistener042);
        tv415.setOnClickListener(clicklistener042);

        tv421.setOnClickListener(clicklistener043);
        tv422.setOnClickListener(clicklistener043);
        tv423.setOnClickListener(clicklistener043);
        tv424.setOnClickListener(clicklistener043);
        tv425.setOnClickListener(clicklistener043);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.setEdt1(edt1.getText().toString());
                db.setEdt1(edt1.getText().toString());
                db.setEdt1(edt1.getText().toString());
                db.setEdt1(edt1.getText().toString());
                db.setEdt1(edt1.getText().toString());

                Log.i("THE DB IS :", db.getAns11() + "");
                Log.i("THE DB IS :", db.getAns12() + "");
                Log.i("THE DB IS :", db.getAns13() + "");
                Log.i("THE DB IS :", db.getAns21() + "");
                Log.i("THE DB IS :", db.getAns22() + "");
                Log.i("THE DB IS :", db.getAns23() + "");
                Log.i("THE DB IS :", db.getAns31() + "");
                Log.i("THE DB IS :", db.getAns32() + "");
                Log.i("THE DB IS :", db.getAns33() + "");
                Log.i("THE DB IS :", db.getAns41() + "");
                Log.i("THE DB IS :", db.getAns42() + "");
                Log.i("THE DB IS :", db.getAns43() + "");
                Log.i("THE DB IS :", db.getAns51() + "");
                Log.i("THE DB IS :", db.getAns52() + "");
                Log.i("THE DB IS :", db.getAns53() + "");

                if (db.getAns11() == "0" || db.getAns12() == "0" || db.getAns13() == "0" || db.getAns21() == "0" || db.getAns22() == "0" ||
                        db.getAns23() == "0" || db.getAns31() == "0" || db.getAns32() == "0" || db.getAns33() == "0" || db.getAns41() == "0" ||
                        db.getAns42() == "0" || db.getAns43() == "0" || db.getAns51() == "0" || db.getAns52() == "0" || db.getAns53() == "0") {
                    Toast.makeText(v.getContext(), "Fill the entire details first", Toast.LENGTH_LONG).show();
                } else {

                    new AlertDialog.Builder(v.getContext())
                            .setTitle("ALERT")
                            .setMessage("Are you sure you want to submit?")
                            .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    FragmentManager fragmentManager = getFragmentManager();
                                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.contentContainer, new Teacher())
                                            .commit();
                                }
                            })
                            .setNegativeButton("NO", null)
                            .show();
                }
            }
        });


        return root;

    }
}
