package com.projects.frank.calpropinas.fragments;

import com.projects.frank.calpropinas.models.TipRecord;

/**
 * Created by Frank on 4/06/2016.
 */
public interface TipHistoryListFragmentListener  {
    void addToList(TipRecord record);
    void clearList();
}
