package com.asarit.Banking.services.Imp;

import com.asarit.Banking.model.Bank;
import com.asarit.Banking.repo.BankRepo;
import com.asarit.Banking.services.BankService;

public class BankServicelmp implements BankService {

    @Override
    public boolean createAccount(Bank obj) {
       if(!(obj.getBalance()>500)){
           System.out.println("invalid minimum balance");
           return false;
       }
        int findIndex=0;
        for (int i = 0; i < BankRepo.bankDb.length; i++) {
            if(BankRepo.bankDb[i]==null){
                findIndex=i;
                break;
            }

        }
        BankRepo.bankDb[findIndex]=obj;
        return true;
    }

    @Override
    public boolean deposit(int accNo, int amount) {
        int findIndex=0;
        for (int i=0;i<BankRepo.bankDb.length;i++){
            if(BankRepo.bankDb[i].getAccNO()==accNo){
                findIndex=i;
                break;
            }
        }

        BankRepo.bankDb[findIndex].setBalance( BankRepo.bankDb[findIndex].getBalance()+amount);
        return true;



    }

    @Override
    public boolean jvd(int amount) {
        for (int i = 0; i < BankRepo.bankDb.length; i++) {
            if(BankRepo.bankDb[i]==null){
                 break;
            }
            if(BankRepo.bankDb[i]!=null){
               BankRepo.bankDb[i].setBalance(BankRepo.bankDb[i].getBalance()+amount);
            }

        }
        return true;
    }
}
