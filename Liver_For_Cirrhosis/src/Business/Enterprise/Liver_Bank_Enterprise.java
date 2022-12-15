/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author satwik
 */
public class Liver_Bank_Enterprise extends Enterprise {
    
    public Liver_Bank_Enterprise(String name){
        super(name,EnterpriseType.LiverBank);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
