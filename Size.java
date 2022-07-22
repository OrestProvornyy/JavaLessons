import javax.management.loading.MLet;

public enum Size {
    SMALL("S",11,40), MEDIUM("M", 23,51), LARGE("L", 33,67), EXTRA_LARGE("XL", 41, 79);
    private String shortName;
    private int width, length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return  super.name() + " or " + getShortName() +  " size: wigth= " +  getWidth() + " ,length " + getLength();
    }
}
