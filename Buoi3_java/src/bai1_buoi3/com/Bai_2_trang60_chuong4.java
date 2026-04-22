package bai1_buoi3.com;

public class Bai_2_trang60_chuong4 {
	
    public static void main(String[] args) {
        
        String path = "D:/music/bolero/longme.mp3";
        
      
        int indexSlash = path.lastIndexOf("/");  
        int indexDot = path.lastIndexOf(".");   
      
        String tenDayDu = path.substring(indexSlash + 1); 
        System.out.println("Tên đầy đủ: " + tenDayDu); 
        
        
        String tenRieng = path.substring(indexSlash + 1, indexDot); 
        System.out.println("Tên bài hát: " + tenRieng);
    }
}