import homework.FileData;
import homework.FileNavigator;


public class Test { //This class was made to check how code works
    public static void main(String[] args) {

        FileData fileData = new FileData("Just File 1", 1024L, "test.txt");
        FileData fileData1 = new FileData("Just File 2", 1024L * 1024L, "test1.txt");
        FileData fileData2 = new FileData("Just File 3", 1024L / 64L, "test2.txt");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("test.txt", fileData);
        fileNavigator.add("test1.txt", fileData1);
        fileNavigator.add("test2.txt", fileData2);
        System.out.println(fileNavigator.sortBySize());

    }
}
