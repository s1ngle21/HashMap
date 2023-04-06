package homework;

public class FileData {

    private String fileName;
    private long fileSize;
    private String filePath;


    public FileData(String fileName, long fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
