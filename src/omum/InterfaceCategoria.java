package omum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCategoria extends Remote{
        
    public int getIdCategoria() throws RemoteException;

    public String getNomeCategoria() throws RemoteException;

    public void setIdCategoria(int idCategoria) throws RemoteException;

    public void setNomeCategoria(String nomeCategoria) throws RemoteException;
    
    
    
}
