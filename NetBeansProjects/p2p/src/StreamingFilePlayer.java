import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import javax.swing.*;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
public class StreamingFilePlayer extends JFrame
{
  EmbeddedMediaPlayer mediaPlayer;
  Canvas canvas;
  String media ;

  public StreamingFilePlayer(String s)
  {
      setLayout(null);
   media=s;

      /////////////////////////////// STEP-1/////////////////////////////////
      NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "c:\\Users\\VMM\\Desktop\\vlcj data");
      Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);


      /////////////////////////////// STEP-2/////////////////////////////////
      MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();


      /////////////////////////////// STEP-3/////////////////////////////////
      mediaPlayer = mediaPlayerFactory.newEmbeddedMediaPlayer();
      canvas=new Canvas();
      canvas.setBounds(10,10,500,400);
      add(canvas);
      canvas.setBackground(Color.black);



      setSize(1000,700);
      setVisible(true);


      /////////////////////////////// STEP-4/////////////////////////////////
      CanvasVideoSurface videoSurface = mediaPlayerFactory.newVideoSurface(canvas);
      mediaPlayer.setVideoSurface(videoSurface);


      /////////////////////////////// STEP-5,6/////////////////////////////////
      
//      String options=":sout=#transcode{vcodec=mp2v,vb=4096,scale=1,acodec=mpga,ab=128,channels=2,samp??lerate=44100}:duplicate{dst=file{dst=" + filename + "},dst=display}";
      mediaPlayer.playMedia(media);

      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }


 
}