package my;

public class MyMp3File extends MyFile {

    int time;

    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }

    public MyMp3File(String name, String last_modified, int size, int time) {
        super(name, last_modified, size);
        //TODO Auto-generated constructor stub
        this.time = time;
    }
    
}
