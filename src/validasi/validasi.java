/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validasi;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import view.MenuUtama;

/**
 *
 * @author lenovo
 */
public class validasi {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    public boolean valNik(char karakter,int panjangNik){
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)||(karakter==KeyEvent.VK_LEFT)||karakter==KeyEvent.VK_RIGHT))) {
                return false; 
        }else{
            return true;
        }
    }
    
    public boolean valbatas(char karakter,int panjangNik){
        if(panjangNik>=0 && panjangNik <= 15|| (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)){
           return true;
        }else{
            return false;
        }
    }
    
    public boolean valNama(char karakter,int panjangNik){
        if (!(((karakter >= 'a') && (karakter <= 'z') || (karakter >= 'A') && (karakter <= 'Z')|| (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE) || (karakter == KeyEvent.VK_SPACE)||(karakter==KeyEvent.VK_LEFT)||(karakter==KeyEvent.VK_RIGHT)||(karakter==KeyEvent.VK_CAPS_LOCK)))) {
            return false;
        }else{
            return true;
        }
    }
    
    public boolean valNamaBatas(char karakter,int panjangnama){
        if(panjangnama>=0 && panjangnama <= 35|| (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean valTlp(String noTlp,int panjangNik, char karakter){
        if(noTlp.charAt(0)=='0'&&noTlp.charAt(1)=='8'&&panjangNik>=0 && panjangNik <=11|| (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)){
            return true;
        }else{
            return false;
        }
    }
    
        public boolean valplat(char karakter,int panjangnama){
        if(panjangnama>=0 && panjangnama <= 8|| (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)){
            return true;
        }else{
            return false;
        }
    }
        
   public boolean valinner(String inp){
    try{
            String Query = "SELECT * FROM transaksi INNER JOIN tb_pengembalian WHERE tb_pengembalian.id=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_rental", "root", "");
            pst = con.prepareStatement(Query);
            pst.setString(1,inp);
            rs=pst.executeQuery();
            if(rs.next()){
                return true; 
            }else{
                return false;
                
            }
        }catch(Exception ex){
        
        }  
        return false;
   }
   
   public String waktu(){
   
        Calendar cel = new GregorianCalendar();
        long tahun = cel.get(Calendar.YEAR);
        long bulan = cel.get(Calendar.MONTH)+1;
        long hari = cel.get(Calendar.DAY_OF_MONTH);
        
        return (hari+"/"+bulan+"/"+tahun);
   
   }
   
  public boolean valWaktu(Date sekarang,Date pinjam){
    long diffInMillies2 = Math.abs(sekarang.getTime());
    long diff2 = TimeUnit.DAYS.convert(diffInMillies2, TimeUnit.MILLISECONDS);   
    long diffInMillies = Math.abs(pinjam.getTime());
    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    if(diff2>diff){
       return false;
    }else{
       return true;
    }
  }     
}
