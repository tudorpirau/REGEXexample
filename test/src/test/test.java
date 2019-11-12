package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

public static void main (String[] args) {
	
	System.out.println("Please input your expression:");
	Scanner sc=new Scanner(System.in);
	String exp=sc.nextLine();
	sc.close();
	Node<Expression> root=new Node<>(new Expression("root", "general"));
	addMaxExp(exp, root);
	addMinExp(exp, root);
	addOperation(exp, root);
	for (int i=0;i<root.getChildren().size();i++) {
		for (int j=0;j<root.getChildren().get(i).getChildren().size();j++) {
			root.getChildren().get(i).getChildren().get(j).getData().print();
			}
		}
	}
public static void addMaxExp(String exp, Node<Expression> root) {
	Pattern p = Pattern.compile("\\s*Max\\(([0-9a-z]*), *([0-9a-z]*)\\)");
    Matcher m = p.matcher(exp);
    Node<Expression> rootForMax=new Node<>(new Expression("rootForMax","Max function"));
    if (m.find()) {
    	m = p.matcher(exp);
    while (m.find()) {
    	Node<Max> node1 = new Node<Max>(new Max(m.group(), "Max function"));
    	rootForMax.addChild(node1);
    	}
    } else {
    	try {
			throw new Exception("Expresion with type max funtion "
					+ "is not valid or does not exist.");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    root.addChild(rootForMax);
	}
public static void addMinExp(String exp, Node<Expression> root) {
	Pattern p = Pattern.compile("\\s*Min\\(([0-9a-z]*), *([0-9a-z]*)\\)");
    Matcher m = p.matcher(exp);
    Node<Expression> rootForMin=new Node<>(new Expression("rootForMin", "Min function"));
    if (m.find()) {
    	m = p.matcher(exp);
    while (m.find()) {
    	Node<Min> node1 = new Node<Min>(new Min(m.group(), "Min function"));
    	rootForMin.addChild(node1);
    	}
    } else {
    	try {
			throw new Exception("Expresion with type Min function "
					+ "is not valid or does not exist.");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    root.addChild(rootForMin);
	}
public static void addOperation(String exp, Node<Expression> root) {
	Pattern p = Pattern.compile("([0-9a-z]*)\\*([0-9a-z]*)");
    Matcher m = p.matcher(exp);
    Node<Expression> rootForOp=new Node<>(new Expression("rootForOp", "Operation *"));
    if (m.find()) {
    	m = p.matcher(exp);
    while (m.find()) {
    	Node<Operation> node1 = new Node<Operation>(new Operation(m.group(), "Operation *"));
    	rootForOp.addChild(node1);
    	}
    } else {
    	try {
			throw new Exception("Expresion with type Operation * "
					+ "is not valid or does not exist.");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    root.addChild(rootForOp);
	}
}
