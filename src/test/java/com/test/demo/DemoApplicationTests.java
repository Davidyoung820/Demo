package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        tring str = "aabcccbbad";
        String result = filter(str);


        String string = "abcccbad";
        String finalResult = replaceStr(string);
        System.out.println("-> abbbad, ccc is replaced by b ");
        System.out.println("-> aaad, bbb is replaced by a ");
        System.out.println("->" + finalResult);

    }

    /**
     * 过滤重复出现的字符
     * @param str
     * @return
     */
    public String filter(String str){
        if(str == null){
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){//第一次出现的下标和最后一次相同，表示当前字符没有重复
                stringBuffer.append(ch);
            }else{
                if(str.indexOf(i) == i){ //重复出现的字符位置等于当前字符的索引，表示当前字符重复
                    stringBuffer.append(ch);
                }
            }
        }
        return stringBuffer.toString();
    }


    /**
     * 替换
     * @param str
     * @return
     */
    public String replaceStr(String str){
        return str.replaceAll("ccc", "b")
                .replaceAll("bbb", "a")
                .replaceAll("aaa", " ");
    }

}
