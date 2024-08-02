package test09;

import java.util.List;

/*
 * 날짜: 2024/08/01
 * 이름: 박연화
 * 내용: 자바 총정리 문제
 */
public class Main {
	
	public static void main(String[] args) {
		
		//게시판 생성
		Board board = new Board();
		
		//사용자 생성
		User user1 = new User("A101", "김유신");
		User user2 = new User("A102", "김춘추");
		User user3 = new User("A103", "장보고");
		
		//게시물 생성
		Article article1 = new Article(1, "안녕하세요", "내용1", user1);
		Article article2 = new Article(2, "안녕하세요", "내용2", user2);
		Article article3 = new Article(3, "안녕하세요", "내용3", user3);
		
		//댓글 생성
		Comment comment1 = new Comment(101, "1번 글의 101번 댓글입니다.");
		Comment comment2 = new Comment(102, "2번 글의 102번 댓글입니다.");
		Comment comment3 = new Comment(103, "1번 글의 103번 댓글입니다.");
		Comment comment4 = new Comment(104, "3번 글의 104번 댓글입니다.");
		
		//게시물에 댓글 추가
		article1.addComment(comment1);
		article1.addComment(comment3);
		article2.addComment(comment2);
		article3.addComment(comment4);
		
		//게시판에 게시물 추가
		board.addArticle(article1);
		board.addArticle(article2);
		board.addArticle(article3);
		
		//게시판의 모든 게시물 출력
		List<Article> articles = board.getArticles();
		
				
				
		System.out.println("----------------------------");
		System.out.println("| 번호 |  제목  |  내용 | 작성자 |");
		System.out.println("----------------------------");
		
		for(Article article: articles) {
			System.out.println("|  "+article.getNo()+"  |"+article.getTitle()+"| "+article.getContent()+" | "+article.getUser().getName()+" |");
			System.out.println("----------------------------");
			
			for(Comment comment: article.getComments()) {
				System.out.println(" ㄴ "+comment.getContent());		
			}
			System.out.println("----------------------------");
		}
		
		
	}
}
