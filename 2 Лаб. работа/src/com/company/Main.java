package com.company;

public class Main
{
    /*
    TODO:
    доступа к элементам вектора (получения значения и изменения значения) +
    получения «длины» вектора (количества его элементов) +
    поиска минимального и максимального значений из элементов вектора +
    сортировки вектора (по возрастанию или убыванию – на ваш выбор) +
    нахождения евклидовой нормы +
    умножения вектора на число +
    сложения двух векторов +
    нахождения скалярного произведения двух векторов +
     */

    public static void main(String[] args)
    {
        /*
        доступа к элементам вектора (получения значения и изменения значения) +
        получения «длины» вектора (количества его элементов) +
        поиска минимального и максимального значений из элементов вектора +
         */
        MyVector vector1 = new MyVector(10);
        for (int i = 0; i<vector1.GetSize();i++)
        {
            vector1.SetElement(i,i);
        }
        System.out.println(vector1);
        System.out.println("Элемент номер 5: " + vector1.GetElement(4));
        System.out.println("Максимальный элемент: " + vector1.GetMaximalElement() + "\nМинимальный элемент: " + vector1.GetMinimalElement());

        /*
        сортировки вектора (по возрастанию или убыванию – на ваш выбор) +
        нахождения евклидовой нормы +
        умножения вектора на число +
         */
        vector1.DescendingSort();
        System.out.println("Вектор отсортированный по убыванию: " + vector1 + "\n");

        double euclidean = vector1.EuclideanNorm();
        System.out.println("Евклидова норма: " + euclidean + "\n");

        vector1.MultiplicationByNumber(5);
        System.out.println("Вектор умноженный на число 5: " + vector1 + "\n");

        /*
        сложения двух векторов +
        нахождения скалярного произведения двух векторов +
         */
        MyVector vector2 = new MyVector(10);
        for (int i = 0; i<vector1.GetSize();i++)
        {
            vector1.SetElement(i,i+5);
            vector2.SetElement(i,i);
        }
        System.out.println("Два вектора: \n" + vector1 + "\n" + vector2);
        System.out.println("Прибавим второй вектор к первому: " + vector1.SumOfVectors(vector2)+ "\n");

        for (int i = 0; i<vector1.GetSize();i++)
        {
            vector1.SetElement(i,i);
            vector2.SetElement(i,i);
        }
        System.out.println("Два вектора: \n" + vector1 + "\n" + vector2);
        System.out.println("Умножим первый вектор на второй: " + vector1.ScaleMultiply(vector2));
    }
}
