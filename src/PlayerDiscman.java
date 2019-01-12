public class PlayerDiscman extends MusicPlayer {

    int track;
    @Override
    public String play() {
        return "Play DISCMAN" + tracks[track];
    }

    @Override
    public String pause() {
        return "Pause DISCMAN";
    }

    @Override
    public String stop() {
        return "Stop DISCMAN";
    }

    @Override
    public String nextTrack() {
        if (track==tracks.length-1){
            track=0;}
        else ++track;
        return "Next Track DISCMAN";
    }

    @Override
    public String previousTrack() {
        if (track==0)track=tracks.length-1; else  --track;
        return "Previous Track DISCMAN";
    }

   Song[] tracks = new Song[3];

    PlayerDiscman (Song[] song){
        tracks[0]= song[0];
        tracks[1]=song[1];
        tracks[2]=song[2];
    }
}
