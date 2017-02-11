package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
<<<<<<< HEAD


	public static int LeftTalon1 = 1;
	public static int LeftTalon2 = 2;
	public static int RightTalon1 = 3;
	public static int RightTalon2 = 4;
	
	
	
	
	public Talon LeftController1;
	public Talon LeftController2;
	public Talon RightController1;
	public Talon RightController2;
	
	public RobotMap() {
		
		LeftController1 = new Talon(LeftTalon1);
		LeftController2 = new Talon(LeftTalon2);
		RightController1 = new Talon(RightTalon1);
		RightController2 = new Talon(RightTalon2);
	}}
=======
	public static int DumpTalonPort = 0;
	public Talon DumpTalon;
	public boolean limitswitch1;
	public boolean limitswitch2;
	public boolean dumperUp;
	
	public RobotMap() {
		DumpTalon = new Talon(DumpTalonPort);
	}
}
>>>>>>> 0eaf462aad9b02f7f56b8c2f7333a92928940dfb
