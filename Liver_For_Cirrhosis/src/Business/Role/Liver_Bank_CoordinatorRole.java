/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Liver_Bank_Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import UI.LiverBankCoordinatorRole.LiverBankCoordinatorWorkAreaJPanel;

/**
 *
 * @author satwik
 */
public class Liver_Bank_CoordinatorRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LiverBankCoordinatorWorkAreaJPanel(account, (Liver_Bank_Organization)organization, enterprise, business, network);
    }
}
