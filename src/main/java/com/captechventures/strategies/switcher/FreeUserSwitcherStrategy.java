package com.captechventures.strategies.switcher;

import com.captechventures.model.Profile;
import com.captechventures.strategy.Strategy;
import com.google.common.collect.Maps;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Strategy(type = UserSwitcherStrategy.class, profiles = Profile.FREE)
public class FreeUserSwitcherStrategy implements UserSwitcherStrategy {

    @Override
    public Map<String, String> getLinks(HttpServletRequest request) {

        Map<String, String> links = Maps.newLinkedHashMap();

        links.put("Free", null);
        links.put("Limited", request.getServletPath()+"/user?id=1");
        links.put("Premium", request.getServletPath()+"/user?id=2");

        return links;
    }

}
