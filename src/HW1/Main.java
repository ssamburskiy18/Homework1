package HW1;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Выберите номер таска от 1 до 11");
        int TaskNumber = scan.nextInt();
        switch (TaskNumber)
        {
            case 1:
                System.out.println("Обмен значений");
                exchangeValues();
                break;
            case 2:
                System.out.println("В некоторой школе занятия начинаются в 9:00. Продолжительность урока — 45 минут, \n" +
                        "после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут. \n" +
                        "Определите, когда заканчивается указанный урок.");
                lessonEnd();
                break;
            case 3:
                System.out.println("Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, минуты и секунды для каждого из моментов времени. \n" +
                        "Известно, что второй момент времени наступил не раньше первого. \n" +
                        "Определите, сколько секунд прошло между двумя моментами времени.");
                timeDifference();
                break;
            case 4:
                System.out.println("За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршрут длиной m километров?\n");
                motorRaly();
                break;
            case 5:
                System.out.println("Улитка ползёт по вертикальному шесту высотой h метров, \n" +
                        "поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?\n");
                snail();
                break;
            case 6:
                System.out.println("Напишите программу, которая считывает два целых числа a и b и выводит наибольшее значение из них. Числа — целые от 1 до 1000.");
                maximum();
                break;
            case 7:
                System.out.println("Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.");
                rook();
                break;
            case 8:
                System.out.println("Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.");
                comparison();
                break;
            case 9:
                System.out.println("Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).\n");
                moreThanPrevious();
                break;
            case 10 :
                System.out.println("Дан массив, состоящий из целых чисел. Напишите программу, которая в данном массиве определит количество элементов, у которых два соседних и, при этом, оба соседних элемента меньше данного.");
                largeBothNeigthbors();
                break;
            case 11:
                System.out.println("Напишите программу, которая переставляет соседние элементы массива (1-й элемент поменять с 2-м, 3-й с 4-м и т.д. Если элементов нечетное число, то последний элемент остается на своем месте).\n");
                neighboringElements();
                break;
                default:
                System.out.println("Выберите верный номер таска");
        }
    }

    public static void exchangeValues(){
        System.out.println("Введите целое число a:");
        int a = scan.nextInt();
        System.out.println("Введите целое число b:");
        int b = scan.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " " + "b: " + b);
    }

    public static void lessonEnd(){
        System.out.println("Выберите урок от 1 до 10");
        int lesson = scan.nextInt();
        int shortBreak = (lesson - 1) * 5;
        int longBreak = (lesson  - 1) / 2 * 10;
        int endLesson = lesson * 45 + shortBreak + longBreak;
        int b = endLesson / 60 + 9;
        int a =  endLesson % 60;
        System.out.println(b + ":" + a);
    }

    public static void timeDifference(){
        System.out.println("Введите часы,минуты,секунды 1го момента времени: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Введите часы,минуты,секунды 2го момента времени: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int result = ((x-a)*3600 + (y-b)*60 + z - c);
        System.out.println(result);
    }

    public static void motorRaly(){
        System.out.println("Введите колличество проехавших киллометров киллометров: ");
        int n = scan.nextInt();
        assert (n >= 10000):"введите значение меньше 10 000";
        System.out.println("Введите длину маршрута: ");
        int m = scan.nextInt();
        assert (m >= 10000):"введите значение меньше 10 000";
        int result = (int) Math.ceil((double) m / n);
        System.out.println("Колличство дней затраченных на поездку: " + result);
    }

    public static void snail(){
        System.out.println("Введите высоту шеста");
        int h = scan.nextInt();
        System.out.println("Введите на сколько метров  улитка поднялась за день а: ");
        int a = scan.nextInt();
        System.out.println("Введите на сколько метров  улитка спустилась  за ночь b: ");
        int b = scan.nextInt();
        assert (a > b):"a не может быть меньше b";
        int day = (int) Math.ceil((double) h / (a-b));
        System.out.println("Количество дней: " + day);
    }

    public static void maximum(){
        System.out.println("Введите число a (от 1 до 1000): ");
        int a = scan.nextInt();
        System.out.println("Введите число b (от 1 до 1000): ");
        int b = scan.nextInt();
        int result = a < b ? b : a;
        System.out.println("Наибольшим является " + result);
    }

    public static void rook(){
        System.out.println("Введите номер строки ладьи: ");
        int x = scan.nextInt();
        System.out.println("Введите номер стобца ладьи: ");
        int y = scan.nextInt();
        System.out.println("Введите номер строки другой фигуры: ");
        int z = scan.nextInt();
        System.out.println("Введите номер стобца другой фигуры: ");
        int j = scan.nextInt();
        if (x == z || y == j)
            System.out.println("YES");
            else
            System.out.println("NO");
    }

    public static void comparison(){
        System.out.println("Введите 1е число: ");
        int a = scan.nextInt();
        System.out.println("Введите 2е число: ");
        int b = scan.nextInt();
        System.out.println("Введите 3е число: ");
        int c = scan.nextInt();
        if (a == b & a == c) {
            System.out.println("3");}
            else if (a == b || a == c || b == c){
                System.out.println("2");}
            else{
                System.out.println("0");}
        }

    public static void moreThanPrevious(){
        System.out.println("Введите размерность массива: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Заполните массив");
        for(int i = 0; i < size;i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Полученный массив");
        for (int i = 0;i < size;i++){
            System.out.print(" " + arr[i]);
        }
        int count = 0;
        for (int i = 1;i < size;i++) {
        if(arr[i-1] < arr[i])
            count ++;
        }
        System.out.println("\n Результат : " + count);
        }

        public static void largeBothNeigthbors(){
            System.out.println("Введите размерность массива: ");
            int size = scan.nextInt();
            int arr[] = new int[size];
            System.out.println("Заполните массив");
            for(int i = 0; i < size;i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println("Полученный массив");
            for (int i = 0;i < size;i++){
                System.out.print(" " + arr[i]);
            }
            int count = 0;
            for (int i = 1; i < size; i = i + 2) {
                if (arr[i - 1] > arr[i] || arr[i] < arr[i + 1]) {
                }else
                    count ++;
            }
            System.out.println("\n Результат: " + count);
        }

        public static void neighboringElements(){
            System.out.println("Введите размерность массива: ");
            int size = scan.nextInt();
            int arr[] = new int[size];
            System.out.println("Заполните массив");
            for(int i = 0; i < size;i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println("Полученный массив");
            for (int i = 0;i < size;i++){
                System.out.print(" " + arr[i]);
            }
            int count;
            for(int i = 0;i < arr.length - 1;i++) {
            if(i % 2 == 0){
                count = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = count; }
            }
            System.out.println(": " + Arrays.toString(arr));
            }
        }







