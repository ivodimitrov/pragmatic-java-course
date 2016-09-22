package qa9;

public enum Months {
	JANUARY("january"),
	FEBRUARY("february"),
	MARCH("march"),
	APRIL("april"),
	MAY("may"),
	JUNE("june"),
	JULY("july"),
	AUGUST("august"),
	SEPTEMBER("september"),
	OCTOBER("october"),
	NOVEMBER("november"),
	DECEMBER("december");
	
	private String value;
	
	private Months(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static Months fromString(String monthValue) {
		for (Months month: values()) {
			if (month.getValue().equalsIgnoreCase(monthValue)) {
				return month;
			}
		}
		
		return null;
	}
}