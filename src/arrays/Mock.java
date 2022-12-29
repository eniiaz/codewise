package arrays;

import java.util.Arrays;
import java.util.Random;

public class Mock {

public static String students = "Aibol Shadykanov,Aichurok Ybyraimova,Aidai Bakirova,Aidana Belekova,Aidana Dishebekova,Aidana Nugumetova,Aila Kadysheva,Aimeden Juzganova,Aisuluu Sopubekova,Aisuluu Turganbaeva,Aiylchy Zhazykbekov,Aktilek Baktybekova,Alena Brekina,Aliia Anarkulova,Alina Nazarmamatova,Aliya Omorova,Anarbek Mamadinov,Baitik,Begimai Sabyr,Botagoz Baizhambayeva,Daniel Biimyrzaeva,Eliza Abdyldaeva,Elnura Nurmamatova,Feruza Khamraeva,Gulmira Abdulakhat kyzy,Ilgiz Babanov,Irina Katko,Kanykei Kubanychbekova,Kymbat Kazieva,Meerim Baisyn kyzy,Meerim Sultanova,Meerim Zhamangulova,Myrzakhan Akmatov,Nazima Alpamyshova,Nuriia Abdrakhmanova,Nursultan Torobaev,Saida Masaburova,Saikal Orozonova,Shekerbek Murzaliev,Tilek Zhanybekov,Xeniya Loskutova,Zarina Bekova,Zarrina Ochilova,Zhamal Aalieva,Zhyldyz Maratbekova,Azhar Umetalieva,Aigerim Corindan,Yryskul Mamadinova,Kaliia,Nurgul Kudaiberdieva,Batina";
public static String iq =  "What is an object-oriented programming language?:How many primitive data types and why?:Give 3 String manipulation methods you use mostly and explain:What is the method? Void, return type? Method parameters?:Method overloading? Why? How to overload successfully?:What is the role of the constructor in Java and where do we use it?:Constructor overloading, default constructor rules? : Object vs Class?: What is 'this' keyword and where do we use it?: Explaine if-else statement and types : What is loop? : while loop vs for loop : for loop vs for each loop : What is static in Java : Why do we use array? How to create array and use it? : What is scanner in java? :Explain your logic for method creation that converts from hours to minutes";
public static String [] studentList;
public static String [] questions;

public static void start(){
    studentList = students.split(",");
    questions = iq.split(":");
}
public static void technicalQuestion(){
    Random random = new Random();
    String student = studentList[random.nextInt(studentList.length)];
    String question = questions[random.nextInt(questions.length)];
    System.out.println("Student to answer: " + student);
    System.out.println("Question: " + question);
}
}
