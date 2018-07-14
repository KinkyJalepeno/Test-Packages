package ClassObject;

import java.util.Scanner;

public class BookDB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DB[] books = new DB[3];

        for (int i = 0; i < books.length; i++) {


            DB book = new DB();

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
            books[i] = book;

        }//end for loop

        printStock(books);

        sc.close();
    }//end main

    public static void printStock(DB[] books) {
        for (int i = 0; i < books.length; i++) {
            printBook(books[i]);
        }
    }//end method printStock

    public static void printBook(DB books) {
        if (books.hardback == true) {
            System.out.print("Hardback: ");
        } else {
            System.out.print("Paperback: ");
        }
        System.out.println(books.name + " Price: " + books.price + " Stock: " + books.inv);

    }//end method printBook
}
