class MusicStarter{

public static void main(String[] pongal)
{
Music music=new Music(2000.0f);
music.name="Sariyagi nenapide";
music.singerName="arman";
music.cost=4000.0f;
music.writerName="jayant kaikini";

Music music1=new Music(2000.0f);
music1.name="Happy agide";
music1.singerName="alok R.babu";
music.cost=7000.0f;
music1.writerName="alok R.babu";

System.out.println(music.name);
System.out.println(music.singerName);
System.out.println(music.cost);
System.out.println(music.writerName);

System.out.println(music1.name);
System.out.println(music1.singerName);
System.out.println(music1.cost);
System.out.println(music1.writerName);
}
}