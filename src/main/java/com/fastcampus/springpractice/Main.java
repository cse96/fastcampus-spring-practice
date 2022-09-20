package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;
import com.fastcampus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Bubble -> Java sort로 변경할시. main코드를 건드려야함. DI 구현부
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Sort<String> sort = context.getBean(Sort.class);
//        Sort<String> sort = new JavaSort<>();
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result] " + sortService.doSort((Arrays.asList(args))));
    }
}
