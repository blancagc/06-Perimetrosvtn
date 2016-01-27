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

public class Isoceles extends JFrame implements ActionListener{

	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa el valor de un lado:");
	private JLabel lbN2= new JLabel("Ingresa el valor de la base:");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Perimetros op = new Perimetros();
	/**
	 * Clase donde se dimenciona la ventana y se llama el metodo para cargar los objetos
	 */
	public Isoceles(){
		super.setTitle("Perimetro del triangulo Isóssceles");
		super.setSize(320, 310);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
/**
 * Metodo donde se define el tamaño y posicion de los objetos que se veran en la ventana
 */
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
	/**
	 * Accion de los botones que pertenecen a la ventana uno realiza operacion y el otro te
	 * regresa a la ventana anterior
	 */
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		int r = op.trianguloI(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbOperacion.setText(String.format("Perimetro = %d", r));
		}
		if(btn==btnRegresar){
			MenuTriangulos vtn= new MenuTriangulos();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
}
