package com.polo.core.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by POLO on 2016/11/19.
 */
@Entity
@Table(name = "member")
public class Member {

    private static Logger logger = LoggerFactory.getLogger(Member.class);

    private Long memberId;
    private String name;

    @Id
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
