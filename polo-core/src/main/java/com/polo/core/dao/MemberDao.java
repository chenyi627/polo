package com.polo.core.dao;

import com.polo.core.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by POLO on 2016/11/19.
 */
@Repository
public interface MemberDao extends JpaRepository<Member, Long> {

    Member findByMemberId(Long memberId);
}
