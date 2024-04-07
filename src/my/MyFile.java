package my;

public class MyFile {
    public String name;
    public String last_modified;
    public int size;

    public MyFile(String name, String last_modified, int size) {
        this.name = name;
        this.last_modified = last_modified;
        this.size = size;
    }

    public void info()
    {
        System.out.println();
    }


}
