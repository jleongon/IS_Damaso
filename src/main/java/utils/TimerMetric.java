package utils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

public class TimerMetric extends TimerTask {

 @Override
 public void run() {
  TimerTask timerTask;
  try {
   timerTask = new TimerTask()
    {
      Socket conn = new Socket("b246e143.carbon.hostedgraphite.com", 2003);

        public void run() 
        {
       DataOutputStream dos;
      try {
           
       dos = new DataOutputStream(conn.getOutputStream());
       dos.writeBytes("dc6993e9-ce93-49f7-9517-eddf11cc1039.timers.uptime 1\n");
       
      } catch (IOException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
      }
       
        }
    };
     Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 30000); 
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
       
  
 }

}
