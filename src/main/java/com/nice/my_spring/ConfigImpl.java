package com.nice.my_spring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ConfigImpl implements Config {

    private Map<Class, Class> ifc2ImplClass = new HashMap<>();

    public ConfigImpl() {
        ifc2ImplClass.put(Speaker.class, ConsoleSpeaker.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2ImplClass.get(type);
    }
}








