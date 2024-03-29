package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		
		System.out.println(formatador.format(c.getTime()));
		
		// Adicionando grandezas (dia, ano, mês)
		c.add(Calendar.MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		//Apenas "rola" a grandeza passada sem alterar as outras
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
	}

}
