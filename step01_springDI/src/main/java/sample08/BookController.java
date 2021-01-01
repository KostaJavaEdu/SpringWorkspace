package sample08;

public class BookController {
	private BookDTO book1;
	private BookDTO book2;
	private BookService bookService;
	
	public BookController() {}

	public BookController(BookService bookService, BookDTO book1, BookDTO book2) {
		super();
		this.bookService = bookService;
		this.book1 = book1;
		this.book2 = book2;
	}
	
	public void invoker() {
		bookService.save(book1, book2);
	}
	
}
