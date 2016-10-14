package badebaba.tscore.Tscore.RecyclerViews;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import badebaba.tscore.R;
import badebaba.tscore.Tscore.Teacher;

import static java.lang.StrictMath.abs;


public class RecyclerAdapter extends RecyclerView.Adapter<CarViewholder> {

    public final static int CARD_VAL = 1;
    public static final int BUTTON_VAL = 2;
    String[] name = {"YOGITHA ", " NEHA APTE ", "RUCHI",
            "NEELAM", "BHUMIKA"};
    // RatingBar ratingBar;
    Context context;
    LayoutInflater inflater;

    int countercount = 0;
    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CarViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        switch (viewType) {
            case CARD_VAL:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
                return new RecyclerViewHolder(v);
            case BUTTON_VAL:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.button, parent, false);
                return new ButtonViewHolder(v);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(CarViewholder holder, int position) {

        if (getItemViewType(position) == CARD_VAL && position < getItemCount()) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) holder;
            recyclerViewHolder.staff.setText(name[position]);
            recyclerViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    countercount++;
                }
            });
        } else {
            final ButtonViewHolder buttonViewHolder = (ButtonViewHolder) holder;
            buttonViewHolder.bottombutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //if (countercount >= getItemCount()-2) {
                        new AlertDialog.Builder(view.getContext())
                                .setTitle("Submit")
                                .setMessage("Do you really want to submit?")
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        Toast.makeText(context, "Data submitted", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setNegativeButton(android.R.string.no, null).show();
                        // Toast.makeText(view.getContext(), " DATA Sent with the Comment", Toast.LENGTH_SHORT).show();
                        // Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show();
                    //  } else
                    //  Toast.makeText(view.getContext(), "Still :" + abs(countercount - getItemCount()) + "left to submit", Toast.LENGTH_SHORT).show();


                    /* buttonViewHolder.comment.getText();
                    buttonViewHolder.comment.setText("");
                    Toast.makeText(view.getContext(), " DATA Sent with the Comment", Toast.LENGTH_SHORT).show(); */
                }
            });

        }
        // holder.staff.setText(name[position]);
        // holder.tv2.setOnClickListener(clickListener);
        // holder.tv2.setTag(holder);
        // holder.imageView.setOnClickListener(clickListener);
        // holder.imageView.setTag(holder);

    }

    @Override
    public int getItemCount() {
        return name.length + 1;
    }

    @Override
    public int getItemViewType(int position) {
        return (position < getItemCount() - 1) ? CARD_VAL : BUTTON_VAL;
    }
}
