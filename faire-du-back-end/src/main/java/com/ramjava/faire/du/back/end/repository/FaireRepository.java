package com.ramjava.faire.du.back.end.repository;

import com.ramjava.faire.du.back.end.domain.FaireItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FaireRepository {
    // Hardcoded data
    private Long idCounter = 0L;
    private List<FaireItem> faireItems = new ArrayList<>();
    public List<FaireItem> fetchAllFaireItems() {
        if (faireItems.isEmpty()) {
            var item1 = new FaireItem();
            item1.setId(idCounter++);
            item1.setDone(false);
            item1.setTask("Task 1: Buy milk");
            faireItems.add(item1);
        }
        return faireItems;
    }
}
