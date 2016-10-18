package badebaba.tscore.Tscore;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import badebaba.tscore.MainActivity;
import badebaba.tscore.R;
import badebaba.tscore.Tscore.RecyclerViews.TeacherAdapter;

public class Teacher extends Fragment {


    RecyclerView recyclerView2;
    LinearLayoutManager linearLayoutManager;
    CardView keyboard;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.teacherrecycler, container, false);

        ((MainActivity) getActivity()).setbool(3);
        ((MainActivity) getActivity()).countprogress(2);

        getActivity().setTitle(getString(R.string.teachertab));

        AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(rootview.getContext());
        alertDialogBuilder1.setMessage("This activity contains the Teacher feedback" +
                "form.Please fill with unbiased opinion,the respective form and submit and only then move" +
                "to the next section" +
                "\nclick below to the activity ");

        alertDialogBuilder1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();


            }
        });
        AlertDialog alertDialog1 = alertDialogBuilder1.create();
        alertDialog1.show();

        recyclerView2 = (RecyclerView) rootview.findViewById(R.id.teacher_recycler);

        TeacherAdapter adapter = new TeacherAdapter(rootview.getContext());
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView2.setAdapter(adapter);
        recyclerView2.setItemViewCacheSize(20);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(linearLayoutManager);

        return rootview;
    }
}
