package com.ust.rest.model;

import lombok.Data;
import lombok.NoArgsConstructor;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="wallet")
public class Wallet {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int age;
	private long  phone_no;
	
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "govid", referencedColumnName = "govid")
	
	    private GovDoc govDoc;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "wallet_id", referencedColumnName = "certid")
	  
	    private Certificates certificates;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "bankid", referencedColumnName = "bankid")
	   
	    private BankDetails bankDetails;

		

}
