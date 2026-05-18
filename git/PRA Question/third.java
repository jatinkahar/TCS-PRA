import java.util.*;
class third{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine().trim());
        List<Book> books = new ArrayList<>();
        for(int i=0;i<n;i++){
            int bookId=Integer.parseInt(sc.nextLine().trim());
            String title=sc.nextLine().trim();
            double price=Double.parseDouble(sc.nextLine().trim());
            books.add(new Book(bookId, title, price));
        }
    double res=services.help(books);
    System.out.println(res);
}
}
class services{
    public static double help(List<Book> books){
        int count=0;
        double sum=0.0;
        for(Book b:books){
            sum+=b.price;
            count++;
        }
        return sum/count;
    }
}
class Book{
    
    int bookId;
    String title;
    double price; 
    public Book(int bookId, String title, double price){
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}