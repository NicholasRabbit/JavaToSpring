package com.idmtest.test02;

public class OOTest301 {

	public static void main(String[] args) {
		Owner001 james = new Owner001();
		james.name = "James";
		james.telephone = 18902220231L;

		Dog001 dog = new Dog001();
		dog.owner = james;

		System.out.println("���������֣�" + dog.owner.name);
		System.out.println("�����˵绰��" + dog.owner.telephone);
	}

}
