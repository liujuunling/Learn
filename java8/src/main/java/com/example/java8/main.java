package com.example.java8;

import com.example.java8.entity.Apple;
import com.example.java8.entity.Dish;

import java.awt.geom.AffineTransform;
import java.io.FileInputStream;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class main implements Comparable {


    public static void convertPPTToPDF(String sourcepath, String destinationPath, String fileType) throws Exception {
        FileInputStream inputStream = new FileInputStream(sourcepath);
        double zoom = 2;
        AffineTransform at = new AffineTransform();
        at.setToScale(zoom, zoom);
    }

    public static void main(String[] args) {
//            process(() -> System.out.println("This is awesome!"));
        Apple apple1 = new Apple();
        apple1.setColor("green");
        apple1.setWeight(180);
        Apple apple2 = new Apple();
        apple2.setColor("red");
        apple2.setWeight(140);
        Apple apple3 = new Apple();
        apple3.setColor("green");
        apple3.setWeight(190);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(apple1);
        inventory.add(apple2);
        inventory.add(apple3);

//        inventory.sort((Apple a1,Apple a2) -> a1.getWeight());
////        inventory.sort( (Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
//
//        inventory.forEach(System.out::println);


//        inventory.sort(comparing(Apple::getWeight));
        inventory.stream().forEach(System.out::println);
//        apple1(System.out::println);
//        System.out.println(inventory);


//        List<Dish> menu = Arrays.asList(
//                new Dish("pork", false, 800, Dish.Type.MEAT),
//                new Dish("beef", false, 700, Dish.Type.MEAT),
//                new Dish("chicken", false, 400, Dish.Type.MEAT),
//                new Dish("french fries", true, 530, Dish.Type.OTHER),
//                new Dish("rice", true, 350, Dish.Type.OTHER),
//                new Dish("season fruit", true, 120, Dish.Type.OTHER),
//                new Dish("pizza", true, 550, Dish.Type.OTHER),
//                new Dish("prawns", false, 300, Dish.Type.FISH),
//                new Dish("salmon", false, 450, Dish.Type.FISH)
//                );
//
//        IntSummaryStatistics menuStatustucs = menu.stream().collect(summarizingInt(Dish::getCalories));
//        System.out.println(menuStatustucs);
//
//        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining());
//        String shortMenu1 = menu.stream().map(Dish::getName).collect(reducing((s1,s2) -> s1+s2)).get();
//        Map<Dish.Type,List<Dish> > dishesByType = menu.stream().collect(groupingBy(Dish::getType));
//        System.out.println(dishesByType);
//        //分组
//        Map<Dish.CaloricLevel,List<Dish>> dishesByCaloricLevel = menu.stream().collect(
//                groupingBy(dish -> {
//                    if (dish.getCalories() <= 400) return Dish.CaloricLevel.DIET;
//                    else if (dish.getCalories() <= 700) return Dish.CaloricLevel.NORMAL;
//                    else return Dish.CaloricLevel.FAT;
//                }
//         )
//
//);
//        //多级分组
//        Map <Dish.Type,Map<Dish.CaloricLevel,List<Dish>>> dishesByTypeCaloricLevel = menu.stream().collect(
//                groupingBy(Dish::getType,
//                        groupingBy(dish -> {
//                            if (dish.getCalories() <= 400) return Dish.CaloricLevel.DIET;
//                            else if (dish.getCalories() <= 700) return Dish.CaloricLevel.NORMAL;
//                            else return Dish.CaloricLevel.FAT;
//                        }))
//        );
//        System.out.println(dishesByTypeCaloricLevel);
//
//        //使用counting收集器 作为groupingBy的第二个参数
//        Map<Dish.Type,Long> typeCount = menu.stream().collect(
//                groupingBy(Dish :: getType,counting())
//        );
//        System.out.println(typeCount);
//
//        Map<Dish.Type,Dish> mostCaloricByType = menu.stream().collect(
//                groupingBy(Dish::getType,collectingAndThen(
//                        maxBy(comparingInt(Dish::getCalories)),Optional::get
//                ))
//        );
//        System.out.println(mostCaloricByType);
//
//        Map<Dish.Type,Set<Dish.CaloricLevel>> caloricLevelByType = menu.stream().collect(
//          groupingBy(Dish::getType,mapping(
//                  dish -> {if (dish.getCalories()<=400) return Dish.CaloricLevel.DIET;
//                  else if (dish.getCalories() <=700) return Dish.CaloricLevel.NORMAL;
//                  else return Dish.CaloricLevel.FAT;
//                  }, toSet()
//          ))
//        );
////分区
//        Map<Boolean,List<Dish>> partitionedMenu = menu.stream().collect(
//                partitioningBy(Dish::isVegetarian)
//        );
//        System.out.println(partitionedMenu); //{false=[Dish{name='pork', vegetarian=false, calories=800, type=MEAT}, Dish{name='beef', vegetarian=false, calories=700, type=MEAT}, Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}, Dish{name='prawns', vegetarian=false, calories=300, type=FISH}, Dish{name='salmon', vegetarian=false, calories=450, type=FISH}], true=[Dish{name='french fries', vegetarian=true, calories=530, type=OTHER}, Dish{name='rice', vegetarian=true, calories=350, type=OTHER}, Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}, Dish{name='pizza', vegetarian=true, calories=550, type=OTHER}]}
//
//
//
//        Runnable r1 = () -> System.out.println("Hello World 1");  //使用Lambda
//        Runnable r2 = new Runnable() {                            //使用匿名类
//            @Override
//            public void run() {
//                System.out.println("Hello World 2");
//            }
//        };
//       process(r1);
//       process(r2);
//       process(() -> System.out.println("Hello World 3 "));    //利用直接传递的Lambda打印“Hello World 3”
//
//
//        IntPredicate intPredicate = (int i) -> i * 2 == 0;
//        System.out.println(intPredicate.test(1));

    }




    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public static void process(Runnable r) {
        r.run();
    }
}
