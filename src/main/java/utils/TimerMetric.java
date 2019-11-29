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
      Socket conn = new Socket("38b29376.carbon.hostedgraphite.com", 2003);

        public void run() 
        {
       DataOutputStream dos;
      try {
       dos = new DataOutputStream(conn.getOutputStream());
       dos.writeBytes("e5fcc8bb-12f7-4754-8943-ef6017a43efc.timers.uptime 1 \n");
           System.out.println("Métrica UPTIME: " + 1);
      } catch (IOException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
      }
       
        }
    };
     Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 60000); 
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
       
  
 }

}