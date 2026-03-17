public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public class Processor {
        private int noOfCores;
        private String manufacturer;

        public Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        public void displayProcessorInfo() {
            System.out.println("No. of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void displayRAMInfo() {
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public void displayCPUInfo() {
        System.out.println("CPU Price: ₹" + price);
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(50000);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        cpu.displayCPUInfo();
        System.out.println("Processor Info:");
        processor.displayProcessorInfo();
        System.out.println("RAM Info:");
        ram.displayRAMInfo();
    }
}
