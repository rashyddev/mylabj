package org.mylabj.web.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by dev on 09.03.2016.
 */
public class LabHibernateDaoSupport extends HibernateDaoSupport {
    @Autowired
    public void initSessionFactory(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
}
