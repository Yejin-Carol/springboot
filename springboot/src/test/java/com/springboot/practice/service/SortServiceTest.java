package com.springboot.practice.service;

import com.springboot.practice.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest{

    private SortService sut = new SortService(new BubbleSort<>());

    @Test
    void test() {
        //given
        //when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));
        //then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}