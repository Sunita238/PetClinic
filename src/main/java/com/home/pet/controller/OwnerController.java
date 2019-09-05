package com.home.pet.controller;

import com.home.pet.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owner","/owner/index"})
    public String owner(Model model){
        model.addAttribute("owners",ownerService.finadAll());
        return "owner/index";
    }
}
