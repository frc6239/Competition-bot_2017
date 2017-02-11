
package org.usfirst.frc.team6239.robot;


import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static OI oi;
	public static DumpLiftSub dump_lift;
	public static RobotMap robotmap;
	public static DigitalInput limitswitch1;
	public static DigitalInput limitswitch2;
	
	public void robotInit() {
		oi = new OI();
		dump_lift = new DumpLiftSub();
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
		Robot.robotmap.limitswitch1 = Robot.limitswitch1.get();
		Robot.robotmap.limitswitch2 = Robot.limitswitch2.get();
	}
	
	
}
