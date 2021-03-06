/**
 * 
 * @author Blanca
 *
 */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuTriangulos extends JFrame implements ActionListener{

	private JLabel lbN1= new JLabel("El�ge una opci�n:");
	
	private JButton btnEquilatero= new JButton("Equil�tero");
	private JButton btnIsoceles= new JButton("Is�sceles");
	private JButton btnEscaleno= new JButton("Escaleno");
	private JButton btnRegresar= new JButton("Men�");
	
	private Container c= getContentPane();
	/**
	 * metodo donde se crea la ventana
	 */
	public MenuTriangulos(){
		super.setTitle("Tri�ngulos");
		super.setSize(300, 350);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * aqui se crean los objetos que contendra la ventana y se posicionan , adem�s se agregan
	 * al panel
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,50, 280, 30);
		btnEquilatero.setBounds(10, 100, 250, 30);
		btnIsoceles.setBounds(10, 150, 250, 30);
		btnEscaleno.setBounds(10, 200, 250, 30);
		btnRegresar.setBounds(180, 240, 90, 30);
		
		c.add(lbN1);
		c.add(btnEquilatero);
		c.add(btnIsoceles);
		c.add(btnEscaleno);
		c.add(btnRegresar);
		
		btnEquilatero.addActionListener(this);
		btnIsoceles.addActionListener(this);
		btnEscaleno.addActionListener(this);
		btnRegresar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object btn = e.getSource();
		if(btn==btnEquilatero){
			Equilatero vtn= new Equilatero();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		if(btn==btnIsoceles){
			Isoceles vtn= new Isoceles();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		if(btn==btnEscaleno){
			Escaleno vtn= new Escaleno();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		if(btn==btnRegresar){
			Menu vtn= new Menu();
			vtn.setVisible(true);
			this.setVisible(false);
		}
	}
	
}
