package org.computer;

public class Desktop extends LenovaComputer{
	public void desktopSize() {
System.out.println("desktop size is 44gb");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}