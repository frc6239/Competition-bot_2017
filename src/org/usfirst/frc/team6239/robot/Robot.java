
package org.usfirst.frc.team6239.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.I2C;
import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;

import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;


public class Robot extends IterativeRobot {

	public static DriveSubsystem DRIVE_SUB;
	public static RollerGrabberSub roller_grab;
	public static DumpLiftSub dump_lift;
	public static RobotMap robotmap;
	public static OI oi;
	public static DigitalInput limitswitch1;
	public static DigitalInput limitswitch2;
	public static DigitalInput limitswitch3;
	public static DigitalInput limitswitch4;

    public static AHRS ahrs;
    public static Timer timer = new Timer();
	
	public void robotInit() {

		DRIVE_SUB = new DriveSubsystem();
		roller_grab = new RollerGrabberSub();
		dump_lift = new DumpLiftSub();
		robotmap = new RobotMap();
		limitswitch1 = new DigitalInput(3);
		limitswitch2 = new DigitalInput(2);
		limitswitch3 = new DigitalInput(0);
		limitswitch4 = new DigitalInput(1);
		ahrs = new AHRS(I2C.Port.kMXP);

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
