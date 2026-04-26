// Program to demonstrate nested (inner) classes in Java
// CPU is the outer class. Processor is an inner class. RAM is a static nested class.

public class CPU {
    private double price;  // Price of the CPU

    // Constructor to set the CPU price
    public CPU(double price) {
        this.price = price;
    }

    // Inner class - needs an object of CPU to create
    public class Processor {
        private int noOfCores;       // Number of cores in the processor
        private String manufacturer; // Name of the manufacturer

        // Constructor to set processor details
        public Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        // Method to display processor information
        public void displayProcessorInfo() {
            System.out.println("No. of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class - can be created without a CPU object
    public static class RAM {
        private int memory;          // RAM size in GB
        private String manufacturer; // Name of the manufacturer

        // Constructor to set RAM details
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        // Method to display RAM information
        public void displayRAMInfo() {
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Method to display CPU price
    public void displayCPUInfo() {
        System.out.println("CPU Price: ₹" + price);
    }

    public static void main(String[] args) {
        // Create a CPU object with price 50000
        CPU cpu = new CPU(50000);

        // Create Processor using the cpu object (inner class needs outer object)
        CPU.Processor processor = cpu.new Processor(8, "Intel");

        // Create RAM directly (static class does not need outer object)
        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        // Display all information
        cpu.displayCPUInfo();
        System.out.println("Processor Info:");
        processor.displayProcessorInfo();
        System.out.println("RAM Info:");
        ram.displayRAMInfo();
    }
}
