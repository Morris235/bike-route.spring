// package com.morris.bikeroutespring;

// import java.util.Arrays;
// import java.util.List;

// /*
//     id: ID!
//     name: String!
//     rate: Int
//     finish_time: String
//     owner_id: String
// */ 
// public record Route(String id, String name, int rate, String finishTime, String ownerId) {
//     private static List<Route> route = Arrays.asList(
//         // new Book("book-1", "Effective Java", 416, "author-1"),
//         // new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
//         // new Book("book-3", "Down Under", 436, "author-3")
// );

// public static Route getById(String id) {
//     return route.stream()
//             .filter(route -> route.id().equals(id))
//             .findFirst()
//             .orElse(null);
// }
// }
