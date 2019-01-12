public class PlayerMP3 extends MusicPlayer {

    int track = 0;

    @Override
    public String play() {
        return "Play MP3 " + tracks[track];
    }

    @Override
    public String pause() {
        return "Pause mp3";
    }

    @Override
    public String stop() {
        return "Stop mp3";
    }

    @Override
    public String nextTrack() {
        if (track==tracks.length-1){
            track=0;}
            else ++track;
        return "Next track mp3";
    }

    @Override
    public String previousTrack() {
        if (track==0)track=tracks.length-1; else  --track;
        return "Previous track mp3";
    }

    Song[] tracks = new Song[3];

    PlayerMP3 (Song[] song){
        tracks[0]= song[0];
        tracks[1]=song[1];
        tracks[2]=song[2];
    }
}

