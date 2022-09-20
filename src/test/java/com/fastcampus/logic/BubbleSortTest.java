package com.fastcampus.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> actual = bubbleSort.sort(Arrays.asList(3,2,1,6,4));

        //Then
        assertEquals(Arrays.asList(1,2,3,4,6,5),actual);
    }
}