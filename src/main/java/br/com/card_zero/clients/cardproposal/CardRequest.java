package br.com.card_zero.clients.cardproposal;

import br.com.card_zero.clients.cardproposal.card.CardRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


public interface CardRequest {

    @GetMapping("/cards")
    ResponseEntity<CardRequestDto> searchForIdProposal(Long idProposal);
}
