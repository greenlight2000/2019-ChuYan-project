package com.example.cydemo.dao;

import com.example.cydemo.entity.BillOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BillOrderDao extends BaseDao<BillOrder> {
}
