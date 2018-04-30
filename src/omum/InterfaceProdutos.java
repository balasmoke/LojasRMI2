package omum;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfaceProdutos extends Remote{
    
    public int getIdProdutos() throws RemoteException;

    public String getNomeProdutos() throws RemoteException;

    public int getQtdProdutos() throws RemoteException;

    public Double getPrecoProdutos() throws RemoteException;

    public int getIdProdutos_Categoria() throws RemoteException;

    public void setIdProdutos(int idProdutos) throws RemoteException;

    public void setNomeProdutos(String nomeProdutos) throws RemoteException;

    public void setQtdProdutos(int qtdProdutos) throws RemoteException;

    public void setPrecoProdutos(Double precoProdutos) throws RemoteException;

    public void setIdProdutos_Categoria(int idProdutos_Categoria) throws RemoteException;
    
}