public class Main {
    public static void main(String[] args) {
        // Задача 1
        var a = 0;
        byte b = 1;
        short c = 2;
        int d = 3;
        long e = 4L;
        float f = 5.0f;
        double g = 6.0;
        char h = 65;
        boolean i = true;

        //Задача 2
        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;
        double sumWeightBoxers = weightBoxer1 + weightBoxer2;
        double difBetweenBoxers = weightBoxer2 - weightBoxer1;
        System.out.println("Общий вес двух бойцов "+ sumWeightBoxers + " кг.");
        System.out.println("Разница между весами бойцов "+ difBetweenBoxers + " кг.");

        //Задача 3
        int quantityBananas = 5; // шт.
        int weightOneBanan = 80; // гр
        double quantityMilk = 200; // мл
        double densityMilk = 1.05; // гр/мл
        double quantityIceCream = 2; // шт.
        int weightOneIceCream = 100; // гр.
        int quantityEgg = 4; // шт.
        double weightOneEgg = 70; // гр.

        double weightBananas = quantityBananas * weightOneBanan;
        double weightMilk = quantityMilk * densityMilk;
        double weightIceCream =  quantityIceCream * weightOneIceCream;
        double weightEgg = quantityEgg * weightOneEgg;

        double weightCocktail = weightBananas + weightMilk + weightIceCream + weightEgg; // гр.
        double weightCocktailKg = weightCocktail / 1000; // кг.
        System.out.println ("Вес спорт-завтрака составляет " + weightCocktailKg + " кг.");

        //Задача 4
        double minLossWeight = 250;
        double maxLossWeight = 500;
        double needLossWeight = 7000;
        double needDaysMax = needLossWeight / minLossWeight;
        double needDaysMin = needLossWeight / maxLossWeight;
        double needDaysAverage = (needDaysMax + needDaysMin) / 2;
        System.out.println ("В среднем результата похудения спортсмен достигнет за " + needDaysAverage + " дн.");

        //Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double raise = 1.1;
        double newSalaryMasha = raise * salaryMasha;
        double newSalaryDenis = raise * salaryDenis;
        double newSalaryKristina = raise * salaryKristina;
        System.out.println ("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + 12* (newSalaryMasha - salaryMasha) + " рублей.");
        System.out.println ("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + 12* (newSalaryDenis - salaryDenis) + " рублей.");
        System.out.println ("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + 12*(newSalaryKristina - salaryKristina) + " рублей.");

    }
}