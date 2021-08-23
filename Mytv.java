package Study;

/* ※ TV 리모콘 클래스를 생성하여 다음의 기능을 만든다.

   (1) 파워 ON/OFF 할 수 있다.

   (2) 채널을 조절 할 수 있다.

   (3) 볼륨을 조절 할 수 있다.
*/
 

class TvControl {    

     boolean power = false;     // off 

     int channel = 0;     

     public void power() {

          power = !power;     

     }     

     public void channelUp() {      

          channel += 1;

     }     

     public void channelDown() {

          channel += 1; 

     }

}

 

public class Mytv {     

     public static void main(String args[]) {         

          // TV 객체 생성

          TvControl tv = new TvControl();         

          // TV 전원을 켠다.  

          tv.power();          

          // 채널을 11번으로 직접 세팅한다.        

          tv.channel = 11;

          // 채널을 내린다.      

          tv.channelDown();

          // 현재의 채널과 전원을 출력한다.

          System.out.println(" 전원 :　"+ tv.power);         

          System.out.println(" 채널 :　"+ tv.channel);            

          // 채널을 두번 올린다. 

          tv.channelUp();         

          tv.channelUp();         

          // 변수 값들을 출력해본다.

          System.out.println(" 전원 :　"+ tv.power);

          System.out.println(" 채널 :　"+ tv.channel);

          // TV 전원을 끈다.

          tv.power();

 

          System.out.println(" 전원 :　"+ tv.power);

     }

}