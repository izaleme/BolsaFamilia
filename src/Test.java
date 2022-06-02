import java.math.BigDecimal;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
	
		BolsaFamilia beneficiarios = new BolsaFamilia();
		ArrayList<String> lista = beneficiarios.getBolsasFamilia();
		ArrayList<Favorecido> listaFavorecidos = new ArrayList<Favorecido>();
		
		Favorecido fav = new Favorecido(); for(int i = 1; i < lista.size(); i++) {
			String[] partes = lista.get(i).replaceAll("\"", "").split(";");
			Favorecido favorecido = new Favorecido();
			favorecido.setMesReferencia(partes[0]);
			favorecido.setMesCompetencia(partes[1]);
			favorecido.setUf(partes[2]);
			favorecido.setCodigoMunicipioSiafi(partes[3]);
			favorecido.setNomeMunicipio(partes[4]);
			favorecido.setCpfFavorecido(partes[5]);
			favorecido.setNisFavorecido(partes[6]);
			favorecido.setNomeFavorecido(partes[7]);
			favorecido.setValorParcela(new BigDecimal(partes[8].replaceAll(",", ".")));
			listaFavorecidos.add(favorecido);
		}
		
		double menorParcela = fav.findMenorParcela(listaFavorecidos);
		double maiorParcela = fav.findMaiorParcela(listaFavorecidos);
		double somaParcelas = fav.getSomaTotalParcelas(listaFavorecidos);
		
		System.out.println("Valor da menor parcela: R$ " + menorParcela);
		System.out.println("Valor da maior parcela: R$ " + maiorParcela);
		System.out.println("Valor total das parcelas: R$ " + somaParcelas);
		
	}
}