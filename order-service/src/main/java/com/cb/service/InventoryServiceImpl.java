package com.cb.service;

import com.cb.client.InventoryClient;
import com.cb.client.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryClient inventoryClient;

    @Override
    public Mono<Inventory> getInventoryByProductId(int id) {
        return inventoryClient.getInventoryByProductId(id);
    }
}
