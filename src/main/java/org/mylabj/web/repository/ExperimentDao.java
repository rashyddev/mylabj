package org.mylabj.web.repository;

import org.mylabj.web.model.Experiment;

import java.util.List;

/**
 * Created by root on 3/8/2016.
 */
public interface ExperimentDao {
    List<Experiment> getAll();
    Experiment getExperimentById(Long id);
}
