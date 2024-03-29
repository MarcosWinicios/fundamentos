package desafios.calculadoraGravidez;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		return dataEstimadaDaConcepcao.getTime();
	}
	
	public Date calcularDataEstimadaParto() {
		Calendar dataEstimadaParto = this.converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);
		return dataEstimadaParto.getTime();
	}
	
	public Date calcularDataEstimadaConcepcao(Date dataNascimento) {
		Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(dataNascimento);
		dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, -40);
		dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		return dataEstimadaDaConcepcao.getTime();
	}
}
