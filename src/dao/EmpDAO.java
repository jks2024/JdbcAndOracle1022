package dao;

import common.Common;
import vo.EmpVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// DAO(Database Access Object) : 데이터베이스에 접근하여 데이터를 조회하거나 수정하는 데 사용
// DAO는 VO객체와 데이터베이스 간의 매핑을 담당
public class EmpDAO {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    Scanner sc = null;

    EmpDAO() {
        sc = new Scanner(System.in);
    }

    // SELECT(조회) 기능 구현
    public List<EmpVO> empSelect() {
        List<EmpVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection(); // 오라클 DB 연결
            stmt = conn.createStatement(); // statement 생성
            String query = "SELECT * FROM EMP";
            // executeQuery : select 문과 같이 결과값이 여러 개의 레코드로 반환되는 경우 사용
            rs = stmt.executeQuery(query); // ResultSet : 여러 행의 결과값을 받아서 반복자 제공
            // next() : 현재 행에서 한 행 앞으로 이동
            // previous() : 현재 행에서 한 행 뒤로 이동
            // first() : 첫 번째 행으로 이동
            // last() : 마지막 행으로 이동
            while (rs.next()) {
                int no = rs.getInt("EMPNO");
                String name = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("MGR");
                Date date = 

            }

        } catch (Exception e) {
            System.out.println("EMP 조회 실패 !!!!");
        }
    }





}
