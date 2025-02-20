package com.project.controller;

import com.project.api.PurchaseService;
import com.project.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/purchase", method = RequestMethod.GET)
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @GetMapping
    public Result purchase(@RequestParam("userId") Long userId,
                           @RequestParam("bookId") Long bookId,
                           @RequestParam("cnt") Integer count) {
        return purchaseService.purchase(userId, bookId, count);
    }

}
