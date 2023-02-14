// =======история=======
public class Story extends Backpack {

    private Situation start_story;
    public Situation current_situation;

    Story() {
        start_story = new Situation(
                "Пропуждение",
                "Оглянувшись на площади какого то города, вы не заметили ни единой души. Как же прекрасен Стерлипарижъ.\n"
                        + "Всё вокруг напоминало какую-то старую Европейскую застройку из песчанника.\nВдруг вы замечаете единственное напоминание о вчерашним дне, указатель: /Выход/Карьер/Бар/ \n"
                        + "(1)Ну я всё таки ничего не понимаю и не помню. Надо бы проверить себя и вещи на целостность\n"
                        + "(2)Чёрт я так ненавижу это место, прора убираться отсюда пака при памяти /Выход/\n"
                        + "(3)Стоит пойти в бар и выяснить что вчера случилось /Бар/\n"
                        + "(4)ВРЕМЯ РАБОТАТЬ КАСИПОША /Карьер/",
                4, 0, 0);
        start_story.direction[0] = new Situation(
                "Самочувствие",
                "Неудачное начало, ну что ж, почки на месте и на том спасибо"
                        +"\n(1)Надо бы рюкзак проверить"
                        +"\n(2)Так я вроде указатель тут видел",

                2, 1, 0);
        start_story.direction[0].direction[0] = new Situation(
                "Содержимое рюкзака",
                "Довольно медлительно сняв и открыв свой рюкзак со спины \n вы наблюдаете это",2,1,0;
                for(int i = 0; i< arBackpack.size(); i++) {
                System.out.println(arBackpack.get(i));
                } );
        start_story.direction[1] = new Situation(
                "Это пустыня игрок, я люблю этот запах дизбалансных монстров по утру",
                "\nНа вас вылетело 3 касадора, чего делать будем?\n"
                        + "(1)Бей\n"
                        + "(2)Беги\n",

                2, 1,  0
        );
        start_story.direction[1].direction[0] = new Situation(
                "Смэрть",
                "Вас поглатила пустыня...",
                0,
                -1,
                0
                );
        start_story.direction[1].direction[1] = new Situation(
                "Смээээрть",
                "Вас поглатила пустыня... но не так быстро",
                0,
                1,
                0
        );
        start_story.direction[2] = new Situation(
                "3",
                "Мой первый клиент доволен скоростью и качеством "
                        + "моей работы. Сейчас мне звонил лично \nдиректор компании,  сообщил что скоро состоится еще более крупная сделка"
                        + " и он хотел, чтобы по ней работал именно я!", 0, 0,
                1);
        start_story.direction[3] = new Situation(
                "Работаем",
                "Неудачное начало, ну что ж, сегодня в конторе корпоратив! "
                        + "Познакомлюсь с коллегами, людей так сказать посмотрю, себя покажу",
                0, 0, -10);
        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
