package report;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeServiceExam {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) { // 언제나 처음 단계로 돌아가기

            System.out.println("=== 커피 생산 관리 시스템 ===");
            System.out.println("1. 커피 생산");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("시스템을 종료합니다.");
                break; // 종료 기능
            }

            if (choice == 1) {
                selectCoffee();
            }
        }
    }

    // 1️ 커피 종류 선택
    static void selectCoffee() {

        ArrayList<CoffeeService> coffeeList = new ArrayList<CoffeeService>();
        coffeeList.add(new CoffeeService("아메리카노", 3000));
        coffeeList.add(new CoffeeService("라떼", 3500));

        System.out.println("\n[커피 종류 선택]");
        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.println((i + 1) + ". " + coffeeList.get(i).name
                    + " (" + coffeeList.get(i).price + "원)");
        }
        System.out.println("0. 이전");

        System.out.print("선택 >> ");
        int sel = sc.nextInt();

        if (sel == 0) return; // 처음 단계로

        CoffeeService selectedCoffee = coffeeList.get(sel - 1);
        selectDetail(selectedCoffee);
    }

    // 2️ 상세 종류 선택
    static void selectDetail(CoffeeService coffee) {

        ArrayList<CoffeeService> detailList = new ArrayList<CoffeeService>();

        if (coffee.name.equals("아메리카노")) {
            detailList.add(new CoffeeService("HOT", 0));
            detailList.add(new CoffeeService("ICE", 500));
        } else if (coffee.name.equals("라떼")) {
            detailList.add(new CoffeeService("바닐라", 500));
            detailList.add(new CoffeeService("카라멜", 700));
        }

        System.out.println("\n[상세 선택]");
        for (int i = 0; i < detailList.size(); i++) {
            System.out.println((i + 1) + ". " + detailList.get(i).name
                    + " (+" + detailList.get(i).price + "원)");
        }
        System.out.println("0. 이전");

        System.out.print("선택 >> ");
        int sel = sc.nextInt();

        if (sel == 0) return;

        CoffeeService detail = detailList.get(sel - 1);

        // 5️ 선택 내용 확인
        System.out.println("\n=== 선택 확인 ===");
        System.out.println("커피 : " + coffee.name);
        System.out.println("옵션 : " + detail.name);
        System.out.println("총 가격 : " + (coffee.price + detail.price) + "원\n");
    }
}


