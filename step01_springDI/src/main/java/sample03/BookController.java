package sample03;

public class BookController {
	private BookDAO bookDao;
	private BookVo bookVo;

	public BookController() {}
	
	public BookController(BookDAO bookDao, BookVo bookVo) {
		this.bookDao = bookDao;
		this.bookVo = bookVo;
	}
	
	public void bookInsert() {
		bookDao.insert(bookVo);
	}
}
