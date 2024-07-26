package sub2;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	public Book(String title, String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
		
		
	//기능
	
	public boolean borrowBook() {
		if(availableCopies>0) {
			availableCopies--;
			return true;
		}
		return false;
	}
		
	
	public void returnBook() {
		availableCopies++;
	}
	
	public void show() {
		System.out.println("책 제목: "+ title);
		System.out.println("저자 이름: "+ author);
		System.out.println("ISBN 번호: "+ isbn);
		System.out.println("이용 가능한 복사본 수: "+ availableCopies);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	

}
