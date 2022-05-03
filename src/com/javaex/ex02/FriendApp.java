package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해주세요");

		for (int i = 0; i < 3; i++) {
			
			Friend friend = new Friend();
			
			String type = sc.nextLine();
			
			String[] friends = type.split(" ");
			
			friend.setName(friends[0]);
			friend.setHp(friends[1]);
			friend.setSchool(friends[2]);
			
			fList.add(friend);
			
		}
		for (int i = 0 ; i < fList.size(); i++) {
			fList.get(i).showInfo();
		}
		sc.close();

	}

}
