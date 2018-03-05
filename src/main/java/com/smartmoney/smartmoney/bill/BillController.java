package com.smartmoney.smartmoney.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bills")
public class BillController {

    private BillRepository billRepository;

    public BillController(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @GetMapping(value="")
    public Map<String, Bill> getAllBills() {
        return this.billRepository.findAll();
    }

    @GetMapping(value="/id/{id}")
    public Bill getById(@PathVariable String id) {
        return this.billRepository.findById(id);
    }

    @RequestMapping(value="/payee/{payee}", method = RequestMethod.GET)
    public Map<String, Bill> getBillsByPayee(@PathVariable String payee) {
//        return this.billRepository.getBillByPayee(payee);
        return null;
    }

    @PostMapping(value="/add")
    public void addBill(@RequestBody Bill bill) {
        this.billRepository.save(bill);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateBillTitleById(@RequestBody Bill bill) {
        this.billRepository.update(bill);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBillById(@PathVariable String id) {
        this.billRepository.delete(id);
    }

}
