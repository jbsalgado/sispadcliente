/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Junior Pires
 */

//Classe responsavel pelas mensagem que vem do WebService
public class MenssagensWebService implements Subject{
    //lista das mensagens do WebService
    private List<MessageWebService> listMensagens;
    private ArrayList<Observer> observers;
    private int firstIdLastMessages=0;
    public MenssagensWebService() {
        listMensagens = new ArrayList<MessageWebService>();
        observers = new ArrayList<Observer>();
    }
    
    public void addMensagens(List<MessageWebService> mensagens){
        //armazena o index do primeiro elemento das mensagens adicionadas recentemente
        storeLastMessages();
        //converte o vetor mensagens em array e o adiciona a lista
        listMensagens.addAll(mensagens);
        notifyObservers();
        
    }
    
    private void storeLastMessages(){
        //se o array nao for vazio guarda o index do proximo elemento a ser adicionado que é igual ao tamanho
        //do array
        //desse modo pode-se guardar o inicio das ultimas mensagens adicionadas
        if(!listMensagens.isEmpty()){
            firstIdLastMessages = listMensagens.size();
        }
    }
    
    //retorna um array das ultimas mensagens adicionadas
    public List<MessageWebService> getLastMessages(){
         List<MessageWebService> m;
         if(firstIdLastMessages==listMensagens.size()-1){
             m = new ArrayList<MessageWebService>();
             m.add(listMensagens.get(firstIdLastMessages));
             return m;
         }
         else
            return listMensagens.subList(firstIdLastMessages, listMensagens.size()-1);
    }

    @Override
    public void registerObserver(Observer o) {
      observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
       for(Observer o: observers){
           o.update(this, null);
       }
    }

    /**
     * @return the listMensagens
     */
   
    
}
    
    

