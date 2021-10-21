package com.springboot.javaoop;


import com.springboot.javaoop.logic.BubbleSort;
import com.springboot.javaoop.logic.JavaSort;
import com.springboot.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }

}
