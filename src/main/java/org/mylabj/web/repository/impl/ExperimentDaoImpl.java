package org.mylabj.web.repository.impl;

import org.mylabj.web.model.Experiment;
import org.mylabj.web.repository.ExperimentDao;
import org.mylabj.web.util.LabHibernateDaoSupport;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 3/8/2016.
 */
@Repository
public class ExperimentDaoImpl extends LabHibernateDaoSupport implements ExperimentDao {

    public List<Experiment> getAll() {
        return getHibernateTemplate().loadAll(Experiment.class);
    }

    public Experiment getExperimentById(Long id) {
        return getHibernateTemplate().get(Experiment.class, id);
    }
}
