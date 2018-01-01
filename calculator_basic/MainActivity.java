package com.example.ruksharalam.calculator;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdd,btnsub,btndivide,btnmul;
    private TextView tvresult;

    private EditText etfirst,etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnsub = (Button)findViewById(R.id.btnSubtract);
        btndivide = (Button)findViewById(R.id.btnDivide);
        btnmul = (Button)findViewById(R.id.btnMultiply);
        etfirst = (EditText)findViewById(R.id.etFirstNumber);
        etsecond =(EditText)findViewById(R.id.etSecondNumber);
        tvresult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        System.out.println(num1+" "+num2);
        switch(view.getId()){
            case R.id.btnAdd:
                double addition = Double.parseDouble(num1) + Double.parseDouble(num2);
                System.out.println(addition);
                tvresult.setText(Double.toString(addition));
                break;
            case R.id.btnSubtract:
                double subtraction = Double.parseDouble(num1) - Double.parseDouble(num2);
                System.out.println(subtraction);
                tvresult.setText(Double.toString(subtraction));
                break;
            case R.id.btnDivide:
                try{
                    double division = Double.parseDouble(num1) / Double.parseDouble(num2);
                    tvresult.setText(Double.toString(division));
                }catch(Exception e){
                    tvresult.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                double multiply =Double.parseDouble(num1) * Double.parseDouble(num2);
                tvresult.setText(Double.toString(multiply));
                break;
        }
    }
}