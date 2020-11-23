package com.example.biblioteczka;

import java.util.ArrayList;

public class Utils {
    private static Utils instance;
    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> favoriteBooks;
    private static ArrayList<Book> currentlyReadingBooks;

    private Utils(){
        if (null == allBooks) {
            allBooks = new ArrayList<>();
            initData();
        }
        if (null == alreadyReadBooks) {
            alreadyReadBooks = new ArrayList<>();
        }
        if (null == wantToReadBooks) {
            wantToReadBooks = new ArrayList<>();
        }
        if (null == favoriteBooks) {
            favoriteBooks = new ArrayList<>();
        }
        if (null == currentlyReadingBooks) {
            currentlyReadingBooks = new ArrayList<>();
        }
    }

    private void initData() {
        allBooks.add(new Book(1,"Wiedzmin Krew Elfow", "Andrzej Sapkowski", 295, "https://cf1-taniaksiazka.statiki.pl/images/large/0F7/9788375780659.jpg", "Miecz czary i szpiegowska intryga"));
        allBooks.add(new Book(2,"Wiedzmin Ostatnie Zyczenie", "Andrzej Sapkowski", 332, "https://cf1-taniaksiazka.statiki.pl/images/large/123/68007901377KS.jpg", "Otawrcie wiedźmińskiej sagi"));
    }

    public static Utils getInstance() {
        if (null != instance) {
            return instance;
        }else{
            instance = new Utils();
            return instance;
        }
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }
    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }
    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }
    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }
    public static ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    public Book getBookById(int id) {
        for (Book b: allBooks){
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public boolean addToAlreadyRead(Book book) {
        return alreadyReadBooks.add(book);
    }
    public boolean addToWantToRead (Book book) {
        return wantToReadBooks.add(book);
    }
    public boolean addToCurrentlyReading (Book book) {
        return currentlyReadingBooks.add(book);
    }
    public boolean addToFavorite (Book book) {
        return favoriteBooks.add(book);
    }

    public boolean removeFromAlreadyRead(Book book) {
        return alreadyReadBooks.remove(book);
    }
    public boolean removeFromFavorites(Book book) {
        return favoriteBooks.remove(book);
    }
    public boolean removeFromWantToRead(Book book) {
        return wantToReadBooks.remove(book);
    }
    public boolean removeFromCurrentlyReading(Book book) {
        return currentlyReadingBooks.remove(book);
    }
}
