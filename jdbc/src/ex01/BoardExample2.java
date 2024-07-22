package ex01;

import java.util.Scanner;

public class BoardExample2 {
    private Scanner scanner = new Scanner(System.in); // 추가

    // 메인 메뉴 선택 기능
    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "korea", "2022.01.27", "게시판에 오신 것을 환영합니다.");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "korea", "2022.01.27", "안녕하세요.");
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        System.out.println();

        // switch(menuNo) {
        // case "1" -> create();
        // case "2" -> read();
        // case "3" -> clear();
        // case "4" -> exit();
        // }

        switch (menuNo) {
            case "1":
                create();
                break; // fall-through 방지
            case "2":
                read();
                break;
            case "3":
                clear();
                break;
            case "4":
                exit();
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }

    public void create() {
        System.out.println("create() 메서드 실행");
        list();
    }

    public void read() {
        System.out.println("read() 메서드 실행");
        list();
    }

    public void clear() {
        System.out.println("clear() 메서드 실행");
        list();
    }

    public void exit() {
        System.out.println("exit() 메서드 실행");
        System.exit(0); // 종료 상태 코드(0은 정상 종료, 그외 비정상 종료)
    }

    public static void main(String[] args) {
        BoardExample2 boardExample = new BoardExample2();
        boardExample.list();
    }
}
