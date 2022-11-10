/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatheque;

/**
 *
 * @author chabus
 */
public class PrinterBook implements ItemVisitor {
        
        public void visit(Book item) {
		System.out.println("L'auteur du livre est :" + item.getAuthor() + " son titre est "+  item.getTitle());
	}
        public void visit(CD item) {
	
	}
}
