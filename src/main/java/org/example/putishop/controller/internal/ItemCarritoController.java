package org.example.putishop.controller.internal;

import lombok.RequiredArgsConstructor;
import org.example.putishop.service.ItemCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/itemcarrito")
public class ItemCarritoController {

    @Autowired
    private final ItemCarritoService itemCarritoService;
}
