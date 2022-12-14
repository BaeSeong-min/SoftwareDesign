package ui;

public class SignUpUI extends SignUpCommonUI{
	private String belongingKindergarten;
	private String belongingClass;
	
	public String getBelongingKindergarten() {
		return belongingKindergarten;
	}
	
	public void setBelongingKindergarten(String belongingKindergarten) {
		this.belongingKindergarten = belongingKindergarten;
	}

	public String getBelongingClass() {
		return belongingClass;
	}

	public void setBelongingClass(String belongingClass) {
		this.belongingClass = belongingClass;
	}
}
