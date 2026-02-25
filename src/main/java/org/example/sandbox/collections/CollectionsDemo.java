package org.example.sandbox.collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<String>();
        Set<String> set2 = new HashSet<String>();
        Set<String> set3 = new TreeSet<String>();

        //Lists
        List<String> list = new Vector<>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new LinkedList<String>();

        // Priority Queue
        Queue<String> queue = new PriorityQueue<String>();
        Collection<String> queue2 = new PriorityQueue<String>();

    }
}
