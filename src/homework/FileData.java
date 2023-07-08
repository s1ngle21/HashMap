package homework;

import java.util.Objects;

public class FileData {

    private String fileName;
    private Long fileSize;
    private String filePath;


    public FileData(String fileName, Long fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "\n{" +
                " fileName = '" + fileName + '\'' +
                ", fileSize = " + fileSize +
                ", filePath = '" + filePath + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return fileSize == fileData.fileSize && Objects.equals(fileName, fileData.fileName) && Objects.equals(filePath, fileData.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileSize, filePath);
    }
}
