package com.game.tic_tac_toe;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView box101, box102, box103;
    ImageView box201, box202, box203;
    ImageView box301, box302, box303;

    List<Integer> cross = new ArrayList<>();
    List<Integer> circle = new ArrayList<>();

    int count = 1;

    int x = R.drawable.x;
    int o = R.drawable.o;

    int c1, c2, c3, c4, c5, c6, c7, c8, c9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box101 = findViewById(R.id.box101);
        box102 = findViewById(R.id.box102);
        box103 = findViewById(R.id.box103);

        box201 = findViewById(R.id.box201);
        box202 = findViewById(R.id.box202);
        box203 = findViewById(R.id.box203);

        box301 = findViewById(R.id.box301);
        box302 = findViewById(R.id.box302);
        box303 = findViewById(R.id.box303);

        box101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c1 == 0) {
                    c1++;
                    if (count % 2 == 0) {

                        circle.add(1);
                        checkcircle();
                        box101.setImageResource(o);

                    } else {
                        cross.add(1);
                        checkcross();
                        box101.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c2 == 0) {
                    c2++;
                    if (count % 2 == 0) {
                        circle.add(2);
                        checkcircle();
                        box102.setImageResource(o);
                    } else {
                        cross.add(2);
                        checkcross();
                        box102.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c3 == 0) {
                    c3++;
                    if (count % 2 == 0) {
                        circle.add(3);
                        checkcircle();
                        box103.setImageResource(o);
                    } else {
                        cross.add(3);
                        checkcross();
                        box103.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c4 == 0) {
                    c4++;
                    if (count % 2 == 0) {
                        circle.add(4);
                        checkcircle();
                        box201.setImageResource(o);
                    } else {
                        cross.add(4);
                        checkcross();
                        box201.setImageResource(x);
                    }
                    count++;
                }

            }
        });
        box202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c5 == 0) {
                    c5++;
                    if (count % 2 == 0) {
                        circle.add(5);
                        checkcircle();
                        box202.setImageResource(o);
                    } else {
                        cross.add(5);
                        checkcross();
                        box202.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c6 == 0) {
                    c6++;
                    if (count % 2 == 0) {
                        circle.add(6);
                        checkcircle();
                        box203.setImageResource(o);
                    } else {
                        cross.add(6);
                        checkcross();
                        box203.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c7 == 0) {
                    c7++;
                    if (count % 2 == 0) {
                        circle.add(7);
                        checkcircle();
                        box301.setImageResource(o);
                    } else {
                        cross.add(7);
                        checkcross();
                        box301.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c8 == 0) {
                    c8++;
                    if (count % 2 == 0) {
                        circle.add(8);
                        checkcircle();
                        box302.setImageResource(o);
                    } else {
                        cross.add(8);
                        checkcross();
                        box302.setImageResource(x);
                    }
                    count++;
                }

            }
        });

        box303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c9 == 0) {
                    c9++;
                    if (count % 2 == 0) {
                        circle.add(9);
                        checkcircle();
                        box303.setImageResource(o);
                    } else {
                        cross.add(9);
                        checkcross();
                        box303.setImageResource(x);
                    }
                    count++;
                }

            }
        });


    }

    public void clear() {

        count = 1;

        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;

        cross.clear();
        circle.clear();

        box101.setImageResource(0);
        box102.setImageResource(0);
        box103.setImageResource(0);
        box201.setImageResource(0);
        box202.setImageResource(0);
        box203.setImageResource(0);
        box301.setImageResource(0);
        box302.setImageResource(0);
        box303.setImageResource(0);

    }

    public void Wincross() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.win_dialog);
        dialog.setCancelable(false);

        TextView win = dialog.findViewById(R.id.win);
        CardView reset = dialog.findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clear();
                dialog.dismiss();
            }
        });


        win.setText("Cross Win");
        dialog.show();
    }

    public void Wincircle() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.win_dialog);
        dialog.setCancelable(false);

        TextView win = dialog.findViewById(R.id.win);
        CardView reset = dialog.findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clear();
                dialog.dismiss();
            }
        });

        win.setText("Circle Win");

        dialog.show();
    }

    public void checkcross() {

        for (int i = 0; i < cross.size(); i++) {
            for (int j = 0; j < cross.size(); j++) {
                for (int k = 0; k < cross.size(); k++) {

                    // Checking Win from horizontal
                    if (cross.get(i) == 1 && cross.get(j) == 2 && cross.get(k) == 3) {

                        Wincross();
                    }
                    if (cross.get(i) == 4 && cross.get(j) == 5 && cross.get(k) == 6) {

                        Wincross();
                    }
                    if (cross.get(i) == 7 && cross.get(j) == 8 && cross.get(k) == 9) {

                        Wincross();
                    }

                    // Checking Win from vertical
                    if (cross.get(i) == 1 && cross.get(j) == 4 && cross.get(k) == 7) {

                        Wincross();
                    }
                    if (cross.get(i) == 2 && cross.get(j) == 5 && cross.get(k) == 8) {

                        Wincross();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 6 && cross.get(k) == 9) {

                        Wincross();
                    }

                    // Checking Win from Both diagonal
                    if (cross.get(i) == 1 && cross.get(j) == 5 && cross.get(k) == 9) {

                        Wincross();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 5 && cross.get(k) == 7) {

                        Wincross();
                    }


                }
            }
        }
    }

    public void checkcircle() {

        for (int i = 0; i < circle.size(); i++) {
            for (int j = 0; j < circle.size(); j++) {
                for (int k = 0; k < circle.size(); k++) {

                    // Checking Win from horizontal
                    if (circle.get(i) == 1 && circle.get(j) == 2 && circle.get(k) == 3) {

                        Wincircle();
                    }
                    if (circle.get(i) == 4 && circle.get(j) == 5 && circle.get(k) == 6) {

                        Wincircle();
                    }
                    if (circle.get(i) == 7 && circle.get(j) == 8 && circle.get(k) == 9) {

                        Wincircle();
                    }

                    // Checking Win from vertical
                    if (circle.get(i) == 1 && circle.get(j) == 4 && circle.get(k) == 7) {

                        Wincircle();
                    }
                    if (circle.get(i) == 2 && circle.get(j) == 5 && circle.get(k) == 8) {

                        Wincircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 6 && circle.get(k) == 9) {

                        Wincircle();
                    }

                    // Checking Win from Both diagonal
                    if (circle.get(i) == 1 && circle.get(j) == 5 && circle.get(k) == 9) {

                        Wincircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 5 && circle.get(k) == 7) {

                        Wincircle();
                    }

                }
            }
        }
    }
}