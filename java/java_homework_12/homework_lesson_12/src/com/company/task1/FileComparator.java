package com.company.task1;

import java.util.List;

public class FileComparator {
    private MyFileReader fileReader;

    public FileComparator() {
        this.fileReader = new MyFileReader();
    }

    public void compareFiles(String filePath1, String filePath2) {
        List<String> file1Lines = fileReader.readLines(filePath1);
        List<String> file2Lines = fileReader.readLines(filePath2);

        int minSize = Math.min(file1Lines.size(), file2Lines.size());

        for (int i = 0; i < minSize; i++) {
            if (!file1Lines.get(i).equals(file2Lines.get(i))) {
                System.out.println("Mismatch found at line " + (i + 1) + ":");
                System.out.println("File 1: " + file1Lines.get(i));
                System.out.println("File 2: " + file2Lines.get(i));
                return;
            }
        }

        if (file1Lines.size() != file2Lines.size()) {
            System.out.println("Files have different number of lines.");
        } else {
            System.out.println("Files are identical.");
        }
    }
}
