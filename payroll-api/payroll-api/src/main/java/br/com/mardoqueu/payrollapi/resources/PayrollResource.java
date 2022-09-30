package br.com.mardoqueu.payrollapi.resources;

import br.com.mardoqueu.payrollapi.domain.Payroll;
import br.com.mardoqueu.payrollapi.domain.User;
import br.com.mardoqueu.payrollapi.feignClients.UserFeign;
import br.com.mardoqueu.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private  final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
    return ResponseEntity.ok().body(service.getPayment(workerId, payment));

    }
}
