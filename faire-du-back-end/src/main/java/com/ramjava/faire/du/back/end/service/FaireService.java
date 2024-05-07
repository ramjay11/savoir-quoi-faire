package com.ramjava.faire.du.back.end.service;

import com.ramjava.faire.du.back.end.domain.FaireItem;
import com.ramjava.faire.du.back.end.repository.FaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaireService {
    public FaireService(FaireRepository faireRepository) {
        this.faireRepository = faireRepository;
    }
    private FaireRepository faireRepository;
    public List<FaireItem> getAllFaireItems() {
        return faireRepository.fetchAllFaireItems();
    }
}
