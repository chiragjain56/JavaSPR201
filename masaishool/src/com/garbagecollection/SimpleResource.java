package com.garbagecollection;

public class SimpleResource {
    private String name;

    public SimpleResource(String name) {
        this.name = name;
        System.out.println(name + " acquired.");
    }

    public static void main(String[] args) {
        // Create objects using the new keyword
        SimpleResource res1 = new SimpleResource("Resource 1");
        System.out.println("Resource 1");
        SimpleResource res2 = new SimpleResource("Resource 2");
        System.out.println("r2");

        // Set objects to null to make them eligible for garbage collection
        res1 = null;
        res2 = null;

        // Suggest the JVM run the garbage collector
        System.gc();

        // Wait for a while to ensure GC has time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println(name + " released.");
        } finally {
            super.finalize();
        }
    }
}
