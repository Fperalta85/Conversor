package conversorMonedas;

import javax.swing.JOptionPane;

public class Convertir {

		//Cambio de Pesos Argentios a Moneda extranjera
	
	public void ConvertirPesosArgentinosDolares(double valor) {
		double monedaDolar = valor / 264.57;
		monedaDolar = (double)Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaDolar + "Dolares");
		}
	
	public void ConvertirPesosArgentinosEuros(double valor) {
		double monedaEuro = valor / 297.28;
		monedaEuro = (double)Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaEuro + "Euros");
		}
	
	public void ConvertirPesosArgentinosLibrasEsterlinas(double valor) {
		double monedaLibras = valor / 346.34;
		monedaLibras = (double)Math.round(monedaLibras*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaLibras + "Libras Esterlinas");
		}
	
	public void ConvertirPesosArgentinosYenJapones(double valor) {
		double monedaYen = valor / 1.91;
		monedaYen = (double)Math.round(monedaYen*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaYen + "Yen Japones");
		}
	
	public void ConvertirPesosArgentinosWonSurCoreano(double valor) {
		double monedaWon = valor / 0.21;
		monedaWon = (double)Math.round(monedaWon*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaWon + "Won Sur-Coreano");
		}
	
	//Cambio de moneda extranjera a peso Argentino
	
	public void ConvertirDolaresPesosArgentinos(double valor) {
		double monedaDolar = 264.57*valor;
		monedaDolar = (double)Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaDolar + "Dolares");
		}
	
	public void ConvertirEurosPesosArgentinos(double valor) {
		double monedaEuro = 297.28*valor;
		monedaEuro = (double)Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaEuro + "Euros");
		}
	
	public void ConvertirLibrasEsterlinasPesosArgentinos(double valor) {
		double monedaLibras = 346.34*valor;
		monedaLibras = (double)Math.round(monedaLibras*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaLibras + "Libras Esterlinas");
		}
	
	public void ConvertirYenJaponesPesosArgentinos(double valor) {
		double monedaYen = 1.91*valor;
		monedaYen = (double)Math.round(monedaYen*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaYen + "Yen Japones");
		}
	
	public void ConvertirWonSurCoreanoPesosArgentinos(double valor) {
		double monedaWon = 0.21*valor;
		monedaWon = (double)Math.round(monedaWon*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaWon + "Won Sur-Coreano");
		}
	
	
}
