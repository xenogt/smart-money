package com.smartmoney.smartmoney.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BillService {

    @Autowired
    private BillRepositoryImpl billRepositoryImpl;

    public Map<String, Bill> getAllBills() {
        return billRepositoryImpl.findAll();
    }

    public Bill getBillById(String id) {
        return billRepositoryImpl.findById(id);
    }

    public Map<String, Bill> getBillByPayee(String payee) {
//        return billRepositoryImpl.findByPayee(payee);
        return null;
    }

    public void addBill(Bill bill) {
        billRepositoryImpl.save(bill);
    }

    public void updateBillById(Bill bill) {
        billRepositoryImpl.update(bill);
    }

    public void deleteBillById(String id) {

    }
}
