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
 * @author Blanca
 *
 */
public class Equilatero extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
		
	private JLabel lbN1= new JLabel("Ingresa valor de un lado:");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Perimetros op = new Perimetros();
	/**
	 * se define la ventana y el tamaño aquí se cargan todos los objetos
	 */
	public Equilatero(){
		super.setTitle("Perimetro del triangulo equilátero");
		super.setSize(320, 270);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * se definen los objetos el tamaño y posicion , ádemas de la acción del botón
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
	 * Se realizan las acciones que llevara el boton como son dos se coloca un if
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		int r = op.trianguloE(Integer.parseInt(txtN1.getText()));
		lbOperacion.setText(String.format("perimetro = %d", r));
		}
		if(btn==btnRegresar){
			MenuTriangulos vtn= new MenuTriangulos();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
	
}