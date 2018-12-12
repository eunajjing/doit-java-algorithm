package newdealQuiz.classDiagram;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<Account> accounts;
  private int totalAccount;
  
  public Bank() {
    accounts = new ArrayList<>();
    totalAccount = accounts.size();
  }
  
}
