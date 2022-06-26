

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String getRandomWord()
    //Методът генерира случайна дума от списъка и я връща като стойност.
    {
        Random randomGenerator = new Random();
        String[] bulgarianTowns = {"Айтос", "Аксаково", "Алфатар", "Антоново", "Априлци", "Ардино", "Асеновград", "Ахелой", "Ахтопол", "Балчик", "Банкя", "Банско", "Баня", "Батак", "Батановци", "Белене", "Белица", "Белово", "Белоградчик", "Белослав", "Берковица", "Благоевград", "Бобов дол", "Бобошево", "Божурище", "Бойчиновци", "Болярово", "Борово", "Ботевград", "Брацигово", "Брегово", "Брезник", "Брезово", "Брусарци", "Бургас", "Бухово", "Българово", "Бяла", "Бяла Слатина", "Бяла Черква", "Варна", "Велики Преслав", "Велико Търново", "Велинград", "Ветово", "Ветрен", "Видин", "Враца", "Вълчедръм", "Вълчи дол", "Върбица", "Вършец", "Габрово", "Генерал Тошева", "Главиница", "Глоджево", "Годеч", "Горна Оряховица", "Гоце Делчев", "Грамада", "Гулянци", "Гурково", "Гълъбово", "Две могили", "Дебелец", "Девин", "Девня", "Джебел", "Димитровград", "Димово", "Добринище", "Добрич", "Долна баня", "Долна Митрополия", "Долна Оряховица", "Долни Дъбник", "Долни чифлик", "Доспат", "Драгоман", "Дряново", "Дулово", "Дунавци", "Дупница", "Дългопол", "Елена", "Елин Пелин", "Елхово", "Етрополе", "Завет", "Земен", "Златарица", "Златица", "Златоград", "Ивайловград", "Игнатиево", "Искър", "Исперих", "Ихтиман", "Каблешково", "Каварна", "Казанлък", "Калофер", "Камено", "Каолиново", "Карлово", "Карнобат", "Каспичан", "Кермен", "Килифарево", "Китен", "Клисура", "Кнежа", "Козлодуй", "Койнаре", "Копривщица", "Костандово", "Костенец", "Костинброд", "Котел", "Кочериново", "Кресна", "Криводол", "Кричим", "Крумовград", "Крън", "Кубрат", "Куклен", "Кула", "Кърджали", "Кюстендил", "Левски", "Летница", "Ловеч", "Лозница", "Лом", "Луковит", "Лъки", "Любимец", "Лясковец", "Мадан", "Маджарово", "Малко Търново", "Мартен", "Мездра", "Мелник", "Меричлери", "Мизия", "Момин проход", "Момчилград", "Монтана", "Мъглиж", "Неделино", "Несебър", "Николаево", "Никопол", "Нова Загора", "Нови Искър", "Нови пазар", "Обзор", "Омуртаг", "Опака", "Оряхово", "Павел баня", "Павликени", "Пазарджик", "Панагюрище", "Перник", "Перущица", "Петрич", "Пещера", "Пирдоп", "Плачковци", "Плевен", "Плиска", "Пловдив", "Полски Тръмбеш", "Поморие", "Попово", "Пордим", "Правец", "Приморско", "Провадия", "Първомай", "Раднево", "Радомир", "Разград", "Разлог", "Ракитово", "Раковски", "Рила", "Роман", "Рудозем", "Русе", "Садово", "Самоков", "Сандански", "Сапарева баня", "Свети Влас", "Свиленград", "Свищов", "Своге", "Севлиево", "Сеново", "Септември", "Силистра", "Симеоновград", "Симитли", "Славяново", "Сливен", "Сливница", "Сливо поле", "Смолян", "Смядово", "Созопол", "Сопот", "София", "Средец", "Стамболийски", "Стара Загора", "Стражица", "Стралджа", "Стрелча", "Суворово", "Сунгурларе", "Сухиндол", "Съединение", "Сърница", "Твърдица", "Тервел", "Тетевен", "Тополовград", "Троян", "Трън", "Тръстеник", "Трявна", "Тутракан", "Търговище", "Угърчин", "Хаджидимово", "Харманли", "Хасково", "Хисаря", "Цар Калоян", "Царево", "Чепеларе", "Червен бряг", "Черноморец", "Чипровци", "Чирпан", "Шабла", "Шивачево", "Шипка", "Шумен", "Ябланица", "Якоруда", "Ямбол"};
        int randomIndex = randomGenerator.nextInt(bulgarianTowns.length);
        return bulgarianTowns[randomIndex];
    }

    public static void printGameMenu()
    //Методът, който дава достъп до други методи, които са свързани със започване или спиране на играта.
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________");
        System.out.println("Изберете режим на игра: \n1. Единична игра \n2. Играч срещу играч \n3. Изход");
        System.out.println("_________________________________");
        char gameMenuSelect = scan.next().charAt(0);
        if (gameMenuSelect == '1') {
            enterSinglePlayerName();

        } else if (gameMenuSelect == '2') {
            enterPlayerOneName();

        } else if (gameMenuSelect == '3') {
            System.out.println("Довиждане!");
        } else {
            System.out.println("ГРЕШКА! Такава опция не съществува!");
            printGameMenu();
        }
    }

    public static void enterSinglePlayerName()
    //Метод, който дава на потребителя да въведе име и отваря друг метод, който генерира думата, която ще се познава.
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишете името си: ");
        String singlePlayerName = scan.nextLine();
        if (singlePlayerName.length() > 16) {
            System.out.println("Името е по-дълго от 16 символа!");
            enterSinglePlayerName();
        } else {
            getSinglePlayerWord(singlePlayerName);
        }

    }

    public static void getSinglePlayerWord(String singlePlayerName) {
        //Метод, който получава случайно генерираната дума и разделя буквите ѝ на масив, който замества символите с долни черти
        //Накрая се извиква метод, който дава на потребителя да отгатва буквите на излязлата му дума.
        char[] usedWrongLetters = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        int wrongLetterIndex = 0;
        int wrongGuesses = 0;
        String word = getRandomWord();
        word = word.toUpperCase();
        printHangman(wrongGuesses, singlePlayerName, usedWrongLetters, word);
        System.out.println();
        char[] hiddenWordArray = word.toCharArray();
        for (int i = 0; i < hiddenWordArray.length; i++) {
            if (hiddenWordArray[i] != ' ') {
                hiddenWordArray[i] = '_';
            }
        }
        userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, singlePlayerName);
    }

    public static void userEnterLetter(char[] usedWrongLetters, int wrongLetterIndex, String word, char[] hiddenWordArray, int wrongGuesses, String singlePlayerName) {
        //Методът дава на потребителя да въведе буква и, ако тя се намира в думата за отгатване,
        // съответно в масива със сменените символи на правилните места, чрез индекси, се поставя познатата от потребителя буква.
        //Ако потребителят е отгатнал всички букви, ще отвори метод, който го пита дали иска нова игра, изход от играта или път към менюто на играта.
        //Ако потребителят не отгатне въведена буква, ще се добави 1 точка към променлива брояч,
        //който определя, колко крайника на човечето ще се отпечатат в конзолата.
        Scanner scan = new Scanner(System.in);
        System.out.print("Думата ви: ");
        for (int i = 0; i < hiddenWordArray.length; i++) {
            System.out.print(hiddenWordArray[i]);
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
        if (userGuess.length() == 1) {
            if (userGuessArray[0] >= 'А' && userGuessArray[0] <= 'Я') {
                boolean arrayChanged = false;
                for (int i = 0; i < hiddenWordArray.length; i++) {
                    if (userGuessArray[0] == word.charAt(i)) {
                        hiddenWordArray[i] = userGuessArray[0];
                        arrayChanged = true;
                    }
                }
                if (arrayChanged) {
                    printHangman(wrongGuesses, singlePlayerName, usedWrongLetters, word);
                    boolean userWins = true;
                    for (int i = 0; i < hiddenWordArray.length; i++) {
                        if (hiddenWordArray[i] == '_') {
                            userWins = false;
                        }
                    }
                    if (userWins) {
                        System.out.println("Поздравления, " + singlePlayerName + ", успяхте да спасите човечето!");
                        System.out.println("Думата е " + word);
                        printGameOverQuestion(singlePlayerName);

                    } else {
                        userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, singlePlayerName);
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
                    userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, singlePlayerName);
                }
            } else {
                System.out.print("Използвайте само кирилица! ");
                userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, singlePlayerName);
            }

        } else {
            System.out.print("Въведохте повече от 1 символ!");
            userEnterLetter(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, singlePlayerName);
        }
    }

    public static void printGameOverQuestion(String singlePlayerName)
    //Методът, който дава опции на потребителя, приключил с единична игра, достъп до главното меню/да започне нова игра/да излезе от играта
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________");
        System.out.println("1. Познай нова дума \n2. Към главното меню \n3. Изход");
        System.out.println("_________________________________");
        char userSelect = scan.next().charAt(0);
        if (userSelect == '1') {
            getSinglePlayerWord(singlePlayerName);
        } else if (userSelect == '2') {
            printGameMenu();
        } else if (userSelect == '3') {
            System.out.println("Довиждане!");
        } else {
            System.out.println("ОПА! Такава опция не съществува!");
            printGameOverQuestion(singlePlayerName);
        }
    }

    public static void printHangman(int wrongGuesses, String singlePlayerName, char[] usedWrongLetters, String word)
    //Метод, който отпечатва човечето с повече крайници при всяка грешка при режим единична игра.
    //При последната грешка, освен че се отпечатва обесеното човече, се отваря и метод, който пита потребителя дали иска
    //да започне нова игра, или да излезе от играта, или дали иска към менюто на играта.
    {
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
                System.out.println("Човечето е обесено!");
                System.out.println("Думата е: " + word);
                printGameOverQuestion(singlePlayerName);
                break;
            }
        }
    }

    public static void enterPlayerOneName()
    //Методът дава на потребителя да запише име за Играч 1 и, ако името се приеме се отваря методът за попълване на име за Играч 2.
    {
        Scanner scan = new Scanner(System.in);
        int playerOneScore = 0;
        System.out.print("(Играч 1) Напишете името си: ");
        String playerOneName = scan.nextLine();
        if (playerOneName.length() > 16) {
            System.out.println("Името е по-дълго от 16 символа!");
            enterPlayerOneName();
        } else {
            enterPlayerTwoName(playerOneName, playerOneScore);
        }

    }

    public static void enterPlayerTwoName(String playerOneName, int playerOneScore)
    //Методът дава на потребителя да запише име за Играч 2 и, ако то се приеме се отваря методът за генериране случайна дума.
    {
        Scanner scan = new Scanner(System.in);
        int playerTwoScore = 0;
        System.out.print("(Играч 2) Напишете името си: ");
        String playerTwoName = scan.nextLine();
        if (playerTwoName.length() > 16) {
            System.out.println("Името е по-дълго от 16 символа!");
            enterPlayerTwoName(playerOneName, playerOneScore);
        } else {
            getMultiplayerWord(playerOneName, playerTwoName, playerOneScore, playerTwoScore);

        }
    }

    public static void getMultiplayerWord(String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore)
    //Методът получава случайна дума и създава масив от буквите ѝ, като ги закрива с долни черти и отваря метода,
// в който Играч 1 може да започне с отгатването на букви.
    {
        char[] usedWrongLetters = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        int wrongLetterIndex = 0;
        int wrongGuesses = 0;
        String word = getRandomWord();
        word = word.toUpperCase();
        printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
        System.out.println();
        char[] hiddenWordArray = word.toCharArray();
        for (int i = 0; i < hiddenWordArray.length; i++) {
            if (hiddenWordArray[i] != ' ') {
                hiddenWordArray[i] = '_';
            }
        }
        enterLetterPlayerOne(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
    }

    public static void enterLetterPlayerOne(char[] usedWrongLetters, int wrongLetterIndex, String word, char[] hiddenWordArray, int wrongGuesses, String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore)
    //Методът дава на потребителя да запише буква от името на Играч 1, ако тя бъде приета,
    //се проверява дали тя съотвества на някоя от буквите в случайно генерираната дума.
    //Ако да, ще се направи сравнение и според индексите долните черти в масива ще се заменят с буквата въведена от потребителя
    //и така, ако потребителят разкрие всички букви, Играч 1 ще получи 1 точка и ще се отвори друг метод,
    //който пита играчите дали искат да продължат.
    //Ако буквата не съотвества в думата, ще се добави 1 точка към променлива, която играе ролята на брояч,
    // който определя кой крайник да се добави на човечето и за да се прехвърли хода към Играч 2 се отваря метод,
    // който изпълнява същата функция като този, само че от името на Играч 2.
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Думата ви: ");
        for (int i = 0; i < hiddenWordArray.length; i++) {
            System.out.print(hiddenWordArray[i]);
        }
        System.out.println();
        System.out.print("Използвани грешни букви: ");
        for (int i = 0; i < usedWrongLetters.length; i++) {
            System.out.print(usedWrongLetters[i] + ", ");
        }
        System.out.println();
        System.out.print(playerOneName + " e на ход! \nВъведете буква: ");
        String playerOneGuess = scan.nextLine();
        playerOneGuess = playerOneGuess.toUpperCase();
        char[] playerOneGuessArray = playerOneGuess.toCharArray();
        if (playerOneGuess.length() == 1) {
            if (playerOneGuessArray[0] >= 'А' && playerOneGuessArray[0] <= 'Я') {
                boolean arrayChanged = false;
                for (int i = 0; i < hiddenWordArray.length; i++) {
                    if (playerOneGuessArray[0] == word.charAt(i)) {
                        hiddenWordArray[i] = playerOneGuessArray[0];
                        arrayChanged = true;
                    }
                }
                if (arrayChanged) {
                    printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
                    boolean playerOneWins = true;
                    for (int i = 0; i < hiddenWordArray.length; i++) {
                        if (hiddenWordArray[i] == '_') {
                            playerOneWins = false;
                        }
                    }
                    if (playerOneWins) {
                        System.out.println("Поздравления, " + playerOneName + ", успяхте да спасите човечето!");
                        System.out.println("Думата е " + word);
                        playerOneScore++;
                        System.out.println("Резултат: \n" + playerOneName + " – " + playerOneScore + "\n" + playerTwoName + " – " + playerTwoScore);
                        continueGameQuestion(playerOneName, playerTwoName, playerOneScore, playerTwoScore);

                    } else {
                        enterLetterPlayerOne(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                    }
                } else {
                    wrongGuesses++;
                    boolean newWrongGuess = true;
                    for (int i = 0; i < usedWrongLetters.length; i++) {
                        if (playerOneGuessArray[0] == usedWrongLetters[i]) {
                            newWrongGuess = false;
                            wrongGuesses--;
                        }
                    }

                    if (newWrongGuess) {
                        usedWrongLetters[wrongLetterIndex] = playerOneGuessArray[0];
                        wrongLetterIndex++;
                        printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
                        enterLetterPlayerTwo(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                    }
                    printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
                    enterLetterPlayerOne(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                }
            } else {
                System.out.print("Използвайте само кирилица! ");
                enterLetterPlayerOne(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
            }

        } else {
            System.out.print("Въведохте повече от 1 символ!");
            enterLetterPlayerOne(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
        }
    }

    public static void enterLetterPlayerTwo(char[] usedWrongLetters, int wrongLetterIndex, String word, char[] hiddenWordArray, int wrongGuesses, String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Думата ви: ");
        for (int i = 0; i < hiddenWordArray.length; i++) {
            System.out.print(hiddenWordArray[i]);
        }
        System.out.println();
        System.out.print("Използвани грешни букви: ");
        for (int i = 0; i < usedWrongLetters.length; i++) {
            System.out.print(usedWrongLetters[i] + ", ");
        }
        System.out.println();
        System.out.print(playerTwoName + " e на ход! \nВъведете буква: ");
        String playerTwoGuess = scan.nextLine();
        playerTwoGuess = playerTwoGuess.toUpperCase();
        char[] playerTwoGuessArray = playerTwoGuess.toCharArray();
        if (playerTwoGuess.length() == 1) {
            if (playerTwoGuessArray[0] >= 'А' && playerTwoGuessArray[0] <= 'Я') {
                boolean arrayChanged = false;
                for (int i = 0; i < hiddenWordArray.length; i++) {
                    if (playerTwoGuessArray[0] == word.charAt(i)) {
                        hiddenWordArray[i] = playerTwoGuessArray[0];
                        arrayChanged = true;
                    }
                }
                if (arrayChanged) {
                    printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
                    boolean playerTwoWins = true;
                    for (int i = 0; i < hiddenWordArray.length; i++) {
                        if (hiddenWordArray[i] == '_') {
                            playerTwoWins = false;
                        }
                    }
                    if (playerTwoWins) {
                        System.out.println("Поздравления, " + playerTwoName + ", успяхте да спасите човечето!");
                        System.out.println("Думата е " + word);
                        playerTwoScore++;
                        System.out.println("Резултат: \n" + playerOneName + " – " + playerOneScore + "\n" + playerTwoName + " – " + playerTwoScore);
                        continueGameQuestion(playerOneName, playerTwoName, playerOneScore, playerTwoScore);

                    } else {
                        enterLetterPlayerTwo(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                    }
                } else {
                    wrongGuesses++;
                    boolean newWrongGuess = true;
                    for (int i = 0; i < usedWrongLetters.length; i++) {
                        if (playerTwoGuessArray[0] == usedWrongLetters[i]) {
                            newWrongGuess = false;
                            wrongGuesses--;
                        }
                    }

                    if (newWrongGuess) {
                        usedWrongLetters[wrongLetterIndex] = playerTwoGuessArray[0];
                        wrongLetterIndex++;
                        printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
                        enterLetterPlayerOne(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                    }
                    printHangmanMultiplayer(wrongGuesses, playerOneName, playerTwoName, usedWrongLetters, word, playerOneScore, playerTwoScore);
                    enterLetterPlayerTwo(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                }
            } else {
                System.out.print("Използвайте само кирилица! ");
                enterLetterPlayerTwo(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
            }

        } else {
            System.out.print("Въведохте повече от 1 символ!");
            enterLetterPlayerTwo(usedWrongLetters, wrongLetterIndex, word, hiddenWordArray, wrongGuesses, playerOneName, playerTwoName, playerOneScore, playerTwoScore);
        }
    }

    public static void continueGameQuestion(String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore)
    //Методът, който излиза след края на игра на режим играч срещу играч. Задава се въпрос на потребителя дали иска да продължи играта,
    // ако не се изписва резултата и се отваря менюто на играта.
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Искате ли да продължите играта?");
        System.out.println("1. ДА \n2. НЕ");
        char answer = scan.next().charAt(0);
        if (answer == '1') {
            getMultiplayerWord(playerOneName, playerTwoName, playerOneScore, playerTwoScore);
        } else if (answer == '2') {
            if (playerOneScore > playerTwoScore) {
                System.out.println(playerOneName + " ПЕЧЕЛИ!");
                printGameMenu();
            } else if (playerOneScore < playerTwoScore) {
                {
                    System.out.println(playerTwoName + " ПЕЧЕЛИ!");
                    printGameMenu();
                }
            } else {
                System.out.println("РАВЕНСТВО!");
                printGameMenu();
            }
        } else {
            System.out.println("ОПА! Не съществува такава опция!");
            continueGameQuestion(playerOneName, playerTwoName, playerOneScore, playerTwoScore);
        }
    }

    public static void printHangmanMultiplayer(int wrongGuesses, String playerOneName, String playerTwoName, char[] usedWrongLetters, String word, int playerOneScore, int playerTwoScore)
    //Метод, който отпечатва човечето с повече крайници при всяка грешка при режим играч срещу играч.
    //При последната грешка, освен че се отпечатва обесеното човече, се отваря метод, който пита играчите дали искат да продължат.
    {
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
                System.out.println("Човечето е обесено!");
                System.out.println("Думата е: " + word);
                System.out.println("Резултат: \n" + playerOneName + " – " + playerOneScore + "\n" + playerTwoName + " – " + playerTwoScore);
                continueGameQuestion(playerOneName, playerTwoName, playerOneScore, playerTwoScore);
                break;
            }
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
        printGameMenu();


    }
}