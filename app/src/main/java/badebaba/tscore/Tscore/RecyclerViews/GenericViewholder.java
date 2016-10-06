package badebaba.tscore.Tscore.RecyclerViews;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import badebaba.tscore.R;


/**
 * Created by monty on 4/9/16.
 */
public class GenericViewholder extends CarViewholder {

    TextView ques;
    TextView tv1, tv2, tv3, tv4, tv5;
    LinearLayout counter;
    CardView cardview1;
    // Firebase mref;
    // Button bottomb;

    public GenericViewholder(View itemView) {
        super(itemView);

        // cardview1 = (CardView) itemView.findViewById(R.id.card_view1) ;
        counter = (LinearLayout) itemView.findViewById(R.id.tv_counter);
        ques = (TextView) itemView.findViewById(R.id.setQuestion);
        tv1 = (TextView) itemView.findViewById(R.id.one);
        tv2 = (TextView) itemView.findViewById(R.id.two);
        tv3 = (TextView) itemView.findViewById(R.id.three);
        tv4 = (TextView) itemView.findViewById(R.id.four);
        tv5 = (TextView) itemView.findViewById(R.id.five);
        // bottomb = (Button) itemView.findViewById(R.id.button);

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
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };

        tv1.setOnClickListener(clicklistener);
        tv2.setOnClickListener(clicklistener);
        tv3.setOnClickListener(clicklistener);
        tv4.setOnClickListener(clicklistener);
        tv5.setOnClickListener(clicklistener);


    }
}
