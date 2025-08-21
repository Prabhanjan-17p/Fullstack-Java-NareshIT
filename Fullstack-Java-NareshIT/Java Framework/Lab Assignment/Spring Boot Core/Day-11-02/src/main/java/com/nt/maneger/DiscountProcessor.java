package com.nt.maneger;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.nt.service.DiscountService;

@Component
public class DiscountProcessor {
	private final Set<DiscountService> dis;
	private final Map<String, DiscountService> selectDis;

	public DiscountProcessor(Set<DiscountService> dis, Map<String, DiscountService> selectDis) {
		super();
		this.dis = dis;
		this.selectDis = selectDis;
	}

	public void showAllDiscounts(double amount) {
		for (DiscountService service : dis) {
			System.out
					.println(service.getClass().getSimpleName() + " -> Final Amount: " + service.applyDiscount(amount));
		}
	}

	public double applySelectedDiscount(String discountType, double amount) {
		DiscountService service = selectDis.get(discountType.toLowerCase());
		if (service != null) {
			return service.applyDiscount(amount);
		} else {
			System.out.println("No matching discount, applying NoDiscount.");
			return selectDis.get("nodiscount").applyDiscount(amount);
		}
	}

}
