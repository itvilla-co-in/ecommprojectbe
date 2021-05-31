package com.itvilla.ecomm.prod.controller;

import com.itvilla.ecomm.prod.dto.myorder;
import com.itvilla.ecomm.prod.dto.orderresponse;
import com.itvilla.ecomm.prod.service.purchaseservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class ordercontroller {

    private purchaseservice purchaseservice;

    public ordercontroller(purchaseservice purchaseservice)
    {        this.purchaseservice = purchaseservice;     }

    @PostMapping("/buy")
    public orderresponse orderresponse(@RequestBody myorder myorder) {

        orderresponse orderresponse = purchaseservice.placeOrder(myorder);

        return orderresponse;
    }


}
