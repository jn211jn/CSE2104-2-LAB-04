/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookmain;

/**
 *
 * @author Shimi
 */
import java.util.ArrayList;
import java.util.LinkedList;


class Book {
    private String title;
    private String author;
    private int year;
    private String genre;

    
    public Book(String Title, String Author, int Year, String Genre) {
        this.title = Title;
        this.author = Author;
        this.year = Year;
        this.genre = Genre;
    }

   
    public String get_title() {
        return title;
    }

    public String get_tuthor() {
        return author;
    }

    public int get_year() {
        return year;
    }

    public String get_genre() {
        return genre;
    }

    @Override
public String toString() {
    return String.format("""
        Title: %s, 
        Author: %s, 
        Year: %d, 
        Genre: %s""", 
        title, author, year, genre);
}
}

public class BookMain {
    public static void main(String[] args) {
       
        Book b1 = new Book("Book no 1", "Author no 1", 2021, "Horror");
        Book b2 = new Book("Book no 2", "Author no 2", 2000, "Action");
        Book b3 = new Book("Book no 3", "Author no 3", 1998, "Adventure");
        ArrayList<Book> array_list = new ArrayList<>();
        array_list.add(b1);
        array_list.add(b2);
        array_list.add(b3);
        System.out.println("ArrayList = ");
        display_arrayList(array_list);       
        array_list.remove(b2);
        System.out.println("\nArrayList after deletig book2:");
        display_arrayList(array_list);

        
        LinkedList<Book> linked_list = new LinkedList<>();
        linked_list.add(b1);
        linked_list.add(b2);
        linked_list.add(b3);

        System.out.println("\nLinkedList = ");
        display_linkedList(linked_list);

       
        linked_list.remove(b1);

        System.out.println("\nLinkedList after deleting book no 1 = ");
        display_linkedList(linked_list);
        
        System.out.println("ArrayList size: " + array_list.size());
        System.out.println("LinkedList size: " + linked_list.size());

        array_list.clear();
        linked_list.clear();

        System.out.println("Array List size after deleting: " + array_list.size());
        System.out.println("Linked List size after deleting: " + linked_list.size());

        array_list.add(b2);
        linked_list.add(b1);

        System.out.println("ArrayList have book: " + array_list.contains(b2));
        System.out.println("LinkedList have book: " + linked_list.contains(b1));
    }

   
    public static void display_arrayList(ArrayList<Book> array_list) {
        for (Book book : array_list) {
            System.out.println(book.toString());
        }
    }

    
    public static void display_linkedList(LinkedList<Book> linked_list) {
        for (Book book : linked_list) {
            System.out.println(book.toString());
        }
    }
}