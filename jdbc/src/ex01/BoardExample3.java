package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// 게시물 목록 기능(JDBC 연동)
public class BoardExample3 {
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    public BoardExample3() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaboard", "root", "1234");

            System.out.println("connect");
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
    }

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------------");

        try {
            String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards ORDER BY bno DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(); // executeQuery() 메서드는 쿼리 실행후 응답값 반환
            while (rs.next()) { // rs.next()는 결과 집합에서 다음 행으로 이동하고, 결과가 존재하면 true를 반환
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                System.out.printf("%-6s%-12s%-16s%-40s\n",
                        board.getBno(),
                        board.getBwriter(),
                        board.getBdate(),
                        board.getBtitle());
            }
            // 리소스 해제
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

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
        System.exit(0);
    }

    public static void main(String[] args) {
        BoardExample3 boardExample = new BoardExample3();
        boardExample.list();
    }
}
