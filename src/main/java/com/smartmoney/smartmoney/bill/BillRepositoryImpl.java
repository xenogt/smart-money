package com.smartmoney.smartmoney.bill;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BillRepositoryImpl implements BillRepository {

    private RedisTemplate<String, Bill> redisTemplate;

    private HashOperations hashOperations;

    public BillRepositoryImpl(RedisTemplate<String, Bill> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Bill bill) {
        hashOperations.put("BILLS", bill.getId(), bill);
    }

    @Override
    public Map<String, Bill> findAll() {
        return hashOperations.entries("BILLS");
    }

    @Override
    public void update(Bill bill) {
        save(bill);
    }

    @Override
    public void delete(String id) {
        hashOperations.delete("BILLS", id);
    }

    @Override
    public Bill findById(String id) {
        return (Bill) hashOperations.get("BILLS", id);
    }
}
