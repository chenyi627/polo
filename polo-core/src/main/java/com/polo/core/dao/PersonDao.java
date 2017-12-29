package com.polo.core.dao;

import com.polo.core.domain.Member;
import com.polo.core.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 功能描述: todo
 * <p>
 * 作者: Administrator
 * 日期: 2017/12/26 0026 17:20
 */
public interface PersonDao {

    Person findById(Long id);
}
