package com.web.entity;

/**
 * @author cyq-xn
 * @ClassName LeftServlet
 * @Description TODO
 * @Date 2019/10/2
 * @Version 1.0
 **/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LeftServlet {
public LeftServlet(){
    init();
}
    private static List<Book> bookList;
    public static List<Book> init() {
        bookList = new ArrayList<>(10);
        Book[] books={
                new Book("地学家的藏书室","1.jpg","乔恩·法斯曼",1),
                new Book("北方四岛的呼叫","2.jpg","佐佐木让",2),
                new Book("突然亡命天涯","3.jpg","肯.来福特",3),
                new Book("春夏然后是冬","4.jpg","歌野昌午",4),
                new Book("偷窥者小平次","5.jpg","京极夏炎",5),
                new Book("色情电影谋杀案","6.jpg","爱德华.霍克",6),
                new Book("福尔摩斯古堡谜案","7.jpg","赤川次郎",7),
                new Book("福尔摩斯雪山谜案","8.jpg","赤川次郎",8),
                new Book("福尔摩斯幽灵谜案","9.jpg","赤川次郎",9),
                new Book("梦之花","10.jpg","东野奎吾",10),
        };
        bookList = Arrays.asList(books);
        return bookList;
    }

}
