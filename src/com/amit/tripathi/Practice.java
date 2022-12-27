package com.amit.tripathi;

import java.util.*;

class Box{
    int height;
    int breadth;
    int length;

    Box(int h, int b, int l){
        height = h;
        breadth = b;
        length = l;
    }

    void display(){
        System.out.println("height "+height+ "breadth " + breadth+ "length: " + length);
    }
}

class BoxWeight extends Box{
    int weight;
    BoxWeight(int h, int b, int l, int w){
        height = h;
        breadth = b;
        length = l;
        weight = w;
    }
}

class Main{
    public static void main(String[] args){
        //		Box b = new Box(10, 20, 30);
        BoxWeight w = new BoxWeight(10, 20, 30, 500);
        //b.display();
//			System.out.println();
        w.display();
    }
}