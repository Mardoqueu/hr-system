package br.com.mardoqueu.payrollapi.resources;

import br.com.mardoqueu.payrollapi.domain.Payroll;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
    return ResponseEntity.ok().body(
                new Payroll(
                        "Mardoqueu",
                        payment.getDescription(),
                        payment.getHourlyPrice(),
                        100.0,
                        payment.getHourlyPrice() * payment.getWorkedHours())
        );
    }
}
