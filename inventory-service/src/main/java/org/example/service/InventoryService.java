package org.example.service;

import org.example.model.InventoryItem;
import org.example.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository repository;

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItem> getAllItems() {
        return repository.findAll();
    }

    public InventoryItem getItemById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public InventoryItem saveItem(InventoryItem item) {
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}

