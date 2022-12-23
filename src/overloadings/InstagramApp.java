package overloadings;

public class InstagramApp {

    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("James Bond", "jb2022", "JB2022!");

        user1.display();

        InstagramUser user2 = new InstagramUser("John Wick", "jw20", "Wick22", "I am an actor");
        user2.display();

        InstagramUser user3 = new InstagramUser("Cristiano Ronalno", "ronaldo", "CR7", "Football is life", "cr.com");
        user3.display();
    }

}
