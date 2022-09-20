package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //Given
        BubbleSort<Integer> javaSort = new BubbleSort<>();

        //when
        List<Integer> actual = javaSort.sort(Arrays.asList(3,2,1,6,4));

        //Then
        assertEquals(Arrays.asList(1,2,3,4,6,5),actual);
    }

}