package jdnc.jdbcPractice.repository;

import jdnc.jdbcPractice.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.jdbc.support.SQLExceptionTranslator;

import javax.sql.DataSource;
import java.sql.*;
import java.util.NoSuchElementException;


/*
* jdbc템플릿 사용
*  */
@Slf4j
public class MemberRepositoryV5 implements MemberRepository {

    private final JdbcTemplate template;

    public MemberRepositoryV5(DataSource dataSource) {

        this.template = new JdbcTemplate(dataSource);
    }

    @Override
    public Member save(Member member) {
        String sql = "insert into member(member_id, money) values(?,?)";
        template.update(sql, member.getMemberId(), member.getMoney());
        return member;

    }

    @Override
    public Member findById(String memberId)  {
        String sql = "select * from member where member_id = ?";
        return template.queryForObject(sql, memberRowMapper(), memberId);
    }




    @Override
    public void update(String memberId, int money){
        String sql = "update member set money=? where member_id=?";
        template.update(sql,money, memberId);

    }

    @Override
    public void delete(String memberId)  {
        String sql = "delete from member where member_id=?";
        template.update(sql, memberId);
    }
    /*private void close(Connection con, Statement pstmt, ResultSet rs){
        JdbcUtils.closeResultSet(rs);
        JdbcUtils.closeStatement(pstmt);
        //주의 트랜잭션 동기화를 사용하려면 dataSourceUtils를 사용
        DataSourceUtils.releaseConnection(con, dataSource);

    }

    private Connection getConnection() throws SQLException {
        //주의 트랜잭션 동기화를 사용하려면 dataSourceUtils를 사용해야함
        Connection con = DataSourceUtils.getConnection(dataSource);

        log.info("get connection={}, class={}", con, con.getClass());
        return con;

    }*/

    private RowMapper<Member> memberRowMapper(){
        return (rs, rowNum) ->{
            Member member = new Member();
            member.setMemberId(rs.getString("member_id"));
            member.setMoney(rs.getInt("money"));
            return member;
        };
    }
}
