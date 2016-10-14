package badebaba.tscore.Tscore.RecyclerViews;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import badebaba.tscore.Bruteforce.DbTeacher;
import badebaba.tscore.R;

import static java.lang.StrictMath.abs;


public class TeacherAdapter extends RecyclerView.Adapter<TeacherViewHolder> {

    String[] teachers = {"Hitesh Vakharia(Maths)",
            "Kekul Vakharia(Science)",
            "Janki Barodia(French)",
            " Kanika Maheshwari(French) ",
            "  Priti Vora(Maths) ",
            "  Sonal Jain (Maths) ",
            "  Manoj Mishra (History) ",
            "  Juliet Sequeira (Social Science) ",
            "  Vandana Nagar(English/History) ",
            "  Aarti Ganatra(English/Social Sciences) ",
            "   Tushar Bhatt(English Grammar) ",
            "   Pravin Parab (Sanskrit/Marathi) ",
            "  Shashi Singh(Hindi) ",
            "  Sejal Bhave(Hindi/Marathi) ",
            "  Shabina Sayyad(Science) ",
            "   Ruddhi Salvi (Science) ",
            "   Harshil Jariwala(Science) "
    };
    Context context;
    LayoutInflater inflater;
    int countercount = 0;
    List<DbTeacher> objectteacher = new ArrayList<>();

    public TeacherAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);

    }


    @Override
    public TeacherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.teacher, parent, false);
        TeacherViewHolder teacherViewHolder = new TeacherViewHolder(view);
        return teacherViewHolder;
    }

    @Override
    public void onBindViewHolder(TeacherViewHolder holder, int position) {
        holder.TeacherName.setText(teachers[position]);

        /*
        this is for the storing of the values in the list of teachers object
         */
        // objectteacher.add(position,holder.object);
        // Log.i("Objectteacher", holder.object+"");
        // Log.i("ObjectTeachervalues",holder.object.getA1()+""+holder.object.getA2()+""
        // +holder.object.getA3()+holder.object.getA4()+holder.object.getA5()+holder.object.getA6());

        /*
        Submission through the button, need to reset all the entries and then submit the required fill
         */
     /*   holder.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle("Submit")
                        .setMessage("Are you sure you want to submit?")
                        .setPositiveButton("YES", new Dialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context,"submission for this teacher is done,Scroll down for next one",Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("NO",null)
                        .show();


            }
        }); */
    }


    @Override
    public int getItemCount() {
        return teachers.length;
    }
}
