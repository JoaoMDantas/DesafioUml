package iphone;

import java.util.Scanner;

import functionalities.Celular;

public class IPhone extends Celular{

	public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.selecionarMusica();
        iphone.atualizarPagina();
        iphone.pausar();
        iphone.tocar();
	}

	@Override
	public void ligar() {
		System.out.println("Ligando o celular");	
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação");
	}

	@Override
	public void CorreioVoz() {
		System.out.println("correio de voz iniciado");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a página");

	}

    @Override
    public void atualizarPagina() {
        System.out.println("A pagina foi atualizada");

    }
	@Override
	public void adicionarAba() {
		System.out.println("Adicionando uma nova aba");

	}


	Scanner sc = new Scanner(System.in);
	String musica;

	@Override
	public void EscolhaMusica() {
		System.out.print("Selecione uma música: ");
		musica = sc.next();
	}
	@Override
	public void tocar() {
		System.out.println("Tocando a música: " + musica);
		sc.close();
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música");
	}

}