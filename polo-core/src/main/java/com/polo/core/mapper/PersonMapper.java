package com.polo.core.mapper;

import com.polo.core.domain.Person;

public interface PersonMapper {

    Person selectByPrimaryKey(Integer id);

}