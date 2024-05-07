package com.ramjava.faire.du.back.end.controller;

import com.ramjava.faire.du.back.end.domain.FaireItem;
import com.ramjava.faire.du.back.end.service.FaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class FaireController {
    // HttpRequest -> Controller -> Service -> Repository -> Database
    // front-end <- Controller <- Service <- Repository <- Database
    private FaireService faireService;

    public FaireController(FaireService faireService) {
        this.faireService = faireService;
    }

    @GetMapping("/api/faireItems")
    public ResponseEntity<?> fetchAllFaireItems() {
        List<FaireItem> faireItems = faireService.getAllFaireItems();
        return ResponseEntity.ok(faireItems);
    }
}
