package ua.alishev.springcourse;

public class MusicalPlayer {
    private Music music;
    private String name;
    private int value;
         //IoC
  //  public MusicalPlayer(Music music) {
      //  this.music = music;
   // }

    public MusicalPlayer() {
    }

    public void playMusic(){
     music.getSong();
        System.out.println("Playing  :  " +music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
