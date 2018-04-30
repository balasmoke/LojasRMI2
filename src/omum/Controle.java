package omum;
/*
import BancoDeDados.Categoria;
import BancoDeDados.CategoriaDAO;
import BancoDeDados.Funcionarios;
import BancoDeDados.FuncionariosDAO;
import BancoDeDados.Produtos;
import BancoDeDados.ProdutosDAO;
*/
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public interface Controle extends Remote{

    public void inserir_Categoria(String name) throws RemoteException;

    public void atualizar_Categoria(String name,int id) throws RemoteException;
    
    public void excluir_Categoria(int id) throws RemoteException;
    
    public InterfaceCategoria busca_Categoria(String name)throws RemoteException;
    
    public InterfaceCategoria busca_Categoria(int id) throws RemoteException;
    
    public ArrayList<InterfaceCategoria> buscaAllPorNome_Categoria(String name)throws RemoteException;
    
    public ArrayList<InterfaceCategoria> buscaAllPorId_Categoria(int id)throws RemoteException;
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void inserir_Funcionarios(String name, String user, String senha, String email, int status) throws RemoteException;

    public void atualizar_Funcionarios(String name, String user, String senha, String email, int status,int id) throws RemoteException;
    
    public void excluir_Funcionarios(int id) throws RemoteException;
    
    public InterfaceFuncionarios busca_Funcionarios(String name) throws RemoteException;
    
    public InterfaceFuncionarios busca_Funcionarios(int id) throws RemoteException;
    
    public ArrayList<InterfaceFuncionarios> buscaAllPorNome_Funcionarios(String name) throws RemoteException;
    
    public ArrayList<InterfaceFuncionarios> buscaAllPorId_Funcionarios(int id) throws RemoteException;
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void inserir_Produtos(String name, int qtd, Double preco, int idCatego) throws RemoteException;

    public void atualizar_Produtos(String name, int qtd, Double preco, int idCatego,int id) throws RemoteException;
    
    public void excluir_Produtos(int id) throws RemoteException;
    
    public InterfaceProdutos busca_Produtos(String name) throws RemoteException;
    
    public InterfaceProdutos busca_Produtos(int id) throws RemoteException;
    
    public ArrayList<InterfaceProdutos> buscaAllPorNome_Produtos(String name) throws RemoteException;
    
    public ArrayList<InterfaceProdutos> buscaAllPorId_Produtos(int id)throws RemoteException;
    
    ////////////////////////////////////////////////////////////////////////////
       
}
