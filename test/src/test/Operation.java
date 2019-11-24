package test;

public class Operation extends Expression{

private String exp, type;
public Operation (String exp, String type){
	super(exp, type);
	this.exp=exp;
	this.type=type;
	}

}

