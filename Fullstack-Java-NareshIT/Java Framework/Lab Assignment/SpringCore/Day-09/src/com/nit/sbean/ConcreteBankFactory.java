package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteBankFactory implements BankFactory{
	
	@Autowired 
	private SBI sbi;
	@Autowired 
	private HDFC hdfc;

	@Override
	public Bank createBank(String bankType) throws Exception  {
		if (bankType.equalsIgnoreCase("sbi")) {
			return sbi;
		}else if (bankType.equalsIgnoreCase("hdfc")) {
			return hdfc;
		}else {
			throw new Exception("Bank Type Not Found!!");
		}
	}

}
