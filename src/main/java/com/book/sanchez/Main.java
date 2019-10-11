
package com.book.sanchez;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //book
        Book book = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Shewchenko")
                .withPages(PageFactory.createPageList(ImmutableList.of("text")))
                .build();

        //book2
        Book book2 = new Book.Builder()
                .withCover(new Cover("green", true))
                .withAuthor("Block")
                .withPages(PageFactory.createPageList(ImmutableList.of("text", "text1")))
                .build();

        //book3
        Book book3 = new Book.Builder()
                .withCover(new Cover())
                .withAuthor("Skovoroda")
                .withPages(PageFactory.createPageList(ImmutableList.of("text", "text1", "text2")))
                .build();

        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        //for Figure class
        Figure[] array = new Figure[10];
        Figure obj = null;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0:
                    obj = new Triangle(new int[] {random.nextInt(10), random.nextInt(10)},
                            new int[] {random.nextInt(10), random.nextInt(10)});
                    break;
                case 1:
                    obj = new Square(new int[] {random.nextInt(10), random.nextInt(10)},
                            new int[] {random.nextInt(10), random.nextInt(10)});
                    break;
                case 2:
                    obj = new Circle(new int[] {random.nextInt(10), random.nextInt(10)},
                            new int[] {random.nextInt(10), random.nextInt(10)});
                    break;
            }
            array[i] = obj;
        }
        System.out.println(Arrays.toString(array));
    }
}
