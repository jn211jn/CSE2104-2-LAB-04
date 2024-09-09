/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author Shimi
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

    public class Book {
    private String Title;
    private String Author;
    private int Year;
    private static String Genre = "hidden";
    private static int count = 0;

    public Book(String Title, String Author, int Year) {
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
        ++count;
    }

    public void display_details() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Year: " + Year);
        System.out.println("Genre: " + Genre);
    }

    public static void display_TotalBooks() {
        System.out.println("Total books = " + count);
    }

    public static void resetCount() {
        count = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Array ----- ");
        Book[] arrayBooks = new Book[3];

        for (int x = 0; x<3; x++) {
            System.out.print("Give Title for book " + (x+1) + " = ");
            String title = scanner.nextLine();
            System.out.print("Give Author Nmae for book " + (x+1) + " = ");
            String author = scanner.nextLine();
            System.out.print("Give year for book " + (x+1) + " = ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            arrayBooks[x] = new Book(title, author, year);
        }

        for (Book book : arrayBooks) {
            book.display_details();
            System.out.println();
        }

        Book.display_TotalBooks();

        Book.resetCount();

        System.out.println("\nArrayList ------- ");
        ArrayList<Book> array_listBooks = new ArrayList<>();

        for (int x = 0; x<3; x++) {
            System.out.print("Give Title for book " + (x+1) + " = ");
            String title = scanner.nextLine();
            System.out.print("Give Author Nmae for book " + (x+1) + " = ");
            String author = scanner.nextLine();
            System.out.print("Give year for book " + (x+1) + " = ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            array_listBooks.add(new Book(title, author, year));
        }

        for (Book book : array_listBooks) {
            book.display_details();
            System.out.println();
        }

        Book.display_TotalBooks();

        Book.resetCount();

        System.out.println("\nLinkedList -------- ");
        LinkedList<Book> linked_listBook = new LinkedList<>();

        for (int x=0; x<3; x++) {
            System.out.print("Give Title for book " + (x+1) + " = ");
            String title = scanner.nextLine();
            System.out.print("Give Author Nmae for book " + (x+1) + " = ");
            String author = scanner.nextLine();
            System.out.print("Give year for book " + (x+1) + " = ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            linked_listBook.add(new Book(title, author, year));
        }

        for (Book book : linked_listBook) {
            book.display_details();
            System.out.println();
        }

        Book.display_TotalBooks();
    }
}