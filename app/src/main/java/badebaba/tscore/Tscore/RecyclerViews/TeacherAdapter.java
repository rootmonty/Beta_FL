package badebaba.tscore.Tscore.RecyclerViews;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

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
        holder.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  if (countercount >= getItemCount()-2) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle("Submission")
                        .setMessage("Do you really want to submit?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(context, "Yay", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton(android.R.string.no, null).show();
                // Toast.makeText(v.getContext(), "Submission for this teacher is done", Toast.LENGTH_SHORT).show();
                //  Toast.makeText(context, "Move to next", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return teachers.length;
    }
}
