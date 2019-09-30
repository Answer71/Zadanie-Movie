public class MovieLibrary {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Forrest Gump";
        movie1.description = "Historia życia Forresta, chłopca o niskim ilorazie inteligencji " +
                "z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.";
        movie1.director = "Robert Zemeckis";
        movie1.rating = 9;
        movie1.oscars = true;

        System.out.println("Informacje o filmie:");
        System.out.println("Tytuł: " + movie1.title);
        System.out.println("Opis: " + movie1.description);
        System.out.println("Reżyser: " + movie1.director);
        System.out.println("Ocena: " + movie1.rating + "/10");
        System.out.println("Czy otrzymał Oskara: " + movie1.oscars);
    }
}
