package com.polo.core.service.iml;

import com.polo.core.dao.PersonDao;
import com.polo.core.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述: todo
 * <p>
 * 作者: Administrator
 * 日期: 2017/12/27 0027 9:41
 */
@Service
public class PersonServiceIml implements PersonService{

    @Autowired
    PersonDao personDao;

    @Override
    public Person findById(Long id) {
        return personDao.findById(id);
    }
}
