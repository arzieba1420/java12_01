public class PlayerCheck {
    public static void main(String[] args) {
        /*MusicPlayer musicPlayer = new PlayerMP3();

        System.out.println(musicPlayer.play());
        System.out.println(musicPlayer.nextTrack());
        System.out.println(musicPlayer.play());
        System.out.println(musicPlayer.previousTrack());
        System.out.println(musicPlayer.play());*/

        MusicPlayer musicPlayer = new PlayerMP3(buildList());

        System.out.println(musicPlayer.play());
        System.out.println(musicPlayer.nextTrack());
        System.out.println(musicPlayer.play());
        System.out.println(musicPlayer.previousTrack());
        System.out.println(musicPlayer.play());
        System.out.println(musicPlayer.previousTrack());
        System.out.println(musicPlayer.play());
    }

    static Song[]  buildList(){
        Song[] songs = new Song[3];
        songs[0]=new Song("artist1","title1","album1");
        songs[1]=new Song("artist2","title2","album2");
        songs[2]=new Song("artist3","title3","album3");
        return songs;
    }
}
