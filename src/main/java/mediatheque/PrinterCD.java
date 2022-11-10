/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatheque;

/**
 *
 * @author chabus
 */

public class PrinterCD implements ItemVisitor {
        
        public void visit(CD item) {
		System.out.println("Le CD est composé de :" + item.getNumberOfTracks() + "pistes "+" son titre est"+  item.getTitle());
	}
       public void visit(Book item) {
		
	}
}
