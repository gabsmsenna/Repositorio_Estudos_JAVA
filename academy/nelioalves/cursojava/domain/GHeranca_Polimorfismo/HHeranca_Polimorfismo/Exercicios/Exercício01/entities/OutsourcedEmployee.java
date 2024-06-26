package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.GHeranca_Polimorfismo.HHeranca_Polimorfismo.Exercicios.Exercício01.entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee (String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
