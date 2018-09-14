package com.example.spandananakkireddy.hw1_group32;

// Priyanka Manusanipally - 8011017222
// Sai Spandana Nakkireddy - 801023658
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    EditText etbillvalue;
    RadioGroup rg;
    RadioButton rb10, rb15, rb18, rbcustom;
    SeekBar seekBar;
    TextView tvprogress, tvtip, tvtotal;
    Double a, b, c;
    Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Tip Calculator");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.app_icon);

        etbillvalue = (EditText) findViewById(R.id.etbillvalue);
        etbillvalue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable edt) {
                String temp = edt.toString();
                int posDot = temp.indexOf(".");
                if (posDot <= 0) {
                    return;
                }
                if (temp.length() - posDot - 1 > 2) {
                    edt.delete(posDot + 3, posDot + 4);
                }
            }

        });

        rg = (RadioGroup) findViewById(R.id.rg);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb18 = (RadioButton) findViewById(R.id.rb18);
        rbcustom = (RadioButton) findViewById(R.id.rbcustom);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        tvprogress = (TextView) findViewById(R.id.tvprogress);
        tvprogress.setText(String.valueOf(seekBar.getProgress() + "%"));
        tvtip = (TextView) findViewById(R.id.tvtip);
        tvtotal = (TextView) findViewById(R.id.tvtotal);

        if (etbillvalue.getText().toString() != null) {

            etbillvalue.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    try {
                        if (etbillvalue.getText().toString() != null) {

                            a = Double.parseDouble(etbillvalue.getText().toString());
                            Log.d("tot", a + "");
                            double total = a * 0.1;
                            String totals = String.format("%.1f", total);
                            double total1 = total + a;
                            String total2 = String.format("%.1f", total1);
                            tvtip.setText(totals + "");
                            tvtotal.setText(total2 + "");

                        }
                    } catch (Exception e) {
                        etbillvalue.setError("Enter Bill Total");
                        tvtip.setText("0.00");
                        tvtotal.setText("0.00");
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if (checkedId == R.id.rb10) {
                        try {
                            if (etbillvalue.getText().toString() != null) {

                                etbillvalue.addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                                        try {
                                            if (etbillvalue.getText().toString() != null) {
                                                a = Double.parseDouble(etbillvalue.getText().toString());
                                                Log.d("tot", a + "");
                                                double total = a * 0.1;
                                                String totals = String.format("%.1f", total);
                                                double total1 = total + a;
                                                String total2 = String.format("%.1f", total1);
                                                tvtip.setText(totals + "");
                                                tvtotal.setText(total2 + "");
                                            }
                                        } catch (Exception e) {
                                            etbillvalue.setError("Enter Bill Total");
                                            tvtip.setText("0.00");
                                            tvtotal.setText("0.00");
                                        }
                                    }

                                    @Override
                                    public void afterTextChanged(Editable s) {

                                    }
                                });

                                a = Double.parseDouble(etbillvalue.getText().toString());
                                Log.d("tot", a + "");
                                double total = a * 0.1;
                                String totals = String.format("%.1f", total);
                                double total1 = total + a;
                                String total2 = String.format("%.1f", total1);
                                tvtip.setText(totals + "");
                                tvtotal.setText(total2 + "");
                            }

                        } catch (NumberFormatException ex) {
                            etbillvalue.setError("Enter Bill Total");
                            tvtip.setText("0.00");
                            tvtotal.setText("0.00");
                        }
                    } else if (checkedId == R.id.rb15) {
                        try {
                            if (etbillvalue.getText().toString() != null) {
                                etbillvalue.addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                                        try {
                                            if (etbillvalue.getText().toString() != null) {

                                                a = Double.parseDouble(etbillvalue.getText().toString());
                                                Log.d("tot", a + "");
                                                double total = a * 0.15;
                                                String totals = String.format("%.1f", total);
                                                tvtip.setText(totals + "");
                                                double total1 = total + a;
                                                String total2 = String.format("%.1f", total1);
                                                tvtotal.setText(total2 + "");
                                            }
                                        } catch (Exception e) {
                                            etbillvalue.setError("Enter Bill Total");
                                            tvtip.setText("0.00");
                                            tvtotal.setText("0.00");
                                        }

                                    }

                                    @Override
                                    public void afterTextChanged(Editable s) {

                                    }
                                });

                                a = Double.parseDouble(etbillvalue.getText().toString());
                                Log.d("tot", a + "");
                                double total = a * 0.15;
                                String totals = String.format("%.1f", total);
                                tvtip.setText(totals + "");
                                double total1 = total + a;
                                String total2 = String.format("%.1f", total1);
                                tvtotal.setText(total2 + "");

                            }

                        } catch (NumberFormatException ex) {
                            etbillvalue.setError("Enter Bill Total");
                            tvtip.setText("0.00");
                            tvtotal.setText("0.00");
                        }
                    } else if (checkedId == R.id.rb18) {
                        try {
                            if (etbillvalue.getText().toString() != null) {
                                etbillvalue.addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                                        try {
                                            if (etbillvalue.getText().toString() != null) {
                                                a = Double.parseDouble(etbillvalue.getText().toString());
                                                Log.d("tot", a + "");
                                                double total = a * 0.18;
                                                String totals = String.format("%.1f", total);
                                                double total1 = total + a;
                                                String total2 = String.format("%.1f", total1);
                                                tvtip.setText(totals + "");
                                                tvtotal.setText(total2 + "");


                                            }
                                        } catch (Exception e) {
                                            etbillvalue.setError("Enter Bill Total");
                                            tvtip.setText("0.00");
                                            tvtotal.setText("0.00");
                                        }

                                    }

                                    @Override
                                    public void afterTextChanged(Editable s) {

                                    }
                                });

                                a = Double.parseDouble(etbillvalue.getText().toString());
                                Log.d("tot", a + "");
                                double total = a * 0.18;
                                String totals = String.format("%.1f", total);
                                double total1 = total + a;
                                String total2 = String.format("%.1f", total1);
                                tvtip.setText(totals + "");
                                tvtotal.setText(total2 + "");

                            }

                        } catch (NumberFormatException ex) {
                            etbillvalue.setError("Enter Bill Total");
                            tvtip.setText("0.00");
                            tvtotal.setText("0.00");
                        }


                    } else if (checkedId == R.id.rbcustom) {
                        tvprogress.setVisibility(View.VISIBLE);
                        seekBar.setProgress(25);
                        if (etbillvalue.getText().toString() != null) {
                            try {
                                a = Double.parseDouble(etbillvalue.getText().toString());
                                double progress = (seekBar.getProgress() * a) / 100.0;
                                String totals = String.format("%.1f", progress);
                                double total1 = progress + a;
                                String total2 = String.format("%.1f", total1);
                                tvtip.setText(totals);
                                tvtotal.setText(total2 + "");
                            } catch (NumberFormatException ex) {

                            }

                        }

                        etbillvalue.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                            }

                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                try {
                                    if (etbillvalue.getText().toString() != null) {
                                        a = Double.parseDouble(etbillvalue.getText().toString());
                                        double progress = (seekBar.getProgress() * a) / 100.0;
                                        String totals = String.format("%.1f", progress);
                                        double total1 = progress + a;
                                        String total2 = String.format("%.1f", total1);
                                        tvtip.setText(totals);

                                        tvtotal.setText(total2 + "");

                                    }
                                } catch (Exception e) {
                                    etbillvalue.setError("Enter Bill Total");
                                    tvtip.setText("0.00");
                                    tvtotal.setText("0.00");
                                }

                            }

                            @Override
                            public void afterTextChanged(Editable s) {

                            }
                        });


                        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                tvprogress.setText(String.valueOf(seekBar.getProgress()) + "%");
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {
                                try {
                                    if (etbillvalue.getText().toString() != null) {
                                        a = Double.parseDouble(etbillvalue.getText().toString());
                                        double progress = (seekBar.getProgress() * a) / 100.0;
                                        String totals = String.format("%.1f", progress);
                                        double total1 = progress + a;
                                        String total2 = String.format("%.1f", total1);
                                        tvtip.setText(totals);
                                        tvtotal.setText(total2 + "");

                                    }
                                    else
                                        etbillvalue.setError("jfds");
                                }

                                catch(Exception e)
                                    {

                                    }
                                }


                        });
                    }

                }

            });
        }
            btnexit = (Button) findViewById(R.id.btnexit);
            btnexit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    System.exit(0);
                }
            });

    }

}



