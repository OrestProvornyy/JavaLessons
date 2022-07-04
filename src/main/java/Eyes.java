public class Eyes {
    public String color;
    public int radius;
    public boolean visible;
    public int count;

    public Eyes(String color, int radius, boolean visible, int count) {
        this.color = color;
        this.radius = radius;
        if (count == 0) {
            this.visible = false;
            this.count = 0;
        }
        if ((count < 3) && (count > 0)) {
            this.visible = visible;
            this.count = count;
        } else {
            this.visible = visible;
            this.count = 2;
        }
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isVisible() {
        return visible;
    }

    public int getCount() {
        return count;
    }
}
