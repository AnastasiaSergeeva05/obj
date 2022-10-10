public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alescha","Lykynov");
        Author author2 = new Author("Kolya","Lavorchyk");

        Book book1 = new Book("Kniga1",author1,2020);
        Book book2 = new Book("Kniga2",author2,2021);

        book1.setYear(2022);


        System.out.println("Автор книги: "+author1);
    }
}

