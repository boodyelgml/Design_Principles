package DesignPrinciples.LiskovSubstitution;


// من الآخر متحطش حاجات ف الكلاس الأب ممكن الكلاس الأبن ميكونش بيدعمها أو محتاجها
// عشان لو حبيت تبدل ما بينهم الأبلكيشن ما يضربش
// بنحل المشكلة دى بأستخدام ال nested inherent كلاسس اللى بتورث من بعضها
// مثال على كدا

import DesignPrinciples.LiskovSubstitution.MediaPlayers.DivMediaPlayer;
import DesignPrinciples.LiskovSubstitution.MediaPlayers.VlcMediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Created list of video players
        List < VideoMediaPlayer > allPlayers = new ArrayList < VideoMediaPlayer > ();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        // Play video in all players
        playVideoInAllMediaPlayers(allPlayers);

        // Well - all works as of now...... :-)
        System.out.println("---------------------------");

        // Now adding new Winamp player. If you uncomment below line,
        // it would give compile time error as can't add audio player in list of video players.
        // allPlayers.add(new WinampMediaPlayer());
    }

    public static void playVideoInAllMediaPlayers(List < VideoMediaPlayer > allPlayers) {

        for (VideoMediaPlayer player: allPlayers) {
            player.playVideo();
        }
    }
}

