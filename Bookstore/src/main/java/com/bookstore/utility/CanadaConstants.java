package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CanadaConstants {
	
	public final static String CA = "CA";
	public final static Map<String, String> mapOfCanadianProvinces = new HashMap<String, String>(){
		{
			put("AB", "Alberta");
			put("BC", "British Columbia");
			put("MB", "Manitoba");
            put("NB", "New Brunswick");
            put("NL", "Newfoundland and Labrador");
            put("NS", "Nova Scotia");
            put("NT", "Northwest Territories");
            put("NU", "Nunavut");
            put("ON", "Ontario");
            put("PE", "Prince Edward Island");
            put("QC", "Quebec");
            put("SK", "Saskatchewan");
            put("YT", "Yukon");
		}
	};
	public final static List<String> listOfCanadaProvinceCodes = new ArrayList<>(mapOfCanadianProvinces.keySet());
	public final static List<String> listOfCanadaProvinceNames = new ArrayList<>(mapOfCanadianProvinces.values());
}
