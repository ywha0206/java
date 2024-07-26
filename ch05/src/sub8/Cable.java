package sub8;

public class Cable implements Socket{

	private Bolb bolb;//속성 추가
	
	public Cable(Bolb bolb) {
		this.bolb = bolb;
	}
	
	@Override
	public void switchOn() {
		bolb.LightOn();
	}

	@Override
	public void switchOff() {
		bolb.LightOff();
	}
	
}
