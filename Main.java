public class Main {
    public static void main(String[] args) {
        /**
         * Создание первой коробки с яблоками
         */
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruits(new Apple());
        appleBox1.addFruits(new Apple());

        /**
         * Создание первой коробки с апельсинами
         */

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruits(new Orange());
        orangeBox1.addFruits(new Orange());

        /**
         * Создание второй коробки с яблоками
         */

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruits(new Apple());
        appleBox2.addFruits(new Apple());

        /**
         * Производится сравнение коробок
         */

        System.out.println("Вес коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Коробки равны по весу: " + appleBox1.compare(orangeBox1));

        /**
         * Производится пересыпание фруктов в другой ящик
         */

        appleBox1.transferToAnotherBox(appleBox2);

        /**
         * Производится повторное сравнение коробок
         */

        System.out.println("Вес коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Коробки равны по весу: " + appleBox1.compare(appleBox2));
    }
}