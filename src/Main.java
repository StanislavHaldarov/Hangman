import com.sun.security.jgss.GSSUtil;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void printHangman(int wrongGuesses, String singlePlayerName, char[] usedWrongLetters, String word) {
        switch (wrongGuesses) {
            case 0: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        ");
                System.out.println("   |        ");
                System.out.println("   |       ");
                System.out.println("   |        ");
                System.out.println("   |         ");
                System.out.println("   |        ");
                System.out.println("   |       ");
                System.out.println("   |         ");
                System.out.println("   |       ");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 1: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /      \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         ");
                System.out.println("   |        ");
                System.out.println("   |       ");
                System.out.println("   |         ");
                System.out.println("   |       ");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 2: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /      \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |          ||");
                System.out.println("   |          || ");
                System.out.println("   |          ==  ");
                System.out.println("   |        ");
                System.out.println("   |       ");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 3: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /      \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||");
                System.out.println("   |        / || ");
                System.out.println("   |       ^  ==  ");
                System.out.println("   |            ");
                System.out.println("   |           ");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 4: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /      \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         ");
                System.out.println("   |       ");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 5: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /      \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         /  ");
                System.out.println("   |       _/    ");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 6: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /      \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         /  \\ ");
                System.out.println("   |       _/    \\_");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 7: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       /    o \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         /  \\ ");
                System.out.println("   |       _/    \\_");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 8: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       / o  o \\ ");
                System.out.println("   |       \\      /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         /  \\ ");
                System.out.println("   |       _/    \\_");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 9: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       / o  o \\ ");
                System.out.println("   |       \\   >  /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         /  \\ ");
                System.out.println("   |       _/    \\_");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                break;
            }
            case 10: {
                System.out.println("   ____________");
                System.out.println("   |          |");
                System.out.println("   |          |");
                System.out.println("   |        /¯¯¯¯\\");
                System.out.println("   |       / x  x \\ ");
                System.out.println("   |       \\   0  /");
                System.out.println("   |        \\_  _/");
                System.out.println("   |         _||_");
                System.out.println("   |        / || \\");
                System.out.println("   |       ^  ==  ^");
                System.out.println("   |         /  \\ ");
                System.out.println("   |       _/    \\_");
                System.out.println("   |                ");
                System.out.println("   |                ");
                System.out.println("___|___             ");
                System.out.print("Използвани грешни букви: ");
                for (int i = 0; i < usedWrongLetters.length; i++) {
                    System.out.print(usedWrongLetters[i] + ", ");
                }
                System.out.println();
                System.out.println("Вие обесихте човечето!");
                System.out.println("Думата е: " + word);
                gameOverQuestion(singlePlayerName);
                break;
            }
        }
    }

    public static void gameMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________");
        System.out.println("Изберете режим на игра: \n1. Единична игра \n2. Играч срещу играч \n3. Изход");
        System.out.println("_________________________________");
        String gameMenuSelect = scan.nextLine();
        if (Objects.equals(gameMenuSelect, "1")) {
            singleplayer();

        } else if (Objects.equals(gameMenuSelect, "2")) {

        } else if (Objects.equals(gameMenuSelect, "3")) {
            System.out.println("Довиждане!");
        } else {
            System.out.println("ГРЕШКА! Такава опция не съществува!");
            gameMenu();
        }
    }

    public static void gameOverQuestion(String singlePlayerName) {
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________");
        System.out.println("1. Познай нова дума \n2. Към главното меню \n3. Изход");
        System.out.println("_________________________________");
        String userSelect = scan.nextLine();
        if (userSelect.equals("1")) {
            getSingleplayerWord(singlePlayerName);
        } else if (userSelect.equals("2")) {
            gameMenu();
        } else if (userSelect.equals("3")) {
            System.out.println("Довиждане!");
        } else {
            System.out.println("ГРЕШКА! Такава опция не съществува!");
            gameOverQuestion(singlePlayerName);
        }
    }

    public static String getRandomArrayElement() {
        Random randomGenerator = new Random();
        String[] bulgarianTowns = {"Айтос", "Аксаково", "Алфатар", "Антоново", "Априлци", "Ардино", "Асеновград", "Ахелой", "Ахтопол", "Балчик", "Банкя", "Банско", "Баня", "Батак", "Батановци", "Белене", "Белица", "Белово", "Белоградчик", "Белослав", "Берковица", "Благоевград", "Бобов дол", "Бобошево", "Божурище", "Бойчиновци", "Болярово", "Борово", "Ботевград", "Брацигово", "Брегово", "Брезник", "Брезово", "Брусарци", "Бургас", "Бухово", "Българово", "Бяла", "Бяла Слатина", "Бяла Черква", "Варна", "Велики Преслав", "Велико Търново", "Велинград", "Ветово", "Ветрен", "Видин", "Враца", "Вълчедръм", "Вълчи дол", "Върбица", "Вършец", "Габрово", "Генерал Тошева", "Главиница", "Глоджево", "Годеч", "Горна Оряховица", "Гоце Делчев", "Грамада", "Гулянци", "Гурково", "Гълъбово", "Две могили", "Дебелец", "Девин", "Девня", "Джебел", "Димитровград", "Димово", "Добринище", "Добрич", "Долна баня", "Долна Митрополия", "Долна Оряховица", "Долни Дъбник", "Долни чифлик", "Доспат", "Драгоман", "Дряново", "Дулово", "Дунавци", "Дупница", "Дългопол", "Елена", "Елин Пелин", "Елхово", "Етрополе", "Завет", "Земен", "Златарица", "Златица", "Златоград", "Ивайловград", "Игнатиево", "Искър", "Исперих", "Ихтиман", "Каблешково", "Каварна", "Казанлък", "Калофер", "Камено", "Каолиново", "Карлово", "Карнобат", "Каспичан", "Кермен", "Килифарево", "Китен", "Клисура", "Кнежа", "Козлодуй", "Койнаре", "Копривщица", "Костандово", "Костенец", "Костинброд", "Котел", "Кочериново", "Кресна", "Криводол", "Кричим", "Крумовград", "Крън", "Кубрат", "Куклен", "Кула", "Кърджали", "Кюстендил", "Левски", "Летница", "Ловеч", "Лозница", "Лом", "Луковит", "Лъки", "Любимец", "Лясковец", "Мадан", "Маджарово", "Малко Търново", "Мартен", "Мездра", "Мелник", "Меричлери", "Мизия", "Момин проход", "Момчилград", "Монтана", "Мъглиж", "Неделино", "Несебър", "Николаево", "Никопол", "Нова Загора", "Нови Искър", "Нови пазар", "Обзор", "Омуртаг", "Опака", "Оряхово", "Павел баня", "Павликени", "Пазарджик", "Панагюрище", "Перник", "Перущица", "Петрич", "Пещера", "Пирдоп", "Плачковци", "Плевен", "Плиска", "Пловдив", "Полски Тръмбеш", "Поморие", "Попово", "Пордим", "Правец", "Приморско", "Провадия", "Първомай", "Раднево", "Радомир", "Разград", "Разлог", "Ракитово", "Раковски", "Рила", "Роман", "Рудозем", "Русе", "Садово", "Самоков", "Сандански", "Сапарева баня", "Свети Влас", "Свиленград", "Свищов", "Своге", "Севлиево", "Сеново", "Септември", "Силистра", "Симеоновград", "Симитли", "Славяново", "Сливен", "Сливница", "Сливо поле", "Смолян", "Смядово", "Созопол", "Сопот", "София", "Средец", "Стамболийски", "Стара Загора", "Стражица", "Стралджа", "Стрелча", "Суворово", "Сунгурларе", "Сухиндол", "Съединение", "Сърница", "Твърдица", "Тервел", "Тетевен", "Тополовград", "Троян", "Трън", "Тръстеник", "Трявна", "Тутракан", "Търговище", "Угърчин", "Хаджидимово", "Харманли", "Хасково", "Хисаря", "Цар Калоян", "Царево", "Чепеларе", "Червен бряг", "Черноморец", "Чипровци", "Чирпан", "Шабла", "Шивачево", "Шипка", "Шумен", "Ябланица", "Якоруда", "Ямбол"};
        int randomIndex = randomGenerator.nextInt(bulgarianTowns.length);
        return bulgarianTowns[randomIndex];
    }

    public static void singleplayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Въведете името си *до 16 символа*: ");
        String singlePlayerName = scan.nextLine();
        if (singlePlayerName.length() > 16) {
            System.out.println("Името е по-дълго от 16 символа!");
            singleplayer();
        } else {
            getSingleplayerWord(singlePlayerName);
        }

    }

    public static void getSingleplayerWord(String singlePlayerName) {
        char[] usedWrongLetters = {' ', ' ', ' ', ' ', ' ',' ',' ',' ',' ',' '};
        int wrongLetterIndex = 0;
        int wrongGuesses = 0;
        String word = getRandomArrayElement();
        word = word.toUpperCase();
        printHangman(wrongGuesses,singlePlayerName,usedWrongLetters,word);
        System.out.println();
        char[] hidWord = word.toCharArray();
        for (int i = 0; i < hidWord.length; i++) {
            if(hidWord[i] != ' ')
            {
                hidWord[i] = '_';
            }
        }
        userEnterLetter(usedWrongLetters,wrongLetterIndex,word,hidWord,wrongGuesses,singlePlayerName);
    }
    public static void userEnterLetter(char[] usedWrongLetters,int wrongLetterIndex, String word, char[] hidWord, int wrongGuesses, String singlePlayerName)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Думата ви: ");
        for (int i = 0; i < hidWord.length; i++) {
            System.out.print(hidWord[i]);
        }
        System.out.println();
        System.out.print("Използвани грешни букви: ");
        for (int i = 0; i < usedWrongLetters.length; i++) {
            System.out.print(usedWrongLetters[i] + ", ");
        }
        System.out.println();
        System.out.print("Въведете буква: ");
        String userGuess = scan.nextLine();
        userGuess = userGuess.toUpperCase();
        char[] userGuessArray = userGuess.toCharArray();
        if(userGuess.length() == 1)
        {
            if(userGuessArray[0] >= 'А' && userGuessArray[0] <= 'Я') {
                boolean arrayChanged = false;
                for (int i = 0; i < hidWord.length; i++) {
                    if (userGuessArray[0] == word.charAt(i)) {
                        hidWord[i] = userGuessArray[0];
                        arrayChanged = true;
                    }
                }
                if (arrayChanged) {
                    printHangman(wrongGuesses, singlePlayerName, usedWrongLetters, word);
                    boolean userWins = true;
                    for (int i = 0; i < hidWord.length; i++) {
                        if (hidWord[i] == '_') {
                            userWins = false;
                        }
                    }
                    if (userWins) {
                        System.out.println("Поздравления, " + singlePlayerName + ", успяхте да спасите човечето!");
                        System.out.println("Думата е " + word);
                        gameOverQuestion(singlePlayerName);

                    } else {
                        userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hidWord, wrongGuesses, singlePlayerName);
                    }
                } else {
                    wrongGuesses++;
                    boolean newWrongGuess = true;
                    for (int i = 0; i < usedWrongLetters.length; i++) {
                        if (userGuessArray[0] == usedWrongLetters[i]) {
                            newWrongGuess = false;
                            wrongGuesses--;
                        }
                    }

                    if (newWrongGuess) {
                        usedWrongLetters[wrongLetterIndex] = userGuessArray[0];
                        wrongLetterIndex++;
                    }
                    printHangman(wrongGuesses, singlePlayerName, usedWrongLetters, word);
                    userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hidWord, wrongGuesses, singlePlayerName);
                }
            }
            else
            {
                System.out.print("Използвайте само кирилица! ");
                userEnterLetter(usedWrongLetters,wrongLetterIndex,word,hidWord,wrongGuesses,singlePlayerName);
            }

        }
        else{
            System.out.print("Въведохте повече от 1 символ!");
            userEnterLetter(usedWrongLetters,wrongLetterIndex,word,hidWord,wrongGuesses,singlePlayerName);
        }
    }

    public static void main(String[] args) {

        System.out.println("  БЕСЕНИЦА v15.06 \n  Проект на Станислав Халдъров");

        System.out.println("   ____________");
        System.out.println("   |          |");
        System.out.println("   |          |");
        System.out.println("   |        /¯¯¯¯\\");
        System.out.println("   |       / x  x \\ ");
        System.out.println("   |       \\   0  /");
        System.out.println("   |        \\_  _/");
        System.out.println("   |         _||_");
        System.out.println("   |        / || \\");
        System.out.println("   |       ^  ==  ^");
        System.out.println("   |         /  \\ ");
        System.out.println("   |       _/    \\_");
        System.out.println("   |                ");
        System.out.println("   |                ");
        System.out.println("___|___             ");
        System.out.println(getRandomArrayElement());
        gameMenu();


    }
}