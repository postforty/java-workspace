package ex01;

public class BoardExample1 {
    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "korea", "2022.01.27", "게시판에 오신 것을 환영합니다.");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "korea", "2022.01.27", "안녕하세요.");
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.println("메뉴 선택: ");
        System.out.println();
    }

    public static void main(String[] args) {
        BoardExample1 boardExample = new BoardExample1();
        boardExample.list();
    }
}
