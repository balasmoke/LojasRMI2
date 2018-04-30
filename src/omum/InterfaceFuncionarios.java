package omum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceFuncionarios extends Remote{
    
    public int getIdFuncionarios() throws RemoteException;

    public String getNomeFuncionarios() throws RemoteException;

    public String getUsuarioFuncionarios() throws RemoteException;

    public String getSenhaFuncionarios() throws RemoteException;

    public String getEmailFuncionarios() throws RemoteException;

    public int getStatusFuncionarios() throws RemoteException;

    public void setIdFuncionarios(int idFuncionarios) throws RemoteException;

    public void setNomeFuncionarios(String nomeFuncionarios) throws RemoteException;

    public void setUsuarioFuncionarios(String usuarioFuncionarios) throws RemoteException;

    public void setSenhaFuncionarios(String senhaFuncionarios) throws RemoteException;

    public void setEmailFuncionarios(String emailFuncionarios) throws RemoteException;

    public void setStatusFuncionarios(int statusFuncionarios) throws RemoteException;
    
    
    
}