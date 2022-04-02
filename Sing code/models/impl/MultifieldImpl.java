package com.mysite.core.models.impl;

import com.adobe.cq.wcm.core.components.models.Title;
import com.mysite.core.models.Multifield;

import javax.inject.Inject;
import java.util.List;

public class MultifieldImpl implements Multifield {

    @Inject
    List<Title> titles;
    @Override
    public List<Title> getTitles() {
        return null;
    }
}
