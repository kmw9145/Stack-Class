package Stack;

import java.util.Scanner;

public class Stack02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        IntStack intStack = new IntStack(4); // Assuming IntStack is your class

        while (true) {
            System.out.println("=================================================");
            System.out.printf("현재 데이터 개수: %d / %d\n", intStack.size(), intStack.capacity());
            System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

            int menu = input.nextInt();
            if (menu == 0) break;

            int data;

            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    data = input.nextInt();
                    intStack.push(data);
                    break;

                case 2:
                    if (intStack.isEmpty()) {
                        System.out.println("스택이 비어있습니다.");
                    } else {
                        data = intStack.pop();
                        System.out.println("팝한 데이터는 " + data + "입니다.");
                    }
                    break;

                case 3:
                    if (intStack.isEmpty()) {
                        System.out.println("스택이 비어있습니다.");
                    } else {
                        data = intStack.peek();
                        System.out.println("피크한 데이터는 " + data + "입니다.");
                    }
                    break;

                case 4:
                    System.out.println("스택 덤프:");
                    intStack.dump();
                    break;
            }
        }
    }
}