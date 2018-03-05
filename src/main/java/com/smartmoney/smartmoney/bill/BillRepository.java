package com.smartmoney.smartmoney.bill;
import java.util.List;
import java.util.Map;

public interface BillRepository {
    void save(Bill bill);
    Map<String, Bill> findAll();
    void update(Bill bill);
    void delete(String id);
    Bill findById(String id);
}
