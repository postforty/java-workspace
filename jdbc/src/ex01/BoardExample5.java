package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample5 {
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    public BoardExample5() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaboard", "root", "1234");

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
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
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
        // 입력 받기
        Board board = new Board();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        board.setBtitle(scanner.nextLine());
        System.out.print("내용: ");
        board.setBcontent(scanner.nextLine());
        System.out.print("작성자: ");
        board.setBwriter(scanner.nextLine());

        // 보조 메뉴
        System.out.println("----------------------------------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        if (menuNo.equals("1")) {
            try {
                String sql = "INSERT INTO boards (btitle, bcontent, bwriter, bdate) VALUES (?, ?, ?, now())";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, board.getBtitle());
                pstmt.setString(2, board.getBcontent());
                pstmt.setString(3, board.getBwriter());
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    // ! 게시물 읽기
    public void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(scanner.nextLine());

        try {
            String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bno);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                System.out.println("######################################################################");
                System.out.println("번호: " + board.getBno());
                System.out.println("번호: " + board.getBtitle());
                System.out.println("번호: " + board.getBcontent());
                System.out.println("번호: " + board.getBwriter());
                System.out.println("번호: " + board.getBdate());
                System.out.println("######################################################################");
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
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
        BoardExample5 boardExample = new BoardExample5();
        boardExample.list();
    }
}
