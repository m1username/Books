
package main.java.com.book.sanchez;


public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString());


    }


}

 /*   переопредилить toString() класса Book (помни про аннотацию -  маркер) под такой вывод
        Book author: {author}, number of pages: {pagesCount}, {color} cover is {hard/soft}. */