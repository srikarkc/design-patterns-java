public class CompositePatternDemo {
    public static void main(String[] args) {
        FilesystemComponent file1 = new File("File1.txt");
        FilesystemComponent file2 = new File("File2.txt");
        FilesystemComponent file3 = new File("File3.txt");

        Directory directory1 = new Directory("Directory1");
        Directory directory2 = new Directory("Directory2");

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        directory2.addComponent(file3);
        directory2.addComponent(directory1);

        directory2.showDetails();
    }
}
