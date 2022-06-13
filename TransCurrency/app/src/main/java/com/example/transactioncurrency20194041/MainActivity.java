package com.example.transactioncurrency20194041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public int i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.textView2);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editTextNumber);

        Spinner spinner1 = findViewById(R.id.spinner_from);

        List<String> Currency = Arrays.asList("Mỹ - Đô la","Việt Nam - Đồng","Châu Âu - Euro","Anh - Bảng","Nhật Bản - Yên","Hàn Quốc - Won","Thái Lan - Bath","Trung Quốc - Nhân dân tệ");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Currency);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                i1 = i;
                textView2.setText("Tỷ giá hối đoái");
                textView4.setText("Tỷ giá hối đoái");
                textView.setText("0");
                ImageView imageView1 = findViewById(R.id.imageView);
                ImageView imageView3 = findViewById(R.id.imageView3);
                if(i == 0) {
                    imageView1.setImageResource(R.drawable.dollar);
                    imageView3.setImageResource(R.drawable.qk_us);
                }else if (i == 1) {
                    imageView1.setImageResource(R.drawable.dong);
                    imageView3.setImageResource(R.drawable.qk_vn);
                }else if (i == 2){
                    imageView1.setImageResource(R.drawable.euro);
                    imageView3.setImageResource(R.drawable.qk_euro);
                }else if (i == 3){
                    imageView1.setImageResource(R.drawable.bang_anh);
                    imageView3.setImageResource(R.drawable.qk_uk);
                }else if (i == 4){
                    imageView1.setImageResource(R.drawable.yen);
                    imageView3.setImageResource(R.drawable.qk_japan);
                }else if (i == 5){
                    imageView1.setImageResource(R.drawable.korea);
                    imageView3.setImageResource(R.drawable.qk_korea);
                }else if (i == 6){
                    imageView1.setImageResource(R.drawable.bath);
                    imageView3.setImageResource(R.drawable.qk_thai);
                }else if (i == 7){
                    imageView1.setImageResource(R.drawable.trungquoc);
                    imageView3.setImageResource(R.drawable.qk_china);
                }
//                    case 2: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 3: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 4: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 5: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 6: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 7: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 8: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 9: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 10: imageView1.setImageResource(R.drawable.japan_yen_);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner2 = findViewById(R.id.spinner_from1);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                i2=i;
                textView2.setText("Tỷ giá hối đoái");
                textView4.setText("Tỷ giá hối đoái");
                textView.setText("0");
                ImageView imageView4 = findViewById(R.id.imageView4);
                ImageView imageView6 = findViewById(R.id.imageView6);
                if(i == 0) {
                    imageView4.setImageResource(R.drawable.dollar);
                    imageView6.setImageResource(R.drawable.qk_us);
                }else if (i == 1) {
                    imageView4.setImageResource(R.drawable.dong);
                    imageView6.setImageResource(R.drawable.qk_vn);
                }else if (i == 2){
                    imageView4.setImageResource(R.drawable.euro);
                    imageView6.setImageResource(R.drawable.qk_euro);
                }else if (i == 3){
                    imageView4.setImageResource(R.drawable.bang_anh);
                    imageView6.setImageResource(R.drawable.qk_uk);
                }else if (i == 4){
                    imageView4.setImageResource(R.drawable.yen);
                    imageView6.setImageResource(R.drawable.qk_japan);
                }else if (i == 5){
                    imageView4.setImageResource(R.drawable.korea);
                    imageView6.setImageResource(R.drawable.qk_korea);
                }else if (i == 6){
                    imageView4.setImageResource(R.drawable.bath);
                    imageView6.setImageResource(R.drawable.qk_thai);
                }else if (i == 7){
                    imageView4.setImageResource(R.drawable.trungquoc);
                    imageView6.setImageResource(R.drawable.qk_china);
                }
                //case 2: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 3: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 4: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 5: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 6: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 7: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 8: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 9: imageView1.setImageResource(R.drawable.japan_yen_);
//                    case 10: imageView1.setImageResource(R.drawable.japan_yen_);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button button = findViewById(R.id.button);
        button.setEnabled(false);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(editText.getText().toString().isEmpty()){
                    button.setEnabled(false);
                }else button.setEnabled(true);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            double num1, num2;
            @Override
            public void onClick(View view) {
                if(i1 == 0){
                    if(i2 == 0){
                        textView2.setText("1 USD = 1 USD");
                        textView4.setText("1 USD = 1 USD");
                        textView.setText(editText.getText().toString());
                    }else if(i2 == 1){
                        textView2.setText("1 USD = 23165 VND");
                        textView4.setText("1 VND = 0.00004317 USD");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 23.165 * num1;
                        textView.setText(String.valueOf(num2)+ " K");
                    }else if(i2 == 2){
                        textView2.setText("1 USD = 0.9409 EUR");
                        textView4.setText("1 EUR = 1.06281 USD");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.9409 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 3){
                        textView2.setText("1 USD = 0.8001 GBP");
                        textView4.setText("1 GBP = 1.2498 USD");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.8001 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 4){
                        textView2.setText("1 USD = 134.03 JPY");
                        textView4.setText("1 JPY = 0.007461 USD");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 134.03 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 5){
                        textView2.setText("1 USD = 1266.05 KRW");
                        textView4.setText("1 KRW = 0.0007899 USD");;
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 1266.05 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 6){
                        textView2.setText("1 USD = 34.63 THB");
                        textView4.setText("1 THB = 0.02888 USD");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 34.63 * num1;
                        textView.setText(String.valueOf(Math.round(num2)) );
                    }else if(i2 == 7){
                        textView2.setText("1 USD = 6.6917 CNY");
                        textView4.setText("1 CNY = 0.1494 USD");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 6.6917 * num1;
                        textView.setText(String.valueOf(num2));
                    }
                } else if ( i1 == 1){
                    if(i2 == 0){
                        textView2.setText("1 VND = 0.00004317 USD");
                        textView4.setText("1 USD = 23165 VND");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.00004317 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 1){
                        textView2.setText("1 VND = 1 VND");
                        textView4.setText("1 VND = 1 VND");
                        textView.setText(editText.getText().toString());
                    }else if(i2 == 2){
                        textView2.setText("1 VND = 0.00004062 EUR");
                        textView4.setText("1 EUR = 24618 VND");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.00004062 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 3){
                        textView2.setText("1 VND = 0.00003454 GBP");
                        textView4.setText("1 GBP = 28952 VND");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.00003454 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 4){
                        textView2.setText("1 VND = 0.005786 JPY");
                        textView4.setText("1 JPY = 172.83 VND");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.005786 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 5){
                        textView2.setText("1 VND = 0.05465 KRW");
                        textView4.setText("1 KRW = 18.298 VND");;
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.05465 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 6){
                        textView2.setText("1 VND = 0.001495 THB");
                        textView4.setText("1 THB = 668.9 VND");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.001495 * num1;
                        textView.setText(String.valueOf(Math.round(num2)) );
                    }else if(i2 == 7){
                        textView2.setText("1 VND = 0.0002889 CNY");
                        textView4.setText("1 CNY = 3461.4053 VND");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.0002889 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }
                }else if ( i1 == 2) {
                    if (i2 == 0) {
                        textView2.setText("1 EUR = 1.0627 USD");
                        textView4.setText("1 USD = 0.941 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 1.0627 * num1;
                        textView.setText(String.valueOf(num2));
                    } else if (i2 == 1) {
                        textView2.setText("1 EUR = 24618 VND");
                        textView4.setText("1 VND = 0.00004062 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 24.618 * num1;
                        textView.setText(String.valueOf(Math.round(num2))+" K");
                    } else if (i2 == 2) {
                        textView2.setText("1 EUR = 1 EUR");
                        textView4.setText("1 EUR = 1 EUR");
                        textView.setText(editText.getText().toString());
                    } else if (i2 == 3) {
                        textView2.setText("1 EUR = 0.8515 GBP");
                        textView4.setText("1 GBP = 1.1744 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.8515 * num1;
                        textView.setText(String.valueOf(num2));
                    } else if (i2 == 4) {
                        textView2.setText("1 EUR = 141.9554 JPY");
                        textView4.setText("1 JPY = 0.007044 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 141.9554 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    } else if (i2 == 5) {
                        textView2.setText("1 EUR = 1348.32 KRW");
                        textView4.setText("1 KRW = 18.298 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 1348.32 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    } else if (i2 == 6) {
                        textView2.setText("1 EUR = 36.8969 THB");
                        textView4.setText("1 THB = 0.0271 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 36.8969 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    } else if (i2 == 7) {
                        textView2.setText("1 EUR = 7.1029 CNY");
                        textView4.setText("1 CNY = 3461.4053 EUR");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 7.1029 * num1;
                        textView.setText(String.valueOf(num2));
                    }
                }else if ( i1 == 3) {
                    if (i2 == 0) {
                        textView2.setText("1 GBP = 1.2498 USD");
                        textView4.setText("1 USD = 0.8001 GBP");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 1.2498 * num1;
                        textView.setText(String.valueOf(num2));
                    } else if (i2 == 1) {
                        textView2.setText("1 GBP = 28952 VND");
                        textView4.setText("1 VND = 0.00003454 GBP");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 28.952 * num1;
                        textView.setText(String.valueOf(Math.round(num2))+" K");
                    } else if (i2 == 2) {
                        textView2.setText("1 GBP = 1.1744 EUR");
                        textView4.setText("1 EUR = 0.8515 GBP");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 1.1744 * num1;
                        textView.setText(String.valueOf(num2));
                    } else if (i2 == 3) {
                        textView2.setText("1 GBP = 1 GBP");
                        textView4.setText("1 GBP = 1 GBP");
                        textView.setText(editText.getText().toString());
                    } else if (i2 == 4) {
                        textView2.setText("1 GBP = 166.7041 JPY");
                        textView4.setText("1 JPY = 0.006 GBP");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 166.7041 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    } else if (i2 == 5) {
                        textView2.setText("1 GBP = 1593.4 KRW");
                        textView4.setText("1 KRW = 0.0006276 GBP");
                        ;
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 1593.4 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    } else if (i2 == 6) {
                        textView2.setText("1 GBP = 43.3296 THB");
                        textView4.setText("1 THB = 0.0231 GBP");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 43.3296 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    } else if (i2 == 7) {
                        textView2.setText("1 GBP = 8.3412 CNY");
                        textView4.setText("1 CNY = 0.1199 GBP");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 8.3412 * num1;
                        textView.setText(String.valueOf(num2));
                    }
                }else if ( i1 == 4){
                    if(i2 == 0){
                        textView2.setText("1 JPY = 0.007461 USD");
                        textView4.setText("1 USD = 134.03 JPY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.007461 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 1){
                        textView2.setText("1 JPY = 172.83 VND");
                        textView4.setText("1 VND = 0.005786 JPY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 172.83 * num1;
                        textView.setText(String.valueOf(Math.round(num2))+" K");
                    }else if(i2 == 2){
                        textView2.setText("1 JPY = 0.007044 EUR");
                        textView4.setText("1 EUR = 141.9554 JPY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.007044 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 3){
                        textView2.setText("1 JPY = 0.006 GBP");
                        textView4.setText("1 GBP = 166.7041 JPY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.006 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 4){
                        textView2.setText("1 JPY = 1 JPY");
                        textView4.setText("1 JPY = 1 JPY");
                        textView.setText(editText.getText().toString());
                    }else if(i2 == 5){
                        textView2.setText("1 JPY = 9.4982 KRW");
                        textView4.setText("1 KRW = 0.1053 JPY");;
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 9.4982 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 6){
                        textView2.setText("1 JPY = 0.2599 THB");
                        textView4.setText("1 THB = 3.8476 JPY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.2599 * num1;
                        textView.setText(String.valueOf(num2) );
                    }else if(i2 == 7){
                        textView2.setText("1 JPY = 0.05004 CNY");
                        textView4.setText("1 CNY = 19.984 JPY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.05004 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }
                }else if ( i1 == 5){
                    if(i2 == 0){
                        textView2.setText("1 KRW = 0.0007899 USD");
                        textView4.setText("1 USD = 1266.05 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.0007899 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 1){
                        textView2.setText("1 KRW = 18.298 VND");
                        textView4.setText("1 VND = 0.05465 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 18.298 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 2){
                        textView2.setText("1 KRW = 0.0007417 EUR");
                        textView4.setText("1 EUR = 1348.32 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.0007417 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 3){
                        textView2.setText("1 KRW = 0.0006276 GBP");
                        textView4.setText("1 GBP = 1593.4 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.0006276 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 4){
                        textView2.setText("1 KRW = 0.1053 JPY");
                        textView4.setText("1 JPY = 9.4982 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 =  0.1053 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 5){
                        textView2.setText("1 KRW = 1 KRW");
                        textView4.setText("1 KRW = 1 KRW");;
                        textView.setText(editText.getText().toString());
                    }else if(i2 == 6){
                        textView2.setText("1 KRW = 0.02737 THB");
                        textView4.setText("1 THB = 36.5364 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.02737 * num1;
                        textView.setText(String.valueOf(Math.round(num2)) );
                    }else if(i2 == 7){
                        textView2.setText("1 KRW = 0.005268 CNY");
                        textView4.setText("1 CNY = 189.8254 KRW");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.005268 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }
                }else if ( i1 == 6){
                    if(i2 == 0){
                        textView2.setText("1 THB = 0.02888 USD");
                        textView4.setText("1 USD = 34.63 THB");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.02888 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 1){
                        textView2.setText("1 THB = 668.9 VND");
                        textView4.setText("1 VND = 0.001495 THB");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.6689 * num1;
                        textView.setText(String.valueOf(Math.round(num2)+" K"));
                    }else if(i2 == 2){
                        textView2.setText("1 THB = 0.0271 EUR");
                        textView4.setText("1 EUR = 36.8969 THB");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.0271 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 3){
                        textView2.setText("1 THB = 43.3296 GBP");
                        textView4.setText("1 GBP = 0.0231 THB");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 43.3296 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 4){
                        textView2.setText("1 THB = 3.8476 JPY");
                        textView4.setText("1 JPY = 0.2599 THB");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 3.8476 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 5){
                        textView2.setText("1 THB = 36.5364 KRW");
                        textView4.setText("1 KRW = 0.02737 THB");;
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 36.5364 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 6){
                        textView2.setText("1 THB = 1 THB");
                        textView4.setText("1 THB = 1 THB");
                        textView.setText(editText.getText().toString());
                    }else if(i2 == 7){
                        textView2.setText("1 THB = 0.1925 CNY");
                        textView4.setText("1 CNY = 5.1948 THB");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.1925 * num1;
                        textView.setText(String.valueOf(num2));
                    }
                }else if ( i1 == 7){
                    if(i2 == 0){
                        textView2.setText("1 CNY = 0.1494 USD");
                        textView4.setText("1 USD = 6.6917 CNY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.1494 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 1){
                        textView2.setText("1 CNY = 3461.4053 VND");
                        textView4.setText("1 VND = 0.0002889 CNY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 3.4614053 * num1;
                        textView.setText(String.valueOf(Math.round(num2)) + " K");
                    }else if(i2 == 2){
                        textView2.setText("1 CNY = 0.1408 EUR");
                        textView4.setText("1 EUR = 7.1023 CNY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.1408 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 3){
                        textView2.setText("1 CNY = 0.1199 GBP");
                        textView4.setText("1 GBP = 8.3412 CNY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.00003454 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 4){
                        textView2.setText("1 CNY = 19.984 JPY");
                        textView4.setText("1 JPY = 0.05004 CNY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.005786 * num1;
                        textView.setText(String.valueOf(num2));
                    }else if(i2 == 5){
                        textView2.setText("1 CNY = 189.8254 KRW");
                        textView4.setText("1 KRW = 0.005268 CNY");;
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.05465 * num1;
                        textView.setText(String.valueOf(Math.round(num2)));
                    }else if(i2 == 6){
                        textView2.setText("1 CNY = 5.1948 THB");
                        textView4.setText("1 THB = 0.1925 CNY");
                        num1 = Double.parseDouble(editText.getText().toString());
                        num2 = 0.001495 * num1;
                        textView.setText(String.valueOf(num2) );
                    }else if(i2 == 7){
                        textView2.setText("1 CNY = 1 CNY");
                        textView4.setText("1 CNY = 1 CNY");
                        textView.setText(editText.getText().toString());
                    }
                }
            }
        });


    }
}