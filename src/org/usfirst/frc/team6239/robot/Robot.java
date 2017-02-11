
package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team6239.robot.subsystems.DriveSub;
import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {

	public static DriveSub drive_sub;
	public static OI oi;
	public static DumpLiftSub dumpLift;
	public static RobotMap robotmap;
	public static DigitalInput limitswitch1;
	public static DigitalInput limitswitch2;
	
	
	public void robotInit() {
		
		oi = new OI();
		drive_sub = new DriveSub();
		dumpLift = new DumpLiftSub();
		robotmap = new RobotMap();
		limitswitch1 = new DigitalInput(0);
		limitswitch2 = new DigitalInput(1);

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

	}

	
}