package com.company.impl;

import com.company.impl.Car;
import com.company.impl.Motorcycle;

public class VehicleApp {

    public static void main(String[] args) {
        // Создайте новый проект, залинкуйте его с удаленным репозиторием на GitHub, добавьте файл .gitignore и сделайте коммит
        //Создайте класс абстрактный класс Vehicle (средство передвижения)
        //У класса Vehicle создайте поле wheelCount типа int и модификатором доступа protected
        //Создайте конструктор с аргументом wheelCount
        //Создайте абстрактный метод printInfo() (protected void), который будет реализован в классах-наследниках и будет выводить информацию о конкретном средстве передвижения
        //Создайте класс Car (наследник класса Vehicle)
        //Добавьте в класс Car поле doorsCount (private int) и создайте конструктор с 2-мя аргументами (wheelCount и doorsCount)
        //Реализуйте в классе Car метод printInfo() - должен выводить на экран информацию о машине (Пример вывода: “Транспортное средство: Машина - Количество дверей: 5 - Количество колес: 4”)
        //Создайте класс Motorcycle (наследник класса Vehicle)
        //Добавьте в класс Motorcycle поле c (private int) и создайте конструктор с 2-мя аргументами (wheelCount и maxSpeed)
        //Реализуйте в классе Motorcycle метод printInfo() - должен выводить на экран информацию о мотоцикле (Пример вывода: “Транспортное средство: Мотоцикл- Количество колес: 2 - Максимальная скорость: 170 км/ч”)
        //Создайте интерфейс Costable и в него добавьте метод getCost() с возвращаемым типом int
        //Реализуйте интерфейс Costable для класса Car (реализация на ваше усмотрение). Добавить информацию о цене в метод printInfo()
        //Для реализации работы программы создайте по 2 экземпляра классов Car и Motorcycle. Продемонстрировать работу каждого из методов классов и вывести результат на консоль
        //Залить код в репозиторий и отправить ссылку на репозиторий преподавателюour code here
        Car car1 = new Car(4, 3, 12);
        Car car2 = new Car(4, 5, 5);
        Motorcycle motorcycle1 = new Motorcycle(2, 400);
        Motorcycle motorcycle2 = new Motorcycle(3, 150);
        System.out.println("-----car1-----");
        car1.printInfo();
        System.out.println("Цена: " + car1.getCost() + " тыс.$");

        System.out.println("-----car2-----");
        car2.printInfo();
        System.out.println("Цена: " + car2.getCost() + " тыс.$");

        System.out.println("-----motorcycle1-----");
        motorcycle1.printInfo();

        System.out.println("-----motorcycle1-----");
        motorcycle2.printInfo();


    }
}
