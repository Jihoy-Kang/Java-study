package jdnc.jdbcPractice.repository;

import jdnc.jdbcPractice.domain.Member;

import java.sql.SQLException;

public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;

}
