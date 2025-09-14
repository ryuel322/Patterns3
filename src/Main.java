public class Main {
    public static void main(String[] args) {
        ArtistUser artist = new ArtistUser.Builder("Vincent", "van Gogh")
                .age(37)
                .country("Netherlands")
                .famousPainting("Starry Night")
                .build();

        System.out.println("Artist: " + artist.getFirstName() + " " + artist.getLastName());
        System.out.println("Age: " + artist.getAge());
        System.out.println("Country: " + artist.getCountry());
        System.out.println("Famous Painting: " + artist.getFamousPainting());
    }
}
