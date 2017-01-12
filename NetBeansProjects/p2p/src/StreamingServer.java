import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

public class StreamingServer implements Runnable {

  String ip1;
  long portno1;
  String id;
  EmbeddedMediaPlayer mediaPlayer1;
  String media1;
  Thread t;

  StreamingServer(String m, long p,String i) {
    NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "c:\\Users\\VMM\\Desktop\\vlcj data");
    Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
    id = "hello";
    ip1 = i;
    portno1 =  p;
    media1 = m;
    t = new Thread(this);
    t.start();
  }

  public void run() {
    String options1 = formatRtspStream(ip1, portno1, id);
    MediaPlayerFactory mediaPlayerFactory1 = new MediaPlayerFactory();
    mediaPlayer1 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
    mediaPlayer1.playMedia(media1, options1, ":no-sout-rtp-sap", ":no-sout-standard-sap", ":sout-all", ":sout-keep");
    System.out.println("RTPS Server started");
    try
    {
      Thread.currentThread().join();
    }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }


  }

  String formatRtspStream(String serverAddress, double serverPort, String id) {
    System.out.println("in format Rtsp stream");
    StringBuilder sb = new StringBuilder(60);
    sb.append(":sout=#rtp{sdp=rtsp://@");
    sb.append(serverAddress);
    sb.append(':');
    sb.append(serverPort);
    sb.append('/');
    sb.append(id);
    sb.append("}");
    return sb.toString();
  }

  
}
