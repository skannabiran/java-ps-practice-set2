class Stock {
  private int id;
  private String name;
  private double totalValue;
  private long availableUnits;
  private double totalExpectedProfitPerMonth;

  public Stock(
      int id,
      String name,
      double totalValue,
      long availableUnits,
      double totalExpectedProfitPerMonth) {
    this.id = id;
    this.name = name;
    this.totalValue = totalValue;
    this.availableUnits = availableUnits;
    this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(double totalValue) {
    this.totalValue = totalValue;
  }

  public long getAvailableUnits() {
    return availableUnits;
  }

  public void setAvailableUnits(long availableUnits) {
    this.availableUnits = availableUnits;
  }

  public double getTotalExpectedProfitPerMonth() {
    return totalExpectedProfitPerMonth;
  }

  public void setTotalExpectedProfitPerMonth(double totalExpectedProfitPerMonth) {
    this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
  }
}
