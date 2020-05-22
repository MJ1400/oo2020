class TestClass {
    private String name;

    public TestClass(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }
}

class Massiivid {
    public static void main(String[] args) {


        //Kasutatakse primitiivtüüpi andmete hoidmiseks, sest Collection klassid on aeglasemad
        //Kasutatakse, kui on teada, et töödatakse ainult kindla arvu elementidega, sest arraylistid eraldavad umbes kaks korda rohkem mälu ja mälu läheks raisku
        

        // Deklareerimine
        // Massiivi tehes peab määrama ära, millist tüüpi objekte seal hoitakse
        int[] test;

        
        // Saab deklareerida fikseeritud suurusega
        double doubleArray[] = new double[2];

        // Kohe algväärtustega lähtestamine
        String[] cars = { "BMW", "Ford", "Opel" };
        
        // Saab teha ka klassi objektidest massiivi
        TestClass[] testArray = new TestClass[1];
        // Massiivi lisamine
        testArray[0] = new TestClass("Testnimi");
        
        // Massiiv on fikseeritud suurusega ehk ei ole dünaamilised, mis tähendab et kui massiiv on suurusega 1 siis ei saa sinna kahte elementi talletada
            //testArray[1] = new TestClass("Testnimi2");
        // Massiivi objekti meetodi väljakutsumine
        testArray[0].getName();
        System.out.println("--------------------------------------------------");

        //  Massiivi elementide arvu leidmine
        System.out.println(cars.length);
        System.out.println("--------------------------------------------------");

        //  Massiivi elementide läbi loopimine tavalise for tsükliga
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("--------------------------------------------------");

        // Massiivi elementide läbi loopimine for-each loopiga
        for(String s : cars) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------");

        // Multidimensiooniline massiiv - kahe-dimensiooniline massiivi näide
        int[][] numbrid = { {1, 2, 3, 4, 5}, {6, 7, 8}};

    }
}