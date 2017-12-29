package com.polo.core.service;

import com.polo.core.dao.MemberDao;
import com.polo.core.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by POLO on 2016/11/19.
 */
@Service
public class MemberService {

    private static Logger logger = LoggerFactory.getLogger(MemberService.class);

    @Autowired
    private MemberDao memberDao;


    public Member findByMemberId(Long memberId) {
        return memberDao.findByMemberId(memberId);
    }


}
