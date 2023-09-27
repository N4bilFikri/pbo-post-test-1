/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motor;

/**
 *
 * @author asus
 */
class Motorbike {
    
    public String merek;
    public String ConfigureMachine;
    
    public Motorbike(String merek, String ConfigureMachine) {
        this.merek = merek;
        this.ConfigureMachine = ConfigureMachine;
    }
}

public class Motor {
    public static void main(String[] args) {
        
        Motorbike[] motors = new Motorbike[5];
        
        motors[0] = new Motorbike("Honda", "Inline 4");
        motors[1] = new Motorbike("Yamaha", "CrossPlane 4");
        motors[2] = new Motorbike("Kawasaki", "Inline 4");
        motors[3] = new Motorbike("Suzuki", "Inline 4");
        motors[4] = new Motorbike("Ducati", "V4");
        
        
        for (int i = 0; i < motors.length; i++) {
            System.out.print("\nMotorbike : " + (i + 1) + ": " + motors[i].merek);
            System.out.print(", Jenis Mesin : " + motors[i].ConfigureMachine);
        }
    }
}
