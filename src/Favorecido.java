import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Favorecido {

	private String mesReferencia;
	private String mesCompetencia;
	private String uf;
	private String codigoMunicipioSiafi;
	private String nomeMunicipio;
	private String cpfFavorecido;
	private String nisFavorecido;
	private String nomeFavorecido;
	private BigDecimal valorParcela;
	
	public double findMenorParcela(List<Favorecido> listaFavorecidos) {
		
		double menorValor = 0;
		
		for(int i = 0; i < listaFavorecidos.size(); i++) {
			if (menorValor != 0) {
				if(listaFavorecidos.get(i).getValorParcela().doubleValue() < menorValor) {
					menorValor = listaFavorecidos.get(i).getValorParcela().doubleValue();
				}
			} else {
				menorValor = listaFavorecidos.get(i).getValorParcela().doubleValue();
			}
		}
		
		return menorValor;
	}
	
	public double findMaiorParcela(List<Favorecido> listaFavorecidos) {
		
		double maiorValor = 0;
		
		for(Favorecido fav : listaFavorecidos) {
			if (fav.getValorParcela().doubleValue() > maiorValor) {
				maiorValor = fav.getValorParcela().doubleValue();
			}
		}
		
		return maiorValor;
	}
	
	public double getSomaTotalParcelas(List<Favorecido> listaFavorecidos) {
		
		double somaParcelas = 0;
		
		for(int i = 0; i < listaFavorecidos.size(); i++) {
			somaParcelas+= listaFavorecidos.get(i).getValorParcela().doubleValue();
		}
		
		return somaParcelas;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public String getMesCompetencia() {
		return mesCompetencia;
	}

	public void setMesCompetencia(String mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCodigoMunicipioSiafi() {
		return codigoMunicipioSiafi;
	}

	public void setCodigoMunicipioSiafi(String codigoMunicipioSiafi) {
		this.codigoMunicipioSiafi = codigoMunicipioSiafi;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getCpfFavorecido() {
		return cpfFavorecido;
	}

	public void setCpfFavorecido(String cpfFavorecido) {
		this.cpfFavorecido = cpfFavorecido;
	}

	public String getNisFavorecido() {
		return nisFavorecido;
	}

	public void setNisFavorecido(String nisFavorecido) {
		this.nisFavorecido = nisFavorecido;
	}

	public String getNomeFavorecido() {
		return nomeFavorecido;
	}

	public void setNomeFavorecido(String nomeFavorecido) {
		this.nomeFavorecido = nomeFavorecido;
	}

	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	
}