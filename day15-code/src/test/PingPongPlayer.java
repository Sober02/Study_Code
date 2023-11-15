package test;

public class PingPongPlayer extends Sportsman implements SpeakEnglish{

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("运动员在学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("运动员在说英语");
    }
}
