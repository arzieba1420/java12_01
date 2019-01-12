public class ListCreator {

   public static Song[] createListOfSong(Player player){
        Song songs[] = new Song[3];
        songs[0]=new Song("artist1","title1","album1");
        songs[1]=new Song("artist2","title2","album2");
        songs[2]=new Song("artist3","title3","album3");
        return songs;
    }
}
