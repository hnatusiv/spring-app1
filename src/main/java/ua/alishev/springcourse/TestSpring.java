package ua.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
      //  Music music = context.getBean("musicBean" , Music.class);

       // MusicalPlayer musicalPlayer = new MusicalPlayer(music);
        MusicalPlayer musicalPlayer= context.getBean("musicalPlayer",MusicalPlayer.class);
        musicalPlayer.playMusic();
        System.out.println( " Name of MusicPlayer : " +musicalPlayer.getName());
        System.out.println(" Value =  "  +musicalPlayer.getValue());
        System.out.println(" Value =  "  +musicalPlayer.getValue()); //!
        System.out.println();//!!

        context.close();
    }
}
