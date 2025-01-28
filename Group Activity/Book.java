class Book{

    String BookTitle;
    String Author;
    String Genre;
    static Integer TotalBookCount = 0;

    public Book(String BookTitle, String Author){
        this.BookTitle = BookTitle;
        this.Author = Author;
        TotalBookCount++;
    }

    static Integer getTotalBookCount(Integer TotalBookCount){
        return TotalBookCount;
    }

    public void displayBookDetails(Book book){
        System.out.println("Book Title: " + book.BookTitle);
        System.out.println("Author: " + book.Author);
        System.out.println(" ");
    }

    static Integer removeBook(Integer TotalBookCount){
        return Book.TotalBookCount -= 1;
    }

    public static void main(String[] args) {
        Book newBook1 = new Book("Madol Doova", "Martin Wikramasignhe");
        Book newBook2 = new Book("Gampalaya", "Martin Wikramasignhe");
        Book newBook3 = new Book("Kumudu Gamana", "K Jayathilaka");
        Book newBook4 = new Book("Maname", "Edmand");
        Book newBook5 = new Book("Hath Pana", "Kumarathunga Munidasa");

        newBook1.displayBookDetails(newBook1);
        newBook2.displayBookDetails(newBook2);
        newBook3.displayBookDetails(newBook3);
        newBook4.displayBookDetails(newBook4);
        newBook5.displayBookDetails(newBook5);

        System.out.println("Total Book Count: " + Book.TotalBookCount);
        Book.removeBook(Book.TotalBookCount);
        System.out.println("Total Book Count after calling removeBook Method: " + Book.TotalBookCount);
    }
}

/*
Gorup 5 Members:
    CIT-24-01-0082
    CIT-24-01-0023
    CIT-24-01-0125
    CIT-24-01-0424
    CIT-24-01-0491
    CIT-24-01-0090
    CIT-24-01-0396
    CIT-24-01-0060
    CIT-24-01-0598
    CIT-24-01-0350
    CIT-24-01-0015
    CIT-24-01-0185
    CIT-24-01-0020
 */