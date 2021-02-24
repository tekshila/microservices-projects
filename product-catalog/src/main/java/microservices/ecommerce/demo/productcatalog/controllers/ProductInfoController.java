package microservices.ecommerce.demo.productcatalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ms/ecommerce/demo")
public class ProductInfoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from : " + ProductInfoController.class.getName();
    }

}
