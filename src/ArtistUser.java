public class ArtistUser {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String country;
    private final String famousPainting;

    private ArtistUser(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.country = builder.country;
        this.famousPainting = builder.famousPainting;
    }

    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public String getFamousPainting() { return famousPainting; }

    
    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String country;
        private String famousPainting;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder famousPainting(String famousPainting) {
            this.famousPainting = famousPainting;
            return this;
        }

        public ArtistUser build() {
            return new ArtistUser(this);
        }
    }
}
