package irinaff.servlet;

/**
 * Created by Irina on 09.02.2017.
 */
public class PhraseOMatic {
    public static String makePhrase() {
// Создайте три набора слов для выбора. Добавляйте свои собственные!
        String[] wordListOne = {"круглосуточный", "трехзвенный", "30000-футовый",
                "взаимный", "обоюдный выигрыш", "фронтзнд", "на основе веб-технологий", "проникающий",
                "умный", "шесть сигм", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт",
                "ориентированный", "центральный", "распределенный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой",
                "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры",
                "талант", "подход", "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};
// Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
// Генерируем три случайных числа, чтобы выбрать случайные слова из каждого списка
        int randl = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
// Теперь строим фразу
        String phrase = wordListOne[randl] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
// Возвращаем ее
        return ("Все, что нам нужно, это: " + phrase);
    }
}
