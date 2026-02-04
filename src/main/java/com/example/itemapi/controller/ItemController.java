package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        return ResponseEntity.ok(service.addItem(item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        return service.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
