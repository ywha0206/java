package test04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isborrowd = false;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public void borrowBook() {
		if(isborrowd==false) {
			isborrowd = true;
			System.out.printf("도서 대출: %s\n",title);
		}else {
			System.out.printf("%s 이미 대출됨\n",title);
		}
	}
	public void returnBook() {
		if(isborrowd) {
			isborrowd = false;
			System.out.printf("도서 반납: %s\n",title);
		}else {
			System.out.printf("%s 이미 반납됨\n",title);
		}
	}
	public void getBookInfo() {
		System.out.println("도서명 : ");
		System.out.println("저자 : ");
		System.out.println("ISBN : ");
		
		if(isborrowd) {
			System.out.println("대출여부 : 불가능");
		}else {
			System.out.println("대출여부 : 가능");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
