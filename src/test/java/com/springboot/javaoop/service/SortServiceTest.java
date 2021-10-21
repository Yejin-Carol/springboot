package com.springboot.javaoop.service;

import com.springboot.javaoop.logic.BubbleSort;
import com.springboot.javaoop.logic.JavaSort;
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