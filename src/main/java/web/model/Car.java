package web.model;

public class Car {
    private String marka;
    private String model;
    private int serial;

    public Car(){}
    public Car(String marka, String model, int serial) {
        this.marka = marka;
        this.model = model;
        this.serial = serial;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", serial=" + serial +
                '}';
    }
}
