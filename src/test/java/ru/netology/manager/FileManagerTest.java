package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    private FileManager fileManager = new FileManager();

    @BeforeEach
    public void before() {
        fileManager.save("doc", "Word");
        fileManager.save("str", "Str");
    }

    @Test
    public void registerNewApp() {
        Map<String, String> mapT = new HashMap<>();
        mapT.put("ipg", "AddSee");
        mapT.put("doc", "Word");
        mapT.put("str", "Str");
        Map expected = mapT;
        Map actual = fileManager.registerNewApp("ipg", "AddSee");
        assertEquals(expected, actual);
    }

    @Test
    public void getApplicationToOpenFile() {
        String expected = "Word";
        String actual = String.valueOf(fileManager.getApplicationToOpenFile("doc"));
        assertEquals(expected, actual);
    }

    @Test
    public void removeTheBindingApplications() {
        Map<String, String> mapT = new HashMap<>();
        mapT.put("doc", "Word");
        Map expected = mapT;
        Map actual = fileManager.removeTheBindingApplications("str");
        assertEquals(expected, actual);
    }

    @Test
    public void getListAllRegisteredExtensionss() {
        Set<String> expected = Set.of("str", "doc");
        Set actual = fileManager.getListAllRegisteredExtensionss();
        assertEquals(expected, actual);
    }


    @Test
    public void getListAllApp() {
        List<String> expected = List.of("Str", "Word");
        ArrayList actual = fileManager.getListAllApp();
        assertEquals(expected, actual);
    }

}