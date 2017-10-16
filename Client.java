/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.libs.ThuatToan;

/**
 *
 * @author lekimloitcu
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        // TODO code application logic here
        new Client().run();
        
    }
  
    private void run(){
       int port= 6394;
            // nhập ước chung lớn nhất, nhỏ nhất
            int a, b;
                Scanner nhap = new Scanner (System.in);
                System.out.println("Nhap so thu nhat: ");
                a = nhap.nextInt();
                System.out.println("Nhap so thu hai: ");
                b = nhap.nextInt();
           
                            ThuatToan nguyenTo;            
                    try {
                        nguyenTo = (ThuatToan) Naming.lookup("rmi://localhost:"+port+"/ThuatToan");
                         int ucln=nguyenTo.UCLN(a,b);
                        System.out.println("======UCLN-BCNN =======");                 
                        System.out.println("Uoc chung lon nhat cua a va b la : "+ucln);
                        System.out.println("Boi chung nho nhat cua a va b la : "+(a*b)/ucln);
                        System.out.println();
                    } catch (NotBoundException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (RemoteException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
               
               
        } 
}
    

