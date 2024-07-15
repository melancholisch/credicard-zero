package br.com.card_zero.clients.cardproposal.card;

public class CardRequestDto {

    private String document;
    private String name;
    private String requestResult;
    private String idProposal;

    public String getDocument(){
        return document;
    }

    public String getName(){
        return name;
    }

    public String getRequestResult(){
        return requestResult;
    }

    public String getIdProposal(){
        return idProposal;
    }
}
