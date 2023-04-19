/*
Adaptar a classe Account para armazenar o saldo da conta. Sua
classe deve ter um construtor que recebe um nome e um saldo
inicial e o construtor deve validar se o saldo inicial é maior ou
igual a 0. Caso o saldo inicial do construtor seja negativo,
inicializar o saldo com 0. Você também deve criar um método
para fazer um depósito de forma que o depósito só seja
efetivado se for válido, ou seja, se o depósito for maior que 0.
Além disso, você deve criar um método get para recuperar o
saldo.
* */

public class Account {
    private String name;
    private double saldo;
//    private double salario;

    public Account(String nomeInicial, double saldoInicial){
        name = nomeInicial;
        if(saldoInicial>0){
            saldo = saldoInicial;
        }
        else{
            saldo = 0;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void saque(double valorSaque){
        if(valorSaque<=saldo){
            saldo -= valorSaque;
        }
        else{
            System.out.println("Você não possui saldo suficiente para realizar o saque!");
        }
    }
    public void deposito(double valorDeposito){
        if(valorDeposito>0) {
            saldo += valorDeposito;
        }
        else{
            System.out.println("Valor de depósito é inválido!");
        }
    }

    public double getSaldo(){
        return saldo;
    }
//    public void setSalario(double salario){
//        this.salario = salario;
//    }
//    public double getSalario(){
//        return this.salario;
//    }
//
//    public void aumento10(){
//        this.salario *= 1.1;
//    }
}
