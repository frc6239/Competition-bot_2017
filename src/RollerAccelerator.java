import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;

public class RollerAccelerator {
	public Talon LeftController1;
	public Talon LeftController2;
	public Talon RightController1;
	public Talon RightController2;

	public static int AcceleratorTalon = 5;
	public Talon Accelerator;
	public void DriveRobot(double Leftspeed, double Rightspeed){
		LeftController1.set(Leftspeed);
		LeftController2.set(Leftspeed);
		RightController1.set(Rightspeed);
		RightController2.set(Rightspeed);
		Accelerator.set(1);
}}



