package badebaba.tscore.Tscore.RecyclerViews;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import badebaba.tscore.DbObj;
import badebaba.tscore.R;

import static java.lang.StrictMath.abs;


/**
 * Created by monty on 4/9/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CarViewholder> {
    /*
    Important thing to notice here is that the multiple viewholders are needed to be checked and aligned
    with respect to the position and viewtype of the layout
    Viewtype: returns default value 0 for similar layout so we overrided it with two values
    one for the cardview and one for the Master submit section
     Pl note :::: Always create different child classes and extend it to the master class to get better result and
     better judge of the execution taking place.
     OncreateViewholder creates and inflates the view so here we need to distinctly create different objects of
     child classes to get different results

     */

    public static int CARD_VAL = 1;
    public static int BUTTON_VAL = 2;
    List<String> dbObjList = new ArrayList<>();
    int countercount = 0;
    String[] ques = {"How would you grade the Teachers",
            "How Did You Find The Study Material",
            "How Was The Coaching Infrastructure",
            "How Innovative Were The Teachers",
            "Ease Of Travel To The Class",
            "Previous Years' Results",
            "Extra-Curricular Activities",
            "Counselling During Admission",
            "Clear Your Doubts Sessions",
            "How Were The Tests Conducted",
            "How Were The Seminars",
            "How Were The Powerpoint Presentations",
            "Quality of tests in regular time intervals",
            "Syllabus coverage in tests",
            "Test results/feedback on time",
            "Doubt clearance after tests",
            "Remedial classes after tests"};
    Context context;
    LayoutInflater inflater;
    // View iview;

    public CardAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CarViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        CarViewholder viewholder;
        View iview;
        if (viewType == CARD_VAL) {
            iview = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
            viewholder = new GenericViewholder(iview);
            iview.setTag(viewholder);
            return viewholder;
        } else {
            iview = LayoutInflater.from(parent.getContext()).inflate(R.layout.button, parent, false);
            viewholder = new ButtonViewHolder(iview);
            return viewholder;

        }
    }

    @Override
    public void onBindViewHolder(CarViewholder holder, int position) {
        if (getItemViewType(position) == BUTTON_VAL || position == getItemCount() + 1) {
            ButtonViewHolder buttonViewHolder = (ButtonViewHolder) holder;
            buttonViewHolder.bottombutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int countt = 0;
                    Log.i("Checking the database", dbObjList.toString());
                    for (int i = 0; i < dbObjList.size(); i++) {
                        if (dbObjList.get(i).equals("") || dbObjList.get(i).equals("0"))
                            countt++;
                    }
                    Log.i("Checking the database", countt + "");
                    if (countt == 0) {
                        new AlertDialog.Builder(view.getContext())
                                .setTitle("Title")
                                .setMessage("Do you really want to submit?")
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        Toast.makeText(context, "Submitted your response", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setNegativeButton(android.R.string.no, null).show();
                    } else {
                        Toast.makeText(view.getContext(), "Still left to submit", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (getItemViewType(position) == CARD_VAL && position <= getItemCount()) {
            Log.i("DEBUG", "" + getItemViewType(position));
            // holder = null;
            GenericViewholder genericViewholder = (GenericViewholder) holder;
            dbObjList.add(position, genericViewholder.database);
            if (genericViewholder.count == 1) {
                    countercount++;
                Log.i("THE value of count :", countercount + "");
                }
            genericViewholder.ques.setText(ques[position]);
        }
    }

    @Override
    public int getItemCount() {
        return ques.length + 1;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        //check for the termination point
        //for the last point insert button
        return (position < ques.length) ? CARD_VAL : BUTTON_VAL;


    }

}

