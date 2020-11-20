package com.example.calculadoraadvance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_0;
    Button btn_suma;
    Button btn_resta;
    Button btn_multi;
    Button btn_divide;
    Button btn_clean;
    Button btn_coma;
    Button btn_igual;
    TextView resultado;
    Double resultado1;

String operador="0",num1,num2;
    //Declaramos las variables que vamos a usar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btn_1=(Button)findViewById(R.id.button1);
        btn_2=(Button)findViewById(R.id.button2);
        btn_3=(Button)findViewById(R.id.button3);
        btn_4=(Button)findViewById(R.id.button4);
        btn_5=(Button)findViewById(R.id.button5);
        btn_6=(Button)findViewById(R.id.button6);
        btn_7=(Button)findViewById(R.id.button7);
        btn_8=(Button)findViewById(R.id.button8);
        btn_9=(Button)findViewById(R.id.button9);
        btn_0=(Button)findViewById(R.id.button0);
        resultado=(TextView)findViewById(R.id.textView1);
        btn_coma=(Button)findViewById(R.id.buttonComa);
        btn_clean=(Button)findViewById(R.id.buttonclean) ;

btn_suma=(Button)findViewById(R.id.buttonsuma) ;
//Las asiciamos con sus respectivas ID de cada boton
btn_suma.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        resultado=(TextView) findViewById(R.id.textView1);
        num1=resultado.getText().toString();
        operador="+";
        resultado.setText("");
    }
});
// Si clicamos el boton mas el resultado mostrado en la TextView se guardará y el operador tendrá el signo + y vaciará el TextView mostrado
btn_resta=(Button)findViewById(R.id.buttonResta) ;
btn_resta.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        resultado=(TextView) findViewById(R.id.textView1);
        num1=resultado.getText().toString();
        operador="-";
        resultado.setText("");
    }
});

btn_multi=(Button)findViewById(R.id.buttonmulti);
btn_multi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        resultado=(TextView) findViewById(R.id.textView1);
        num1=resultado.getText().toString();
        operador="x";
        resultado.setText("");
    }
});

btn_divide=(Button)findViewById(R.id.buttonDivide);
btn_divide.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        resultado=(TextView) findViewById(R.id.textView1);
        num1=resultado.getText().toString();
        operador="/";
        resultado.setText("");
    }
});



btn_igual=(Button)findViewById(R.id.buttonigual);
btn_igual.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        resultado=(TextView)findViewById(R.id.textView1);
        num2=resultado.getText().toString();//Guardamos en el valor num2 lo recogido en la TextView

        if(operador.equals("0")){
            resultado.setText(resultado.getText().toString());
            operador="E";
        }
                if(operador.equals("+")){
                    resultado1=Double.parseDouble(num1)+Double.parseDouble(num2);
                    resultado.setText(String.valueOf(resultado1));
                    operador="E";
                }//Cuando se da click en el boton + se mostrará el resultado de la suma del num1 guardado anteriormente y del numero 2

        if(operador.equals("-")){
            resultado1=Double.parseDouble(num1)-Double.parseDouble(num2);
            resultado.setText(String.valueOf(resultado1));
            operador="E";
        }

        if(operador.equals("x")){
            resultado1=Double.parseDouble(num1)*Double.parseDouble(num2);
            resultado.setText(String.valueOf(resultado1));
            operador="E";
        }


        if(operador.equals("/")){
            resultado1=Double.parseDouble(num1)/Double.parseDouble(num2);
            resultado.setText(String.valueOf(resultado1));
            operador="E";
        }

        if(operador.equals("E")){
            resultado.setText(resultado.getText().toString());
        }

    }
});

    }
    public void bn1(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"1");
    }//Mostrar los numeros de cada boton

    public void bn2(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"2");
    }

    public void bn3(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"3");
    }

    public void bn4(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"4");
    }

    public void bn5(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"5");
    }

    public void bn6(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"6");
    }

    public void bn7(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"7");
    }

    public void bn8(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"8");
    }

    public void bn9(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"9");
    }

    public void bn0(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+"0");
    }

    public void bnClean(View view){
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText("");
    }

    public void bnpunto(View View)
    {
        resultado=(TextView)findViewById(R.id.textView1);
        resultado.setText(resultado.getText().toString()+".");
    }


}