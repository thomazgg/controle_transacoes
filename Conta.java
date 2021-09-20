import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class Conta implements Transacao {
    private Integer idConta;
    private double saldo = 100.00;

    public Conta(Integer idConta) {
        this.idConta = idConta;
    }

    // Id Conta
    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    // Saldo

    @Override
    public double vista(double valor) {
        try {
            if (valor > saldo) {
                System.out.println("Saldo Insuficiente");
            } else {
                return saldo - valor;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Compra a vista de R$" + valor + " efetuada");
        return saldo;
    }

    @Override
    public double parcelada(double valor) {
        try {
            if (valor > saldo) {
                System.out.println("Saldo Insuficiente");
            } else {
                return saldo - valor;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Parcela de R$" + valor + " efetuada");
        return saldo;
    }

    @Override
    public double saque(double valor) {
        try {
            if (valor > saldo) {
                System.out.println("Saldo Insuficiente");
            } else {
                return saldo - valor;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Saque de R$" + valor + " efetuado");
        return saldo;
    }

    @Override
    public double pagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado");
        return saldo += valor;
    }

    @Override
    public Data dataTransacao(Data data) {
        SimpleDateFormat dataAtual = new SimpleDateFormat("DD/MM/yyyy");
        return (Data) dataAtual;
    }
}