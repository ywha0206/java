package user1;

public class User1VO {
	
	private String uid;
	private String name;
	private String birth;
	private String hp;
	private int age;
	
	//기본생성자
	public User1VO() {
		
	}
	
	//생성자
	public User1VO(String uid, String name, String birth, String hp, int age) {
		this.uid = uid;
		this.name = name;
		this.birth = birth;
		this.hp = hp;
		this.age = age;
	}
	
	//게터세터
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//투스트링
	@Override
	public String toString() {
		return "uid=" + uid + ", name=" + name + ", birth=" + birth + ", hp=" + hp + ", age=" + age ;
	}
	
}
