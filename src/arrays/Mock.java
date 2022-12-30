package arrays;

import java.util.Arrays;
import java.util.Random;

public class Mock {

public static String students = "Aibol Shadykanov,Aichurok Ybyraimova,Aidai Bakirova,Aidana Belekova,Aidana Dishebekova,Aidana Nugumetova,Aila Kadysheva,Aimeden Juzganova,Aisuluu Sopubekova,Aisuluu Turganbaeva,Aiylchy Zhazykbekov,Aktilek Baktybekova,Alena Brekina,Aliia Anarkulova,Alina Nazarmamatova,Aliya Omorova,Anarbek Mamadinov,Baitik,Begimai Sabyr,Botagoz Baizhambayeva,Daniel Biimyrzaeva,Eliza Abdyldaeva,Elnura Nurmamatova,Feruza Khamraeva,Gulmira Abdulakhat kyzy,Ilgiz Babanov,Irina Katko,Kanykei Kubanychbekova,Kymbat Kazieva,Meerim Baisyn kyzy,Meerim Sultanova,Meerim Zhamangulova,Myrzakhan Akmatov,Nazima Alpamyshova,Nuriia Abdrakhmanova,Nursultan Torobaev,Saida Masaburova,Saikal Orozonova,Shekerbek Murzaliev,Tilek Zhanybekov,Xeniya Loskutova,Zarina Bekova,Zarrina Ochilova,Zhamal Aalieva,Zhyldyz Maratbekova,Azhar Umetalieva,Aigerim Corindan,Yryskul Mamadinova,Kaliia,Nurgul Kudaiberdieva,Batina";
public static String iq =  "What is wrapper class? Talk about autoboxing and unboxing :What is an object-oriented programming language?:How many primitive data types and why?:Give 3 String manipulation methods you use mostly and explain:What is the method? Void, return type? Method parameters?:Method overloading? Why? How to overload successfully?:What is the role of the constructor in Java and where do we use it?:Constructor overloading, default constructor rules? : Object vs Class?: What is 'this' keyword and where do we use it?: Explaine if-else statement and types : What is loop? : while loop vs for loop : for loop vs for each loop : What is static in Java : Why do we use array? How to create array and use it? : What is scanner in java? :Explain your logic for method creation that converts from hours to minutes";

public static String softs = "What is SDLC?: What is STLC?: What is Defect life cycle?: What is Test case?: Talk about Agile: Tell me the scrum team members and their responsibilities: How does the development happen in Scrum?: Talk about scrum ceremonies: What is user story and give example: What is the difference btw product backlog and sprint backlog?: What is Test Case and who writes it?: What is Test plan and who does it?: Why do we automate the testing?: What is the differnce between W2 and 1099 employment forms?: How many people are in your team and how many are in QA? What is your role?: How do you split the work with your co-workers?: What do you do when developers are working on new functionality and if it is not available for testing yet?";

public static String [] studentList;
public static String [] questions;

public static String [] softSkills;

public static void start(){
    studentList = students.split(",");
    questions = iq.split(":");
    softSkills = softs.split(":");
}
public static void technicalQuestion(){
    Random random = new Random();
    String student = studentList[random.nextInt(studentList.length)];
    String question = questions[random.nextInt(questions.length)];
    System.out.println("\nStudent to answer: " + student);
    System.out.println("Question: " + question);
}

    public static void softSkillsQuestion(){
        Random random = new Random();
        String student = studentList[random.nextInt(studentList.length)];
        String question = softSkills[random.nextInt(softSkills.length)];
        System.out.println("\nStudent to answer: " + student);
        System.out.println("Question: " + question);
    }
}
