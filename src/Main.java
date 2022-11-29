public class Main {
    public static void main(String[] args) {
        String[][] booksAndAuthors = new String[5][2]; //  объявили массив и проинициализировали
        booksAndAuthors[0][0] = "Золотой ключик"; // заролняем нужными значениями
        booksAndAuthors[0][1] = "Алексей Толстой";
        booksAndAuthors[1][0] = "Стальная крыса";
        booksAndAuthors[1][1] = "Гэнри Дэмпси";
        booksAndAuthors[2][0] = "Неукротимая Планета";
        booksAndAuthors[2][1] = "Гэнри Дэмпси";
        booksAndAuthors[3][0] = "Мир смерти";
        booksAndAuthors[3][1] = "Гэнри Дэмпси";
        booksAndAuthors[4][0] = "Запад Эдема";
        booksAndAuthors[4][1] = "Гэнри Демпси";
        for (int i = 0; i < booksAndAuthors.length; i++) {  // идем по строкам
            for (int j = 0; j < booksAndAuthors[0].length; j++) {  // идем по столбцам
                if (j == 0) {
                    System.out.print("<<" + booksAndAuthors[i][j] + ">>"); // вывод книги
                } else
                    System.out.println(" "+booksAndAuthors[i][j]+ " "); // вывод элемента
            }
            System.out.println(); // перенос строки
        }
    }
}