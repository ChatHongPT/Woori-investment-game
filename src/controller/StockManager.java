package controller;

import model.StockModel;
import model.domain.User;
import model.domain.News;
import model.domain.Stock;
import model.Model;
import model.StockDatabase;

public class StockManager {
    
    private static StockModel stmodel = StockModel.getModel();
    private static MarketManager marketManager = new MarketManager();
    private static Model model = Model.getModel();
    
    public static void priceChange(News n) {
        for(Stock stock : stmodel.getStock()) {
            double rate;
            
            if(n.getSName().equals(stock.getSName())) {
                // 뉴스에 언급된 주식
                if(n.getNIsGood()) {
                    rate = Math.random() * 0.2; // 0 ~ 0.2 (상승)
                    stock.setSPrice((int)(stock.getSPrice() * (1 + rate)));
                    System.out.println("📈 " + stock.getSName() + " 주가 상승: +" + String.format("%.1f", rate * 100) + "%");
                } else {
                    rate = Math.random() * 0.2; // 0 ~ 0.2 (하락)
                    stock.setSPrice((int)(stock.getSPrice() * (1 - rate)));
                    System.out.println("📉 " + stock.getSName() + " 주가 하락: -" + String.format("%.1f", rate * 100) + "%");
                }
                stock.setSGraph(rate);
            } else {
                // 다른 주식들의 소폭 랜덤 변동
                rate = (Math.random() - 0.5) * 0.1; // -0.05 ~ 0.05
                stock.setSPrice((int)(stock.getSPrice() * (1 + rate)));
                stock.setSGraph(Math.abs(rate));
            }
        }
    }
    
    public static boolean stockBuy(String stockName, int num) {
        if (num <= 0) {
            return false;
        }
        
        Stock targetStock = findStockByName(stockName);
        if (targetStock == null) {
            return false;
        }
        
        int totalCost = targetStock.getSPrice() * num;
        User currentPlayer = model.getCurrentPlayer();
        
        if (currentPlayer.getUWallet() >= totalCost) {
            currentPlayer.setUWallet(currentPlayer.getUWallet() - totalCost);
            targetStock.setSAmount(targetStock.getSAmount()-num);
            marketManager.buyStock(targetStock,num);
            return true;
        }
        
        return false;
    }
    
    public static boolean stockSell(String stockName, int num) {
        if (num <= 0) {
            return false;
        }

        Stock targetStock = findStockByName(stockName);
        if (targetStock == null) {
            return false;
        }

        boolean isSuccess = marketManager.sellStock(targetStock, num);
        if (isSuccess) {
            User currentPlayer = model.getCurrentPlayer();
            int totalValue = targetStock.getSPrice() * num;
            currentPlayer.setUWallet(currentPlayer.getUWallet() + totalValue);
            return true;
        }
        return false;
    }

    
    // 주식 이름으로 찾기 헬퍼 메서드
    private static Stock findStockByName(String stockName) {
        for (Stock stock : stmodel.getStock()) {
            if (stockName.equals(stock.getSName())) {
                return stock;
            }
        }
        return null;
    }
    
    public static Stock[] showStocks() {
        return stmodel.getStock();
    }
    
    // 추가 유틸리티 메서드들
    public static Stock getStockByName(String stockName) {
        return findStockByName(stockName);
    }
    
    public static boolean isValidStock(String stockName) {
        return findStockByName(stockName) != null;
    }
}