package newdealQuiz.buyProduct;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    KtTv kttv = new KtTv();
    Audio audio = new Audio();
    NoteBook notebook = new NoteBook();
    Scanner sc = new Scanner(System.in);
    System.out.println("구매자는 돈을 얼마나 가지고 있나요?");
    int money = sc.nextInt();
    Buyer buyer = new Buyer(money);
    String ans;

    do {
        System.out.println("무엇을 구매할까요?");
        System.out.println("1. tv");
        System.out.println("2. audio");
        System.out.println("3. noteBook");
        int product = sc.nextInt();

        if (product == 1) {
          buyer.buy(kttv);
        } else if (product == 2) {
          buyer.buy(audio);
        } else if (product == 3) {
          buyer.buy(notebook);
        } else {
          System.out.println("그런 물건은 판매하고 있지 않습니다.");
        }
        
        System.out.println("계속 구매할까요? y/n");
        ans = sc.nextLine();
        
      } while (ans.equalsIgnoreCase("y"));
    
    int summary = 0;
    
    for (int j = 0 ; j < buyer.i - 1 ; j++) {
      summary += buyer.cart[j].price;
    }
    
    System.out.println("총 구매금액은 "+summary+"원");
    
  }
}
