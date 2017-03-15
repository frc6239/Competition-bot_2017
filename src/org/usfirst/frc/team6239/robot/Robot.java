
package org.usfirst.frc.team6239.robot;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;
import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    public static DriveSubsystem DRIVE_SUB = new DriveSubsystem();
    public static OI oi;
    public static DumpLiftSub dump_lift;
    public static RobotMap robotmap;
    public static RollerGrabberSub roller_grab;

    public void robotInit() {
        dump_lift = new DumpLiftSub();
        robotmap = new RobotMap();
        roller_grab = new RollerGrabberSub();
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
        oi.updateSensors();
    }

}
