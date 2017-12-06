package stream.sort;

import java.util.Date;

public class DataObj {
    
    private String str;
    private Date date;

    @Override
    public String toString() {
        return "DataObj [str=" + str + ", date=" + date + "]";
    }

    public DataObj(String str, Date date) {
        super();
        this.str = str;
        this.date = date;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
