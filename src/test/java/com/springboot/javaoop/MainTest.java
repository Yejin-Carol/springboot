package com.springboot.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        //given
        String[] args = {"3", "1", "2"};
        //when & Then
        Main.main(args);

    }
}