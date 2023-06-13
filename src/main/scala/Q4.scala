object Q4 {
  def main(args: Array[String]) {
    var coverPrice = 24.95;
    var quantity=60;
    var discountedPrice = coverPrice * 0.6;
    var totShipping = 3+(quantity-50)*0.75;
    var totPrice=discountedPrice*60+totShipping;
    println("Total price for 60 books : " + totPrice);
  }
}
