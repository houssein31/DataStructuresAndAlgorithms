package javaPrep.interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateTotalTradesCost {

    public static class Trades {
        private String id;
        private Integer numberOfUnits;

        public Trades(String id, Integer numberOfUnits) {
            this.id = id;
            this.numberOfUnits = numberOfUnits;
        }

        public String getId() {return id;}
        public Integer getNumberOdUnits() {return numberOfUnits;}
    }

    public static class Cost {
        private String id;
        private Double pricePerUnit;

        public Cost(String id, Double pricePerUnit) {
            this.id = id;
            this.pricePerUnit = pricePerUnit;
        }

        public String getId(){return id;}
        public Double getPricePerUnit() {return pricePerUnit;}
    }

    public static void main(String[] args) {

        // Trades
        Trades t1 = new Trades("AAPL", 10);
        Trades t2 = new Trades("TSLA", 5);
        Trades t3 = new Trades("MSFT", 20);

        List<Trades> trades = Arrays.asList(t1, t2, t3);

        // Costs
        Cost c1 = new Cost("AAPL", 150.00);
        Cost c2 = new Cost("TSLA", 700.00);
        Cost c3 = new Cost("MSFT", 320.50);

        List<Cost> unitCosts = Arrays.asList(c1, c2, c3);

        System.out.println(calculateTotalCost2(unitCosts, trades));

    }

    public static Double calculateTotalCost(List<Cost> unitCosts, List<Trades> trades) {

        Map<String, Double> costMap = new HashMap<>();

        for(Trades trade : trades) {
            costMap.put(trade.id, (double)trade.numberOfUnits);
        }

        for(Cost cost : unitCosts) {
            costMap.put(cost.id, costMap.get(cost.id) * cost.pricePerUnit);
        }

        double total = 0.0;

        for(Map.Entry<String, Double> entry : costMap.entrySet()) {

             total += entry.getValue();
        }

        return total;
    }

    public static Double calculateTotalCost2(List<Cost> unitCosts, List<Trades> trades) {

        Map<String, Double> costMap = unitCosts.stream()
                .collect(Collectors.toMap(c -> c.getId(), c -> c.pricePerUnit));

        return trades.stream()
                .mapToDouble(t -> t.getNumberOdUnits() * costMap.get(t.getId()))
                .sum();
    }
}

