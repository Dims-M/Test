package ru.com.Calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 10.09.2016.
 */
public class SimpleCalculator {

    public static void main(String[] args) {



        // Основное окно с программой
        JPanel myFlame = new JPanel();

        // Менеджер  размещения элементов  и для управления нашими компонетами в окне.
        FlowLayout f1 = new FlowLayout();
        myFlame.setLayout(f1);

        // Cоздаем обьекты в памяти

        JLabel label1 = new JLabel("Цифра 1:");
        //В ведите первую цифру
        JTextField field = new JTextField(10);
        JLabel label2 = new JLabel("Цифра 2:");
        //В ведите вторую цифру
        JTextField field1 = new JTextField(10);
        JLabel label3 = new JLabel("Сумма :");
        JTextField field3 = new JTextField(10);
        // кнопка
        JButton go = new JButton("Посчитать");

        // Добавляем на панель наши элементы
        myFlame.add(label1);
        myFlame.add(field);
        myFlame.add(label2);
        myFlame.add(field1);
        myFlame.add(label3);
        myFlame.add(field3);
        myFlame.add(go);

        // Задаем фрейм
        //окно с рамкой и строкой заголовка (с кнопками «Свернуть», «Во весь экран» и «Закрыть»
        JFrame frame1 = new JFrame("Калькулятор");
        frame1.setContentPane(myFlame);
        // Привязываем контент c кнопками и др
        //Размеры окна
        frame1.setSize(350, 150);
        //Добавляем кнопки (Свернуть, полный экран и закрыть)
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Указываем Видимость панели

        frame1.setVisible(true);
        frame1.setLocation(550,400);



    }


}
