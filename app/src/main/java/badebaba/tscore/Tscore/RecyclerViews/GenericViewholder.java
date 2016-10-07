package badebaba.tscore.Tscore.RecyclerViews;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import badebaba.tscore.DbObj;
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
    int count = 0;
    String database = new String();

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
                        count = 1;
                        database = "1";
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
                        count = 1;
                        database = "2";
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
                        count = 1;
                        database = "3";
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
                        count = 1;
                        database = "4";

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
                        count = 1;
                        database = "5";
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        count = 0;
                        database = "0";

                }
                //Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();

            }
        };

        if (tv1.getBackground() != null || tv2.getBackground() != null || tv3.getBackground() != null || tv4.getBackground() != null || tv5.getBackground() != null) {
            count = 1;
        } else
            count = 0;

        tv1.setOnClickListener(clicklistener);
        tv2.setOnClickListener(clicklistener);
        tv3.setOnClickListener(clicklistener);
        tv4.setOnClickListener(clicklistener);
        tv5.setOnClickListener(clicklistener);


    }
}
