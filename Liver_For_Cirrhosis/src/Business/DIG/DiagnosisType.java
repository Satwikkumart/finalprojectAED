/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DIG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author satwik
 */
public class DiagnosisType {
    HashMap<String, Integer> DIGComboCounts;
    
    public DiagnosisType() {
        DIGComboCounts = new HashMap<>();
    }
    
    public void DIGCountAdd(PersonDIGType dig) {
        ArrayList<String> digValues = dig.getDigValuesList();
        Collections.sort(digValues);
        String digCombo = String.join(", ", digValues);
        this.DIGComboCounts.putIfAbsent(digCombo, 0);
        this.DIGComboCounts.put(digCombo, this.DIGComboCounts.get(digCombo) + 1);
    }
    
    public void DIGCountAdd(PersonDIGType dig, Integer i) {
        ArrayList<String> digValues = dig.getDigValuesList();
        Collections.sort(digValues);
        String digCombo = String.join(", ", digValues);
        this.DIGComboCounts.putIfAbsent(digCombo, 0);
        this.DIGComboCounts.put(digCombo, this.DIGComboCounts.get(digCombo) + i);
    }
    
    public void DIGCountSubstract(PersonDIGType dig) {
        ArrayList<String> digValues = dig.getDigValuesList();
        Collections.sort(digValues);
        String digCombo = String.join(", ", digValues);
//        this.DIGComboCounts.putIfAbsent(digCombo, 0);
        this.DIGComboCounts.put(digCombo, this.DIGComboCounts.get(digCombo) - 1);
    }
    
    public HashMap<String, Integer> getDigComboCounts() {
        return DIGComboCounts;
    }
    
}
