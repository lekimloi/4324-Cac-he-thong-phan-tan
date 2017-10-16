/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.libs.ThuatToan;

/**
 *
 * @author lekimloitcu
 */
public class GiaiQuyet  extends UnicastRemoteObject implements ThuatToan{


    public GiaiQuyet() throws RemoteException {     
   
    }
    
   
    @Override
    public int UCLN(int a, int b) throws RemoteException {
        while(a!= b){
             if(a>b) a= a-b;
                 else b= b-a;
         }
        return a;
    }
}
