package castings;

public class Speaking {

    public static void main(String[] args) {
        English english = new English();

        // Language => English, Spanish

        // Polymorphism allows creating an object with parent references as well
        Spanish spanish = new Spanish();

        // reference name always has access to whatever the reference type has
        Language language = new English();
        // language has  access to welcome() and speak()
        English language1 = new English();
        // language1 has access to welcome(), speak() and practice()

        BritishEnglish be = new BritishEnglish();
        //English, Language
        English english1 = be;
        Language language2 = be;
        english1.welcome();

        // any of above 3 references can call any method and that method
        // can be found in BritishEnglish.

        Language language3 = new BritishEnglish();
        // I want to cast from language3 to English and BritishEnglish
        // This is going down. Downcasting
        // Why?
        English eng = (English)language3;
        BritishEnglish ben = (BritishEnglish) language3;

        English engl = new English();
        BritishEnglish bb = (BritishEnglish) engl;
        bb.accent();








    }
}
