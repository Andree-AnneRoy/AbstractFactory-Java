public abstract class Drink {
    public abstract String getSize();
    public abstract String getType();
    public abstract String getTemperature();

    @Override
    public String toString() {
        return 'Size= ' + this.getSize() + ', Type= ' + this.getType() + ', Temperature= ' + this.getTemperature();
    }
}