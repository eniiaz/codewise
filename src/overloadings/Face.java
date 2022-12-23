package overloadings;

public class Face {

    // Create instance variable
    // forget about main method
    String skinColor;
    String eyeColor;
    String noseSize;
    String shape;

    public Face(String colorForSkin, String shapeOfFace){
        this.skinColor = colorForSkin;
        this.shape = shapeOfFace;
    }

    public Face(String skinColor, String shape, String eyeColor){
        this.skinColor = skinColor;
        this.shape = shape;
        this.eyeColor = eyeColor;
    }



    public void happy(){
        System.out.println("Happy Face!");
    }

    public void sad(){
        System.out.println("Sad Face!");
    }

    public void smile(){
        System.out.println("Smiling Face!");
    }

    public void displayFace(){
        System.out.println("Face information");
        System.out.println("Skin color: " + skinColor);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Nose size: " + noseSize);
        System.out.println("Shape of Face: " + shape);
        System.out.println();
    }
}
