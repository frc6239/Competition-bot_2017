
package org.usfirst.frc.team6239.robot;


import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.I2C;
import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;
import org.usfirst.frc.team6239.robot.subsystems.VisionSub;

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
	public static DriveSubsystem DRIVE_SUB = new DriveSubsystem();
	public static OI oi;
	public static DumpLiftSub dump_lift;
	public static RobotMap robotmap;
	public static DigitalInput limitswitch1;
	public static DigitalInput limitswitch2;
	public static DigitalInput limitswitch3;
	public static DigitalInput limitswitch4;
	public static RollerGrabberSub roller_grab;
	public static Timer timer;
	public static VisionSub vision;// = new VisionSub();
    public static AHRS ahrs;

	
	public void robotInit() {
		
		dump_lift = new DumpLiftSub();
		robotmap = new RobotMap();
		limitswitch1 = new DigitalInput(3);
		limitswitch2 = new DigitalInput(2);
		limitswitch3 = new DigitalInput(0);
		limitswitch4 = new DigitalInput(1);
		ahrs = new AHRS(I2C.Port.kMXP);
		roller_grab = new RollerGrabberSub();
		timer = new Timer();
		oi = new OI();	
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
		
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();

		Robot.robotmap.limitswitch1 = Robot.limitswitch1.get();
		Robot.robotmap.limitswitch2 = Robot.limitswitch2.get();
		Robot.robotmap.limitswitch3 = Robot.limitswitch3.get();
		Robot.robotmap.limitswitch4 = Robot.limitswitch4.get();
		Robot.robotmap.driving = oi.isMoving();
		

	} 
		
}
