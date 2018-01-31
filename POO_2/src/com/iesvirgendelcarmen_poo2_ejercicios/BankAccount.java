package com.iesvirgendelcarmen_poo2_ejercicios;

import java.time.LocalDate;

public class BankAccount {
		
	private static final String BANK = "1234";
	private static final String BANKOFFICE = "5678";
	
	private String accountNumber;
	private double bankBalance = 0;
	private double interest = 2.5;;
	private LocalDate creationDate = LocalDate.now();
	public static int numberOfAccounts = 0;
	
	//Geters y seters
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	//constructor por defecto
	public BankAccount () {
	numberOfAccounts ++;	
	}
	
	//constructor que crea cuentas dado un deposito inicial e interes bancario
	public BankAccount(double bankBalance, double interest) {
		this.bankBalance = bankBalance;
		this.interest = interest;
		numberOfAccounts ++;
	}
	
	private String randomDigits() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(Math.random()*10);
		}
		return sb.toString();
	}
	
	private String firstControlDigit() {
		
		int firstDigit = 11 - ((((BANK.charAt(0) * 4) - 48 ) + ((BANK.charAt(1) * 8) - 48 ) + ((BANK.charAt(2) * 5) - 48 ) + ((BANK.charAt(3) * 10) - 48 ) +
				((BANKOFFICE.charAt(0) * 9) - 48 ) + ((BANKOFFICE.charAt(1) * 7) - 48 ) + ((BANKOFFICE.charAt(2) * 3) - 48 ) + ((BANKOFFICE.charAt(3) * 6) - 48 )) % 11); 
		return firstDigit + "" ;
	}
	
	private String secondControlDigit () {
		int secondDigit = 11 - ((((BANK.charAt(0) * 4) - 48 ) + ((BANK.charAt(1) * 8) - 48 ) + ((BANK.charAt(2) * 5) - 48 ) + ((BANK.charAt(3) * 10) - 48 ) +
				((BANKOFFICE.charAt(0) * 9) - 48 ) + ((BANKOFFICE.charAt(1) * 7) - 48 ) + ((BANKOFFICE.charAt(2) * 3) - 48 ) + ((BANKOFFICE.charAt(3) * 6) - 48 )) % 11); 
		return secondDigit + "";
	}
	
	
}
