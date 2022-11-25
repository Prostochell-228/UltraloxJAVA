import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Тип задачи: \n 1. Текстовая информация \n 2. Звуковая информация \n 3. Графическая информация \n 4. Краткая инструкция \n 6. Выход  \n Введите номер: ");
        int a = 0;
        while (a == 0) {
            try {
                String nAsString = in.next();
                int N = Integer.parseInt(nAsString);
                if (N <= 5 || N > 0) {
                    switch (N) {
                        case 1: {
                            text(a);
                            break;
                        }
                        case 2: {
                            sound(a);
                            break;
                        }
                        case 3: {
                            photo(a);
                            break;
                        }
                        case 4: {
                            instruction();
                            break;
                        }
                        case 5: {
                            System.out.println("");
                            System.out.println(ANSI_RED + "Штирлиц вытащил из сейфа записку Мюллера. Мюллеру было очень больно и он сильно ругался." + ANSI_RESET);
                            System.out.println("");
                            break;
                        }
                        case 6: {
                            System.exit(1);
                            break;
                        }
                        default:
                            System.out.print("Такого пункта нету \n");
                            break;
                    }
                    System.out.println(ANSI_YELLOW + "*Вы вернулись в меню. Возможно вы получили ответ или же ваш ввод был некоректен. В этом случее обратитесь к инструкции (Раздел 2)*" + ANSI_RESET);
                    System.out.print("Тип задачи: \n 1. Текстовая информация \n 2. Звуковая информация \n 3. Графическая информация \n 4. Краткая инструкция   \n Введите номер: ");
                } else {
                    System.out.print(ANSI_YELLOW + "*Вводи целочисленное положительное число входяшее в размер Integer, но желательно выбрать число/значение из списка.*" + ANSI_RESET + "\n \nВсё что ты написал не сушетвует и если ты продолжишь в таком ключе разговаривать с програмой ты долго не проживёшь)\n \nПовторить ввод:");
                }
            } catch (Exception e) {
                System.out.println(ANSI_YELLOW + "*Вводи целочисленное положительное число/другую корректную переменную*\n \n" + ANSI_RESET + "Всё что ты написал не сушетвует и если ты продолжишь в таком ключе разговаривать с програмой ты долго не проживёшь)" + ANSI_RESET + " \n \nПовторить ввод:");
            }
        }
    }

    public static void instruction() {
        System.out.println("");
        System.out.println("");
        System.out.println("Добро пожаловать в инструкцию к программе :)");
        System.out.println(ANSI_CYAN + "ТРЕПЕЩИ ХИМБИО УТКАНОС Я СОЗДАЛ РЕШАТОИНАТОР" + ANSI_RESET);
        System.out.println("");
        System.out.println("Данная программа преднозначена для решения задач по предмету Информатика. \n" + ANSI_RED + "!!!Автор не несёт ответственность за применение программы в террористических целях и военных преступлениях!!!" + ANSI_RESET);
        System.out.println("");
        System.out.println("РАЗДЕЛ 1.Цветовые  маркировки \n" + ANSI_CYAN + "ГОЛУБОЙ - " + ANSI_RESET + "используется лишь для названия программы\n" + ANSI_RED + "КРАСНЫЙ - " + ANSI_RESET + "предупрежденя от разроботчика и угрозы\n" + ANSI_YELLOW + "ЖЁЛТЫЙ - " + ANSI_RESET + "системные сообщения/системные ошибки\n" + ANSI_PURPLE + "ФИОЛЕТОВЫЙ - " + ANSI_RESET + "выделяет ответ к задаче\n" + ANSI_BLUE + "СИНИЙ - " + ANSI_RESET + "этим цветом возможно будет помечаться важная информация\n" + ANSI_GREEN + "ЗЕЛЁНЫЙ - " + ANSI_RESET + "этим цветом отмечены подзаголовки\n" + "СТАНДАРТНЫЙ - " + "основной текст который несёт основную интерактивность или объяснения которые не требуют особого внимания\n");
        System.out.println("");
        System.out.println("РАЗДЕЛ 2.Управление \n" + "Ввод в программе требуется производить либо целочисленные, положительные числа для пунктов меню и велечин из формул. \nЛибо чистая буква в том регистре который представлен в специальных скобках например: (V, I, M, t, k) и без дополнительных символов и пробелов.\n" + ANSI_BLUE + "Если переменная пустая или не дана в задачи вводите её как (0)\n" + ANSI_RESET + ANSI_RED + "!!!!ЕСЛИ ВЫБРАТЬ ЗНАЧЕНИЯ ДЛЯ ВВОДА ПЕРЕМЕННОЙ ТО ВСЕ ЕДЕНИЦЫ С ТАКОЙ ЖЕ ПЕРЕМЕННОЙ БУДУТ ПРИНЕМАТЬ ТО ЖЕ СЧИСЛЕНИЕ НАПРЕМЕР I и i!!!!" + ANSI_RESET);
        System.out.println("");
        System.out.println("РАЗДЕЛ 3.Преременные\n" + ANSI_GREEN + "Кодирование текста\n" + ANSI_RESET + "  I(информационный объём текста)\n  K(количество символов)\n  i(информационный вес символа)\n  N(количество символов в алфовите/мошность алфовита)\n" + ANSI_GREEN + "Кодерование звука\n" + ANSI_RESET + "  V(частота кодирования звука)\n  I(объём звукого файла)\n  M(количество звуковых каналов (моно-1/стерео-2) )\n  t(время аудиозаписи)\n  k(разряднось аудиозаписи)\n" + ANSI_GREEN + "Графическая информация\n" + ANSI_RESET + "  X(Количество пикселей по координате x/ширина)\n  Y(Количество пикселей по координате y/длина)\n  I(информационный объём графического файла)\n  i(иформационный вес каждого пикселя)\nГлавное стоить помнить что для задач используются формулы:(N = 2^i) - мощность алфовита,(I = K * i) - размер текстового файла,(I = V * M * t * k) - размер аудиофайла,(I = i * X * Y) - размер графического файла");
        System.out.println("");
        System.out.println("Программное обеспечение разработано компанией ОАО 'Юррий122Пакастингкорпорейтед' все права зашишены.");
        System.out.println("Телефон технической поддержки: 89529287459");
        System.out.println("");
        System.out.println("");
    }

    public static int coder(int B, int moderin) {
        switch (B) {
            case 2: {
                moderin = 8;
            }
            case 3: {
                moderin = 8192;
            }
            case 4: {
                moderin = 8388608;
            }
            default: {
                break;
            }
        }
        return moderin;
    }

    public static int decoder(int B2, int moderout) {
        switch (B2) {
            case 2: {
                moderout = 8;
            }
            case 3: {
                moderout = 8192;
            }
            case 4: {
                moderout = 8388608;
            }
            default: {
                break;
            }
        }
        return moderout;
    }

    public static int Hzinput(int BV, int moderV) {
        switch (BV) {
            case 2: {
                moderV = 1000;
            }
            case 3: {
                moderV = 1000000;
            }
            default: {
                break;
            }
        }
        return moderV;
    }

    public static int Hzoutput(int BV2, int moderV2) {
        switch (BV2) {
            case 2: {
                moderV2 = 1000;
            }
            case 3: {
                moderV2 = 1000000;
            }
            default: {
                break;
            }
        }
        return moderV2;

    }

    public static int Timeinput(int T, int modert) {
        switch (T) {
            case 2: {
                modert = 1000;
            }
            case 3: {
                modert = 1000000;
            }
            default: {
                break;
            }
        }
        return modert;

    }

    public static int Timeoutput(int T2, int modert2) {
        switch (T2) {
            case 2: {
                modert2 = 1000;
            }
            case 3: {
                modert2 = 1000000;
            }
            default: {
                break;
            }
        }
        return modert2;

    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static int text(int a) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер  ввода: \n 1. бит \n 2. байт \n 3. килобайт \n 4. мегабайт   \n Введите номер: ");
        String BAsString = in.next();
        int B = Integer.parseInt(BAsString);
        System.out.print("Размер  вывода: \n 1. бит \n 2. байт \n 3. килобайт \n 4. мегабайт   \n Введите номер: ");
        String B2AsString = in.next();
        int B2 = Integer.parseInt(B2AsString);
        System.out.print("Что необходимо найти? (I, K, i, N): ");
        String What = in.next();
        int K = 0;
        int i = 0;
        int N = 0;
        int I = 0;
        int moderout = 1;
        int moderin = 1;
        coder(B, moderin);
        decoder(B2, moderout);
        switch (What) {
            case "I":
                System.out.print("K = ");
                K = in.nextInt();
                System.out.print("i = ");
                i = in.nextInt();
                System.out.println(ANSI_PURPLE + "I = " + (K * i * moderin) / moderout + ANSI_RESET);
                break;
            case "K":
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("i = ");
                i = in.nextInt();
                System.out.println(ANSI_PURPLE + "K = " + I * moderin / i * moderin + ANSI_RESET);
                break;
            case "i":
                System.out.print("N = ");
                N = in.nextInt();
                if (N == 0) {
                    System.out.print("I = ");
                    I = in.nextInt();
                    System.out.print("K = ");
                    K = in.nextInt();
                    System.out.println(ANSI_PURPLE + "i = " + ((I * moderin) / K) / moderout + ANSI_RESET);
                    break;
                } else {
                    System.out.println(ANSI_PURPLE + "i =" + Math.log(N) / moderout + ANSI_RESET);
                    break;
                }
            case "N":
                System.out.print("i = ");
                i = in.nextInt();
                System.out.println(ANSI_PURPLE + "N = " + Math.pow(2, i * moderin) + ANSI_RESET);
                break;
        }
        a = 1;
        return a;
    }

    public static int sound(int a) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер ввода: \n 1. бит \n 2. байт \n 3. килобайт \n 4. мегабайт \nВведите номер: ");
        String BAsString = in.next();
        int B = Integer.parseInt(BAsString);
        System.out.print("Размер  вывода: \n 1. бит \n 2. байт \n 3. килобайт \n 4. мегабайт   \nВведите номер: ");
        String B2AsString = in.next();
        int B2 = Integer.parseInt(B2AsString);
        System.out.print("Размер ввода: \n 1. секунда \n 2. минута \n 3. час \nВведите номер:");
        String TAsString = in.next();
        int T = Integer.parseInt(TAsString);
        System.out.print("Размер вывода: \n 1. секунда \n 2. минута \n 3. час \nВведите номер:");
        String T2AsString = in.next();
        int T2 = Integer.parseInt(T2AsString);
        System.out.print("Размер входной герцовки: \n 1. Hz \n 2. KHz \n 3. MHz \n Введите номер:");
        String BVAsString = in.next();
        int BV = Integer.parseInt(BVAsString);
        System.out.print("Размер выходной (для задач на нахождение герцовки) герцовки: \n 1. Hz \n 2. KHz \n 3. MHz \nВведите номер:");
        String BV2AsString = in.next();
        int BV2 = Integer.parseInt(BV2AsString);

        System.out.print("Что необходимо найти? (V, I, M, t, k): ");
        String What = in.next();
        int V = 0;
        int I = 0;
        int M = 0;
        int t = 0;
        int k = 0;
        int moderV = 1;
        int moderV2 = 1;
        int moderin = 1;
        int moderout = 1;
        int moderT = 1;
        int moderT2 = 1;
        coder(B, moderin);
        Hzinput(BV, moderV);
        Timeinput(T, moderV);
        decoder(B2, moderout);
        Timeoutput(T2, moderT2);
        Hzoutput(BV2, moderV2);
        switch (What) {
            case "I":
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("M = ");
                M = in.nextInt();
                System.out.print("t = ");
                t = in.nextInt();
                System.out.print("k = ");
                k = in.nextInt();
                System.out.println(ANSI_PURPLE + "I = " + (V * moderV) * M * t * moderT * k / moderout * moderV2 * moderT2 + ANSI_RESET);
                break;
            case "V":
                System.out.print("I = ");
                V = in.nextInt();
                System.out.print("M = ");
                M = in.nextInt();
                System.out.print("t = ");
                t = in.nextInt();
                System.out.print("k = ");
                k = in.nextInt();
                System.out.println(ANSI_PURPLE + "V = " + (I * moderin / (M * t * moderT * k)) / moderout * moderV2 * moderT2 + ANSI_RESET);
                break;
            case "M":
                System.out.print("V = ");
                V = in.nextInt();
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("t = ");
                t = in.nextInt();
                System.out.print("k = ");
                k = in.nextInt();
                System.out.println(ANSI_PURPLE + "M = " + (I * moderin / (V * moderV * t * moderT * k)) / moderout * moderV2 * moderT2 + ANSI_RESET);
                break;
            case "t":
                System.out.print("V = ");
                V = in.nextInt();
                System.out.print("M = ");
                M = in.nextInt();
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("k = ");
                k = in.nextInt();
                System.out.println(ANSI_PURPLE + "t = " + (I * moderin / (V * moderV * M * k)) / moderout * moderV2 * moderT2 + ANSI_RESET);
                break;
            case "k":
                System.out.print("V = ");
                V = in.nextInt();
                System.out.print("M = ");
                M = in.nextInt();
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("t = ");
                t = in.nextInt();
                System.out.println(ANSI_PURPLE + "k = " + (I * moderin / (V * moderV * M * t * moderT)) / moderout * moderV2 * moderT2 + ANSI_RESET);
                break;

        }
        a = 1;
        return a;
    }

    public static int photo(int a) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер ввода: \n 1. бит \n 2. байт \n 3. килобайт \n 4. мегабайт   \n Введите номер: ");
        String BAsString = in.next();
        System.out.print("Размер  вывода: \n 1. бит \n 2. байт \n 3. килобайт \n 4. мегабайт   \nВведите номер: ");
        String B2AsString = in.next();
        int B2 = Integer.parseInt(B2AsString);
        int B = Integer.parseInt(BAsString);
        System.out.print("Что необходимо найти? (I, i, X, Y): ");
        String What = in.next();
        int X = 0;
        int I = 0;
        int i = 0;
        int Y = 0;
        int moderin = 1;
        int moderout = 1;
        coder(B, moderin);
        decoder(B2, moderout);
        switch (What) {
            case "i":
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("X = ");
                X = in.nextInt();
                System.out.print("Y = ");
                Y = in.nextInt();
                System.out.println(ANSI_PURPLE + "i= " + (I * moderin / (X * Y)) / moderout + ANSI_RESET);
                break;
            case "I":
                System.out.print("i = ");
                i = in.nextInt();
                System.out.print("X = ");
                X = in.nextInt();
                System.out.print("Y = ");
                Y = in.nextInt();
                System.out.println(ANSI_PURPLE + "I = " + (i * moderin * X * Y) / moderout + ANSI_RESET);
                break;
            case "X":
                System.out.print("i = ");
                i = in.nextInt();
                System.out.print("I = ");
                I = in.nextInt();
                System.out.print("t = ");
                Y = in.nextInt();
                System.out.println(ANSI_PURPLE + "X = " + (I * moderin / (i * moderin * Y)) + ANSI_RESET);
                break;
            case "Y":
                System.out.print("X = ");
                X = in.nextInt();
                System.out.print("i = ");
                i = in.nextInt();
                System.out.print("I = ");
                I = in.nextInt();
                System.out.println(ANSI_PURPLE + "Y = " + (I * moderin / (i * moderin * X)) + ANSI_RESET);
                break;
        }
        a = 1;
        return a;
    }
}