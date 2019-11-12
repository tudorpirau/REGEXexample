package test;

public class Min extends Expression{

	private String exp, type;
	public Min (String exp, String type){
		super(exp, type);
		this.exp=exp;
		this.type=type;
		}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public void print() {
		System.out.println(type+" : "+exp);
    }
}
