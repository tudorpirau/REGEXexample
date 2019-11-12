package test;

public class Expression {
	String exp, type;
	public Expression(String exp, String type) {
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
	};
    public void print() {
    	System.out.println(type+" : "+exp);
    }
}
