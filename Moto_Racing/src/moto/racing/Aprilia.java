package moto.racing;
import java.util.Random;
public class Aprilia extends MotoGp{
    public static final double MAX_SPEED = 350;

    public Aprilia(String brand, String racer, int no) {
        super(brand, racer, no);
    }

    @Override
    public double racingOpeningLap(){
        return 300 + (new Random().nextDouble() * (MAX_SPEED - 300));
	// random tufw 300 ddeesn 350
    }

    @Override
    public void showResultFormationLap(){
        System.out.printf("|%-10s|%-10s|%5d|%8.2f|\n", brand, racer, no, racingOpeningLap());
    }

    @Override
    public void showResultOpeningLap(double speed){
        System.out.printf("|%-10s|%-10s|%5d|%8.2f|\n", brand, racer, no, speed);
    }
}