
package org.usfirst.frc.team6239.robot;


import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

/*	public class robotmap {

		public static Object LeftController1;
		public static Object LeftController2;
		public static Object RightController1;
		public static Object RightController2;

	}
*/
	public static DriveSubsystem DRIVE_SUB;
	
	public static OI oi;
	public static DumpLiftSub dump_lift;
	public static RobotMap robotmap;
	public static DigitalInput limitswitch1;
	public static DigitalInput limitswitch2;
    public static SmartDashboard smartDashboard;
    public static AHRS ahrs;


	
	public void robotInit() {
		oi = new OI();
		dump_lift = new DumpLiftSub();
		robotmap = new RobotMap();
		limitswitch1 = new DigitalInput(0);
		limitswitch2 = new DigitalInput(1);
		smartDashboard = new SmartDashboard();
		ahrs = new AHRS(Port.kMXP);
				
	}


	public void disabledInit() {
		
	}


	public void autonomousInit() {
		
	}


	public void teleopInit() {
		
	}


	public void robotPeriodic() {
		
	}
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}


	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		Robot.robotmap.curAngle = ahrs.getAngle();
	}


	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		Robot.robotmap.limitswitch1 = Robot.limitswitch1.get();
		Robot.robotmap.limitswitch2 = Robot.limitswitch2.get();
	}
	
	
}
