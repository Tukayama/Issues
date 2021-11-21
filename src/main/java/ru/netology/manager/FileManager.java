package ru.netology.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileManager {
    Map<String, String> map = new HashMap();

    public void save(String key, String element) {
        map.put(key, element);
    }

    public Map<String, String> registerNewApp(String key, String element) {
        map.put(key, element);
        return map;
    }

    public String getApplicationToOpenFile(String key) {
        String element = map.get(key);
        return element;
    }

    public Map<String, String> removeTheBindingApplications(String key) {
        map.remove(key);
        return map;
    }

    public Set<String> getListAllRegisteredExtensionss() {
        Set<String> keySet = map.keySet();
        return keySet;
    }

    public ArrayList<String> getListAllApp() {
        ArrayList<String> value = new ArrayList<>(map.values());
        return value;
    }
}
