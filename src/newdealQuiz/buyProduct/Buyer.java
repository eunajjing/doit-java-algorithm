package newdealQuiz.buyProduct;

public class Buyer {
  
  int money;
  int bonuspoint;
  Product[] cart;
  int i;
  
  public Buyer(int money) {
    this.money = money;
    this.cart = new Product[10];
    i = 0;
  }
  
  void buy(Product product) {
    if (product.price > money) {
      System.out.println("금액이 부족하여 구매에 실패하였습니다.");
      System.out.println("현재 남은 금액은 "+money+"원이며, ");
      System.out.println("구매하시고자 하신 상품의 가격은 "+product.price+"원 입니다.");
    } else {
      money -= product.price;
      bonuspoint +=product.bonuspoint;
      System.out.println("구매하였습니다.");
      System.out.println("현재 남은 금액은 "+money+"원이며, ");
      System.out.println("쌓인 포인트는 "+bonuspoint+" 입니다.");
      cart[i++] = product;
    }
  }

}
