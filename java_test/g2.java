package java_test;
import java.util.Scanner;
abstract class Book {
    public String title;
    public int price;
    public double rating;

    public Book(String title, int price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public abstract void printDetails();
}

class EBook extends Book {
    private int fileSize;

    public EBook(String title, int price, double rating, int fileSize) {
        super(title, price, rating);
        this.fileSize = fileSize;
    }

    @Override
    public void printDetails() {
        System.out.println("Highest rated book information:");
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + getRating());
        System.out.println("File Size: " + fileSize + "MB");
    }
}

class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook(String title, int price, double rating, int pageCount) {
        super(title, price, rating);
        this.pageCount = pageCount;
    }

    @Override
    public void printDetails() {
        System.out.println("Highest rated book information:");
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + getRating());
        System.out.println("Page Count: " + pageCount);
    }
}
public class g2 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        Book highestRatedBook = null;

        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    String type = sc.next();
                    if (!type.equals("EBook") && !type.equals("PrintedBook")) {
                        System.out.println("Invalid book type. Please enter 'EBook' or 'PrintedBook'.");
                        continue;
                    }
                    String title = sc.next();

                    if (!sc.hasNextInt()) {
                        System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
                        sc.next();
                        continue;
                    }
                    int price = sc.nextInt();

                    if (!sc.hasNextDouble()) {
                        System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
                        sc.next();
                        continue;
                    }
                    double rating = sc.nextDouble();

                    if (!sc.hasNextInt()) {
                        System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
                        sc.next();
                        continue;
                    }
                    int additionalInfo = sc.nextInt();

                    Book book;
                    if (type.equals("EBook")) {
                        book = new EBook(title, price, rating, additionalInfo);
                    } else {
                        book = new PrintedBook(title, price, rating, additionalInfo);
                    }

                    if (highestRatedBook == null || book.getRating() > highestRatedBook.getRating()) {
                        highestRatedBook = book;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
                    sc.nextLine(); 
                }
            }
        }
        sc.close();

        System.out.println("\nHighest Rated Book:");
        highestRatedBook.printDetails();
    }

}
