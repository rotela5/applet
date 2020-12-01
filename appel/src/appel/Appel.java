package appel;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Appel extends JApplet{

	

		@Override
		public void init() {

		String textoHtml = "<html><strong><font size=3>Aplicacion y Applet";
		JLabel etiqueta = new JLabel(textoHtml, JLabel.CENTER);
		add(etiqueta);
		}

		public static void main(String[] args) {

		JFrame ventana = new JFrame("Ventana de la aplicacion");
		Appel applet = new Appel();
		ventana.add(applet);
		applet.init();
		applet.start();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500, 300);
		ventana.setVisible(true);

		}

		}
