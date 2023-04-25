package com.example.demo.factoryPattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		
		ProfessionFactory professionfactory=new ProfessionFactory();
		Profession doc=professionfactory.getProfessionFactory("Engineer");
		doc.print();

	}

}
