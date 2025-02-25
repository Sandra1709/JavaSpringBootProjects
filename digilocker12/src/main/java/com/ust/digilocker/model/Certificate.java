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
public class Certificate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long certid;
	private String certiname;
	private long certino;
	

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

}
