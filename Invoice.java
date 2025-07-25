package com.example.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bouncycastle.asn1.dvcs.ServiceType;

import com.example.Enum.PaymentStatus;
import com.example.Enum.PaymentType;

@Entity
@Table(name="invoices")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String userEmail;
	private ServiceType serviceType;
	private Double amount;
	private LocalDateTime purchaseDate=LocalDateTime.now();
	private PaymentType paymentMethod;
	private PaymentStatus status;
	private String invoiceNumber;
	private String invoiceDownloadURL;
	
	public Invoice() {}
	public Invoice(Long id,String userEmail,ServiceType serviceType,Double amount,String invoiceNumber,String invoiceDownloadURL) {
		this.id=id;
		this.userEmail=userEmail;
		this.serviceType=serviceType;
		this.amount=amount;
		this.invoiceNumber=invoiceNumber;
		this.invoiceDownloadURL=invoiceDownloadURL;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public ServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceDownloadURL() {
		return invoiceDownloadURL;
	}
	public void setInvoiceDownloadURL(String invoiceDownloadURL) {
		this.invoiceDownloadURL = invoiceDownloadURL;
	}
	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public PaymentType getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentType paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	
	
	
	

}
