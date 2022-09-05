package com.company;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // коллекции
        //  все колекции джава можно условно разделить на две группы
        // интерфейс collection:
        // List (интерфейс) - > ArrayList, LinkedList
        // Set( интерфейс) - > HashSet
        //Queue ( иньерфейс)("очередь")
        // Stack (класс)
        //нтерфейс Map:
        // HashMap,SortedMap


        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList хранит элементы внутри себя ввиде массива

        //добавление элемента
        list.add(12);// добавление в конец списка
        list.add(15);
        list.add(21);
        list.add(12);
        list.add(7);
        list.add(37);
        list.add(16);
        list.add(12);
        list.add(3, 19);// добавление в указанную позицию
        //12, 15, 21, 19, 17
        System.out.println(list);
        // list.add(74, 12); если индекс добавляемого элемента больше
        // чем ко-во элемнетов в коллекции то произойдет ошибка
        //получени элемаента
        //get()- [] для коллекции
        int elem = list.get(3);
        System.out.println(elem);
        // удаление элемента из коллекции
        list.remove(4);
        System.out.println(list);
        list.remove(new Integer(7));
        System.out.println(list);
        // list.clear()- удаляет ВСЕ элементы из коллекции
        ArrayList<Integer> itemsToRemmove = new ArrayList<>();
        itemsToRemmove.add(12);
        itemsToRemmove.add(16);
        list.removeAll(itemsToRemmove);
        System.out.println(list);
        // текущее количество элементов в спискке
        System.out.println(list.size());
        // итерирование по коллекции
        for (int e : list) {
            System.out.println(e);
        }
        // перевод коллекция -> массив
        //.toArray - возвращает элементы коллекции в виде массива
        Object[] items = list.toArray();
        Integer[] arrItems = new Integer[list.size()];
        list.toArray(arrItems);
        for (int e : arrItems) {
            System.out.print("  " + e);
        }
        System.out.println();
        // предварительное выделение памяти
        list.ensureCapacity(12);
        ArrayList<String> list2 = new ArrayList<>(100);
        //LinkedList==ArrayList  кроме Capacity
       /* System.out.println("ArrayList");
        addToBegin(new ArrayList<>());
        addToEnd(new ArrayList<>());
        addToMidl(new ArrayList<>());
        System.out.println("ArrayList capacity = 200000");
        addToBegin(new ArrayList<>(200000));
        addToEnd(new ArrayList<>(200000));
        addToMidl(new ArrayList<>(200000));
        // LinkedList
        System.out.println("LinkedList");
        addToBegin(new LinkedList<>());
        addToEnd(new LinkedList<>());
        addToMidl(new LinkedList<>());*/

        //Queue (очередь) организованны по FIFO
        // FIFO (first in, first out) (первым пришел, первым вышел)
        // Stack (стек)   организованны по LIFO
        // LIFO (last in, first out) (последний зашел, первый вышел)
        Stack<String> stack= new Stack<>();
        stack.push("the");// добавляет элемент в начало стека (вершина кучи)
        stack.push("Emperor");
        stack.push("Protects");
        stack.push("always !!!");
        // peek возврашает верхний элемент стека без его удаления
        System.out.println(stack.peek());
        // pop возврашает верхний элемент стека с его удалением
        System.out.println(stack.pop());
        System.out.println(stack);
        ArrayQueue<Integer>  q = new ArrayQueue<>(100);
        q.add(1);// добовляет элемент в конец очерреди
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.get(2));

    }


    public static void addToBegin (List<Integer> list){
        long time = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            list.add (0,i);
        }
        long dt=System.currentTimeMillis()- time;
        System.out.printf("Добавление в начало: %dmc\n",dt);
    }
    public static void addToEnd (List<Integer> list){
        long time = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            list.add (i);
        }
        long dt=System.currentTimeMillis()- time;
        System.out.printf("Добавление в конец: %dmc\n",dt);
    }
    public static void addToMidl (List<Integer> list){
        long time = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            list.add (list.size()/2,i);
        }
        long dt=System.currentTimeMillis()- time;
        System.out.printf("Добавление в середину: %dmc\n",dt);
    }
}
