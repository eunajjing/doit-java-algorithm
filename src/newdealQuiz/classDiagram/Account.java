package newdealQuiz.classDiagram;

import java.util.ArrayList;
import java.util.List;

public class Account {
  private String accountNo;
  private String name;
  private long balance;
  private List<Tramsaction> tramsactions;
  
  public Account(String accountNo, String name) {
    this.accountNo = accountNo;
    this.name = name;
    balance = 0;
    tramsactions = new ArrayList<>();
  }
  
}
