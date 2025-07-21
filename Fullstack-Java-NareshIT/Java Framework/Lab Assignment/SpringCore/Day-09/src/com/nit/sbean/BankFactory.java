package com.nit.sbean;

public interface BankFactory {
	Bank createBank(String bankType) throws Exception;
}
