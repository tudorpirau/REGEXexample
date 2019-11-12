package test;

import java.util.ArrayList;
import java.util.List;

public class Node<T extends Expression> {
	 
	 private T data = null;
	 
	 private List<Node<? extends Expression>> children = new ArrayList<>();
	 
	 private Node<? extends Expression> parent = null;
	 
	 public Node(T data) {
	 this.data = data;
	 }
	 
	 public Node<? extends Expression> addChild(Node<? extends Expression> child) {
	 child.setParent(this);
	 this.children.add(child);
	 return child;
	 }
	 
	 public void addChildren(List<Node<? extends Expression>> children) {
	 children.forEach(each -> each.setParent(this));
	 this.children.addAll(children);
	 }
	 
	 public List<Node<? extends Expression>> getChildren() {
	 return children;
	 }
	 
	 public T getData() {
	 return data;
	 }
	 
	 public void setData(T data) {
	 this.data = data;
	 }
	 
	 private void setParent(Node<? extends Expression> parent) {
	 this.parent = parent;
	 }
	 
	 public Node<? extends Expression> getParent() {
	 return parent;
	 }
	 
	}