package com.mysite.core.models.impl;

import com.mysite.core.models.Authorable;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;




    @Model(adaptables = Resource.class, adapters = Authorable.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class AuthorableImpl implements Authorable {



        @Inject

         String link;

       @Inject
        String text;


    @Override
    public String getLink() {
        return link;
    }

    @Override
    public String getTitle()
    {
        return text;
    }
}