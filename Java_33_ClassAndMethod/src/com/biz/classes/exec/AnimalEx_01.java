package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal am = new Dog();			// 부모, 자식
		
		String name = am.getName();
		
		System.out.println(name);
		
		// am = new Dog();
		// am.
		
		am = new Dog();
		
		
		
		Dog dog1 = new Dog();
		
		name = dog1.getName();
		System.out.println(name);
		
		dog1.setName();
		name = dog1.getName();
		System.out.println(name);

		
		Cat cat1 = new Cat();
		
		name = cat1.getName();
		System.out.println(name);
		
		cat1.setName();
		name = cat1.getName();
		System.out.println(name);
	}

}
