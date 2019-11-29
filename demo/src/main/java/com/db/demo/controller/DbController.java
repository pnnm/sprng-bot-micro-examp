package com.db.demo.controller;

import com.db.demo.domain.*;
import com.db.demo.exception.ApplicationException;
import com.db.demo.model.AddressModel;
import com.db.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/dbCtrl")
public class DbController {

    @Autowired
    BankRepository bankRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AddressRepository addressRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getBank(){
        System.out.println("welocme!!");
        Bank b = new Bank();
        b.setId(1);
        b.setName("Axis");
        Branch branch = new Branch();
        branch.setBranchCode("AXIS1257");
        branch.setBranchName("SUNCITY");
        branch.setBranchType("Urban");
        branch.setBank(b);
        Address address = new Address();
        address.setCity("Hyderabad");
        address.setPin("500086");
        address.setState("Telangana");
        address.setAddress1("Kalimandir");
        branch.setAddress(address);
       // branchRepository.save(branch);
        b.setBranchList(Arrays.asList(branch));
        bankRepository.save(b);

        return "success";
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String getInfo(){

        Customer customer = new Customer();
        customer.setAadharNumber("121216781");
        Address address = new Address();
        address.setCity("hyderabad1");
        address.setPin("5000801");
        address.setState("Telangana");
        address.setAddress1("Goplapuram1");
        address.setAddress2("Karimnagar1");

        customer.setAddress(address);
        customer.setContactNumber(93210);
        customer.setEmail("padma12131.ponnam@gmail.com");
        customer.setFirstName("padmapnnm");
        customer.setLastName("ponnam");
        List<Branch> branches = branchRepository.findAll();
        List<Branch> brnchs = new ArrayList<>();
        List<Customer> l = new ArrayList<>();
        l.add(customer);
        for(Branch br : branches){
            if(br.getId() == 17){
                br.setCustomers(l);
                brnchs.add(br);
            }else{
                br.setCustomers(l);
                brnchs.add(br);
            }


        }

        customer.setBranches(brnchs);
        customerRepository.save(customer);

         /* customer creation end */
        Account account = new Account();
        account.setBalance(500);
        account.setCreatedDate(new Date());
        account.setStatus("new");
        account.setType("savings");

        customer.setAccountList(Arrays.asList(account));
        account.setCustomer(customer);

        Transaction transaction = new Transaction();
        transaction.setAccount(account);
        transaction.setTransactionAmount(500);
        transaction.setMerchantId("AX2327hfvjhbbmsn ");
        transaction.setTransactionMode("Account open");
        transaction.setTransactionStatus("new Account");
        transaction.setTransactionType("deposit");
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);
        account.setTransactionSet(transactionList);

        accountRepository.save(account);

        return "success";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(){
       try{
           String s = null;
           s.isEmpty();
       }catch(Exception e){
           throw new IllegalArgumentException();
       }
       List<Customer> customers = customerRepository.findAll();
        int size = customers.size();
        return "completed";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        Customer customer =customerRepository.findByFirstName("padmapnnm");
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);

        Branch br = branchRepository.findByBranchCode("AXIS1257");
        br.setCustomers(customers);
        List<Branch> branches = new ArrayList<>();
        branches.add(br);
        customer.setBranches(branches);
//        customerRepository.save(customer);


        Account account = new Account();
        account.setBalance(500);
        account.setCreatedDate(new Date());
        account.setStatus("new");
        account.setType("FD ACCOUNT");
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        customer.setAccountList(accounts);
        account.setCustomer(customer);

        Transaction transaction = new Transaction();
        transaction.setAccount(account);
        transaction.setTransactionAmount(500);
        transaction.setMerchantId("AX23278322sdedfedsfd");
        transaction.setTransactionMode("Account open");
        transaction.setTransactionStatus("FD Account");
        transaction.setTransactionType("deposit");
        account.setTransactionSet(Arrays.asList(transaction));

        accountRepository.save(account);

        return "done!!";
    }

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public String getData() throws ApplicationException {
        try{
            String s = null;
            s.isEmpty();
        }catch(Exception e){
            throw new ApplicationException("Exception occurred.........");
        }
        List<Customer> customers = customerRepository.findAll();
        int size = customers.size();
        return "completed";
    }

    @RequestMapping(value="/testa", method = RequestMethod.GET)
    public String testA(){
        List<AddressModel> a =addressRepository.getDataByState();
        System.out.println(a.size());
        return "helloo";
    }
}
