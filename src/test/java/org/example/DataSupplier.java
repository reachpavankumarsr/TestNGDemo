package org.example;

import org.testng.annotations.DataProvider;

public class DataSupplier {
    @DataProvider()
    public String[] getStringData(){
        String data[]=new String[]{
                "rama",
                "lakshmana",
                "bharata",
                "shathrugna"
        };
        return data;
    }
}
