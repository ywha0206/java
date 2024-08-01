package test03;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked = false;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		super();
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
	}
	
	public void bookTicket() {
		if(isBooked==false) {
			isBooked = true;
			System.out.printf("%s, %s, %s 예매 완료\n",movieTitle, screenTime, seatNumber);
		}else if(isBooked==true) {
			System.out.println("이미 예매됨");
		}
	}
	
	public void cancelBook() {
		
		if(isBooked==true) {
			isBooked = false;
			System.out.printf("%s, %s, %s 취소 완료\n",movieTitle, screenTime, seatNumber);
		}else if(isBooked==false) {
			System.out.println("아직 예매 안 됨");
		}
		
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : "+movieTitle);
		System.out.println("상영시간 : "+screenTime);
		System.out.println("좌석번호 : "+seatNumber);
		
		if(isBooked) {
			System.out.println("예매여부 : Yes");
		}else {
			System.out.println("예매여부 : No");
		}
	}
	
}
