package com.springboot.practice;


import com.springboot.practice.config.Config;
import com.springboot.practice.logic.JavaSort;
import com.springboot.practice.logic.Sort;
import com.springboot.practice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result]" + sortService.doSort(Arrays.asList(args)));
    }

}
