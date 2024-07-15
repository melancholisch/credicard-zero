package br.com.card_zero.clients.cardproposal.card;

public class CardRequestForm {

    private String document;
    private String name;
    private String number;

    public CardRequestForm(String cpfOrCnpj, String name, Long id){
        this.document = cpfOrCnpj;
        this.name = name;
        this.number = id.toString();
    }

    public String getDocument(){
        return document;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }
}
