package esenReviews;

public class YoutubeVideo {

    // instance variables
    String title;
    String comments;
    int views;
    int likes;
    boolean isPrivate;

    // 	a. method signature: void method,
    // 	watch name, method parameters-> no parameters
//    b. add 1 to current views
    public void watch(){
        if(isPrivate){
            System.out.println("Sorry the video is private");
        }else{
            System.out.println("Enjoy the video!");
            views++; // views = views + 1;
        }

    }

    // a. Method signature: void method, makePrivate name,boolean
    //	b. Set isPrivate to true
    public void makePrivate(){
        isPrivate = true;
    }


    public void like(){
        likes++;
    }

    public void comment(String newComment){
        comments = comments + "\n" + newComment;
    }



}
