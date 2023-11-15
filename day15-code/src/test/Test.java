package test;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //1.篮球教练
        BasketballCoach basketballCoach = new BasketballCoach("坤坤",24);
        System.out.println(basketballCoach.getName() + ", " + basketballCoach.getAge());
        basketballCoach.teach();
        //2.乒乓球教练
        PingPongCoach pingPongCoach = new PingPongCoach("乒乓coach", 25);
        System.out.println(pingPongCoach.getName() + ", " + pingPongCoach.getAge());
        pingPongCoach.teach();
        pingPongCoach.speakEnglish();
        //3.篮球运动员
        BasketballPlayer basketballPlayer = new BasketballPlayer("ikun",21);
        System.out.println(basketballPlayer.getName() + ", " + basketballPlayer.getAge());
        basketballPlayer.study();
        //4.乒乓球运动员
        PingPongPlayer pingPongPlayer = new PingPongPlayer("乒乓palyer",22);
        System.out.println(pingPongPlayer.getName() + ", " + pingPongPlayer.getAge());
        pingPongPlayer.study();
        pingPongPlayer.speakEnglish();
    }
}
