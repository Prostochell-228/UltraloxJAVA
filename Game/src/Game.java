import java.util.Scanner;

//=======игра=======

public class Game {

    public static Character strannik;
    public static Story story;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Квест в честь годового юбилея обещаний Богдана провести D&D завтра");
        System.out.print("Вы чувствуете боль в голове. \n"
                + "Cухость которая вместе с песком прошлась по вашем дыхательным путям быстро оживила вас. \n(Введите ваше имя):");
        strannik = new Character(in.next());
        story = new Story();
        while (true) {
            strannik.Level += story.current_situation.dLevel;
            strannik.Respect += story.current_situation.dRespect;
            System.out.println("=====\nУровень:" + strannik.Level + "\tРепутация:" + strannik.Respect + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================Алё ну когда ДэНэДэ у первой партии?===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

}
