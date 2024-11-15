public class Main {
    // Метод formatText(String text), который возвращает текст, переведённый в верхний регистр.
    // 2. Метод formatText(String text, boolean toUpperCase), который возвращает текст, переведённый в
    // верхний регистр, если toUpperCase равно true, и в нижний регистр, если toUpperCase равно false.
    // 3. Метод formatText(String text, int start, int end), который возвращает подстроку,
    // начиная с индекса start и заканчивая end, переведённую в верхний регистр.

    public static String formatText(String text) {
        return text.toUpperCase();
    }

    public static String formatText(String text, boolean toUpperCase) {
        if (toUpperCase) {
            return text.toUpperCase();
        } else {
            return text.toLowerCase();
        }
    }

    public static String formatText(String text, int start, int end) {
        return text.substring(start, end).toUpperCase();
    }

    //  Напишите метод containsSubstring, который принимает строку text и подстроку substring.
    //  Метод должен возвращать true, если подстрока присутствует в строке, и false — если нет.

    public static boolean containsSubstring(String text, String substring) {
        boolean contains = text.contains(substring);
        return contains;
    }

    // перегруженные варианты метода
    // игнорирует регистр если ignoreCase равно true
    public static boolean containsSubstring(String text, String substring, boolean ignoresCase) {
        boolean contains;
        if (ignoresCase) {
            contains = (text.toLowerCase().contains(substring.toLowerCase()));
        } else {
            contains = text.contains(substring);
        }
        return contains;
    }

    // проверяет, встречается ли определенный символ
    public static boolean containsSubstring(String text, char character) {
        boolean contains;
        if (text.indexOf(character) != -1) {
            contains = true;
        } else {
            contains = false;
        }
        return contains;
    }

    // ЗАДАЧА 3. Замена символов.
    // метод replaceCharacter(String text, char oldChar, char newChar)
    public static String replaceCharacter(String text, char oldChar, char newChar) {
        return text.replace(oldChar, newChar);
    }

    // заменить символ на строку replaceCharacter(String text, String oldString, String newString)
    public static String replaceCharacter(String text, String oldString, String newString) {
        return text.replaceAll(oldString, newString);
    }


    // ЗАДАЧА 4. поиск слова в строке
    // метод findWord, который принимает текст и словоб и возвращает индекс первого вхождения слова в тексте. Если слово не найдено, метод возвращает -1.
    public static int findWord(String text, String word) {
        return text.indexOf(word);
    }

    // игнорирует регистр, если ignoreCase == true
    public static int findWord(String text, String word, boolean ignoreCase) {
        if (ignoreCase) {
            return text.toLowerCase().indexOf(word);
        } else {
            return text.indexOf(word);
        }
    }

    // возвращает индекс вхождения char в тексте
    public static int findWord(String text, char character) {
        return text.indexOf(character);
    }

    // Задача 5. Обрезка пробелов и перевод регистра.
    // Напишите метод trimAndConvertCase, который принимает строку, обрезает пробелы в начале и в конце, и переводит её в верхний регистр.
    public static String trimAndConvertCase(String text) {
        return text.trim().toUpperCase();
    }

    // Добавьте перегруженные методы:
    //1. Метод trimAndConvertCase(String text, boolean toUpperCase),
    // который переводит строку в верхний или нижний регистр в зависимости от значения toUpperCase.
    public static String trimAndConvertCase(String text, boolean toUpperCase) {
        if (toUpperCase) {
            return text.trim().toUpperCase();
        } else {
            return text.trim().toLowerCase();
        }
    }

    //2. Метод trimAndConvertCase(String text, boolean toUpperCase, boolean removeAllSpaces), который,
    // помимо обрезки пробелов в начале и конце, удаляет все пробелы в строке, если removeAllSpaces равно true.
    public static String trimAndConvertCase(String text, boolean removeAllSpaces, boolean toUpperCase) {
        if (removeAllSpaces) {
            text.replace(" ", "");
        } else {
            text.trim();
        }
        if (toUpperCase) {
            text.toUpperCase();
        } else {
            text.toLowerCase();
        }
        return text;
    }

    // Задача 6: Конструктор текста из слов
    //Описание: Напишите метод buildText, который принимает массив строк и объединяет их в одно предложение.
    public static String buildText(String words[]) {
        StringBuilder stringBuilder = new StringBuilder();
        String text = "";
        for (String word : words) {
            stringBuilder.append(" ").append(word).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    // Добавьте перегруженные методы:
    //1. Метод buildText(String[] words, String separator), который соединяет слова с указанным разделителем.
    public static String buildText(String[] words, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                stringBuilder.append(words[i]);
            } else {
                stringBuilder.append(words[i]).append(separator);
            }
        }
        return stringBuilder.toString();
    }

    //2. Метод buildText(String[] words, String separator, boolean capitalizeFirstLetter), который дополнительно
    // делает первую букву каждого слова заглавной, если capitalizeFirstLetter равно true.
    public static String buildText(String[] words, String separator, boolean capitalizeFirstLetter) {
        StringBuilder stringBuilder = new StringBuilder();
        if (capitalizeFirstLetter) {
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                if (i != words.length - 1) {
                    stringBuilder.append(words[i]).append(separator);
                } else {
                    stringBuilder.append(words[i]);
                }
            }
        } else {
            for (int i = 0; i < words.length; i++) {
                if (i != words.length - 1) {
                    stringBuilder.append(words[i]).append(separator);
                } else {
                    stringBuilder.append(words[i]);
                }
            }
        }
        return stringBuilder.toString();
    }

    // Задача 7: Удаление всех символов кроме букв и цифр
    public static String removeNonAlphanumeric(String text) {
        String[] forbid = {"!", "*", "/", "#", "@"};
        for (String forbidden : forbid) {
            text.replaceAll(forbidden, "");
        }
        return text;
    }

    // Добавьте перегруженные методы:
    //1. Метод removeNonAlphanumeric(String text, boolean toUpperCase), который дополнительно переводит строку в верхний регистр, если toUpperCase равно true.
    public static String removeNonAlphanumeric(String text, boolean toUpperCase) {
            text.replaceAll("[^a-zA-Z0-9]", "");
        if (toUpperCase) {
            return text.toUpperCase();
        } else {
            return text;
        }
    }

    //2. Метод removeNonAlphanumeric(String text, String allowedSymbols), который оставляет в строке только буквы,
    // цифры и символы, указанные в allowedSymbols.
    public static String removeNonAlphanumeric(String text, String allowedSymbols) {
        //
    }

    public static void main(String[] args) {

    }
}