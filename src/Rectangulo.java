
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
import javax.swing.JTextField;
/**
 * 
 * Clase donde se definen los objetos que se utilizaran en la ventana
 *
 */
public class Rectangulo extends JFrame implements ActionListener{

	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa valor del largo :");
	private JLabel lbN2= new JLabel("Ingresa el valor del ancho :");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Perimetros op = new Perimetros();
	//se crea la ventana
	public Rectangulo(){
		super.setTitle("Perimetro del rectangulo");
		super.setSize(320, 310);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
//Se  crean y agregan los objetos al panel
	private void cargarControles() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		lbN2.setBounds(10,80, 280, 30);
		txtN2.setBounds(10, 120, 280, 30);
		//2pi*r
		btnCalcular.setBounds(10, 160, 180, 30);
		
		lbOperacion.setBounds(10,200, 280,30);
		
		btnRegresar.setBounds(200, 230, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);

	}

	@Override
	// accion de los dos botones de la ventana
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		int r = op.rectangulo(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbOperacion.setText(String.format("Perimetro = %d", r));
		}
		if(btn==btnRegresar){
			Menu vtn= new Menu();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
}
