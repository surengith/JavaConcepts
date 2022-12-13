package com.Demo4.org;

public class DemoMultilevel extends DemoSingle {

	public static void main(String[] args) {
		DemoMultilevel obj = new DemoMultilevel();
		obj.name();
		obj.city();
		obj.district();
		obj.state();
		obj.country();

	}

	public void name() {
		super.name();
	}

	public void city() {
		super.city();
	}

	public void district() {
		super.district();
		System.out.println("Karur");
	}

	public void state() {
		super.state();
		System.out.println("Kerala");
	}

	public void country() {
		super.country();
	}

}