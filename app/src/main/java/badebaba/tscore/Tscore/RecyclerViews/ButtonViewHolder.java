package badebaba.tscore.Tscore.RecyclerViews;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import badebaba.tscore.R;
import badebaba.tscore.Tscore.Teacher;


/**
 * Created by monty on 15/9/16.
 */
public class ButtonViewHolder extends CarViewholder {

    Button bottombutton;
    EditText comment;

    public ButtonViewHolder(View itemView) {
        super(itemView);
        bottombutton = (Button) itemView.findViewById(R.id.button);
        comment = (EditText) itemView.findViewById(R.id.comment);

        bottombutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
