package com.polo.core.service.iml;

import com.polo.core.dao.MemberDao;
import com.polo.core.domain.Member;
import com.polo.core.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by POLO on 2016/11/19.
 */
public interface PersonService {

    Person findById(Long id);

}
