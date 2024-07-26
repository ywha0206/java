package ch06.sec11.exam02;

public class Earth {
	//상수 선언 및 초기화
	static final double Earth_Radius = 6400;
	
	//상수 선언
	static final double Earth_Surface_Area;
	
	//정적 블록에서 상수 초기화
	static {
		Earth_Surface_Area = 4*Math.PI * Earth_Radius * Earth_Radius;
	}
}
