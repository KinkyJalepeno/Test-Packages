package ClassObject;

import java.util.Scanner;

public class BookDB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] bookList = new Book[3];

        for (int i = 0; i < bookList.length; i++) {


            Book book = new Book();

            System.out.print("Enter the books title: ");
            book.name = sc.nextLine();

            System.out.print("Enter the books price: ");
            book.price = sc.nextFloat();

            System.out.print("Enter copies in stock: ");
            book.inv = sc.nextInt();

            System.out.print("Is this book a hardback (Y/N) :");
            String answer = sc.next();

            System.out.println(" ");

            if (answer.equals("Y") || answer.equals("y")) {
                book.hardback = true;
            } else {
                book.hardback = false;
            }

            sc.nextLine();
            bookList[i] = book;

        }//end for loop

        printStock(bookList);

        sc.close();
    }//end main

    private static void printStock(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            printBook(bookList[i]);
        }
    }//end method printStock

    private static void printBook(Book book) {
        if (book.hardback) {
            System.out.print("Hardback: ");
        } else {
            System.out.print("Paperback: ");
        }
        System.out.println(book.name + " Price: " + book.price + " Stock: " + book.inv);

    }//end method printBook
}
