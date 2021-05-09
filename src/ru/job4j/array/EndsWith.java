package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int wordIndex = word.length - 1;
        for (int i = 0; i < post.length - 1; i++) {
            if (post[post.length - 1 - i] == word[wordIndex]) {
                wordIndex = -1;
                result = true;
            }
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}