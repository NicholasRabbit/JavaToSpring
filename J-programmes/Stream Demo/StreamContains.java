package com.test.stream.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamContains{

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            list1.add(arr1[i]);
        }
        int[] arr2 = {3,4,5,6};
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            list2.add(arr2[i]);
        }

        List<Integer> list = list1.stream().filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(list);


    }

}
