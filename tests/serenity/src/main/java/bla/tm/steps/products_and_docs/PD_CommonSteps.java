package bla.tm.steps.products_and_docs;

import bla.tm.pages.AncestorPage;

import java.util.HashMap;
import java.util.Map;

public class PD_CommonSteps extends WidgetFields {

    AncestorPage ancestorPage;


    public String getCountryNameByCode(String countryCode) {
        Map<String, String> countryCodes = new HashMap<>();
        countryCodes.put("CA", "Canada");
        countryCodes.put("AU", "Australia");
        countryCodes.put("GB", "Great Britain");
        countryCodes.put("IE", "Ireland");
        countryCodes.put("NZ", "New Zealand");
        countryCodes.put("US", "United States");
        return countryCodes.get(countryCode);
    }

}
