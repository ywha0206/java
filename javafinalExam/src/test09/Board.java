package test09;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	
	public void addArticle(Article article) {
		articles.add(article);
	}
	public void addUser(User user) {
		users.add(user);
	}
	
	public List<Article> getArticles() {
		return articles;
	}
	public List<User> getUsers() {
		return users;
	}
	
}
