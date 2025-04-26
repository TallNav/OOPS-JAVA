package com.nav.staticExample;

public class Library {

    static int totalIssuedBooks;
    static int getTotalIssuedBooks(){
        return totalIssuedBooks;
    }

    static void returnBook(Book book){
        if(book.isIssued){
            book.isIssued=false;
            totalIssuedBooks--;
        }
    }


    public static void main(String[] args){

        Book b1 = new Book("Harry Potter" , "JKR", true);
        Book b2 = new Book("Misery" , "SK", false);
        Book b3 = new Book("Pokemon" , "Satoshi", true);

        System.out.println(totalIssuedBooks+" books are issued");
//        Library.returnBook(Book b1);
        System.out.println(totalIssuedBooks+" books are issued");



    }


}

class Book{
    String title;
    String author;
    boolean isIssued = false;

    Book(String title, String author, boolean isIssued){
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
        Library.totalIssuedBooks++;
    }
}
