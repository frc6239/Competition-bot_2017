package org.usfirst.frc.team6239.robot;

import com.ctre.CANTalon; 
import edu.wpi.first.wpilibj.Spark;
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

	public static int LeftMotor1 = 3;
	public static int LeftMotor2 = 2;
	public static int RightMotor1 = 0;
	public static int RightMotor2 = 1;
	public static int DumpTalonPort = 0;
	public static int RearDumpTalonPort = 3;
	public static int ClimbTal = 1;
	public static int RollerGrab = 2;
	public double curAngle;
	public boolean limitswitch1;
	public boolean limitswitch2;
	public boolean limitswitch3;
	public boolean limitswitch4;
	public boolean dumperUp;
	public boolean isSeen;
	public boolean driving;
	
	public CANTalon ClimbTalon;
	public CANTalon DumpTalon;
	public CANTalon RearDumpTalon;
	
	public CANTalon RollerGrabTal;
	public Spark LeftController1;
	public Spark LeftController2;
	public Spark RightController1;
	public Spark RightController2;

	
	public RobotMap() {
		RearDumpTalon = new CANTalon(RearDumpTalonPort);
		LeftController1 = new Spark(LeftMotor1);
		LeftController2 = new Spark(LeftMotor2);
		RightController1 = new Spark(RightMotor1);
		RightController2 = new Spark(RightMotor2);
		DumpTalon = new CANTalon(DumpTalonPort);
		ClimbTalon = new CANTalon(ClimbTal);
		RollerGrabTal = new CANTalon(RollerGrab);
	}
	
}
