/**
 * Program 5: CPU with Processor (inner class) and RAM (static nested class).
 *
 * Demonstrates:
 *  - Static nested class (RAM) – does NOT need an outer-class instance
 *  - Non-static inner class (Processor) – linked to its outer CPU instance
 *  - Composing a CPU object from its nested components
 *  - Displaying all details through a single method
 */
public class CPUNestedClass {

    /* Price of the CPU system */
    double price;

    /* -------------------------------------------------------
     * Non-static inner class: Processor
     * Being non-static means each Processor is logically tied
     * to a specific CPU instance (like Java's inner class concept).
     * ------------------------------------------------------- */
    class Processor {
        int    noOfCores;    // number of CPU cores
        String manufacturer; // chip manufacturer name

        /**
         * Constructor for Processor.
         *
         * @param noOfCores    number of processor cores
         * @param manufacturer processor chip manufacturer
         */
        Processor(int noOfCores, String manufacturer) {
            this.noOfCores    = noOfCores;
            this.manufacturer = manufacturer;
        }
    }

    /* -------------------------------------------------------
     * Static nested class: RAM
     * Being static means it can be created independently of any
     * specific CPU instance (equivalent to a static nested class).
     * ------------------------------------------------------- */
    static class RAM {
        int    memory;       // RAM capacity in GB
        String manufacturer; // RAM module manufacturer

        /**
         * Constructor for RAM.
         *
         * @param memory       RAM size in GB
         * @param manufacturer RAM manufacturer name
         */
        RAM(int memory, String manufacturer) {
            this.memory       = memory;
            this.manufacturer = manufacturer;
        }
    }

    /* Processor component of this CPU */
    Processor processor;

    /* RAM component of this CPU */
    RAM ram;

    /**
     * Constructor for CPU.
     *
     * @param price     price of the complete CPU system
     * @param processor Processor object linked to this CPU
     * @param ram       RAM object associated with this CPU
     */
    CPUNestedClass(double price, Processor processor, RAM ram) {
        this.price     = price;
        this.processor = processor;
        this.ram       = ram;
    }

    /**
     * Display all details: CPU price, processor info, and RAM info.
     */
    void display() {
        System.out.println("CPU Price: " + price);
        System.out.println("Processor Info:");
        System.out.println("  No. of Cores: " + processor.noOfCores);
        System.out.println("  Manufacturer: " + processor.manufacturer);
        System.out.println("RAM Info:");
        System.out.println("  Memory: " + ram.memory + " GB");
        System.out.println("  Manufacturer: " + ram.manufacturer);
    }

    public static void main(String[] args) {

        /* Create a CPU object and populate its nested components */
        CPUNestedClass cpu = new CPUNestedClass(50000.00,
            null, // processor assigned below (inner class needs outer instance)
            new RAM(16, "Corsair") // RAM is static nested – created directly
        );

        /* Create the inner-class Processor using the outer cpu instance */
        cpu.processor = cpu.new Processor(8, "Intel");

        /* Display the complete CPU configuration */
        cpu.display();
    }
}
