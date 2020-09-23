package hn.baas.lead.prospect;

public enum ProspectStatus {
	CONTACTED(1),
	SENT_INFO(2),
	DEMO(3),
	ACCEPTED(4),
	REJECTED(5);
	private int value;
	ProspectStatus(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public static void main(String[] args) {
		ProspectStatus p = ProspectStatus.ACCEPTED;
		System.out.println(p);
	}
}
