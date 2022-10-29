package ru.raspgleb.hellorobot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Класс калькулятор
 * @author Распопин Глеб
 * @version 1.0
 */
public class Calculator extends AppCompatActivity {

    /** Поле число №1 */
    Double first_number = 0.0;


    /** Поле число №1 */
    Double second_number = 0.0;

    /**
     * Поле со строковым значением
     * {@value} операция над числами №1 и №2
     */
    String math_operation = "=";

    /**
     * Функция инициализации активности
     * @param savedInstanceState
     * Связь с макетом, R - ресурс, layout - дизайн
     * Отображение текста без возможности редактирования пользователем
     * id.numbers - тег поля для будущих чисел
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView out = (TextView) findViewById(R.id.numbers);

        /**
         * Получение кнопки по id
         * @param setOnClickListener - обработка нажатия на кнопку пользователем
         * @param setText - формирование текста в поле id.numbers
         * @param out.getText() - текущее значение в поле
         */

        Button one = findViewById(R.id.one);
        one.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"1");

        });

        Button two = findViewById(R.id.two);
        two.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"2");

        });

        Button three = findViewById(R.id.three);
        three.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"3");

        });

        Button four = findViewById(R.id.four);
        four.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"4");

        });
        Button five = findViewById(R.id.five);
        five.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"5");

        });

        Button six = findViewById(R.id.six);
        six.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"6");

        });

        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"7");

        });

        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"8");

        });

        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"9");

        });

        Button zero = findViewById(R.id.zero);
        zero.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"0");

        });

        Button clear = findViewById(R.id.cl);
        clear.setOnClickListener((View view) ->{
            ((TextView) findViewById(R.id.numbers)).setText("");
        });

        /**
         * Условие, контролирующее текущее значение текствого поля
         */
        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
            }
            math_operation = "+";
            ((TextView) findViewById(R.id.numbers)).setText("");


        });

        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
            }
            math_operation = "-";
            ((TextView) findViewById(R.id.numbers)).setText("");

        });

        Button multiply = findViewById(R.id.multip);
        multiply.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
            }
            math_operation = "*";
            ((TextView) findViewById(R.id.numbers)).setText("");

        });

        Button divide = findViewById(R.id.divide);
        divide.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
            }
            math_operation = "/";
            ((TextView) findViewById(R.id.numbers)).setText("");

        });
        /**
         * Блок кода, где выполняется операция над числовыми полями
         * Не строгое условие, контролирующее текущее значение текствого поля и числового поля
         * @param switch - проверка значения строкового поля (операция над числами)
         */
        Button result = findViewById(R.id.equa);
        result.setOnClickListener((View view) ->{
            if(String.valueOf(out.getText()).equals("") || first_number == 0.0)
                math_operation = "=";

            switch (math_operation){
                case "+":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    /** Если операция на числовыми полями не даёт остаток */
                    if(String.valueOf(first_number + second_number).split("\\.")[1].equals("0")){
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((long)(first_number +second_number)));
                        /** Сбрасываем значение операции до значения по-умолчанию */
                        math_operation = "=";
                        break;
                    }

                    /** Если операция на числовыми полями даёт остаток */
                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number + second_number));
                        /** Сбрасываем значение операции до значения по-умолчанию */
                        math_operation = "=";
                        break;
                    }

                case "-":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    if(String.valueOf(first_number - second_number).split("\\.")[1].equals("0")){
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((long)(first_number - second_number)));
                        math_operation = "=";
                        break;
                    }

                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number - second_number));
                        math_operation = "=";
                        break;
                    }

                case "*":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    if(String.valueOf(first_number * second_number).split("\\.")[1].equals("0")){
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((long)(first_number * second_number)));
                        math_operation = "=";
                        break;
                    }

                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number *second_number));
                        math_operation = "=";
                        break;
                    }
                case "/":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    /** Проверка числового поля-делителя на нулевое значение */
                    if(second_number!=0){
                        if(String.valueOf(first_number / second_number).split("\\.")[1].equals("0")){
                            ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((long)(first_number / second_number)));
                            math_operation = "=";
                            break;
                        }
                        else{
                            ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number / second_number));
                            math_operation = "=";
                            break;
                        }
                    }

                    else{
                        ((TextView) findViewById(R.id.numbers)).setText("");
                        math_operation = "=";
                        break;


                    }
                case "=":
                    ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(out.getText()));
                    math_operation = "=";
                    break;
            }
        });
    }

}