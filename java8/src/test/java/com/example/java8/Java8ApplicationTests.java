package com.example.java8;

import com.example.java8.entity.Apple;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Java8ApplicationTests {

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return  result;
    }
    public static void main(String[] args){
        contextLoads();
    }


    public static void contextLoads() {
        Apple apple1 = new Apple();
        apple1.setColor("green");
        apple1.setWeight(180);
        Apple apple2 = new Apple();
        apple2.setColor("red");
        apple2.setWeight(140);
        Apple apple3 = new Apple();
        apple3.setColor("green");
        apple3.setWeight(130);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(apple1);
        inventory.add(apple2);
        inventory.add(apple3);

        inventory.sort(comparing(Apple::getWeight));

        System.out.println(inventory);
//        System.out.println((List<String> list) -> list.isEmpty());
//        List<Apple> aps = filterApples(inventory,Apple::isGreenApple);
//        System.out.println(aps);

        //Lambda 表达式    66666666流批  当一个方法只用一次或很少次的时候，就不需要去为它写定义，直接使用Lambda表达式，代码更干净，更清晰
        System.out.println(filterApples(inventory,(Apple a) ->"green".equals(a.getColor())));
        System.out.println(filterApples(inventory,(Apple a) ->a.getWeight()>150));

        /**
         * java8 并行处理数据 使用Stream() API  而不需要用多线程
         *
         *
         */
         //顺序处理
        List<Apple> heavyApples = inventory.stream().filter((Apple a) -> a.getWeight() > 150).collect(toList());

        //并行处理  很好的利用了多核处理器
        List<Apple> ha2 = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150).collect(toList());

        /**
         * java8的接口中提供了默认的方法，用default修饰，在实现类没有实现方法时提供方法内容。
         * 如：List接口提供了sort（）
         * default void （Comparator<？ super E > c){
         * Collections.sort(this,c)
         * }
         */
        /**
         * 第二章  通过行为参数化传递代码   将行为  a.getWeight() > 150  作为参数传递给lambda表达式
         */


         //lambda 表达式 sort
//        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        //renturn是一个控制流语句。要使此Lambda有效，需要使用花括号
//        (Integer i) -> {return "Alan" + i ;}

//        Lamdba示例  P37

    }
    /**
     * 函数式接口，只定义一个抽象方法的接口 如predicate
     * 函数式接口的抽象方法的签名基本上就是Lambda表达式的签名 -> 前面的就是Lambda表达式的签名。 我们将这种抽象方法叫做  函数描述符
     * 例如： Runnable接口可以看作一个无参无返回值的函数的签名，（函数签名就是方法参数）
     *
     * Lambda表达式可以被赋值给一个变量，或传递给一个接受函数式接口作为参数的方法（像Runnable接口的唯一的抽象方法run方法）
     * Lamdba表达式() -> System.out.println("This is awesome")
     * 什么也不接受什么也不返回，可以直接传给process方法
     */
    public void process(Runnable r){
        r.run();
    }

//    process(() -> System.out.println("This is awesome!"));

}
