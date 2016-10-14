package badebaba.tscore.Tscore;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import badebaba.tscore.R;
import badebaba.tscore.Tscore.RecyclerViews.TeacherAdapter;
import badebaba.tscore.Tscore.RecyclerViews.TeacherViewCallback;

public class Teacher extends Fragment {


    RecyclerView recyclerView2;
    LinearLayoutManager linearLayoutManager;
    private TeacherViewCallback teacherViewCallback;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        teacherViewCallback = (TeacherViewCallback) activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.teacherrecycler, container, false);

        recyclerView2 = (RecyclerView) rootview.findViewById(R.id.teacher_recycler);

        TeacherAdapter adapter = new TeacherAdapter(rootview.getContext(), teacherViewCallback);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView2.setAdapter(adapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(linearLayoutManager);

        return rootview;
    }
}
