package com.example.DTO;

import java.time.LocalDateTime;

import org.bouncycastle.asn1.dvcs.ServiceType;

import com.example.Enum.PaymentStatus;
import com.example.Enum.PaymentType;

public class InvoiceDTO {
	
	public Long id;
	public String userEmail;
	public ServiceType serviceType;
	public Double amount;
	public LocalDateTime purchaseDate=LocalDateTime.now();
	public PaymentType paymentMethod;
	public PaymentStatus status;
	public String invoiceNumber;
	public String invoiceDownloadURL;
	
	public InvoiceDTO() {}
	public InvoiceDTO(Long id,String userEmail,ServiceType serviceType,Double amount,PaymentType paymentMethod,PaymentStatus status,String invoiceNumber,String invoiceDownloadURL) {
		this.id=id;
		this. userEmail= userEmail;
		this.serviceType=serviceType;
		this.amount=amount;
		this.paymentMethod=paymentMethod;
		this.status=status;
		this.invoiceNumber=invoiceNumber;
		this.invoiceDownloadURL=invoiceDownloadURL;
		
	}
		
		
	}


