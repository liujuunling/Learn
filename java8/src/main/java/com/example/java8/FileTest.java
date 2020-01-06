package com.example.java8;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileTest {


    //找出一个目录下的所有隐藏文件

    File[] hiddenFiles = new File(".").listFiles(new FileFilter(){
        public boolean accept(File file){
            return  file.isHidden();
        }
    });


    //方法引用  直接将File的Hidden方法 作为参数出单地给listFiles方法。 此时的isHidden方法不再是二等值，而是一定值
    File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);


    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        List s =array.subList(0, 3);
        System.out.println(s);
        array.add(5);
        s.forEach( System.out::println);
    }
}
