
package main.java.com.book.sanchez;

public class Main {
    public static void main(String[] args) {
        //book
        Book book = new Book(new Cover(), "Shewchenko", Util.getPages(new Page("text")));

        //book2
        Book book2 = new Book(new Cover("green", true), "Block", Util.getPages(new Page("text"), new Page("text")));

        //book3
        Book book3 = new Book(new Cover(), "Skovoroda", Util.getPages(new Page("text"), new Page("text"), new Page("text")));
        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
