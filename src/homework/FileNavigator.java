package homework;

import java.nio.file.InvalidPathException;
import java.util.*;

public class FileNavigator {
    private HashMap<String, List<FileData>> files;

    public FileNavigator() {
        this.files = new HashMap<>();
    }

    public void add(String filePath, FileData fileData) {
        if (!filePath.equals(fileData.getFilePath())) {
            throw new InvalidPathException(filePath, "Your file path: " + fileData.getFilePath() + " is not compatible to your key");
        }
        if (!files.containsKey(filePath)) {
            List<FileData> fileList = new ArrayList<>();
            fileList.add(fileData);
            files.put(filePath, fileList);
        } else {
            files.get(filePath).add(fileData);
        }
    }

    public List<FileData> find(String filePath) {
        if (files.containsKey(filePath)) {
            return files.get(filePath);
        }
        return new ArrayList<>();
    }

    public List<FileData> filterBySize(long fileSize) {
        List<FileData> filtredList = new ArrayList<>();
        for (List<FileData> fileList : files.values()) {
            for (FileData fileData : fileList) {
                if (fileData.getFileSize() <= fileSize) {
                    fileList.add(fileData);
                }
            }
        }
        return filtredList;
    }

    public void remove(String filePath) {
        if (files.containsKey(filePath)) {
            files.remove(filePath);
        }
    }

    public List<FileData> sortBySize() {
        TreeMap<Long, List<FileData>> map = new TreeMap<>();
        for (List<FileData> fileList : files.values()) {
            for (FileData fileData : fileList) {
                map.put(fileData.getFileSize(), fileList);
            }
        }
        List<FileData> sortedList = new ArrayList<>();
        for (List<FileData> fileList : map.values()) {
            sortedList.addAll(fileList);
        }
        return sortedList;
    }

}
