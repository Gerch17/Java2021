package r3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class Main {
    private static final Semaphore semaphore = new Semaphore(1);
    static void createSet(){
        try {
            semaphore.acquire();
            Set<String> semaphoreSet;
            System.out.println("Set has been created");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("First part");
        createSet();
        System.out.println("============================\nSecond part");
        Map map = new HashMap();
        Collections.synchronizedMap(map);
        System.out.println("Map has been created");
    }
}
