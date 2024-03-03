 class Route {
    String startAddress;
    String destinationAddress;
    int price;

    public Route(String startAddress, String destinationAddress, int price) {
        this.startAddress = startAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
