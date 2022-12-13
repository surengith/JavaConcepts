package com.Demo4.org;

public class DemoSingle extends DemoSample {

	public static void main(String[] args) {
		DemoSingle obj = new DemoSingle();
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
		System.out.println("Coimbatore");
	}

	public void state() {
		System.out.println("Karanataka");
	}

	public void country() {
		super.country();
		System.out.println("London");
	}

}
