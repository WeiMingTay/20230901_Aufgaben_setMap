package org.example;

public class Medicine {
    private String name;
    private double price;
    private Boolean availability;

private Medicine(){};
    public Medicine(String name, double price, Boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medicine medicine)) return false;

        if (Double.compare(getPrice(), medicine.getPrice()) != 0) return false;
        if (getName() != null ? !getName().equals(medicine.getName()) : medicine.getName() != null) return false;
        return getAvailability() != null ? getAvailability().equals(medicine.getAvailability()) : medicine.getAvailability() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getAvailability() != null ? getAvailability().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
