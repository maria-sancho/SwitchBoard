public class Call {

    private String sourceNumber;
    private String destinationNumber;
    private int duration;
    private int band;
    private char type;
    private double cost;

    public Call(String sourceNumber, String destinationNumber, int duration, int band, char type) {
        this.sourceNumber = sourceNumber;
        this.destinationNumber = destinationNumber;
        this.duration = duration;
        this.band = band;
        this.type = type;

        if(type == 'l'){
            cost = 15 * duration;
        }
        if(type == 'p'){
            if(band == 1){
                cost = 20 * duration;
            } else if (band == 2) {
                cost = 25 * duration;
            } else {
                cost = 30 * duration;
            }
        }
    }

    public String getSourceNumber() {
        return sourceNumber;
    }

    public void setSourceNumber(String sourceNumber) {
        this.sourceNumber = sourceNumber;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public int getDuration() {
        return duration;
    }

    public int getBand() {
        return band;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Call{" +
                "sourceNumber='" + sourceNumber + '\'' +
                ", destinationNumber='" + destinationNumber + '\'' +
                ", duration=" + duration +
                ", band=" + band +
                ", type=" + type +
                '}';
    }
}