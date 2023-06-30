package web.model;


public class Car {

    public  enum Color {Red, Blue, Black}

    private String model;
    private int series;
    private Color color;

    public Car(String model, int series, Color color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }


    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
