package com.fastcapmus.javaoop;

import com.fastcampus.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Bubble -> Java sort로 변경할시. main코드를 건드려야함. DI 구현부
        BubbleSort<String> sort = new BubbleSort<>();


        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
