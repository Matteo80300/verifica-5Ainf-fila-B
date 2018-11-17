
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h1>SpeddTest</h1>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td>Date<td>");
		sb.append("<td>UP(Mbps)<td>");
		sb.append("<td>Down(Mbps)<td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>1/7/18<td>");
		sb.append("<td>25.0<td>");
		sb.append("<td>28.9<td>");
		sb.append("</tr>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>7/9/18<td>");
		sb.append("<td>24.6<td>");
		sb.append("<td>1.99<td>");
		sb.append("</tr>");
		sb.append("</body>");
		sb.append("</html>");

		String str = sb.toString();
		super.setSize(300,400);
		super.add(new JLabel());
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

