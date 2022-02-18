package com.company;

import java.util.Arrays;

public class MyVector
{
    private final double[] Array;
    private final int Size;


    MyVector(int size)
    {
        this.Size = size;
        this.Array = new double[size];
    }
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

    //Скалярное произведение двух векторов
    public MyVector ScaleMultiply(MyVector Vector)
    {
        for (int i = 0;i<Size;i++)
        {
            Array[i] *= Vector.Array[i];
        }
        return this;
    }

    //Сложение двух векторов, в параметрах: другой вектор
    public MyVector SumOfVectors(MyVector Vector)
    {
        for (int i = 0;i<Size;i++)
        {
            Array[i] += Vector.Array[i];
        }
        return this;
    }

    //Умножение вектора на число
    public void MultiplicationByNumber(int number)
    {
        for (int i=0;i<Size;i++)
        {
            Array[i] *= number;
        }
    }

    //Нахождение евклидовой нормы
    public double EuclideanNorm()
    {
        double euclideanNorm;
        int summary = 0;
        for (int i=0;i<Size;i++)
        {
            summary += MyAbs(Array[i])*MyAbs(Array[i]);
        }
        euclideanNorm = Math.sqrt(summary);
        return euclideanNorm;
    }

    //Сортировка вектора
    //Сортировка пузырьком по убыванию
    public void DescendingSort()
    {
        for (int start = 0; start < Size - 1; start++) {
            for (int index = 0; index < Size - 1 - start; index++) {
                if (Array[index] < Array[index + 1]){
                    Swap(index);
                }
            }
        }
    }

    //Вспомогательный метод для сортировки пузырьком, в пераметрах: номер элемента
    private void Swap(int i)
    {
        //Перестановка элементов с помощью промежуточной переменной
        /*
        double tmp = Array[i];
        Array[i] = Array[(i + 1)];
        Array[(i + 1)] = tmp;
         */
        
        //С помощью арифметики
        Array[i+1]+=Array[i];
        Array[i] = Array[i+1] - Array[i];
        Array[i+1] = Array[i+1] - Array[i];
    }

    //Методы нахождения максимального и минимального элемента массива (в диапазоне от -1000000 до 1000000)
    //Метод нахождения максимального элемента
    public double GetMaximalElement()
    {
        double max = Array[0];
        for (int i=0;i<Size;i++)
        {
            if (Array[i] > max)
            {
                max = Array[i];
            }
        }
        return max;
    }
    //Метод нахождения минимального элемента
    public double GetMinimalElement()
    {
        double min = Array[0];
        for (int i=0;i<Size;i++)
        {
            if (Array[i] < min)
            {
                min = Array[i];
            }
        }
        return min;
    }

    //Доступы к элементам вектора
    //Взятие элемента, в параметрах: номер элемента
    public double GetElement(int numberOfElement)
    {
        return Array[numberOfElement];
    }
    //Задание элемента, в параметрах: номер элемента и значение
    public void SetElement(int numberOfElement, double value)
    {
        Array[numberOfElement] = value;
    }

    private double MyAbs(double num)
    {
        if (num > 0)
            return num;
        if (num < 0)
            return num *= -1;
        return 0;
    }

    //Получение длины
    public int GetSize()
    {
        return Size;
    }

    @Override
    public String toString() {
        return "MyVector{" +
                "Array=" + Arrays.toString(Array) +
                ", Size=" + Size +
                '}';
    }
}
