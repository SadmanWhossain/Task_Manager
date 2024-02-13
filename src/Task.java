import java.lang.*;

public class Task {
    private String des;
    private boolean CStatus;
    private String DDate;


    public Task(String des, String ddate) {
        this.des = des;
        this.CStatus = false;
        DDate = ddate;
    }

    public void setCStatus(boolean CStatus) {
        this.CStatus = CStatus;
    }


    public String getDes() {
        return des;
    }
    public String getDDate() {
        return DDate;
    }

    public boolean isCStatus() {
        return CStatus;
    }

    public void Display() {
        System.out.println(des);
        System.out.println(CStatus);
        System.out.println(DDate);

    }
}
