package oopRecap;

public class Learning {

    public static void main(String[] args) {
        CodingBootcamp cb = new CodingBootcamp();
        cb.name = "Codewise";
        cb.address = "Chicago";

        School school = new CodingBootcamp();
        ((CodingBootcamp)school).teachCoding();
        school.teach();


    }
}
