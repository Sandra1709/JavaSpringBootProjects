package com.ust.rest.controller;


import java.util.List;
//import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Certificates;
import com.ust.rest.model.Wallet;
import com.ust.rest.model.GovDoc;

import com.ust.rest.service.WalletService;

@RestController
@RequestMapping("/wallet/api")//root of the resource/controller

public class WalletController {
	@Autowired
	private WalletService service;
	Logger logger =Logger.getLogger("WalletController.class");
	
//----------------------------------------Starting GetMapping-----------------------------------------------------------------	
	@GetMapping(value="/wallet/{id}")
	public ResponseEntity <Wallet>getById(@PathVariable long id)
	{
		Wallet wallet = service.getWalletById(id);
        if (wallet != null) {
            return ResponseEntity.ok(wallet);
        } else {
            return ResponseEntity.status(HttpStatusCode.valueOf(404)).body(null);
        }
	}
		
	@GetMapping(value="/walet/{name}")
	public ResponseEntity <Wallet>getByName(@PathVariable String name)
	{
		Wallet wallet = service.getWalletByName(name);
        if (wallet != null) {
		return ResponseEntity.ok(wallet);
       } else {
           return ResponseEntity.notFound().build();
       }
		}
@GetMapping(value="/walletsinfo",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity <List<Wallet>> displayWallets()
{
	 List<Wallet> wallets = service.getAllWallets();
     return ResponseEntity.ok(wallets);
}
//---------------------------------------end of GetMapping codes--------------------------------------------------------------------------------
//adding data as a whole
@PostMapping(value = "/addData", consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Wallet> addAllData(@RequestBody Wallet walletRequest) {
    // Log the received request
    logger.info("Adding all data: " + walletRequest);

    // Add the wallet first
    Wallet savedWallet = service.addWallet(walletRequest);

    if (walletRequest.getBankDetails() != null) {
        service.addBankDetails(walletRequest.getBankDetails());
    }

    // Add government documents
    if (walletRequest.getGovDoc() != null) {
        service.addGovDoc(walletRequest.getGovDoc());
    }

    // Add certificates
    if (walletRequest.getCertificates() != null) {
        {
            service.addCertificates(walletRequest.getCertificates());
        }
    }

    return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedWallet);
}


//Deleting the person details using id
@DeleteMapping(value="/delete/{id}")
public void  removeProduct(@PathVariable long id)
{
	service.removeProductById(id);
    
		
}



}