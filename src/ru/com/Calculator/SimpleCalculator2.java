package ru.com.Calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 11.09.2016.
 */
public class SimpleCalculator2 {

    // Обьявим все компоненты нашего класса.
    JPanel windowsContent; // Контейнер для хранения и отображения компонентов(енопки поля текстоаые сообщения
    JTextField displayFild; // Надписи.
    JButton butto0;
    JButton button1; // Кнопки
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;

    SimpleCalculator2 (){ // Конструктор. Инициализирует при каждом создании экземпляра обьекта
        windowsContent = new JPanel();

        BorderLayout b1 = new BorderLayout();
        //Менеджер размещения BorderLayout разделяет панель на пять областей:
        // центральную, верхнюю, нижнюю, правую и левую.

        windowsContent.setLayout(b1);
        // Размещаем на нашей панеле менеджер границ

        displayFild = new JTextField(30);
        windowsContent.add("North",displayFild); // Расположили текстовую надпись

        butto0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,3); //GridLayout разбивает панель на ячейки одинаковой ширины и высоты (таким образом окно становится похожим на таблицу)
        p1.setLayout(g1); // Добавляем на панель
        // Добавляем копки на наель
        p1.add(butto0);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonPoint);
        p1.add(buttonEqual);


    } // Конец конструктора

    public static void main(String[] args) {




    }// Конец класса

}
