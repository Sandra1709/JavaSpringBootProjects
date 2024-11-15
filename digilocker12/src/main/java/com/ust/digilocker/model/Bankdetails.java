package com.ust.digilocker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Bankdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bankid;
	private String bankname;
	private long accno;
	private String ifscode;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

}
