package conversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	Convertir monedas = new Convertir();
	
	public void Convertir(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
						"Seleccion")).toString();
		switch (opcion) {
		case "De Pesos a Dólar": 
			monedas.ConvertirPesosArgentinosDolares(valor);
			break;
		
		case "De Pesos a Euro": 
			monedas.ConvertirPesosArgentinosEuros(valor);
			break;
			
		case "De Pesos a Libras Esterlinas":
			monedas.ConvertirPesosArgentinosLibrasEsterlinas(valor);
			break;
			
		case "De Pesos a Yen Japonés":
			monedas.ConvertirPesosArgentinosYenJapones(valor);
			break;
			
		case "De Pesos a Won sub-coreano":
			monedas.ConvertirPesosArgentinosWonSurCoreano(valor);
			break;
		
		case "De Dólar a Pesos":
			monedas.ConvertirDolaresPesosArgentinos(valor);
			break;
			
		case "De Euro a Pesos":
			monedas.ConvertirEurosPesosArgentinos(valor);
			break;
			
		case "De Libras Esterlinas a Pesos":
			monedas.ConvertirLibrasEsterlinasPesosArgentinos(valor);
			break;
		 
		case "De Yen Japonés a Pesos":
			monedas.ConvertirYenJaponesPesosArgentinos(valor);
			break;
			
		case "De Won sub-coreano a Pesos":
			monedas.ConvertirWonSurCoreanoPesosArgentinos(valor);
			break;
		}
		}
		
	}
	
