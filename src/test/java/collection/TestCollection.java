package collection;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
//        Collection

//        List

        iteratorDelete();
    }


    public static void iteratorDelete(){
        String[] str = new String[]{"1","2"};
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.add("5");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String obj = (String) iterator.next();
            if(StringUtils.join(str, ",").contains(obj)){

                iterator.remove();
            }
        }

        System.out.println("还剩余的元素个数：" + list.size() + " 元素值："+list.toString());


    }

}
