package kr.re.kitri.tododemo.controller;

import kr.re.kitri.tododemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitriMallController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public String doOrder() {
        return orderService.doOrder();
    }
}
