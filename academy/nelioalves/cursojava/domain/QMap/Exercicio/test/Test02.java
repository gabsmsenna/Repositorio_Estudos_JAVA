package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap.Exercicio.test;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap.Exercicio.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        Map<Product, Double> cookies = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Tablet", 400.0);
        Product p3 = new Product("Notebook", 1200.0);

        cookies.put(p1, 10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 15000.0);

        Product ps = new Product("TV", 900.0);

        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));



    }
}
