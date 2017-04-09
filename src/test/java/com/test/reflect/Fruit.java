package com.test.reflect;

/**
 * @（#）:Fruit
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public enum Fruit {

    APPLE("apple", 10) {
        double apply(String name, double price) {
            return 0;
        }
    },

    ORANGE("orange", 5) {
        double apply(String name, double price) {
            return 0;
        }
    };

    String name;

    double price;
/**
*
*/
    Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double apply(String name, double price);
}
