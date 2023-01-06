package com.raman.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raman.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);
	
}
