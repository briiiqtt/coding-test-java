package baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B30676_WhatColorIsThisStar {
    public static void main(String[] args) throws IOException {
        int v = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (620 <= v) System.out.println("Red");
        else if (590 <= v) System.out.println("Orange");
        else if (570 <= v) System.out.println("Yellow");
        else if (495 <= v) System.out.println("Green");
        else if (450 <= v) System.out.println("Blue");
        else if (425 <= v) System.out.println("Indigo");
        else System.out.println("Violet");
    }
}
