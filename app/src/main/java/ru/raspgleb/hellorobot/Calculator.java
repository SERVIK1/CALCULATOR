package ru.raspgleb.hellorobot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    /** Поле для расчёта корня №1 */
    Double sqrt = 0.0;

    /**
     * Поле со строковым значением
     * {@value} операция над числами №1 и №2
     */
    String math_operation = "=";

    /**
     * Метод вызова сообщений для пользователя
     * @param text текст сообщения
     */
    private void showInfo(String text){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }

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
            /**
             *  "==" - сигнализирует что на экране результат предыдущих вычислений
             *  НЕ ПУТАТЬ с "=" - символ операции равенства!
             *  При нажатии на кнопку с цифрой экран предварительно очищается от старого значения
             */
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                /** Сбрасываем значение операции до значения "равно" */
                math_operation = "=";
            }
            /* Ноль необходимо убирать,если после него идёт обычная цифра следом */
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-1");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("1");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"1");
            }

        });

        Button two = findViewById(R.id.two);
        two.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-2");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("2");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"2");
            }

        });

        Button three = findViewById(R.id.three);
        three.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-3");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("3");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"3");
            }

        });

        Button four = findViewById(R.id.four);
        four.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-4");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("4");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"4");
            }

        });
        Button five = findViewById(R.id.five);
        five.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-5");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("5");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"5");
            }

        });

        Button six = findViewById(R.id.six);
        six.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-6");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("6");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"6");
            }

        });

        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-7");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("7");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"7");
            }

        });

        Button eight = findViewById(R.id.eight);
        if(math_operation.equals("==")){
            ((TextView) findViewById(R.id.numbers)).setText("");
            math_operation = "=";
        }
        eight.setOnClickListener((View view) ->{
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-8");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("8");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"8");
            }

        });

        Button nine = findViewById(R.id.nine);
        if(math_operation.equals("==")){
            ((TextView) findViewById(R.id.numbers)).setText("");
            math_operation = "=";
        }
        nine.setOnClickListener((View view) ->{
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")) {
                if (String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-9");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("9");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"9");
            }


        });

        Button zero = findViewById(R.id.zero);
        if(math_operation.equals("==")){
            ((TextView) findViewById(R.id.numbers)).setText("");
            math_operation = "=";
        }
        zero.setOnClickListener((View view) ->{
            if(String.valueOf(out.getText()).equals("0") || String.valueOf(out.getText()).equals("-0")){
                if(String.valueOf(out.getText()).equals("-0"))
                    ((TextView) findViewById(R.id.numbers)).setText("-0");
                else
                    ((TextView) findViewById(R.id.numbers)).setText("0");
            }
            else{
                ((TextView) findViewById(R.id.numbers)).setText(out.getText()+"0");
            }


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
            if(!String.valueOf(out.getText()).equals("") && !String.valueOf(out.getText()).equals("-")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
                math_operation = "+";
            }
            else{
                /**
                 * Условие проверки значения операции на случай если пользоваеть несколько раз нажал на кнопку
                 * Несколько раз нажал на кнопку арифм.операции, то система всёравно запомнит и вычислит в дальнейшем
                 */
                if(!math_operation.equals("+")){
                    math_operation = "=";
                }
                else{
                    math_operation = "+";
                }

            }
            ((TextView) findViewById(R.id.numbers)).setText("");


        });

        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("") && !String.valueOf(out.getText()).equals("-")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
                math_operation = "-";
            }
            else{
                if(!math_operation.equals("-")){
                    math_operation = "=";
                }
                else{
                    math_operation = "-";
                }

            }

            ((TextView) findViewById(R.id.numbers)).setText("");

        });

        Button multiply = findViewById(R.id.multip);
        multiply.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("") && !String.valueOf(out.getText()).equals("-")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
                math_operation = "*";
            }
            else{
                if(!math_operation.equals("*")){
                    math_operation = "=";
                }
                else{
                    math_operation = "*";
                }

            }
            ((TextView) findViewById(R.id.numbers)).setText("");

        });

        Button divide = findViewById(R.id.divide);
        divide.setOnClickListener((View view) ->{
            if(!String.valueOf(out.getText()).equals("") && !String.valueOf(out.getText()).equals("-")) {
                first_number = Double.valueOf(String.valueOf(out.getText()));
                math_operation = "/";
            }
            else{
                if(!math_operation.equals("/")){
                    math_operation = "=";
                }
                else{
                    math_operation = "/";
                }

            }
            ((TextView) findViewById(R.id.numbers)).setText("");

        });

        Button sqrt = findViewById(R.id.sqrt);
        sqrt.setOnClickListener((View view) ->{
            if (String.valueOf(out.getText()).equals("") || String.valueOf(out.getText()).equals("-")) {
                ((TextView) findViewById(R.id.numbers)).setText("0");
            } else {
                /* Корень извлекается только из положительного числа */
                if(String.valueOf(out.getText()).contains("-")) {
                    showInfo("Invalid value");
                }
                else{
                    if(String.valueOf(Math.sqrt(Double.valueOf(String.valueOf(out.getText())))).split("\\.")[1].equals("0")) {
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((int)Math.sqrt(Double.valueOf(String.valueOf(out.getText())))));
                    }
                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(Math.sqrt(Double.valueOf(String.valueOf(out.getText())))));
                    }
                }
            }
        });

        Button square = findViewById(R.id.square);
        square.setOnClickListener((View view) ->{

            if (String.valueOf(out.getText()).equals("") || String.valueOf(out.getText()).equals("-")) {
                ((TextView) findViewById(R.id.numbers)).setText("0");
            } else {
                /* Если число стало слишком большим, то уведомление об этом скажет и не допустит переполнения */
                if (String.valueOf(out.getText()).contains("E")) {
                    if (Integer.valueOf(String.valueOf(out.getText()).split("E")[1]) > 40) {
                        showInfo("Overflow");
                    }
                } else {
                    if (String.valueOf(Math.pow(Double.valueOf(String.valueOf(out.getText())), 2)).split("\\.")[1].equals("0")) {
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((int) Math.pow(Double.valueOf(String.valueOf(out.getText())), 2)));
                    } else {
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(Math.pow(Double.valueOf(String.valueOf(out.getText())), 2)));
                    }
                }
            }

        });


        Button point = findViewById(R.id.toch);
        point.setOnClickListener((View view) ->{
            if(math_operation.equals("==")){
                ((TextView) findViewById(R.id.numbers)).setText("");
                math_operation = "=";
            }
            if(!String.valueOf(out.getText()).contains(".")) {
                if (String.valueOf(out.getText()).equals("") || String.valueOf(out.getText()).equals("-")) {
                    if(String.valueOf(out.getText()).equals("-"))
                        ((TextView) findViewById(R.id.numbers)).setText("-0.");
                    else
                        ((TextView) findViewById(R.id.numbers)).setText("0.");
                } else {
                    ((TextView) findViewById(R.id.numbers)).setText(out.getText() + ".");
                }
            }


        });

        Button mod = findViewById(R.id.plus_minus);
        mod.setOnClickListener((View view) ->{
            if (String.valueOf(out.getText()).equals("")) {
                ((TextView) findViewById(R.id.numbers)).setText("-");
            } else {
                if(String.valueOf(out.getText()).contains("-")) {
                    ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(out.getText()).replace("-",""));
                }
                else{
                    ((TextView) findViewById(R.id.numbers)).setText("-" + out.getText());
                }
            }



        });

        /**
         * Блок кода, где выполняется операция над числовыми полями
         * Не строгое условие, контролирующее текущее значение текствого поля и числового поля
         * @param switch - проверка значения строкового поля (операция над числами)
         */
        Button result = findViewById(R.id.equa);
        result.setOnClickListener((View view) ->{
            if(String.valueOf(out.getText()).equals(""))
                math_operation = "==";

            switch (math_operation){
                case "+":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    /** Если операция на числовыми полями не даёт остаток */
                    if(String.valueOf(first_number + second_number).split("\\.")[1].equals("0")){
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((int)(first_number + second_number)));
                        /**
                         *  "==" - сигнализирует что на экране результат предыдущих вычислений
                         *  НЕ ПУТАТЬ с "=" - символ операции равенства!
                         */
                        math_operation = "==";
                        break;
                    }

                    /** Если операция на числовыми полями даёт остаток */
                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number + second_number));

                        math_operation = "==";
                        break;
                    }

                case "-":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    if(String.valueOf(first_number - second_number).split("\\.")[1].equals("0")){
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((int)(first_number - second_number)));
                        math_operation = "==";
                        break;
                    }

                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number - second_number));
                        math_operation = "==";
                        break;
                    }

                case "*":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    if(String.valueOf(first_number * second_number).split("\\.")[1].equals("0")){
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((int)(first_number * second_number)));
                        math_operation = "==";
                        break;
                    }

                    else{
                        ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number *second_number));
                        math_operation = "==";
                        break;
                    }
                case "/":
                    second_number = Double.valueOf(String.valueOf(out.getText()));
                    /** Проверка числового поля-делителя на нулевое значение */
                    if(second_number!=0){
                        if(String.valueOf(first_number / second_number).split("\\.")[1].equals("0")){
                            ((TextView) findViewById(R.id.numbers)).setText(String.valueOf((int)(first_number / second_number)));
                            math_operation = "==";
                            break;
                        }
                        else{
                            ((TextView) findViewById(R.id.numbers)).setText(String.valueOf(first_number / second_number));
                            math_operation = "==";
                            break;
                        }
                    }

                    else{
                        ((TextView) findViewById(R.id.numbers)).setText("");
                        showInfo("You can't divide by zero");
                        math_operation = "==";
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