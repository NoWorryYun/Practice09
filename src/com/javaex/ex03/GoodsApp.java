package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Goods> goods = new ArrayList<Goods>();
		
		System.out.println("상품을 입력해주세요. (종료q)");
		while(true) {
			
			String type = sc.nextLine();
			
			if(type.equals("q")) {
				break;
			} else {
				Goods g = new Goods();
				type.trim();
				String[] gType = type.split(",");
				
				g.setName(gType[0]);
				int gtype1 = Integer.parseInt(gType[1]);
				int gtype2 = Integer.parseInt(gType[2]);
				g.setPrice(gtype1);
				g.setCount(gtype2);
				
				goods.add(g);
			}
			
		}System.out.println("[입력완료]");
		System.out.println("============================");
		for(int i = 0 ; i < goods.size() ; i++) {
			goods.get(i).showInfo();
		}
		
		
		sc.close();

	}

}
