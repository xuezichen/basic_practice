package zc.itevent.chapter4.hongbao;

public class Users {
    private String name;
    private int totalmoney;

    public Users() {
    }

    public Users(String name, int totalmoney) {
        this.name = name;
        this.totalmoney = totalmoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney) {
        this.totalmoney = totalmoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", totalmoney=" + totalmoney +
                '}';
    }
}
