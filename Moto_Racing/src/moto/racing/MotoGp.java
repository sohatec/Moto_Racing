package moto.racing;
public abstract class MotoGp {
    protected String brand;
    protected String racer;
    protected int no;

    public MotoGp(String brand, String racer, int no) {
        this.brand = brand;
        this.racer = racer;
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRacer() {
        return racer;
    }

    public void setRacer(String racer) {
        this.racer = racer;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public abstract double racingOpeningLap();
    public abstract void showResultFormationLap();
    public abstract void showResultOpeningLap(double speed);

}
