package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBookstore Application");
            System.out.println("----------------");
            System.out.println("1. Add org.example.Book");
            System.out.println("2. Edit org.example.Book");
            System.out.println("3. Delete org.example.Book");
            System.out.println("4. List Books");
            System.out.println("99. Exit");
            System.out.println("----------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add org.example.Book
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter page count: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    books.add(new Book(title, author, isbn, pages));
                    break;

                case 2: // Edit org.example.Book
                    System.out.print("Enter ISBN of book to edit: ");
                    String isbnToEdit = scanner.nextLine();
                    for (Book b : books) {
                        if (b.isbn.equals(isbnToEdit)) {
                            System.out.print("New Title: ");
                            b.title = scanner.nextLine();
                            System.out.print("New Author: ");
                            b.author = scanner.nextLine();
                            System.out.print("New Page Count: ");
                            b.pages = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("New ISBN: ");
                            b.isbn = scanner.nextLine();
                        }
                    }
                    break;

                case 3: // Delete org.example.Book
                    System.out.print("Enter ISBN of book to delete: ");
                    String isbnToDelete = scanner.nextLine();
                    books.removeIf(b -> b.isbn.equals(isbnToDelete));
                    break;

                case 4: // List Books
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i+1) + ". " + books.get(i));
                    }
                    break;

                case 99: // Exit
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 99);
    }
}