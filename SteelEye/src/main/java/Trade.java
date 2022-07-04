
public class Trade {
	
	public String getAssest_class() {
		return Assest_class;
	}
	public void setAssest_class(String assest_class) {
		Assest_class = assest_class;
	}
	public String getCounterparty() {
		return Counterparty;
	}
	public void setCounterparty(String counterparty) {
		Counterparty = counterparty;
	}
	public String getInstrument_id() {
		return Instrument_id;
	}
	public void setInstrument_id(String instrument_id) {
		Instrument_id = instrument_id;
	}
	public String getInstrument_name() {
		return Instrument_name;
	}
	public void setInstrument_name(String instrument_name) {
		Instrument_name = instrument_name;
	}
	public String getTrade_date_time() {
		return Trade_date_time;
	}
	public void setTrade_date_time(String trade_date_time) {
		Trade_date_time = trade_date_time;
	}
	public int getTrade_id() {
		return trade_id;
	}
	public void setTrade_id(int trade_id) {
		this.trade_id = trade_id;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	private String Assest_class;
	private String Counterparty;
	private String Instrument_id;
	private String Instrument_name;
	private String Trade_date_time;
	private int trade_id;
	private String trader;
	private int Price;
	private int Quantity;
	
	public Trade(String Assest_class,
			     String Counterparty,
			     String Instrument_id, 
			     String Instrument_name,
			     String Trade_date_time,
			     int trade_id,
			     String trader,
			     int Price,
			     int Quantity) {
		this.Assest_class= Assest_class;
		this.Counterparty = Counterparty;
		this.Instrument_id = Instrument_id;
		this.Instrument_name = Instrument_name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Trade_date_time = Trade_date_time;
		this.trade_id = trade_id;
		this.trader = trader;
	}
	
}
