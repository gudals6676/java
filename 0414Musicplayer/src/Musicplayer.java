import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Musicplayer {
	MP3Player mp3 = new MP3Player();
  ArrayList<Music> Musiclist = new ArrayList<Music>();
  int curIndex = 0;
  
  public Musicplayer() {
	  Musiclist.add(new Music("DallaDalla", "itzy", 100,"C://music/Itzy - Dalla Dalla.mp3"));
	  Musiclist.add(new Music("??","Rain" , 120, "C://music/Rain - ??.mp3"));
	  Musiclist.add(new Music("SOLO", "Jennie", 200, "C://music/JENNIE - SOLO.mp3"));
	  Musiclist.add(new Music("2002","Anne Marie",200,"C://music/Anne Marie - 2002.mp3"));
	  Musiclist.add(new Music("bad guy","Billie Eilish",200,"C://music/Billie Eilish - bad guy.mp3"));
	  Musiclist.add(new Music("Circle of Life","Carmen Twillie",200,"C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
	  Musiclist.add(new Music("???? 12??","CHUNG HA",200,"C://music/CHUNG HA - ???? 12??.mp3"));
	  Musiclist.add(new Music("Let It Go","Idina Menzel",200,"C://music/Idina Menzel - Let It Go.mp3"));
	  Musiclist.add(new Music("A Whole New World","Mena Massoud",200,"C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3"));
	  Musiclist.add(new Music("Ring Ding Dong","SHINee",200,"C://music/SHINee - Ring Ding Dong.mp3"));
	  Musiclist.add(new Music("FANCY","TWICE",200,"C://music/TWICE - FANCY.mp3"));
	  Musiclist.add(new Music("NO ONE","??????",200,"C://music/?????? - NO ONE.mp3"));
  }
  public Music play() {
	 Music m = Musiclist.get(curIndex) ;
	 if(mp3.isPlaying()) {
		 mp3.stop();
	 }
	  mp3.play(m.getMusicPath());
	  return m;
  }
  public Music nextplay() {
	  curIndex++;
	  if(curIndex == Musiclist.size()) {
		  curIndex = 0;
	  }
	  if(mp3.isPlaying()) {
			 mp3.stop();
		 }
		  
	  Music m = Musiclist.get(curIndex);
	  mp3.play(m.getMusicPath());
	  
	  return m;
  }
  public Music preplay() {
	  curIndex--;
	 if(curIndex < 0 ) {
		 curIndex = Musiclist.size()-1;
		 
	 }
	 if(mp3.isPlaying()) {
		 mp3.stop();
	 }
	 Music m = Musiclist.get(curIndex);
	mp3.play(m.getMusicPath());	 
	  return m;
  }
  public String stop() {
	  if(mp3.isPlaying()) {
			 mp3.stop();
		 }
	  return "?뷡?? ?????Ǿ????ϴ?.";
  }
}
