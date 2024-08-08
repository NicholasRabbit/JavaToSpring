package com.test.stream.streamGroup;

import java.util.*;
import java.util.stream.Collectors;


/*
* List使用Stream按某个属性分组
* */
public class StreamGroupTest {

    public static void main(String[] args) {

        List<BlogPost> blogPostList = new ArrayList<>();

        blogPostList.add(new BlogPost("A","Jack",BlogPostType.GUIDE,15));
        blogPostList.add(new BlogPost("B","Lily",BlogPostType.NEWS,10));
        blogPostList.add(new BlogPost("C","Tom",BlogPostType.REVIEW,20));
        blogPostList.add(new BlogPost("D","Bill",BlogPostType.GUIDE,15));
        blogPostList.add(new BlogPost("E","Rob",BlogPostType.NEWS,5));
        //1,按type分组，放回以type为key的map
        Map<BlogPostType, List<BlogPost>> groupMap = blogPostList.stream().collect(Collectors.groupingBy(BlogPost::getType));
        Set<Map.Entry<BlogPostType, List<BlogPost>>> entrySet = groupMap.entrySet();
        for(Map.Entry<BlogPostType,List<BlogPost>>  e : entrySet){
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        //2,分组后统计某一项属性数据之和
        Map<BlogPostType, Integer> sumMap = blogPostList.stream().collect(Collectors.groupingBy(BlogPost::getType, Collectors.summingInt(BlogPost::getLikes)));
        System.out.println("=======求和=========");
        sumMap.forEach((k,v) -> {
            System.out.println(k + " = " + v);
        });

        //3,统计好数据之后，在按倒叙排序
        Map<BlogPostType,Integer> sortedMap = new LinkedHashMap<>();
        sumMap.entrySet().stream().sorted(Map.Entry.<BlogPostType,Integer> comparingByValue().reversed())
                .forEachOrdered(e -> sortedMap.put(e.getKey(),e.getValue()));
        System.out.println("=========倒叙===========");
        sortedMap.forEach((k,v) ->{
            System.out.println(k + " = " + v);
        });

    }

}
