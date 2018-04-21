package Cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import javax.swing.JOptionPane;

public class Cliente {
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            //CalculadoraServerInterface c = (CalculadoraServerInterface) registry.lookup("CalculadoraServerInterfaceImpl");
            Controle m = (Controle) Naming.lookup(ControladorImpl.geturi() );
            //System.out.println(m.LerMensagem());
            m.jhonso();
            
        } catch (RemoteException e){
            System.out.println();
            System.out.println("RemoteExçeption: "+e.toString());
        } catch (Exception e){
            System.out.println();
            System.out.println("exçeption: "+e.toString());
        }
        
    }
    
}