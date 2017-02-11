
package org.usfirst.frc.team6239.robot;


import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
<<<<<<< HEAD
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team6239.robot.commands.DriveCommand;
import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
=======
>>>>>>> 0eaf462aad9b02f7f56b8c2f7333a92928940dfb

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
<<<<<<< HEAD

/*	public class robotmap {

		public static Object LeftController1;
		public static Object LeftController2;
		public static Object RightController1;
		public static Object RightController2;

	}
*/
	public static DriveSubsystem DRIVE_SUB;
	public static OI oi;
	public static RobotMap robotmap;
=======
	
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
>>>>>>> 0eaf462aad9b02f7f56b8c2f7333a92928940dfb


<<<<<<< HEAD
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", new DriveCommand());
//        chooser.addObject("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
=======
>>>>>>> 0eaf462aad9b02f7f56b8c2f7333a92928940dfb
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
