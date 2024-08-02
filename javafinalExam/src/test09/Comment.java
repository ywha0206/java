package test09;

public class Comment {
	private int no;
	private String content;
	
	public Comment(int no, String content) {
		this.no = no;
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}
	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return  content;
	}
	
	
}
