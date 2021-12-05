package com.mukesh.corejava.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mukesh Bhoge
 * Here covered two example of sorting using stream
 * 1) Natural sorting
 * 2) Sorting element by length of element
 **/
public class SortingByLength {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Mukesh");
        names.add("Abhijeet");
        names.add("Sagar");
        names.add("Dinesh");

        System.out.println("Original List :: "+names);
        names.stream().forEach(System.out::println);
        // Natural sorting Ascending
        List<String> naturalSort = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural Sorting :: " + naturalSort);

        /// Sort By Length
        Comparator<String> c = (s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            return (l1 < l2) ? -1 : (l1 > l2) ? 1 : s1.compareTo(s2);
        };
        List<String> sortByLength = names.stream().sorted(c).collect(Collectors.toList());
        System.out.println("Sort By length :: " + sortByLength);

    }

}
