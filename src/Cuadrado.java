/**
 * 
 * @author Blanca
 *
 */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * 
 * clase donde se definen los objetos
 *
 */
public class Cuadrado extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
		
	private JLabel lbN1= new JLabel("Ingresa el tamaño:");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Perimetros op = new Perimetros();
	
	public Cuadrado(){
		super.setTitle("Perimetro del cuadrado");
		super.setSize(320, 280);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * metodo para cargar los objetos
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		btnCalcular.setBounds(10, 100, 180, 30);
		
		lbOperacion.setBounds(10,150, 280,30);
		
		btnRegresar.setBounds(200, 190, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);
		

	}

	@Override
	/**
	 * Metodo que hace que el boton tenga una accion este incluye boton de regresar y calcular
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object btn = e.getSource();
		if(btn==btnCalcular){
		int r = op.cuadrado(Integer.parseInt(txtN1.getText()));
		lbOperacion.setText(String.format("Perimetro = %d", r));	
		}
		if(btn==btnRegresar){
			Menu vtn= new Menu();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
	
}
