package ru.uina;

/**
 * Created by Администратор on 08.09.2016.
 */
public class Loader {

    public static void main(String[] args) {

        recursia1(1);



    }

    public static int recursia1 (int volue){

        volue ++;

        if (volue ==11){ // При достижении этого значения выйдем из методв и передадим значение
            System.out.println("Результат достигнут");
            return   volue;
        }
        System.out.println("Текущий результат = "+ volue);

        return recursia1(volue); // Рекурсия. Вызов метода самого себя
    }


}
