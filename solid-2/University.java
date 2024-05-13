public class University {
    public static void main(String[] args) {
        Student david = new Student("David");
        Student king = new Student("King");
        Resource kingsBook = new Book("King's Book");
        Resource davidsJournal = new Journal("David's Journal");

        BorrowingService borrowingService = new BorrowingService();

        System.out.println(borrowingService.borrowResource(davidsJournal, king));
        System.out.println(borrowingService.borrowResource(kingsBook, david));
    }
}