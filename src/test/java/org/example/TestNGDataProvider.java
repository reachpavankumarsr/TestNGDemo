package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestNGDataProvider {
    @Test(dataProvider="getStringData", dataProviderClass = DataSupplier.class)
    public void TestMethod(String s){
        System.out.println("dataProviderClass "+s);
    }






    //usecase 1
   @Test(dataProvider = "objectData")
    public void LoginMethod(String username, String passwd){
        System.out.println("username:"+username+" \t "+"passwd: "+passwd);
    }

    @DataProvider()
    //@DataProvider(name="objectData")
    public Object[][] objectData(){
        Object[][] data=new Object[2][2];
        //row1
        data[0][0]="user1";
        data[0][1]="passwd1";

        //row2
        data[1][0]="user2";
        data[1][1]="passwd2";
        return data;
    }


    //usecase 2
    @Test(dataProvider = "IteratorData")
    public void getList(String item){
        System.out.println("item: "+item);
    }

    @DataProvider()
    public Iterator<String> IteratorData(){
        List<String> data=new ArrayList<>();
        data.add("item1");
        data.add("item2");
        return data.iterator();
    }

    @Test(dataProvider = "stringArray")
    public void testStringIndices(String s){
        System.out.println("dataByIndices "+s);
    }


    //usecase 3: By Indices
    @DataProvider(indices = {0,2})
    public String[] stringArray(){
       String data[]=new String[]{
               "rama",
               "lakshmana",
               "bharata",
               "shathrugna"
       };
       return data;
    }



}
