import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class CandleSeriesData {
    private LocalDateTime time;
    private String symbol;
    private double price;

    List<CandleSeriesData> seriesDataList= new ArrayList<>();
    LocalDateTime currentTime = LocalDateTime.now();

    public CandleSeriesData() {
    }

    public CandleSeriesData(LocalDateTime time, String symbol, double price){
        this.time =time;
        this.symbol=symbol;
        this.price=price;
    }

    public LocalDateTime getTime(){
        return time;
    }

    public double getPrice(){
        return price;
    }

    public String getSymbol(){
        return symbol;
    }

    public static String generateSymbols(){
        String[] symbols= {"USD","KES","GBP"};
        Random random=new Random();
        int symbol=random.nextInt(symbols.length);
        return symbols[symbol];
    }

    public static double generatePrice(double price){
        Random random= new Random();
        double[] percentList= {-(random.nextInt(11)),(random.nextInt(11))};
        int percentIndex=random.nextInt(percentList.length);
        price=price+((price*percentList[percentIndex])/100);
        return price;
    }

    public void generateSeriesData(){
        Random random=new Random();
        double price =random.nextInt( 500) + 500 ;
        double closingPrice;
        double openingPrice=0;
        while(seriesDataList.size()<100800){
            if (currentTime.getHour() >= 11 && currentTime.getHour()<15) {
                if (currentTime.getDayOfMonth()==LocalDateTime.now().getDayOfMonth()&&currentTime.getHour()==11 && currentTime.getMinute()==00 && currentTime.getSecond() == 00) {
                    seriesDataList.add(new CandleSeriesData(currentTime, generateSymbols(),price));
                }
                else if (currentTime.getSecond() == 00) {
                    seriesDataList.add(new CandleSeriesData(currentTime, generateSymbols(), openingPrice));
                } else if (currentTime.getSecond() == 59) {
                    closingPrice= generatePrice(price);
                    openingPrice= closingPrice;
                    seriesDataList.add(new CandleSeriesData(currentTime, generateSymbols(),closingPrice));
                }
                else {
                    seriesDataList.add(new CandleSeriesData(currentTime, generateSymbols(), generatePrice(price)));
                }
            }
            currentTime = currentTime.plusSeconds(1);
        }

        seriesDataList.forEach(i->{
            System.out.println("->"+i.getTime()+" "+i.getSymbol()+" "+i.getPrice());
        } );
        System.out.println("size "+seriesDataList.size());
    }

    public List<CandleDTO> getCandles(String symbol, LocalDateTime startDate, LocalDateTime endDate, int granularity) {
        List<CandleSeriesData> filteredList=seriesDataList.stream()
                .filter(e->e.time.isBefore(endDate)&& e.time.isAfter(startDate))
                .filter(e->e.symbol==symbol)
                .collect(Collectors.toList());
        return null;
    }


    public static void main(String[] args) {
        CandleSeriesData candleSeriesData=new CandleSeriesData();
        candleSeriesData.generateSeriesData();


    }
}
