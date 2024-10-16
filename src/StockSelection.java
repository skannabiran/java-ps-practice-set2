import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StockSelection {

  public static void main(String[] args) {
    List<Stock> stockList =
        Arrays.asList(
            new Stock(1, "Maveric", 20.00, 10, 4000.00),
            new Stock(2, "HCL", 20.00, 10, 400.00),
            new Stock(3, "Infosys", 60.00, 10, 2000.00));
    StockSelection stockSelection = new StockSelection();
    Stock maxProfitStock = stockSelection.getMaxProfitStock(stockList);
    System.out.println(maxProfitStock.getName());
  }

  public Stock getMaxProfitStock(List<Stock> stockList) {
    Collections.sort(stockList, new SortByMaxProfit());
    return stockList.get(0);
  }

  static class SortByMaxProfit implements Comparator<Stock> {
    // Used for sorting in ascending order of ID
    public int compare(Stock stock1, Stock stock2) {
      double stock1Profit =
          (stock1.getTotalExpectedProfitPerMonth() / stock1.getAvailableUnits())
              - (stock1.getTotalValue() / stock1.getAvailableUnits());
      double stock2Profit =
          (stock2.getTotalExpectedProfitPerMonth() / stock2.getAvailableUnits())
              - (stock2.getTotalValue() / stock2.getAvailableUnits());
      return (int) (stock2Profit - stock1Profit);
    }
  }
}

