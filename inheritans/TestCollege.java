public class TestCollege {
    public static void main(String args[]) {
        
        ECE eceDept = new ECE("mahalakshmi");
        System.out.println(eceDept.getSecretaryName());
        
        CSE cseDept = new CSE();
        System.out.println(cseDept.getPermenentStaffCount());

        MECH mechDept = new MECH();
        System.out.println(mechDept.getHODName());
        
        Civil civilDept = new Civil();
        System.out.println(civilDept.getTotalStrength());
    }
}