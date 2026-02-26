public class Pipeline {

    public static void plotAll(DataStructure[] data) {
        System.out.println("--- Plot All ---");
        for (DataStructure d : data) {
            if (d instanceof Plottable) {
                ((Plottable) d).plot();
            } else {
                System.out.println("Skipping: " + d.toString());
            }
        }
    }

    public static void exportAll(DataStructure[] data) {
        System.out.println("--- Export All ---");
        for (DataStructure d : data) {
            if (d instanceof Exportable) {
                ((Exportable) d).export();
            } else {
                System.out.println("Skipping: " + d.toString());
            }
        }
    }

    public static void dataScienceOperations() {
        DataStructure[] data = {
                new DataFrame("SalesData", 5000, new String[]{"Product", "Price", "Quantity"}),
                new NumericalSeries("Revenue", 3000, "double"),
                new CategoricalSeries("Region", 3000, "String"),
                new DataFrame("Inventory", 1200, new String[]{"Item", "Stock"}),
        };

        System.out.println("--- All Objects ---");
        for (DataStructure d : data) {
            System.out.println(d.toString());
        }

        System.out.println();
        plotAll(data);

        System.out.println();
        exportAll(data);
    }

    public static void main(String[] args) {
        dataScienceOperations(); 
    }
}
