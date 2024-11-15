package com.ust.rest.service;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.BankDetails;
import com.ust.rest.model.Certificates;
import com.ust.rest.model.GovDoc;
import com.ust.rest.model.Wallet;
import com.ust.rest.repository.WalletRepository;

@Service
public class WalletService {
 @Autowired
  private WalletRepository  repo;
 
// private final Map<Long, List<BankDetails>> bankDetailsMap = new HashMap<>();
// private final Map<Long, List<GovDoc>> govDocMap = new HashMap<>();
// private final Map<Long, List<Certificates>> certificatesMap = new HashMap<>();
// 

 public Wallet addWallet(Wallet prod)
 {
	 return repo.save(prod);
 }
 public List<Wallet> getAllWallets() {
     return repo.findAll();
 }
 public Wallet getWalletById(long id) {
     Optional<Wallet> wallet = repo.findById(id);
     return wallet.orElse(null);
 }
 public Wallet getWalletByName(String name) {
     return repo.findByName(name);
 }
 public void removeProductById(long id) {
    repo.deleteById(id);
 }
 

 public BankDetails addBankDetails(BankDetails bankDetails) {
	   return repo.save(bankDetails); 
	}


 public GovDoc addGovDoc(GovDoc govDoc) {
  
	return  repo.save(govDoc);
 }

 public Certificates addCertificates(Certificates certificate) {
     
	
	 return repo.save(certificate);
 }

}
