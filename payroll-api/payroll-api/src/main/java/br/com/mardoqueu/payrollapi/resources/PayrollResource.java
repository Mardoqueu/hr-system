package br.com.mardoqueu.payrollapi.resources;

import br.com.mardoqueu.payrollapi.domain.Payroll;
import br.com.mardoqueu.payrollapi.domain.User;
import br.com.mardoqueu.payrollapi.feignClients.UserFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {


    private final UserFeign userFeign;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){

        User user= userFeign.findById(workerId).getBody();

    return ResponseEntity.ok().body(
                new Payroll(
                        user.getName(),
                        payment.getDescription(),
                        user.getHourlyPrice(),
                        payment.getWorkedHours(),
                        user.getHourlyPrice() * payment.getWorkedHours())
        );
    }
}
