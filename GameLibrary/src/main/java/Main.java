public class Main {

    public static void main(String[] args) {
        Game banjoKazooie = new Game(
                "Banjo-Kazooie",
                "Nintendo 64",
                false,
                "Bear and Bird team up to defeat Grunty and rescue Banjo's sister Tooty!",
                5,
                "PAL"
        );

        System.out.println("1998");
        System.out.println(banjoKazooie);

        // Using the getter to retrieve and display the values
        System.out.println("Title: " + banjoKazooie.getTitle());
        System.out.println("Rating: " + banjoKazooie.getRating());

        banjoKazooie.setPlatforms("Nintendo 64, Xbox 360, Xbox One, Xbox Series X, Nintendo Switch");
        banjoKazooie.setDigital(true);

        System.out.println("\n2008 - Present");
        System.out.println(banjoKazooie);
    }
}