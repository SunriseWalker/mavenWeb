package collection;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<String, String>();

        for (Map.Entry<String, String> stringEntry : hashMap.entrySet()) {

        };

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

        TreeMap<String, String> treeMap = new TreeMap<String, String>() ;

    }

}
