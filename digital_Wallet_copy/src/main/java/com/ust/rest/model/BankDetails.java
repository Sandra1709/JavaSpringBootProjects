package com.ust.rest.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class BankDetails {
	@Id

	private long bankid;
	private String bankname;
	private long bankaccno;
	private String ifscode;

}
