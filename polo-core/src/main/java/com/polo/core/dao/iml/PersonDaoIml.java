package com.polo.core.dao.iml;

import com.polo.core.dao.PersonDao;
import com.polo.core.domain.Person;
import com.polo.core.mapper.PersonMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 功能描述: todo
 * <p>
 * 作者: Administrator
 * 日期: 2017/12/26 0026 17:20
 */
@Repository
public class PersonDaoIml implements PersonDao {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person findById(Long id) {
        return personMapper.selectByPrimaryKey(id.intValue());
    }
}
