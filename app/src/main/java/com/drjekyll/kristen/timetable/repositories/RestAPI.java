package com.drjekyll.kristen.timetable.repositories;

import java.util.List;

/**
 * Created by Kristen on 26/09/2015.
 */
public interface RestAPI<S, ID> {
    S get(ID id);

    String post(S entity);

    String put(S entity);

    String delete(S entity);

    List<S> getAll();
}
