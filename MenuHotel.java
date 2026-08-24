import javax.swing.JOptionPane;

public class MenuHotel
{
	private int habitacion, noches, ciclo, opcion;
	
	
	Hotel hotel = new Hotel();
	
	public MenuHotel()
	{
		habitacion = 0;
		noches = 0;
		ciclo = 0;
		opcion = 0;
		
		
		
		menu();
		
	}
	
	public void menu()
	{
		JOptionPane.showMessageDialog(null, "Bienvenido");
		
		while (ciclo !=-1)
		{
			opcion = Integer.parseInt(JOptionPane.showInputDialog("1 Cobrar reserva\n2 Entregar habitacion\3 Ver habitaciones disponibles\4 Salir"));
			
			switch (opcion)
			{
				case 1:
					habitacion = Integer.parseInt(JOptionPane.showInputDialog("Tipo de habitacion\n1 Estandar\n2 Suite"));
					noches = Integer.parseInt(JOptionPane.showInputDialog("cantidad de noches"));
					JOptionPane.showMessageDialog(null, hotel.cobrarReserva(habitacion, noches));
					
					break;
				
				case 2:
					habitacion = Integer.parseInt(JOptionPane.showInputDialog("Tipo de habitacion a devolver\n1 Estandar\n2 Suite"));
					JOptionPane.showMessageDialog(null, hotel.entregarHabit(habitacion));
					
					break;
				
				case 3:
					JOptionPane.showMessageDialog(null, "Estandar: "+hotel.getEstandarDesocupada()+"\nSuite: "+hotel.getSuiteDesocupada());
					
					break;
				case 4:
					System.exit(0);
					
				
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	


	
