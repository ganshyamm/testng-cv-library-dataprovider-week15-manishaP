package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * |jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
 * |Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
 * Create 6 More data set.
 */
public class TestData {
    @DataProvider(name = "dataForJob")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent"},
                {"Bookkeeper","London","up to 10 mile","30000","40000","Per annum","Permanent","Permanent"},
                {"Warehouse Operative","Watford, Hertfordshire","up to 5 miles","20000","35000","Per annum","Permanent","Permanent"},
                {"Developer","Milton Keynes","up to 10 miles","35000","70000","Per annum","Contract","Contract"},
                {"Teaching Assistant","Wembley","up to 5 miles","24000","50000","Per annum","Permanent","Permanent"},
                {"Recruiter","Wales","up to 10 miles","20001","30000","Per annum","Part Time","Part Time"}
        };


        return data;


    }
}

