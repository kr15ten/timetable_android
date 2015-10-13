package com.drjekyll.kristen.timetable.services;

import java.util.List;

/**
 * Created by Kristen on 26/09/2015.
 */
public interface Services<S, ID> {

    public S findById(ID id);

    public String save(S entity);

    public String update(S entity);

    public String delete(S entity);

    public List<S> findAll();
}
