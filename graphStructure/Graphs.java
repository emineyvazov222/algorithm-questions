package org.spring.graphStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graphs {
    public static void main(String[] args) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        graph.put(1, new HashSet<>());
        graph.put(2, new HashSet<>());
        System.out.println(graph);

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(2).add(6);
        System.out.println(graph);

    }
}
