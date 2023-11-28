package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Book> books = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            books.add(new Book("Какое-то имя " + i, "Какой-то автор " + i));
        }


        Spliterator<Book> iterator = books.spliterator();

        Thread firstSplitThread = new Thread(()-> iterator.forEachRemaining((book -> {
            book.setAuthor("Новый");
            System.out.println(book);
        })));

        Thread secondSplitThread = new Thread(() -> iterator.trySplit().forEachRemaining(book -> {
            book.setName("Новое имя");
            System.out.println(book);
        }));

        firstSplitThread.start();
        secondSplitThread.start();

    }
}
