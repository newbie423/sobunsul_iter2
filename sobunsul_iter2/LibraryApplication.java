
/**
 * LibraryApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication{
    private BorrowerDataBase borrowerDB = new BorrowerDataBase();
    private LoanDataBase loanDB = new LoanDataBase();
    private BookDataBase bookDB = new BookDataBase();
    
    public void borrowerRegistration(Integer number, String name){
        Borrower borrower = new Borrower(number, name);
        
        this.borrowerDB.registration(borrower);
    }
    public void bookRegistration(Integer number, String title, String author){
        Book book = new Book(number, title, author);
        
        this.bookDB.registration(book);
    }
    public void bookLoan(Integer bookNumber, Integer borrowerNumber){
        
    }
    public void bookReturn(Integer bookNumber){
        
    }
}