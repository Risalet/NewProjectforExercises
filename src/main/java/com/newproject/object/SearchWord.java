package com.newproject.object;

public class SearchWord {
     static String[] search={"java","America","Turkey"};
     static String word;

    public static String[] getSearch() {
        return search;
    }

    public static void setSearch(String[] search) {
        SearchWord.search = search;
    }

    public static String getWord() {
        return word;
    }

    public static void setWord(String word) {
        SearchWord.word = word;
    }
}

