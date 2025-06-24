abstract class Media{
    String fileName;
    int fileSizeInMB;

    public Media(String fileName,int fileSizeInMB){
        this.fileName = fileName;
        this.fileSizeInMB = fileSizeInMB;
    }
    abstract double calculatePlaybackTime();

    abstract void displayMediaInfo();
}
class ClassAduioFile extends Media{
    public ClassAduioFile(String fileName,int fileSizeInMB){
        super(fileName,fileSizeInMB);
    }
    @Override
    public double calculatePlaybackTime(){
        double aduioPlaybackTime = fileSizeInMB * 8;


        return aduioPlaybackTime;
    }
    @Override
    public void displayMediaInfo(){
        System.out.println("File Name: " + fileName);
        System.out.println("File Size In MB: " + fileSizeInMB);
        System.out.println("Calculate Playback Time:" + calculatePlaybackTime());
    }
}
class ClassVideoFile extends Media{
    public ClassVideoFile(String fileName,int fileSizeInMB){
        super(fileName,fileSizeInMB);
    }
    @Override
    public double calculatePlaybackTime(){
        double videoPlaybackTime = fileSizeInMB * 8;
        return videoPlaybackTime;
    }
    @Override
    public void displayMediaInfo(){
        System.out.println("File Name: " + fileName);
        System.out.println("File Size In MB: " + fileSizeInMB);
        System.out.println("Calculate Playback Time:" + calculatePlaybackTime());

    }
}
public class MediaPlayerSystem {
    public static void main(String[] args){
        ClassAduioFile classAduioFile = new ClassAduioFile("ss",50);
        ClassVideoFile classVideoFile = new ClassVideoFile("dd",60);

        classAduioFile.displayMediaInfo();
        System.out.println();
        classVideoFile.displayMediaInfo();
    }
}
