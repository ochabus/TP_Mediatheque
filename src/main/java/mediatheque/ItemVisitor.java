/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mediatheque;

/**
 *
 * @author chabus
 */
public interface ItemVisitor {
    
    void visit(Book item);
    void visit(CD item);
        
    
    
}
