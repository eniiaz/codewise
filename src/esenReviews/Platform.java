package esenReviews;

public class Platform {

    public static void main(String[] args) {
        YoutubeVideo video = new YoutubeVideo();
        video.makePrivate();
        video.watch();
        video.watch();
        video.watch();
        video.like();

        video.comment("Hey great video!");
        video.comment("Nah, it's lame!");
        System.out.println(video.views);
        System.out.println(video.likes);
        System.out.println(video.comments);
        System.out.println(video.isPrivate);
    }

}
