package com.company.task2;

import java.util.List;

public class LongestLineFinder {
    private MyFileReader fileReader;

    public LongestLineFinder() {
        this.fileReader = new MyFileReader();
    }

    public void findLongestLine(String filePath) {
        List<String> lines = fileReader.readLines(filePath);

        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println("Length of the longest line: " + longestLine.length());
        System.out.println("Longest line: " + longestLine);
    }
}
